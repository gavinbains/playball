import java.io.FileInputStream;

public class AdminSDKInit {
	FileInputStream serviceAccount = new FileInputStream("/PlayBallServer/playball-edd74-firebase-adminsdk-hsx4b-ae88634236.json");

	FirebaseOptions options = new FirebaseOptions.Builder()
	    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
	    .setDatabaseUrl("https://playball-edd74.firebaseio.com/")
	    .build();

	FirebaseApp.initializeApp(options);

}