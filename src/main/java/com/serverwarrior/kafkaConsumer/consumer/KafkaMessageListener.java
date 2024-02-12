package com.serverwarrior.kafkaConsumer.consumer;

import com.serverwarrior.kafkaConsumer.models.Customer;

public interface KafkaMessageListener {
  void consume(String message);
//  void consume2(String message);
//  void consume3(String message);
//  void consume4(String message);
//  void consume5(String message);

//  void consumeCustomer(Customer customer);
  void consumerPartitionTopic(String message);
}
