package com.zensar.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.bean.AdvertisementStatus;
import com.zensar.service.AdvertisementStatusService;

@RestController
public class AdvertisementStatusController {
	@Autowired
	AdvertisementStatusService service;
	@PostMapping(value="/status/add")
	public AdvertisementStatus f1(@RequestBody AdvertisementStatus status) {
		return this.service.addAdvertisementStatus(status);
	}
	@GetMapping(value="/advertise/status")
 	public List<AdvertisementStatus>getAllAdvertisementStatus(){
		return this.service.getAllAdvertisementStatus();
	}

}
