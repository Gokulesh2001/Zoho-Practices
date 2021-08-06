package socialNetwork;
import java.util.*;

public class user {
	String email;
	String password;
	ArrayList<user> friendsList=new ArrayList<>();
    boolean isOnline=true;
	user(String email,String password){
		this.email=email;
		this.password=password;
	}
}
