package com.getpaymentdb.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getpaymentdb.bean.BillingDetails;
import com.getpaymentdb.bean.Card;
import com.getpaymentdb.bean.CardExpiry;
import com.getpaymentdb.bean.PaymentMethod;
import com.getpaymentdb.bean.ReturnLink;
import com.getpaymentdb.repository.BillingDetailsRepository;
import com.getpaymentdb.repository.CardExpiryRepository;
import com.getpaymentdb.repository.CardRepository;
import com.getpaymentdb.repository.PaymentMethodRepository;
import com.getpaymentdb.repository.ReturnLinkRepository;
import com.google.gson.Gson;


@RestController

@RequestMapping("/payment/method")
public class PaymentMethodController {
	@Autowired
	private PaymentMethodRepository payrepository;
	
	@Autowired
	private BillingDetailsRepository billrepository;
	
	@Autowired
	private CardRepository cardrepository;
	
	@Autowired
	private CardExpiryRepository cardexprepository;
	
	@Autowired
	private ReturnLinkRepository returnlinkrepository;
	
	@GetMapping("/read")
	public String readPayment()
	{
		 Iterable<PaymentMethod>  payment =  payrepository.findAll();
		 
		 Gson gson = new Gson();
			String json = gson.toJson(payment);

			JSONArray j1 = new JSONArray(json);
			JSONObject res = new JSONObject(j1.get(0).toString());
			
			 Iterable<BillingDetails> bill = billrepository.findAll();
			 
			 json = gson.toJson(bill);
				JSONObject billingJson = new JSONObject(new JSONArray(json).get(0).toString());
				res.put("BillingDetails", billingJson);
				
				Iterable<Card> card = cardrepository.findAll();
				json = gson.toJson(card);
				JSONObject cardJson1 = new JSONObject(new JSONArray(json).get(0).toString());
				
				Iterable<CardExpiry> cardexp = cardexprepository.findAll();
				json = gson.toJson(cardexp);
				JSONObject cardExpiryJson = new JSONObject(new JSONArray(json).get(0).toString());
				cardJson1.put("caredExpiry", cardExpiryJson);
				
				res.put("Card", cardJson1);
				
				Iterable<ReturnLink> returnlink = returnlinkrepository.findAll();
				 
				 json = gson.toJson(returnlink);
				JSONObject returnlinkJson = new JSONObject(new JSONArray(json).get(0).toString());
					res.put("ReturnLinks", new JSONArray(json));
				
				
				
				
					return res.toString();
		 
	}
	
	
	/*
	 * @PostMapping("/insert") public PaymentMethod create(@RequestBody
	 * PaymentMethod pay) { return payrepository.save(pay); }
	 */
	
	

}
