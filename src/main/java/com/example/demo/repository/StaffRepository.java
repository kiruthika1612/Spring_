package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer> {

}
