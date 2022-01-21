package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.constants.AppConstants;
import com.example.model.Student;

@Service
public class KafKaProducerService 
{
	private static final Logger logger = 
			LoggerFactory.getLogger(KafKaProducerService.class);
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

	public void sendMessage(Student student) 
	{
		logger.info(String.format("Message sent -> %s", student));
		this.kafkaTemplate.send(AppConstants.TOPIC_NAME_TEST, student);
	}
}
