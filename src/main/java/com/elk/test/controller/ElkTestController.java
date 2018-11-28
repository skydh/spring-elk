package com.elk.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author 测试
 *
 */
@Controller
@RequestMapping("/elktest")
public class ElkTestController {
	private Logger log = LoggerFactory.getLogger(ElkTestController.class);

	@RequestMapping(value = "/hello")
	@ResponseBody
	public String hello() {
		log.error("hello");
		return "helloworld";

	}

}
