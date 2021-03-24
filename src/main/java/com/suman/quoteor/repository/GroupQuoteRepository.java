package com.suman.quoteor.repository;

import com.suman.quoteor.model.GroupQuote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupQuoteRepository extends JpaRepository<GroupQuote,Long> {
}
