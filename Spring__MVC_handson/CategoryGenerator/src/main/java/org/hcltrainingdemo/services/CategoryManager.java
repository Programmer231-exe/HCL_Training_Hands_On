package org.hcltrainingdemo.services;

import java.util.List;

import org.hcltrainingdemo.dao.CategoryDAO;
import org.hcltrainingdemo.model.Category;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoryManager {

	private static ApplicationContext appContext = new FileSystemXmlApplicationContext("C:\\Users\\s.sivasan\\workspace-sts-3.9.3\\CategoryGenerator\\WebContent\\WEB-INF\\config\\dispatcher.xml");

	@Transactional
	public static List<Category> getAllCategory() {
		CategoryDAO dao = appContext.getBean("d",CategoryDAO.class);
		
		return dao.getCategories();
	}
	
	@Transactional
	public static boolean createCategory(Category category) {
		CategoryDAO dao = appContext.getBean("d",CategoryDAO.class);
		return dao.createCategory(category);
	}

	@Transactional
	public static boolean deleteCategory(int id) {
		// TODO Auto-generated method stub
		CategoryDAO dao = appContext.getBean("d",CategoryDAO.class);
		return dao.deleteCategory(id); 
	}
	
	@Transactional
	public static boolean updateCategory(Category category) {
		CategoryDAO dao  = appContext.getBean("d",CategoryDAO.class);
		return dao.updateCategory(category);
	}
}
