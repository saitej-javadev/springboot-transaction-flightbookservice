package com.saitej.springboottransaction.flightbookservice.dto;

import com.saitej.springboottransaction.flightbookservice.entities.PassengerInfo;
import com.saitej.springboottransaction.flightbookservice.entities.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
    private PassengerInfo passengerInfo;

    private PaymentInfo paymentInfo;
}
