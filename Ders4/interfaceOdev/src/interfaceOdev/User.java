package interfaceOdev;

public class User {

	protected static int userId;

	public User(int userId) {
		super();
		this.userId = userId;
		
	}

	public static int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
