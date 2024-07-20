package com.example.event.service;

import com.example.event.model.Event;

import java.util.List;

public interface EventService {
    public Event eventFindById(int id);
    public List<Event> eventFindAll();
    public void eventSave(Event stock);
    public void eventDeleteById(int id);
}
