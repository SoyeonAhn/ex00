package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	@RequestMapping("doC")
	public String doC(@ModelAttribute("msg")String fff){
		logger.info("doC called.............."+fff);
		return "result";
	}
	
	/*@RequestMapping("doC")모델 2개 전달할 경우
	public String doC(@ModelAttribute("msg") String msg, @ModelAttribute("fff") String fff ){
		logger.info("doC called.............." + msg + fff );
		return "result";
	}*/
}
