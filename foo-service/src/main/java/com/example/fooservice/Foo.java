package com.example.fooservice;

import com.example.apicommon.Name;
import lombok.Getter;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Entity
public class Foo {
    @Id
    private String id;
    @Embedded
    private AdditionalInformation additionalInformation;
    @Embedded
    private Name name;
}
