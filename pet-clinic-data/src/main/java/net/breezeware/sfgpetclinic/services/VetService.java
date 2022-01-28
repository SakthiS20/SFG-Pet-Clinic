package net.breezeware.sfgpetclinic.services;

import java.util.Set;

import net.breezeware.sfgpetclinic.model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();

}
