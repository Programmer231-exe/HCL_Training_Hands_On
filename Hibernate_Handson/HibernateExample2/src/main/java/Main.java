import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernatedemo.entities.Address;
import org.hibernatedemo.entities.EmbeddedContact;
import org.hibernatedemo.entities.OrderWithEmbeddedContact;

public class Main {
	

	public static void main(String[] args) {
		
		/*
		 * Configuration configuration = new Configuration()
		 * .addResource("Book.hbm.xml")
		 * .setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect")
		 * .setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
		 * .setProperty("hibernate.connection.url",
		 * "jdbc:mysql://localhost:3306/forhibernate")
		 * .setProperty("hibernate.connection.username","CrazyShiva")
		 * .setProperty("hibernate.connection.password","hcl")
		 * .setProperty("hibernate.hbm2ddl.auto", "update")
		 * .setProperty("hibernate.show_sql","true");
		 * 
		 */
	
		
		  Configuration configuration = new Configuration()
		  .addPackage("org.hibernatedemo.entities")
		  .addAnnotatedClass(EmbeddedContact.class)
		  .addAnnotatedClass(OrderWithEmbeddedContact.class)
		  .setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect")
		  .setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
		  .setProperty("hibernate.connection.url",
		  "jdbc:mysql://localhost:3306/forhibernate")
		  .setProperty("hibernate.connection.username","CrazyShiva")
		  .setProperty("hibernate.connection.password","hcl")
		  .setProperty("hibernate.hbm2ddl.auto", "update")
		  .setProperty("hibernate.show_sql","true");
		  
		  
		  
		  ServiceRegistry serviceRegistry = new
		  StandardServiceRegistryBuilder().applySettings(configuration.getProperties())
		  .build(); SessionFactory sessionFactory =
		  configuration.buildSessionFactory(serviceRegistry); Session session =
		  sessionFactory.openSession(); Transaction tx = session.beginTransaction();
		  EmbeddedContact holidayContact = new EmbeddedContact();
		   holidayContact.setAddress("MyAddress");
		   holidayContact.setName("ABCD");
		   holidayContact.setPhone("92837492873");
		   EmbeddedContact weekdayContact = new EmbeddedContact();
		   weekdayContact.setAddress("WeekdayAddress");
		   weekdayContact.setName("ABCDE");
		   weekdayContact.setPhone("923742374");
		   
		   OrderWithEmbeddedContact owec = new OrderWithEmbeddedContact();
		   owec.setHolidayContact(holidayContact);
		   owec.setWeekdayContact(weekdayContact);
		   session.persist(owec);
		   tx.commit();
		   session.close();
		  }	
}