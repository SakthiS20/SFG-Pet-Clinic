package net.breezeware.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import net.breezeware.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long>{
	Owner findByLastName(String lastName);
}
