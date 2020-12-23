package myhibernate;

import static org.junit.jupiter.api.Assertions.fail;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernatedemo.entities.Book;
import org.junit.jupiter.api.Test;

class HibernateTesters {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testCreate() {
		Configuration configuration = new Configuration()
				.addResource("Book.hbm.xml")
				.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect")
				.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
				.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/forhibernate")
				.setProperty("hibernate.connection.username","CrazyShiva")
				.setProperty("hibernate.connection.password","hcl")
				.setProperty("hibernate.hbm2ddl.auto", "update");
	
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Book book = new Book();
		book.setId(1);
		book.setAuthor("Sivasankar");
		book.setPublisher("Pearson");
		session.persist(book);
		tx.commit();
		session.close();
		
	}

}
