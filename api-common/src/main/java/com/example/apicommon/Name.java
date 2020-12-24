package com.example.apicommon;

import lombok.Getter;

import javax.persistence.Embeddable;

@Getter
@Embeddable
public class Name {
    private String firstName;
    private String lastName;
}
