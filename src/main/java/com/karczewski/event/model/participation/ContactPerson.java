package com.karczewski.event.model.participation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ContactPerson {

    private String name;
    private String surname;
    private String position;
    private String phoneNumber;
    private String email;
    private String comments;

}
