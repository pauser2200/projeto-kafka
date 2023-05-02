package com.paulo.jsonconsumer.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
@EqualsAndHashCode
public class Payment implements Serializable {

    private Long id;
    private Long idUser;
    private Long idProduct;
    private String cardNumber;
}
