package com.suman.quoteor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "group_quote_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupQuote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "group_quote_id")
    private Long groupQuoteId;

    @Column(name = "group_quote_name", unique = true, nullable = false)
    private String groupQuoteName;

    @Lob
    @Column(name = "group_quote_description")
    private String groupQuoteDescription;

    @Column(name="created_date")
    private Instant createdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Quote> quote;


}
