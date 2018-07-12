package com.springMvc.Service;

import java.util.ArrayList;
import java.util.List;

public class SpringMvcServiceImp implements SpringMvcService {

	@Override
	public List<String> getTheName(String name) {
		List<String> message = new ArrayList<>();
		message.add("hello ");
		message.add(name);
		message.add(", to my application");

		return message;
	}

}
