package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Asset;
import com.example.demo.repository.AssetRepository;

import jakarta.transaction.Transactional;
@Transactional
@RestController
public class AssetController {
	
	

	@Autowired
	AssetRepository assetRepo;
	private final AssetRepository repository;

	AssetController(AssetRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/asset")
	List<Asset> all() {
		return repository.findAll();
	}

	@PostMapping("/addasset")
	
	Asset newAsset(@RequestBody Asset newAsset) {
		return repository.save(newAsset);
	}

	@GetMapping("/asset/{id}")

	Optional<Asset> one(@PathVariable Integer id) {

		return repository.findByid(id);

	}
	 @DeleteMapping("/asset/{id}")
	  void deleteAsset(@PathVariable Integer id) {
	    repository.deleteByid(id);
	  }

}
