package org.onlinetransactiondemo.listeners;


import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;

/**
 * Application Lifecycle Listener implementation class ServletContextListener
 *
 */
@WebListener
public class ServletContextListener implements javax.servlet.ServletContextListener, ServletContextAttributeListener {
	private static Logger logger =  Logger.getLogger(ServletContextListener.class);
	 
    
    public ServletContextListener() {
            }

	public void attributeAdded(ServletContextAttributeEvent scae)  { 
         logger.info("Context attribute added");
    }

	public void attributeRemoved(ServletContextAttributeEvent scae)  { 
         logger.info("Context Attribute removed");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
        logger.info("Servlet context destroyed");
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
         logger.info("Servlet context attribute replaced");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         logger.info("Servlet Context Initialized");
         logger.info("Application started");
    }
	
   
}
