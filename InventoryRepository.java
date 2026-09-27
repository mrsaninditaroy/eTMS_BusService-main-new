package com.details.inventory.inventoriesserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.details.inventory.inventoriesservernew.entities.*;
 
public interface InventoryRepository 
	extends JpaRepository<Inventory,String> {

}
