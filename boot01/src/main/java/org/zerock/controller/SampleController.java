package org.zerock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.dto.DemoDto;

@RestController
public class SampleController {
	
	@GetMapping("/hello.do")
	public String doHello() {
		return "Hello World!";
	}
	
	@GetMapping("/sample.do")
	public DemoDto makeSample() {
		
		DemoDto demoDto = new DemoDto();
		
		demoDto.setVal1("val1");
		demoDto.setVal2("val2");
		demoDto.setVal3("val3");
		
		System.out.println(demoDto);
		
		return demoDto;
	}

}
