package br.com.nalli.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.nalli.model.Person;
import br.com.nalli.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService services;
    
    
    @RequestMapping(method= RequestMethod.GET,
    		produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Person> findAll() {       
     
        return services.findAll();
    }	
	
    @RequestMapping(value="/{id}",method= RequestMethod.GET, 
    		produces = MediaType.APPLICATION_JSON_VALUE )
    public Person findByid(@PathVariable("id") Long id) {       
     
        return services.findById(id);
    }
    
    @RequestMapping(method= RequestMethod.POST,
    		consumes = MediaType.APPLICATION_JSON_VALUE,
    		produces = MediaType.APPLICATION_JSON_VALUE  )
    public Person create(@RequestBody Person person) {       
     
        return services.crate(person);
    }
    
    @RequestMapping(method= RequestMethod.PUT,
    		consumes = MediaType.APPLICATION_JSON_VALUE,
    		produces = MediaType.APPLICATION_JSON_VALUE  )
    public Person update(@RequestBody Person person) {       
     
        return services.update(person);
    }
    
    @RequestMapping(value="/{id}",method= RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {      
        services.delete(id);
    }
    
}
