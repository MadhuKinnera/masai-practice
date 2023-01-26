package com.masai.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.model.Event;

public interface EventRepo extends JpaRepository<Event, Integer>{
	
	
	Optional<Event> findByName(String name);
	
//	@Query("SELECT e FROM EVENT e WHERE DATE(start)=?1)")
//	public List<Event> getEventsByDay(LocalDate ld);
//	
//	@Query("SELECT e FROM EVENT e WHERE YEARWEEK(?1) = YEARWEEK(NOW())")
//	public List<Event> getEventsByWeek(LocalDate ld);
//	
//	
//	@Query("SELECT e FROM EVENT e WHERE MONTH(?1) = MONTH(NOW())")
//	public List<Event> getEventsByMonth(LocalDate ld);

}
