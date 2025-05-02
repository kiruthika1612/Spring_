package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Staff;
import com.example.demo.service.StaffService;

@Controller
@RequestMapping("/staffs")
public class StaffController {

	private final StaffService staffservice;

	public StaffController(StaffService staffservice) {
		super();
		this.staffservice = staffservice;
	}

	@GetMapping
	public String getAllStaffs(Model model) {
		model.addAttribute("staffs", staffservice.getAllStaffs());
		return "staffs";
	}

}
