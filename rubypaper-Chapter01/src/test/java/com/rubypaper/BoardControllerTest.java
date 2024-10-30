package com.rubypaper;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class BoardControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testHello() throws Exception {
		

		//get, post, put, delete
		//isOK, isNotFound, isMethodNotAllowed, isInternalServerError, is(상태코드)
		mockMvc.perform(get("/hello").param("name", "둘리"))
		.andExpect(status().isOk())
		.andExpect(content().string("Hello : 둘리"))
		.andDo(print());
		
		
		/* MockMvcResultHandlers.print()매서드가 ResultHandler를 구현한 
		 * ConsolePrintingResultHandler 객체를 리턴.
		 * -> ConsolePrintingResultHandler를 andDo매서드 인자로 넘겨준다.
		 * -> 콘솔에 요청/응답과 관련된 정보를 모두 출력.
		 * */
		
	}

}
