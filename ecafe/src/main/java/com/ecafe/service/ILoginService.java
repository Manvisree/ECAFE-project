package com.ecafe.service;

import com.ecafe.entity.AppUser;
import com.ecafe.model.LoginModel;

public interface ILoginService {
	public AppUser validate(LoginModel dto);
	public AppUser register(AppUser appuser);


}
