package com.karczewski.event.model.participation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ContactPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    private String position;
    private String contactPhoneNumber;
    private String email;
    private String comments;
    @MapsId
    @OneToOne
    @JoinColumn(name = "id")
    private Invoice invoice;
    

}
