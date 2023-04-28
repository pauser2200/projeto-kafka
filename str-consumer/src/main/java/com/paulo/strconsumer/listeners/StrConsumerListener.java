package com.paulo.strconsumer.listeners;


import com.paulo.strconsumer.custom.StrConsumerCustomListener;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.common.message.ConsumerProtocolSubscription;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class StrConsumerListener {



    @StrConsumerCustomListener(groupId = "group-1", topicPartitions=  @TopicPartition(topic = "str-topic", partitions = {"0"}))
    public void create(String message) {
        log.info("CREATE ::: Mensagem recebida {}", message);
    }


    @StrConsumerCustomListener(groupId = "group-1", topicPartitions =  @TopicPartition(topic = "str-topic", partitions = {"1"}))
    public void log(String message) {
        log.info("LOG ::: Mensagem recebida {}", message);
    }
}
