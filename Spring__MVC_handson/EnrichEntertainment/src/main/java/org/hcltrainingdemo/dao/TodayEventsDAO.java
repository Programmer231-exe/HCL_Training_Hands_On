package org.hcltrainingdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hcltrainingdemo.model.TodayEvents;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class TodayEventsDAO {
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public List<TodayEvents> getEvents(){
		List<TodayEvents> events = new ArrayList<TodayEvents>();
		events = template.loadAll(TodayEvents.class);
		return events;
	}
}
