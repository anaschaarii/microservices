package com.example.event.service;

import com.example.event.model.Event;
import com.example.event.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService{
    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event eventFindById(int id) {
        return eventRepository.findById(id).get();
    }

    @Override
    public List<Event> eventFindAll() {
        return (List<Event>) eventRepository.findAll();
    }

    @Override
    public void eventSave(Event stock) {
        eventRepository.save(stock);
    }

    @Override
    public void eventDeleteById(int id) {
        eventRepository.deleteById(id);
    }
}
