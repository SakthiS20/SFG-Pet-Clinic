package net.breezeware.sfgpetclinic.services;

import java.util.Set;

import net.breezeware.sfgpetclinic.model.Pet;

public interface PetService {
	
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();

}
