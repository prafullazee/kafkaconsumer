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
    log.info("Consumed message: " + message);
  }
}
