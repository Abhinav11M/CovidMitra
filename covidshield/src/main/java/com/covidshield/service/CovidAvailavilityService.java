package com.covidshield.service;

import com.covidshield.dto.UserAvailibility;
import com.covidshield.dto.UserRegistration;
import com.covidshield.model.UserData;
import com.covidshield.repository.CovidRepository;
import com.covidshield.repository.CovidRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CovidAvailavilityService {


    @Autowired
    CovidRepositoryImpl covidRepository;

    public UserRegistration createUser(UserData userData){

       return covidRepository.registerUser(userData);

    }

    public List<UserAvailibility> getAllUserDetails(String state, String city, int pageNo, int size){
        return covidRepository.findAllUserDeatils(state,city,pageNo,size);
    }
}
