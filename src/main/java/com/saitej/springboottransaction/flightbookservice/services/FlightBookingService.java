package com.saitej.springboottransaction.flightbookservice.services;


import com.saitej.springboottransaction.flightbookservice.dto.FlightBookingAcknowledgement;
import com.saitej.springboottransaction.flightbookservice.dto.FlightBookingRequest;
import com.saitej.springboottransaction.flightbookservice.entities.PassengerInfo;
import com.saitej.springboottransaction.flightbookservice.entities.PaymentInfo;
import com.saitej.springboottransaction.flightbookservice.repositories.PassengerInfoRepository;
import com.saitej.springboottransaction.flightbookservice.repositories.PaymentInfoRepository;
import com.saitej.springboottransaction.flightbookservice.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;
    @Transactional//Execute all the statements or none
    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest bookingRequest){
        PassengerInfo passengerInfo = passengerInfoRepository.save(bookingRequest.getPassengerInfo());

        PaymentInfo paymentInfo = bookingRequest.getPaymentInfo();
        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNumber(), passengerInfo.getFare());//Exception point

        paymentInfo.setPassengerId(passengerInfo.getId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("SUCCESS",passengerInfo.getFare(),UUID.randomUUID().toString().split("-")[0], passengerInfo);


    }

}
