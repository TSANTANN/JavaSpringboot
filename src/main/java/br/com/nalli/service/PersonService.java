package br.com.nalli.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nalli.data.model.Person;
import br.com.nalli.exception.ResourceNotFoundException;
import br.com.nalli.repository.PersonRepository;


@Service
public class PersonService {

	@Autowired
	PersonRepository repository;
	
	public Person crate(Person person) {
		
		return repository.save(person);
	}
	
	public Person findById(Long id) {
		
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID") );
	}
	
	public List<Person> findAll() {
		return repository.findAll();		
	}
	
	public Person update(Person person) {
		Person entity = repository.findById(person.getId())
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));		
		
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
		
		return repository.save(entity);		
		
	}
	
	public void delete(Long id) {
		Person entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));	
		
		repository.delete(entity);
	}	
	
	
}
