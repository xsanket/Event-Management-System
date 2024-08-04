package com.EventManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.EventManagement.model.OrganizerModel;

public interface OrganizerRepository extends JpaRepository<OrganizerModel, Long> {

}
