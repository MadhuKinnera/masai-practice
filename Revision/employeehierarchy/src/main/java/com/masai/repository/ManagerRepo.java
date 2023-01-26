package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Manager;

public interface ManagerRepo extends JpaRepository<Manager, Integer>{

}
