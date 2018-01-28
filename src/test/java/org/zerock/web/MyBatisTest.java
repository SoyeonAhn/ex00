//package org.zerock.web;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//public class MyBetisTest {
//
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
//
//}
package org.zerock.web;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)

//@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
//둘 중 아무거나 해도ㄱㅊ root-context에 있는 객체 bean의 class 끌어온다.
public class MyBatisTest {

	@Inject 
	private SqlSessionFactory sqlFactory;
	//SqlSessionFactory = new SqlSessionFactory; 
	//이런 식으로 안해도 Spring이 자동으로 생성
	@Test
	public void testFactory(){
		System.out.println(sqlFactory);
	}

	@Test
	public void testSession()throws Exception{
		try(SqlSession session = sqlFactory.openSession()){
			//SqlSession 객체를 sqlFactory의 openSession 메서드로 생성.
			System.out.println(session);

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


