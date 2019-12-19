package br.com.nalli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import br.com.nalli.model.Person;
import br.com.nalli.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService services;
    
    
    @RequestMapping(method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Person> findAll() {       
     
        return services.findAll();
    }	
	
    @RequestMapping(value="/{id}",method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public Person findByid(@PathVariable("id") String id) {       
     
        return services.findByid(id);
    }
}
