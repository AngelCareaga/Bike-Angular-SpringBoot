package com.globomatics.bike.dao;

import com.globomatics.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeDao extends JpaRepository<Bike, Long> {

}
