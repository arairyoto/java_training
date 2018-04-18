package standard;

import java.util.ArrayList;
import java.util.List;

public class SeatsManager {
	private static List<Seat> seatArray = new ArrayList<Seat>();

	public static void setSeatArray() {
		// Seat[] tempArray = new Seat[30];
		// Arrays.fill(tempArray, new Seat());
		// seatArray = Arrays.asList(tempArray);
		for (int i = 0; i < Constant.total; i++) {
			seatArray.add(new Seat());
			User user = new User();
			if ((i + 1) % 5 == 0) {
				seatArray.get(i).reserve(user);
			}
		}
	}

	public static boolean checkVacantSeat(int seatNum) {
		return seatArray.get(seatNum).isReserved;
	}

	public static Seat getSeat(int seatNum) {
		return seatArray.get(seatNum);
	}

	public static void reserveSeat(User user, int seatNum) {
		seatArray.get(seatNum).reserve(user);
	}

	public static void show() {
		for (Seat s : seatArray) {
			System.out.print(s.isReserved);
			System.out.println(s.getUser());
		}
	}

}
