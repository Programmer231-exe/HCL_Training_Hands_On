package org.requireddemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		Box box = appContext.getBean(Box.class);
		box.display();
		((ClassPathXmlApplicationContext)appContext).close();		
	}
}



/*
ConfigurationBuilder<BuiltConfiguration> builder = ConfigurationBuilderFactory.newConfigurationBuilder();
		AppenderComponentBuilder console = builder.newAppender("stdout", "console");
		builder.add(console);
		
		AppenderComponentBuilder file = builder.newAppender("log","File");
		file.addAttribute("fileName", "target/logging.log");
		builder.add(file);
		
		FilterComponentBuilder flow = builder.newFilter("MarkerFilter",Filter.Result.ACCEPT,Filter.Result.DENY);
		flow.addAttribute("marker","FLOW");
		console.add(flow);
		
		LayoutComponentBuilder standard = builder.newLayout("PatternLayout");
		standard.addAttribute("pattern","%d [%t] %-5level: %msg%n%throwable");
		console.add(standard);
		file.add(standard);
		
		RootLogger
		Logger logger = LogManager.getLogger(Main.class.getName());
		System.out.println(logger.getName());
		System.out.println(logger.toString());
		logger.info("This is logging");
		logger.debug("This is working");
		logger.warn("So What", "message", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7");
*/