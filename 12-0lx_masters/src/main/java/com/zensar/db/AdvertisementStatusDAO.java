package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.AdvertisementStatus;
@Repository
public interface AdvertisementStatusDAO  extends JpaRepository<AdvertisementStatus, Integer>{

}
