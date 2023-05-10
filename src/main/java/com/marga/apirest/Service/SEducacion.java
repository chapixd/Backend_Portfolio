/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marga.apirest.Service;

import com.marga.apirest.Educacion.Educacion;
import com.marga.apirest.Repository.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    @Autowired
    REducacion rEducacion;
    
    public List<Educacion> list(){
        return rEducacion.findAll();
    }
    public Optional<Educacion> getOne(int id){
        return rEducacion.findAllById(id);
    }
    public Optional<Educacion> getByNombreEdu(String nombreEdu){
        return rEducacion.findByNombreEdu(nombreEdu);
    }
    public void Save(Educacion educacion){
        rEducacion.save(educacion);
    }
    public void delete(int id){
        rEducacion.deleteById(id);
    }
    public boolean existsById(int id){
        return rEducacion.existsById(id);
    }
    
    public boolean existsByNombreEdu(String nombreEdu){
        return rEducacion.existsByNombreEdu(nombreEdu);
    }
    
    
    
}
