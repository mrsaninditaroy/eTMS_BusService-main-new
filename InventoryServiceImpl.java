package com.details.inventory.inventoriesserver.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.details.inventory.inventoriesserver.repositories.InventoryRepository;
import com.details.inventory.inventoriesserver.services.InventoryService;
import com.details.inventory.inventoriesservernew.entities.Inventory;

public class InventoryServiceImpl implements InventoryService{
	
	@Autowired
	InventoryRepository inventoryRepository;

	@Override
	public Inventory createInventory(Inventory inventory) {
		return (inventoryRepository.save(inventory));
	}

	@Override
	public ResponseEntity<String> deleteInventory(String inventoryid) {
		return new ResponseEntity<String>("Inventory with inventoryid->"+inventoryid +" "+ "deleted successfully.",HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Inventory> getInventory(@PathVariable String inventoryid) {
		
		Inventory inventory = inventoryRepository.findById(inventoryid).get();		
		
		return new ResponseEntity<>(inventory,HttpStatus.OK);
	}	

}
