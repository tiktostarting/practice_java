package com.lawencon.validation;

import com.lawencon.constant.User;
import com.lawencon.view.LoginView;
import com.lawencon.view.PedagangView;
import com.lawencon.view.PelangganView;

public class LoginValidationImplement implements LoginValidation{
	
//	private LoginView login = new LoginView();
	private PedagangView pedagang = new PedagangView();
	private PelangganView pelanggan = new PelangganView();

	public String tryLogin(String username, String password) {
		String pedagangUsernameValid = User.PEDAGANG.getUserName();
		String pedagangPasswordValid = User.PEDAGANG.getPassword();
		
		String pelangganUsernameValid = User.PELANGGAN.getUserName();
		String pelangganPasswordValid = User.PELANGGAN.getPassword();
		
		if(username.equals(pelangganUsernameValid) && password.equals(pelangganPasswordValid)) {
			routesPelanggan();
			return "Terima kasih telah berbelanja";
		}else if(username.equals(pedagangUsernameValid) && password.equals(pedagangPasswordValid)) {
			routesPedagang();
			return "Anda keluar";
		}else {
			return "maaf username dan password tidak valid";
		}
	}
	
	@Override
	public void routesPedagang() {
		pedagang.show();
	}
	
	@Override
	public void routesPelanggan() {
		pelanggan.show();
	}

}
