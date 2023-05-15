
package com.marga.apirest.Persona;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import lombok.Data;


@Data

@Entity
public class Person {
    
    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private String nombre;
    private String password;
    private String email;

    public Person(Integer id, String nombre, String password, String email) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.email = email;
    }

    public Person() {
    }
    

    
    
}
