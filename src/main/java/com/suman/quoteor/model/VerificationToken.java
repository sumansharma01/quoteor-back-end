package com.suman.quoteor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "verification_token_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VerificationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "verification_token_id")
    private Long id;

    private String token;

    @Column(name = "expiry_date")
    private Instant expiryDate;

    @OneToOne
    private User user;
}
