package com.globalClasses;

public class MongoDBUtils {
	public static boolean compareAllJsonString(String env, String mDataBase, String collection, String json) {
		MongoDBConnection db = new MongoDBConnection(env, mDataBase);
		boolean bool;
		try {
			bool = db.compareAllJsonString(collection, json);
		} catch(Exception var9) {
			var9.printStackTrace();
			bool = false;
		} finally {
			db.close();
		}
		return bool;
	}
	
	public static boolean existID(String env, String mDataBase, String collection, String id) {
		MongoDBConnection db = new MongoDBConnection(env, mDataBase);
		boolean exist = db.compareID(collection, id);
		db.close();
		return exist;
	}
}

