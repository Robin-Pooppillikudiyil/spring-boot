package com.lxisoft.UserRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lxisoft.UserRegistration.model.UserRegistration;
import com.lxisoft.UserRegistration.repository.UserRegistrationRepository;

@Controller
public class UserRegistrarionResource {

	@Autowired
	UserRegistrationRepository userRegistrationRepository;

	@RequestMapping("/first")
	public String first(Model model) {
		model.addAttribute("userRegistration", new UserRegistration());

		return "index";
	}

	@PostMapping(value = "/save")
	public String save(@ModelAttribute UserRegistration userRegistration, Model model) {
		userRegistrationRepository.save(userRegistration);
		return "next";

	}

}
