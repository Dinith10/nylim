package com.nyl.nylim.repository;

import java.util.HashMap;
import java.util.Map;

import com.nyl.nylim.Entity.Price;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.ConditionalCheckFailedException;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.springboot.model.Student;

@Repository
public class DynamoDbRepository {

	private static final Logger LOGGER = LoggerFactory.getLogger(DynamoDbRepository.class);

	@Autowired
	private DynamoDBMapper mapper;



	public Price getPrice(String cusipId, String effectiveDate) {
		return mapper.load(Price.class, cusipId, effectiveDate);
	}






}