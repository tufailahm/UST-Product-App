package com.ust.pms.controller;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.pms.model.CredentialConfiguration;

@RestController
public class IndexController {

	@Autowired
	CredentialConfiguration credentialsConfiguration;
	
	@Value("${companyName}")
	String cName;

	@RequestMapping("/")
	public String index() {
		return "Welcome Page in " + cName;

	}
	
	@RequestMapping("/displayCredentials")
	public Map displayCredentials() {

		Map data = new HashMap();
		data.put("username", credentialsConfiguration.getUsername());
		data.put("password", credentialsConfiguration.getPassword());
		data.put("secretquestion", credentialsConfiguration.getSecretquestion());
		data.put("secretanswer", credentialsConfiguration.getSecretanswer());
		return data;
	}

	@RequestMapping("/customer/{customerName}")
	public String customer(@PathVariable("customerName") String customerName) {
		return "Welcome Page in Customer " + customerName;
	}
}
