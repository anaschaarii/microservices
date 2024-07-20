package com.example.event.controller;

import com.example.event.model.Event;
import com.example.event.service.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
public class EventController {
    @Autowired
    private EventServiceImpl eventService;

    @PostMapping("/save")
    public String saveEvent(@RequestBody Event event){
        eventService.eventSave(event);
        return "Stock saved";
    }

    @GetMapping("/find/{id}")
    public Event findEventById(@PathVariable int id){
        return eventService.eventFindById(id);
    }

    @GetMapping("/findall")
    public Iterable<Event> findAllEvent(){
        return eventService.eventFindAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEventById(@PathVariable int id){
        eventService.eventDeleteById(id);
        return "Stock deleted";
    }
}
