package com.paulo.strconsumer.custom;

import org.springframework.core.annotation.AliasFor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@KafkaListener
public @interface StrConsumerCustomListener {

    @AliasFor(annotation = KafkaListener.class, attribute = "topics")
    String[] topics() default "str-topcs";

    @AliasFor(annotation = KafkaListener.class, attribute = "containerFactory")
    String containerFactory() default "strContainerFactory";

    @AliasFor(annotation = KafkaListener.class, attribute = "groupId")
    String groupId() default "";

    @AliasFor(annotation = KafkaListener.class, attribute = "topicPartitions", value = "teste")
    TopicPartition[] topicPartitions() default {@TopicPartition(topic = "str-topic", partitions = {"teste"})};
}




