/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.model.Trainer;
import com.example.demo.repository.TrainerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author karat
 */
@Service
public class TrainerServiceImpl implements TrainerServiceInterface {

    @Autowired
    TrainerRepository trainerRepository;
    
    @Override
    public void insertTrainer(Trainer t) {
        trainerRepository.save(t);
        
    }

    @Override
    public List<Trainer> allTrainers() {
        return trainerRepository.findAll();
    }

    @Override
    public Trainer GetById(Integer id) {

      return  trainerRepository.findById(id).get();
    }

    @Override
//    @Transactional
    public void updateTrainer(Integer id,String firstname,String lastname,String subject) {

    Trainer t    =   GetById(id);
    t.setFirstname(firstname);
    t.setLastname(lastname);
    t.getSubject();
    
    insertTrainer(t);
    }

    @Override
    public void deleteTrainer(Trainer t) {
            
            trainerRepository.delete(t);
    }
    
}
