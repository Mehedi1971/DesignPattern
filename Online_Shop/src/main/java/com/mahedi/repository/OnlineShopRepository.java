package com.mahedi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahedi.model.OnlineShop;

@Repository
public interface OnlineShopRepository extends JpaRepository<OnlineShop, Long>{

}
