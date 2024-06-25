package fr.diginamic.singleton;

public class ExecuteSingleton {

	public static void main(String[] args) {
		Configuration config = Configuration.getInstance();
		
		String dbUrl = config.getValue("db.url");
		String dbUser = config.getValue("db.user");
		
		System.out.println(dbUser);

	}

}
