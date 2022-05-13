package com.saitej.springboottransaction.flightbookservice.controller;

import com.saitej.springboottransaction.flightbookservice.dto.FlightBookingAcknowledgement;
import com.saitej.springboottransaction.flightbookservice.dto.FlightBookingRequest;
import com.saitej.springboottransaction.flightbookservice.services.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightBookingController {


    @Autowired
    private FlightBookingService flightBookingService;

    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest bookingRequest){
        return flightBookingService.bookFlightTicket(bookingRequest);
    }
}
