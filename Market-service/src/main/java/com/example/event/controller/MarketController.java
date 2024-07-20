package com.example.event.controller;

import com.example.event.model.Market;
import com.example.event.service.MarketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/market")
public class MarketController {
    @Autowired
    private MarketServiceImpl eventService;

    @PostMapping("/save")
    public String saveMarket(@RequestBody Market event){
        eventService.marketSave(event);
        return "Stock saved";
    }

    @GetMapping("/find/{id}")
    public Market findMarketById(@PathVariable int id){
        return eventService.marketFindById(id);
    }

    @GetMapping("/findall")
    public Iterable<Market> findAllMarket(){
        return eventService.marketFindAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMarketById(@PathVariable int id){
        eventService.marketDeleteById(id);
        return "Stock deleted";
    }
}
