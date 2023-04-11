public class User {
	private final int id;
	protected final String name;
	private String password;
	private final String mail;
	
	public User(int id, String name, String password, String mail) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.mail = mail;
	
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMail() {
		return mail;
	}

	@Override
	public String toString() {
		return "User [id=" + id + 
				", name=" + name + "]" + '\n';
	}
	
	
	
	

}
