package com.fastcode.cloudsampleapp2.domain.core.rental;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.time.*;
@Repository("rentalRepository")
public interface IRentalRepository extends JpaRepository<RentalEntity, Integer>,QuerydslPredicateExecutor<RentalEntity> {

}

