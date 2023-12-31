package com.increff.pos.controller;

import com.increff.pos.model.AboutAppData;
import com.increff.pos.service.AboutAppService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class AboutController {

	@Autowired
	private AboutAppService service;

	@ApiOperation(value = "Gives application name and version")
	@RequestMapping(path = "/api/about", method = RequestMethod.GET)
	public AboutAppData getDetails() {
		AboutAppData data = new AboutAppData();
		data.setName(service.getName());
		data.setVersion(service.getVersion());
		return data;
	}



}
