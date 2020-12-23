package myhibernate;

import static org.junit.jupiter.api.Assertions.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernatedemo.entities.Book;
import org.hibernatedemo.entities.EmbeddedContact;
import org.hibernatedemo.entities.Employee;
import org.hibernatedemo.entities.OrderWithEmbeddedContact;
import org.hibernatedemo.entities.Publisher;
import org.hibernatedemo.entities.SimpleClass;
import org.junit.jupiter.api.Test;

class ComponentTesting {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void simpleTesting() {
		  Configuration configuration = new Configuration()
				  .addPackage("org.hibernatedemo.entities")
				  .addAnnotatedClass(Book.class)
				  .addAnnotatedClass(Publisher.class)
				  .addAnnotatedClass(SimpleClass.class)
				  .addAnnotatedClass(OrderWithEmbeddedContact.class)
				  .addClass(Employee.class)
				  .setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect")
				  .setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
				  .setProperty("hibernate.connection.url",
				  "jdbc:mysql://localhost:3306/forhibernate")
				  .setProperty("hibernate.connection.username","CrazyShiva")
				  .setProperty("hibernate.connection.password","hcl")
				  .setProperty("hibernate.hbm2ddl.auto", "update")
				  .setProperty("hibernate.show_sql","true");
				 
						
				
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
				SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				Session session = sessionFactory.openSession();
				Transaction tx = session.beginTransaction();
				OrderWithEmbeddedContact owec = new OrderWithEmbeddedContact();
				owec.setHolidayContact(new EmbeddedContact("Diwali", "indi","25252525"));
				owec.setWeekdayContact(new EmbeddedContact("Siva", "Rajasthan", "2525225"));
				session.persist(owec);
				tx.commit();
				session.close();

	}

}
