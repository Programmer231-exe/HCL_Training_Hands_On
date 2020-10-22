package org.hcltrainingdemo.controller;

import org.hcltrainingdemo.services.GetEvents;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodayEventsController {

	@GetMapping("/todayevents")
	public String todayEvent(Model model) {
		model.addAttribute("eventlist",GetEvents.getEvents());
		return "todayEvents";
	}
}
