package com.saitej.springboottransaction.flightbookservice.repositories;

import com.saitej.springboottransaction.flightbookservice.entities.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
