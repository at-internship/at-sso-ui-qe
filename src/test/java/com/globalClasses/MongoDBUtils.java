package com.globalClasses;

import com.google.gson.JsonObject;
import org.json.JSONArray;
import org.json.JSONObject;

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
}
