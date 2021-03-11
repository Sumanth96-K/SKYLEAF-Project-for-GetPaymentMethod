package com.getpaymentdb.repository;

import org.springframework.data.repository.CrudRepository;

import com.getpaymentdb.bean.PaymentMethod;

public interface PaymentMethodRepository  extends CrudRepository<PaymentMethod, String>{

}
