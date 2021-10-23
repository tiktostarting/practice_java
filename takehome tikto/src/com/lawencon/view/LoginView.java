package com.lawencon.view;

import java.util.Scanner;
import com.lawencon.validation.LoginValidationImplement;

public class LoginView {
	
	private LoginValidationImplement validasi = new LoginValidationImplement();
	
	public void show() {
		Scanner scan = new Scanner(System.in);
		System.out.println("====== Log in ======");
		System.out.print("masukan username : ");
		String username = scan.nextLine();
		System.out.print("masukan password : ");
		String password = scan.nextLine();
		String prosesLogin = validasi.tryLogin(username, password);
		System.out.println(prosesLogin);
	}
}
