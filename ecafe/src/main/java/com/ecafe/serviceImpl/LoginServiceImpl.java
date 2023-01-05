package com.ecafe.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecafe.entity.AppUser;
import com.ecafe.model.LoginModel;
import com.ecafe.repository.AppUserRepository;
import com.ecafe.service.ILoginService;



@Service
public class LoginServiceImpl implements ILoginService  {
	@Autowired
	private AppUserRepository repo;
	
	@Override
	public AppUser validate(LoginModel loginmodel) {
		AppUser appuser = repo.findById(loginmodel.getUserid()).orElse(null);
	if(appuser!=null && appuser.getPassword().equals(loginmodel.getPassword())) {
		return appuser;
	}
		return null;
	}

	@Override
	public AppUser register(AppUser appuser) {
		// TODO Auto-generated method stub
			this.repo.save(appuser);
		return appuser;
		
	}
	
	

}

