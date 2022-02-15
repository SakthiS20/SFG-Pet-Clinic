package net.breezeware.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import net.breezeware.sfgpetclinic.model.Owner;
import net.breezeware.sfgpetclinic.repositories.OwnerRepository;
import net.breezeware.sfgpetclinic.repositories.PetRepository;
import net.breezeware.sfgpetclinic.repositories.PetTypeRepository;
import net.breezeware.sfgpetclinic.services.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService{

	private final OwnerRepository ownerRepository;
	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;
	
	public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
			PetTypeRepository petTypeRepository) {
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);;
		return owners;
	}

	@Override
	public Owner findById(Long id) {
		/*
		Optional<Owner> optionalOwner =  ownerRepository.findById(id);
		if(optionalOwner.isPresent()) {
			return optionalOwner.get();
		} else {
			return null;
		}		
		return optionalOwner.orElse(null);
		*/
		
		return ownerRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner object) {
		return ownerRepository.save(object);
	}

	@Override
	public void delete(Owner object) {
		ownerRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		ownerRepository.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return ownerRepository.findByLastName(lastName);
	}
	
}
