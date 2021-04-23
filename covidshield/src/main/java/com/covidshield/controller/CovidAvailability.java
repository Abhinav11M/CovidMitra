package com.covidshield.controller;

import com.covidshield.dto.UserAvailibility;
import com.covidshield.dto.UserRegistration;
import com.covidshield.model.UserData;
import com.covidshield.service.CovidAvailavilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/availability/v1")
public class CovidAvailability {

    @Autowired
    CovidAvailavilityService covidAvailavilityService;
    @PostMapping("/user")
    public ResponseEntity<UserRegistration> registerUser(@RequestBody UserData userData){

        UserRegistration userRegistration = covidAvailavilityService.createUser(userData);

        return new ResponseEntity<>(covidAvailavilityService.createUser(userData),HttpStatus.CREATED);
    }
    @GetMapping("/user/{state}/{city}")
    public List<UserAvailibility> getuserDetails(@PathVariable("state") String state,
                                                 @PathVariable("city") String city,
                                                 @RequestParam("pageNo")int  pageNo,
                                                 @RequestParam("size") int size){

        return covidAvailavilityService.getAllUserDetails(state,city,pageNo,size);
    }
}
