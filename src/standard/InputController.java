package standard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputController {

	public static int inputSeatNum() throws IOException{
		//Input form
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		System.out.print(">");

		String str = br.readLine();
		int num = Integer.parseInt(str);
		num--;

		return num;

	}

	public static User inputUserInformation() throws IOException {
		// Welcome
		System.out.println("ユーザ情報を入力してください。");

		//Input form
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		System.out.print("名前(name)>");
		String name = br.readLine();

		System.out.print("電話番号(tel)>");
		String tel = br.readLine();
		while(!tel.matches("[0-9]{10,11}")) {
			System.out.println("電話番号が不正です。");
			System.out.print("電話番号(tel)>");
			tel = br.readLine();
		}

		System.out.print("メールアドレス(email)>");
		String email = br.readLine();
		while(!email.matches("^[a-zA-Z0-9.]+@[a-zA-Z0-9.]+$")) {
			System.out.println("メールアドレスが不正です。");
			System.out.print("メールアドレス(email)>");
			email = br.readLine();
		}

		System.out.print("性別(gender)(1.男性, 2.女性)>");
		String gender = br.readLine();
		while(!gender.matches("[1-2]")){
			System.out.println("入力が不正です。");
			System.out.print("性別(gender)(1.男性, 2.女性)>");
			gender = br.readLine();
		}

		switch(gender){
			case "1":
				gender = "男性";
				break;
			case "2":
				gender = "女性";
				break;
			default:
				break;
		}

		System.out.print("年齢(age)>");
		String str = br.readLine();
		int age = Integer.parseInt(str);

		User user = new User(name,tel,email,gender,age);

		return user;
	}

}
