import java.util.List;

import org.hcltrainingdemo.dao.CategoryDAO;
import org.hcltrainingdemo.model.Category;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

/*
 * import java.util.List;
 * 
 * import org.hcltrainingdemo.dao.TodayEventsDAO; import
 * org.hcltrainingdemo.model.TodayEvents; import
 * org.springframework.context.ApplicationContext; import
 * org.springframework.context.support.ClassPathXmlApplicationContext; import
 * org.springframework.context.support.FileSystemXmlApplicationContext; import
 * org.springframework.jdbc.datasource.DriverManagerDataSource;
 * 
 * public class DataBaseTester { public static void main(String[] args) throws
 * Exception {
 * 
 * 
 * ApplicationContext appContext = new FileSystemXmlApplicationContext(
 * "C:\\Users\\s.sivasan\\workspace-sts-3.9.3\\EnrichEntertainment\\WebContent\\WEB-INF\\config\\dispatcher.xml"
 * );
 * 
 * DriverManagerDataSource dataSource =
 * appContext.getBean(DriverManagerDataSource.class);
 * 
 * System.out.println(dataSource.getUrl());
 * System.out.println(dataSource.getPassword());
 * 
 * TodayEventsDAO dao = appContext.getBean("d",TodayEventsDAO.class);
 * 
 * List<TodayEvents> lists = dao.getEvents();
 * 
 * for(TodayEvents event : lists) { System.out.println(event.getEventName()); }
 * 
 * 
 * ((FileSystemXmlApplicationContext)appContext).close();
 * 
 * } }
 */

public class DataBaseTester{
	public static void main(String[] args) {
		ApplicationContext appContext = new FileSystemXmlApplicationContext(
				  "C:\\Users\\s.sivasan\\workspace-sts-3.9.3\\CategoryGenerator\\WebContent\\WEB-INF\\config\\dispatcher.xml"  );
		
		CategoryDAO dao  = appContext.getBean("d",CategoryDAO.class);
		List<Category> list = dao.getCategories();
		for(Category category : list) {
			System.out.println(category.getName());
		}
		
		
		dao.createCategory(new Category(3,"RAmmor"));
		/* Category category = new Category(); category.setName("Sivasankar");
		 * dao.createCategory(category); dao.getTemplate().delete(new
		 * Category(2,"Suuthd")); dao.getTemplate().flush();
		 * System.out.println(dao.deleteCategory(2));
		 * 
		 */
		dao.getTemplate().merge(new Category(3,"Ramyaa"));		dao.getTemplate().update("name", new Category(3,"Rammmya"));
		dao.updateCategory(new Category(4,"Rammor"));
		
		dao.deleteCategory(1);
		
		
		
		((FileSystemXmlApplicationContext)appContext).close();
		
		
	}
}