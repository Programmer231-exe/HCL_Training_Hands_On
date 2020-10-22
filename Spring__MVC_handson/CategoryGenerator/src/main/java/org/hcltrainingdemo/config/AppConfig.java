/*
 * package org.hcltrainingdemo.config;
 * 
 * import java.io.FileInputStream; import java.util.Properties;
 * 
 * import javax.sql.DataSource;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.ComponentScan; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.context.annotation.PropertySources; import
 * org.springframework.jdbc.datasource.DriverManagerDataSource; import
 * org.springframework.orm.hibernate5.LocalSessionFactoryBean; import
 * org.springframework.web.servlet.ViewResolver; import
 * org.springframework.web.servlet.config.annotation.EnableWebMvc; import
 * org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
 * import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
 * import org.springframework.web.servlet.view.InternalResourceViewResolver;
 * 
 * @Configuration
 * 
 * @EnableWebMvc
 * 
 * @ComponentScan(basePackages = {"org.hcltrainingdemo"})
 * 
 * @PropertySources("classpath:") public class AppConfig implements
 * WebMvcConfigurer{
 * 
 * @Bean public ViewResolver configResolver() { InternalResourceViewResolver vr
 * = new InternalResourceViewResolver(); vr.setPrefix("/WEB-INF/views");
 * vr.setSuffix(".jsp"); return vr; }
 * 
 * @Override public void addResourceHandlers(ResourceHandlerRegistry registry) {
 * registry.addResourceHandler("/resources/**").addResourceLocations(
 * "/resources/"); }
 * 
 * 
 * 
 * 
 * <bean id="mySessionFactory"
 * class="org.springframework.orm.hibernate5.LocalSessionFactoryBean"
 * p:dataSource-ref="dataSource"> <property name="mappingResources"> <list>
 * <value>TodayEvents.hbm.xml</value> </list> </property>
 * 
 * <property name="hibernateProperties"> <props> <prop
 * key="hibernate.dialect">org.hibernate.dialect.MySQL8Dialect</prop> <prop
 * key="hibernate.hbm2ddl.auto">update</prop> <prop
 * key="hibernate.show_sql">true</prop> </props> </property> </bean> <bean
 * id="template" class="org.springframework.orm.hibernate5.HibernateTemplate"
 * p:sessionFactory-ref="mySessionFactory" />
 * 
 * <bean id="d" class="org.hcltrainingdemo.dao.TodayEventsDAO"
 * p:template-ref="template" />
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @Bean(name = "dataSource") public DataSource getDataSource() throws
 * Exception{ DriverManagerDataSource dmds = new DriverManagerDataSource();
 * Properties properties = new Properties(); properties.load(new
 * FileInputStream("mysqlDB.properties"));
 * dmds.setDriverClassName(properties.getProperty("db.Driver"));
 * dmds.setUrl(properties.getProperty("db.URL"));
 * dmds.setUsername(properties.getProperty("db.username"));
 * dmds.setPassword(properties.getProperty("db.password")); return dmds;
 * 
 * }
 * 
 * 
 * @Bean(name ="mySessionFactory") public LocalSessionFactoryBean getFactory()
 * throws Exception{ LocalSessionFactoryBean factory = new
 * LocalSessionFactoryBean(); factory.setDataSource(getDataSource());
 * factory.setHibernateProperties(); return factory; }
 * 
 * }
 */