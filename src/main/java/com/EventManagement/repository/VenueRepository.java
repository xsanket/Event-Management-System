package com.EventManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.EventManagement.model.VenueModel;


public interface VenueRepository extends JpaRepository<VenueModel, Long> {

}
