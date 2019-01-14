package com.ityongman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ityongman.model.AccountEO;
import com.ityongman.service.IAccountService;

@RestController
public class AccountController {
	@Autowired
	private IAccountService accountService ;
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public String getAccount(@RequestParam(value="id") Long id) {
		AccountEO account = accountService.selectByKey(id);
		
		return account+"" ;
	}
}
