package com.crm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "passport")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "issue_date", nullable = false)
    private String issueDate;

    @Column(name = "expiry_date", nullable = false)
    private String expiryDate;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

}