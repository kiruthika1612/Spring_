package com.example.demo.controllers;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Room;
import com.example.demo.service.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {

	private final RoomService roomService;

	public RoomRestController(RoomService roomService) {
		super();
		this.roomService = roomService;
	}

	@GetMapping
	public List<Room> getAllRooms() {

		return roomService.getAllRooms();
	}

}
