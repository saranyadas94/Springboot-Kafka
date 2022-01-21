/*
 * package com.example.service;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
 * org.springframework.kafka.annotation.KafkaListener; import
 * org.springframework.stereotype.Service;
 * 
 * import com.example.constants.AppConstants; import com.example.model.Student;
 * 
 * 
 * @Service public class KafKaConsumerService { private final Logger logger =
 * LoggerFactory.getLogger(KafKaConsumerService.class);
 * 
 * @KafkaListener(topics = AppConstants.TOPIC_NAME_TEST, groupId =
 * AppConstants.GROUP_ID) public void consume(Student student) {
 * logger.info(String.format("Message recieved -> %s",
 * student.getRollNumber())); }
 * 
 * 
 * }
 */