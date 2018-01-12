package com.karczewski.event.model.participation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String companyName;
    private String streetAddress;
    private String city;
    private String postcode;
    private String taxIdNumber;
    private String phoneNumber;
    private String fax;
    @Enumerated(EnumType.STRING)
    private Trade trade;
    @Enumerated(EnumType.STRING)
    private EmployedStaff staff;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "invoice")
    @PrimaryKeyJoinColumn
    private ContactPerson contactPerson;
    @OneToMany(mappedBy = "invoice")
    private Set<Participant> participants;

}
