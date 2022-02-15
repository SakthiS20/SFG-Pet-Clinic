package net.breezeware.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import net.breezeware.sfgpetclinic.model.Speciality;
import net.breezeware.sfgpetclinic.model.Vet;
import net.breezeware.sfgpetclinic.services.SpecialityService;
import net.breezeware.sfgpetclinic.services.VetService;

@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long>implements VetService{

	private final SpecialityService specialityService;
	
	public VetMapService(SpecialityService specialityService) {
	this.specialityService = specialityService;
	}
	
	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}
	@Override
	public void delete(Vet object) {
	    super.delete(object);
	}
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Vet findById(Long id) {
	        return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		if(object.getSpecialities().size() > 0) {
			object.getSpecialities().forEach(Speciality ->{
				if(Speciality.getId() == null) {
					Speciality saveSpeciality = specialityService.save(Speciality);
					Speciality.setId(saveSpeciality.getId());
							
				}
			});
		}
			
		return super.save(object);
	}
	
}
