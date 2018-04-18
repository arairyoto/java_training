package standard;

public class Seat {

	public boolean isReserved;
	private User user;

	public Seat() {
		this.isReserved = false;
	}

	public void reserve(User user){
		this.isReserved = true;
		this.user = user;
	}

	public void refund(User user){
		this.isReserved = false;
		this.user = null;
	}

	public User getUser(){
		return this.user;
	}

}
