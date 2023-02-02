package com.example.date.controller;

import com.example.date.entity.Dates;
import com.example.date.repository.DateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
public class DateController {
    @Autowired
    private DateRepository dateRepository;

    @GetMapping("/date")
    public ResponseEntity<List<Dates>> getLaptopsByCreatedDate (@RequestParam Date startDate,
                                                                @RequestParam Date endDate) {
        return new ResponseEntity<List<Dates>>(dateRepository.findByCreatedAtBetween(startDate, endDate), HttpStatus.OK);
    }
}
