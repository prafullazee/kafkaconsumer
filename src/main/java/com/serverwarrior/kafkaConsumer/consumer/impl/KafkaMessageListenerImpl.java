package com.serverwarrior.kafkaConsumer.consumer.impl;

import com.serverwarrior.kafkaConsumer.consumer.KafkaMessageListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaMessageListenerImpl implements KafkaMessageListener {
  @KafkaListener(topics = "bulk-message-topic", groupId = "bulk-message-topic-listener-group")
  public void consume(String message) {
    log.info("Consumed message in 1st consumer: " + message);
  }
  //[Todo] do not create consumer like this, create proper concurrence consumers
  @KafkaListener(topics = "bulk-message-topic", groupId = "bulk-message-topic-listener-group")
  public void consume2(String message) {
    log.info("Consumed message in 2nd consumer: " + message);
  }
  @KafkaListener(topics = "bulk-message-topic", groupId = "bulk-message-topic-listener-group")
  public void consume3(String message) {
    log.info("Consumed message in 3rd consumer: " + message);
  }
  @KafkaListener(topics = "bulk-message-topic", groupId = "bulk-message-topic-listener-group")
  public void consume4(String message) {
    log.info("Consumed message in 4th consumer: " + message);
  }
  @KafkaListener(topics = "bulk-message-topic", groupId = "bulk-message-topic-listener-group")
  public void consume5(String message) {
    log.info("Consumed message in 5th consumer: " + message);
  }
}
