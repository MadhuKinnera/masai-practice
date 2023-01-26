package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Session;

public interface SessionRepo extends JpaRepository<Session, Integer>{

	Session findByUuid(String uuid);
}
