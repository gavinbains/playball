import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import com.google.gson.Gson;

public class DataGrabber {
	Firebase firebase;
	FirebaseResponse response;
	public DataGrabber(String url) {
		try {
			firebase = new Firebase(url);
		} catch (FirebaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getAllUserLocations() {
		try {
			response = firebase.get("AllUserLocations");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FirebaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response.toString();
	}
	
	public String getAllUsers() {
		try {
			response = firebase.get("users");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FirebaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String allUsers = "{\"users\":[" + response.toString() + "]}";
		String allUsers = response.toString();
		return allUsers;
	}
	
	public String getUser(String userID) {
		try {
			response = firebase.get("users/" + userID);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FirebaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String user = response.toString();
		if(user.equals("null")) {
			user = "User not found!";
		}
		return user;
	}
}
