public class UserManagement extends User {
	//creating UserManagement by using inheritance
	private User[] users= new User[4];
    private int userCount=0;
	public UserManagement(int id, String name, String password, String mail, User[] users) {
		super(id, name, password, mail);
		
	}
	
	public void addUser(User user) {
		users[userCount]=user;
		userCount++;
	}
	public void removeUser(User user) {
		for (int i = 0; i <userCount; i++) {
            if (users[i].getName() == user.name) {
                users[i] = null;
                break;
	       }
        }
	}
	public User searchUser(int id) {
		for (int i = 0; i < userCount; i++) {
            if (users[i].getId()==id) {
            	return users[i];
	        }
	
        }
		return null;
		
	}
	
}
