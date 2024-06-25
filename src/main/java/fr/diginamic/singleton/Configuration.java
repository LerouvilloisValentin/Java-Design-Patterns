package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class Configuration {
	private static Configuration instance = new Configuration();
    private ResourceBundle configuration;

    private Configuration() {
        configuration = ResourceBundle.getBundle("configuration");
	}
	
	public static Configuration getInstance() {
		return instance;
	}
	
	public String getValue(String key) {
		return configuration.getString(key);
	}
	
}
