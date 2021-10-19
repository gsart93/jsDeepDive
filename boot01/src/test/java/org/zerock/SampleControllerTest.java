package org.zerock;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleControllerTest.class)
public class SampleControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void doHello() throws Exception {
		
		mockMvc.perform(get("/hello.do"))
			.andExpect(content().string("Hello World!"));
		
	}

}
