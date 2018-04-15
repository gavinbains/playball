import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/*import net.thegreshams.firebase4j.error.FirebaseException;
import net.thegreshams.firebase4j.error.JacksonUtilityException;
import net.thegreshams.firebase4j.model.FirebaseResponse;
import net.thegreshams.firebase4j.service.Firebase;*/


public class testOne {

	public static void main(String[] args) throws FirebaseException, IOException, JacksonUtilityException {
	
		String firebase_baseUrl = "https://hoop2-98f52.firebaseio.com/";	
		DataGrabber grabber = new DataGrabber(firebase_baseUrl);
		System.out.println("\nGetting Locations:\n" + grabber.getAllUserLocations());
		System.out.println("\nGetting Users:\n" + grabber.getAllUsers());
		System.out.println("\nGetting User rhn2z0tbpCUo7modoXD0IlYEDDp1:\n" + grabber.getUser("rhn2z0tbpCUo7modoXD0IlYEDDp1"));
		System.out.println(grabber.getUser("notauser"));
	}
}
