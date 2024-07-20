package com.example.event.service;

import com.example.event.model.Market;
import com.example.event.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketServiceImpl implements MarketService{
    @Autowired
    private MarketRepository marketRepository;

    @Override
    public Market marketFindById(int id) {
        return marketRepository.findById(id).get();
    }

    @Override
    public List<Market> marketFindAll() {
        return (List<Market>) marketRepository.findAll();
    }

    @Override
    public void marketSave(Market stock) {
        marketRepository.save(stock);
    }

    @Override
    public void marketDeleteById(int id) {
        marketRepository.deleteById(id);
    }
}
