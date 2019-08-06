package com.nyl.nylim.service;

import com.nyl.nylim.repository.DynamoDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nyl.nylim.domain.Price;

@Service
public class PriceService {


	@Autowired
	private DynamoDbRepository dynamoDbRepository;


	public Price getPrices() {
		return new Price("fund1", "qucip1", "ticker1");
	}





}
