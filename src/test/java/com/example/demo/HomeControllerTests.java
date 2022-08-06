package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.ArgumentMatchers.contains;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest
public class HomeControllerTests {
	
	@Autowired
	private MockMvc mockMVC;
	
	@Test
	public void testHomePage() throws Exception {
		mockMVC.perform(get("/")).
			andExpect(status().isOk()).
			andExpect(view().name("home")).
			andExpect(content().string(contains("Welcome!")));
	}
}
