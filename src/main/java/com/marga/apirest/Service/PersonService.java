
package com.marga.apirest.Service;

import com.marga.apirest.Persona.Person;
import com.marga.apirest.Persona.iPersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    
    private final iPersonRepository personRepo;
    
    public void createPersona(Person person)
    {
        personRepo.save(person);
    }

    public void delete(int id) {
                    personRepo.deleteById(id);    }

    public boolean existsById(int id) {
         return personRepo.existsById(id);
    }
    
    public Person login(String email, String password){
    return personRepo.findByEmailAndPassword(email, password);
    }
    
    
            
    
    
}
