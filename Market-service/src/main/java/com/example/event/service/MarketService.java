package com.example.event.service;

import com.example.event.model.Market;

import java.util.List;

public interface MarketService {
    public Market marketFindById(int id);
    public List<Market> marketFindAll();
    public void marketSave(Market market);
    public void marketDeleteById(int id);
}
