package com.karczewski.event.model.event;

import com.karczewski.event.model.participation.Participant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private LocalDate eventDate;
    private LocalTime startTime;
    private int vacancies;
    private BigDecimal price;
    @OneToMany(mappedBy = "event")
    private Set<Participant> participants;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "venue_id")
    private Venue venue;
    @OneToMany(mappedBy = "event")
    private Set<NewsMessage> newsMessages;

}
