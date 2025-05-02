package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Room;
import com.example.demo.service.RoomService;

@Controller
@RequestMapping("/rooms")
public class RoomController {

	private final RoomService roomService;

	public RoomController(RoomService roomService) {
		super();
		this.roomService = roomService;
	}

	@GetMapping
	public String getAllRooms(Model model) {
		model.addAttribute("rooms", roomService.getAllRooms());
		return "rooms";
	}

}
