package tutorialLog;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


/*
 * @autor: Jhon Edison Gomez
 * @fecha: 21/06/2016
 * @descripción: Class to execute the log
 * */
public class Main {
	
	static final Logger logger = Logger.getRootLogger();
	
	
	//method to get configuration
	public void getConfig(){
		PropertyConfigurator.configure(this.getClass().getClassLoader().getResource("log4j.properties"));
	}
	
	public static void main(String[] args) {
		
		Main objMain = new Main();
		objMain.getConfig();
		logger.debug("Sample debug message");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
		

	}

}
