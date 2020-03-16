package com.dev21.pd4.factorymethod2;

public class MongoClientConnection {
	
	public static void main(String[] args) {
		ConnectionFactory connectionFactory;
		try {
			connectionFactory = (ConnectionFactory) getInstance(args[0]);
			Connection connection = connectionFactory.getConnection();
			
			connection.showObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Object getInstance(String className) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException {
		return Class.forName(className).newInstance();
		
	}

}
