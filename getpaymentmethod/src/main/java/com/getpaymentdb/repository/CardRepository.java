package com.getpaymentdb.repository;

import org.springframework.data.repository.CrudRepository;

import com.getpaymentdb.bean.Card;

public interface CardRepository extends CrudRepository<Card, String> {

}
