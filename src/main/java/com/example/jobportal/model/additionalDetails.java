package com.example.jobportal.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class additionalDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addId;
    private String bio;
    private String jobTitle;

    @OneToOne
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private PersonalDetails personalDetails;



}
