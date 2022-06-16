package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zensar.bean.Advertises;

@Repository
public interface AdvertisesDAO extends JpaRepository<Advertises, Integer> {

}