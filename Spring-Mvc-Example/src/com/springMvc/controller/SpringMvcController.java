package com.springMvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springMvc.Service.SpringMvcService;

@Controller
public class SpringMvcController {

	@Autowired
	SpringMvcService springMvcService;

	@RequestMapping("/")
	public String ControllerMethod(Model model) {

		List<String> nameString = springMvcService.getTheName("Muhammad");

		model.addAttribute("NameString", nameString);

		return "DisplayName";

	}

}
