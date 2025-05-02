package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Staff;

@Service
public class StaffService {

	private static final List<Staff> staffs = new ArrayList<>();

	static {

		staffs.add(new Staff(101, "Kiruthika ", "Ramachandran", "CEO"));
		staffs.add(new Staff(102, "Nishanth  ", "Justus", "CFO"));
		staffs.add(new Staff(103, "Donavan ", "K Nishanth", "COO"));

	}

	public List<Staff> getAllStaffs() {
		return staffs;
	}

}
