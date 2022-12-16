package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Asset;

public interface AssetRepository extends JpaRepository<Asset, Long> {
	Optional<Asset> findByid(long id);

	void deleteByid(long id);
	

}
