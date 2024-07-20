package com.example.event.repository;

import com.example.event.model.Market;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketRepository extends MongoRepository<Market,Integer> {
}
