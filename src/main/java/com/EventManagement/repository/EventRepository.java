package com.EventManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EventManagement.model.EventModel;

public interface EventRepository extends JpaRepository<EventModel, Long> {

}
