package com.serverwarrior.kafkaConsumer.consumer.impl;

import com.serverwarrior.kafkaConsumer.consumer.KafkaMessageListener;
import com.serverwarrior.kafkaConsumer.models.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaMessageListenerImpl implements KafkaMessageListener {
  @Override
  @KafkaListener(topics = "bulk-message-topic", groupId = "bulk-message-topic-listener-group")
  public void consume(String message) {
    log.info("Consumed message in 1st consumer: " + message);
  }

  //[Todo] do not create consumer like this, create proper concurrence consumers
//  @Override
//  @KafkaListener(topics = "bulk-message-topic", groupId = "bulk-message-topic-listener-group")
//  public void consume2(String message) {
//    log.info("Consumed message in 2nd consumer: " + message);
//  }
//  @Override
//  @KafkaListener(topics = "bulk-message-topic", groupId = "bulk-message-topic-listener-group")
//  public void consume3(String message) {
//    log.info("Consumed message in 3rd consumer: " + message);
//  }
//  @Override
//  @KafkaListener(topics = "bulk-message-topic", groupId = "bulk-message-topic-listener-group")
//  public void consume4(String message) {
//    log.info("Consumed message in 4th consumer: " + message);
//  }
//  @Override
//  @KafkaListener(topics = "bulk-message-topic", groupId = "bulk-message-topic-listener-group")
//  public void consume5(String message) {
//    log.info("Consumed message in 5th consumer: " + message);
//  }

//  @Override
//  @KafkaListener(topics = "customer-message-topic", groupId = "customer-message-topic-listener-group")
//  public void consumeCustomer(Customer customer) {
//    log.info("Consumed customer: " + customer.toString());
//  }

  @Override
  @KafkaListener(topics = "message-to-partition", groupId = "message-to-partition-listener-group", topicPartitions = {@TopicPartition(topic="message-to-partition", partitions = {"2"})})
  public void consumerPartitionTopic(String message) {
    log.info("Consumed message from 3rd partition: " + message);
  }
}
