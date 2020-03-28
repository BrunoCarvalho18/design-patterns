package br.com.config;

import java.io.IOException;
import java.util.Properties;


//Usando o Design Pattern Singleton
public class ConfigSingleton {
	
	private static Properties prop;
	
	private ConfigSingleton() {
	}
	
	public static Properties getInstance() {
		if(prop ==null) {
			prop = new Properties();
			try {
				prop.load(ConfigSingleton.class.getResourceAsStream("/config.properties"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return prop;
		
	}

}
