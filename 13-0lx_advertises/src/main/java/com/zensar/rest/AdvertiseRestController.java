package com.zensar.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.bean.Advertises;
import com.zensar.service.AdvertisesService;

@RestController
public class AdvertiseRestController {

	@Autowired
	AdvertisesService service;

	// To add new advertises
	@PostMapping("/advertise")
	public Advertises newAdvertise(@RequestBody Advertises advertise) {
		return service.addAdveries(advertise);
	}

	// To update existing advertise
	@PutMapping("/advertise/{id}")
	public Advertises updateAdvertise(@RequestBody Advertises ad, @PathVariable Integer id) {
		return service.updateAdvertise(ad, id);
	}

	// To read all the advertise posted by logged in user
	@GetMapping("/user/advertise")
	public List<Advertises> getAllAdvertises() {
		return this.service.getAllAdvertises(null);
	}

	// Deletes specific advertisement posted by logged in user
	@DeleteMapping("/user/advertise/{postId}")
	public boolean deleteAdvertiseById(@PathVariable("id") Integer id) {
		return service.deleteAdvertiseById(id);
	}

	// Get Advertise by id
	@RequestMapping("/advertise/{postId}")
	public Advertises getAdvertisesById(@PathVariable Integer id) {
		return service.getAdvertisesById(id);
	}

}
