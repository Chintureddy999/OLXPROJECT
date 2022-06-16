package com.zensar.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.Advertises;
import com.zensar.db.AdvertisesDAO;

@Service
public class AdvertisesService {

	@Autowired
	AdvertisesDAO dao;

	public Advertises addAdveries(Advertises advertises) {
		return this.dao.save(advertises);
	}

	public List<Advertises> getAllAdvertises(Advertises advertises) {
		return this.dao.findAll();
	}

	public Advertises updateAdvertise(Advertises ad, Integer id) {
		Optional<Advertises> advertise = dao.findById(id);
		if (advertise != null) {
			return dao.save(ad);
		}
		return null;
	}

	public Advertises getAdvertisesById(Integer id) {
		Optional<Advertises> advertise = dao.findById(id);
		if (advertise.isPresent()) {
			return advertise.get();
		} else {
			return null;
		}
	}
	
	public boolean deleteAdvertiseById(Integer id) {
		dao.deleteById(id);
		if (dao.findById(id) != null) {
			return false;
		}
		return true;
	}
}
