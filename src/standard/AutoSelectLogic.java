package standard;

public class AutoSelectLogic {
	public static boolean logic1(int seatNum){
		return (SeatsManager.checkVacantSeat(seatNum-1) && SeatsManager.checkVacantSeat(seatNum) && SeatsManager.checkVacantSeat(seatNum+1));
	}

	public static boolean logic2(int seatNum){
		User user = SeatsManager.getSeat(seatNum).getUser();
		User userLeft = SeatsManager.getSeat(seatNum-1).getUser();
		User userRight = SeatsManager.getSeat(seatNum+1).getUser();
		return (user.getGender() == userLeft.getGender()) && (user.getGender() == userRight.getGender());
	}

	public static boolean logic3(int seatNum){
		return SeatsManager.checkVacantSeat(seatNum);
	}

	public static int checkLogic1(){
		int available = 0;
		for(int i=1;(i+1)<Constant.total;i++){
			if(logic1(i)){
				continue;
			}else{
				available = i;
				break;
			}
		}
		return available;
	}

	public static int checkLogic2(){
		int available = 0;
		for(int i=1;(i+1)<Constant.total;i++){
			if(logic2(i)){
				continue;
			}else{
				available = i;
				break;
			}
		}
		return available;
	}

	public static int checkLogic3(){
		int available = 0;
		for(int i=0;i<Constant.total;i++){
			if(logic3(i)){
				continue;
			}else{
				available = i;
				break;
			}
		}
		return available;
	}

	public static void autoSelectSeat(User user){
		int available = 0;

		if(checkLogic1()!=0){
			available = checkLogic1();
		} else if(checkLogic2()!=0){
			available = checkLogic2();
		} else {
			available = checkLogic3();
		}

		SeatsManager.reserveSeat(user, available);

	}
}
