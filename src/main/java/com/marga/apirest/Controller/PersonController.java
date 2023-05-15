/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marga.apirest.Controller;

import com.marga.apirest.Persona.Person;
import com.marga.apirest.Service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200/"})

public class PersonController {
    
    private final PersonService personService;
    
    @PostMapping
    public void createPersona(@RequestBody Person person)
    {
        personService.createPersona(person);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
    if(!personService.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"),HttpStatus.BAD_REQUEST);
    personService.delete(id);
    
    return new ResponseEntity(new Mensaje("Usuario eliminado"), HttpStatus.OK);
    }
    
    @PostMapping("/login")
    public Person login(@RequestBody Person person){
    return personService.login(person.getEmail(), person.getPassword());
    }
}
