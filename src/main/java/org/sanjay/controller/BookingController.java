package org.sanjay.controller;

import org.sanjay.exception.CamelApplicationException;
import org.sanjay.model.BookingRequest;
import org.sanjay.model.BookingResponse;
import org.sanjay.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping(value = "/api/booking", produces = "application/json")
    public BookingResponse doBooking(@RequestBody @Valid BookingRequest bookingRequest) throws CamelApplicationException {
        BookingResponse response = bookingService.doBooking(bookingRequest);
        return response;
    }
}
