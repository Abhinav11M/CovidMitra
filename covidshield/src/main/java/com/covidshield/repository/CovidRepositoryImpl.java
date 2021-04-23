package com.covidshield.repository;

import com.covidshield.dto.UserAvailibility;
import com.covidshield.dto.UserRegistration;
import com.covidshield.model.UserData;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CovidRepositoryImpl {

    @Autowired
    CovidRepository covidRepository;

    public UserRegistration registerUser(UserData userData){
       UserData userDataResponse =   covidRepository.save(userData);
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.setUserId(userDataResponse.getId());
        userRegistration.setName(userDataResponse.getName());

        return userRegistration;

    }

    public List<UserAvailibility> findAllUserDeatils(String state, String city, int pageNo,int size){
        Pageable pageable = PageRequest.of(pageNo,size);
       return  covidRepository.findByStateAndCity(state,city,pageable).stream().map(e->new UserAvailibility(e)).collect(Collectors.toList());
    }
}
