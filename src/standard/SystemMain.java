package standard;

public class SystemMain {

	public static void main(String[] args){
		// Welcome
		System.out.println("ようこそ浅草ジャマイカホームへ！\n\n");
		System.out.println("何番の座席を予約しますか？(1～30)");

		try {
			SeatsManager.setSeatArray();
			int seatNum = InputController.inputSeatNum();

			while(SeatsManager.checkVacantSeat(seatNum)){
				System.out.println("※予約済みの座席です。他の席を選択してください。");
				seatNum = InputController.inputSeatNum();
			}

			User user = InputController.inputUserInformation();
			System.out.println(user.toString());
			AutoSelectLogic.autoSelectSeat(user);
//			SeatsManager.reserveSeat(user, seatNum);
			SeatsManager.show();

		} catch(Exception e){
			System.out.println("システムエラーが発生しました。");
			System.out.println("システムを終了します。");
		}

	}

}
