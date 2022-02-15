package net.breezeware.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import net.breezeware.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long>{

}
