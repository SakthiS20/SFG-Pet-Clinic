package net.breezeware.sfgpetclinic.services;

import net.breezeware.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);


}
