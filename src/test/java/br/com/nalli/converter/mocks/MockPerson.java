package br.com.nalli.converter.mocks;

import java.util.ArrayList;
import java.util.List;

import br.com.nalli.data.model.Person;
import br.com.nalli.data.vo.PersonVO;

public class MockPerson {
	
	public Person mockEntity() {
		return mockEntity();
	}

	public PersonVO mockVO() {
		return mockVO(0);
	}
	
	public List<Person> mockEntityList(){
		
		List<Person> persons = new ArrayList<Person>();
		
		for (int i = 0; i<14;i++) {
			persons.add(mockEntity(i));
		}
		
		return persons;
	}

	private Person mockEntity(Integer number) {
		
		Person person = new Person();
		
			person.setAddress("Adress test" + number);
			person.setFirstName("First Name Test" + number);
			person.setLastName("LAst Name Test" + number);
			person.setGender((number % 2)==0 ? "Male":"Female");
			person.setId(number.longValue());
			
		return person;
	}
	
	private PersonVO mockVO(Integer number) {

		PersonVO person = new PersonVO();
		
		person.setAddress("Adress test" + number);
		person.setFirstName("First Name Test" + number);
		person.setLastName("LAst Name Test" + number);
		person.setGender((number % 2)==0 ? "Male":"Female");
		person.setId(number.longValue());
		
	return person;
	}
	
	
	
}
