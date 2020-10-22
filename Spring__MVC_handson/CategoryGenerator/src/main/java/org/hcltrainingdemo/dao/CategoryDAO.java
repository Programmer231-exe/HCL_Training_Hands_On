package org.hcltrainingdemo.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hcltrainingdemo.model.Category;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class CategoryDAO {
	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public boolean createCategory(Category category) {
		Serializable id = template.save(category);
		System.out.println(id);
		if(id != null)
			return true;
		else
			return false;
	}
	
	public boolean updateCategory(Category category) {
		template.update(category);
		return true;
	}
	
	public List<Category> getCategories(){
		List<Category> events = new ArrayList<>();
		events = template.loadAll(Category.class);
		return events;
	}
	
	public boolean deleteCategory(int id) {
		Category category = this.getCategory(id);
		System.out.println(category.getName() + " "+ category.getId());
		template.delete(category);

		return true;
	}
	
	public Category getCategory(int id) {
		Category category = template.get(Category.class,id);
		return category;
	}
}
