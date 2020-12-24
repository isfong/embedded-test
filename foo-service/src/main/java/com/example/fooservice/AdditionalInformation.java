package com.example.fooservice;

import lombok.Getter;

import javax.persistence.Embeddable;

@Getter
@Embeddable
public class AdditionalInformation {
    private String message;
}
