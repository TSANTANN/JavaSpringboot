package br.com.nalli.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.nalli.model.Person;

@Service
public class PersonService {
	private final AtomicLong counter = new AtomicLong();
	
	public Person findByid(String id) {
		Person person = new Person();
		
		person.setId(counter.incrementAndGet());
		person.setFirstName("Thiago");
		person.setLastName("Canalli");
		person.setAddress("Araraquara, Solaris, Marks Jan, 32");
		person.setGender("Male");
		
		return person;		
		
	}
	
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();
		
		for (int i = 0; i<8; i++) {
		Person person = mockPerson(i);
		persons.add(person);
		}
		return persons;		
		
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person Name" + i);
		person.setLastName("Last Name" + i);
		person.setAddress("Some address in Brazil" + i);
		person.setGender("Male" + i);
		
		return person;		

	}
	
}
