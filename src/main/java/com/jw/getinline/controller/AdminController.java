package com.jw.getinline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/admin")
@Controller
public class AdminController {

    @GetMapping("/places")
    public String adminPlaces(){ return "admin/places";}

    @GetMapping("/places/{placeId}")
    public String adminPlaceDetail(@PathVariable Integer placeId){ return "admin/place-detail";}

    @GetMapping("/events")
    public String adminEvents(){ return "admin/events";}

    @GetMapping("events/{eventId}")
    public String adminEventDetail(@PathVariable Integer eventId){return "admin/event-detail";}
}
