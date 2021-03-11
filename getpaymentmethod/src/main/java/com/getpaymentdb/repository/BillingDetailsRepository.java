package com.getpaymentdb.repository;

import org.springframework.data.repository.CrudRepository;

import com.getpaymentdb.bean.BillingDetails;

public interface BillingDetailsRepository extends CrudRepository<BillingDetails, String> {

}
