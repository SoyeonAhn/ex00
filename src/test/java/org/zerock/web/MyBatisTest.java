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
//�� �� �ƹ��ų� �ص����� root-context�� �ִ� ��ü bean�� class ����´�.
public class MyBatisTest {

	@Inject 
	private SqlSessionFactory sqlFactory;
	//SqlSessionFactory = new SqlSessionFactory; 
	//�̷� ������ ���ص� Spring�� �ڵ����� ����
	@Test
	public void testFactory(){
		System.out.println(sqlFactory);
	}

	@Test
	public void testSession()throws Exception{
		try(SqlSession session = sqlFactory.openSession()){
			//SqlSession ��ü�� sqlFactory�� openSession �޼���� ����.
			System.out.println(session);

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


