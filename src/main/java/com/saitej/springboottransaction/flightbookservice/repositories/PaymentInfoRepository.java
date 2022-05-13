package com.saitej.springboottransaction.flightbookservice.repositories;

import com.saitej.springboottransaction.flightbookservice.entities.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends
        JpaRepository<PaymentInfo,Long> {
}
