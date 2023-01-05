package com.ecafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecafe.entity.AppUser;
import com.ecafe.model.LoginModel;
import com.ecafe.service.ILoginService;




	@RestController
	@RequestMapping("/appuser")
	public class AppUserController {
	@Autowired 
	private ILoginService service;
	
	@PostMapping("/validate")
	public ResponseEntity<?> validate (@RequestBody LoginModel loginmodel){
		System.out.println(loginmodel);
		AppUser appuser=service.validate(loginmodel);
		if(appuser == null)
			return ResponseEntity.badRequest().body("Incorrect user");
		return ResponseEntity.ok(appuser);
	}
	
	@PostMapping("/register")
	public AppUser register(AppUser appuser) {
         return this.service.register(appuser);
		
	}
	
	

}

