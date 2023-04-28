package com.paulo.strconsumer.listeners;


import com.paulo.strconsumer.custom.StrConsumerCustomListener;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.apache.kafka.common.message.ConsumerProtocolSubscription;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class StrConsumerListener {



    @StrConsumerCustomListener(groupId = "group-1", topicPartitions=  @TopicPartition(topic = "str-topic", partitions = {"0"}))
    @SneakyThrows
    public void create(String message) {
        log.info("CREATE ::: Mensagem recebida {}", message);
        throw new IllegalArgumentException("EXCEPTION...");
    }


    @StrConsumerCustomListener(groupId = "group-1", topicPartitions =  @TopicPartition(topic = "str-topic", partitions = {"1"}))
    public void log(String message) {
        log.info("LOG ::: Mensagem recebida {}", message);
    }

    @KafkaListener(groupId = "group-2", topics = "str-topic", containerFactory = "validMessageContainerFactory")
    public void interceptor(String message) {
        log.info("Interceptor ::: Mensagem recebida: {}", message);
    }
}
