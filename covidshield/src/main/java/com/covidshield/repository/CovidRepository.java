package com.covidshield.repository;

import com.covidshield.model.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CovidRepository extends CrudRepository<UserData,Long> {

    public List<UserData> findByStateAndCity(String state, String city, Pageable pageable);


}
