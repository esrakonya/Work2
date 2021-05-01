package work2;


public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kaydedildi.");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
			
	}

}
