/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.model.Trainer;
import java.util.List;

/**
 *
 * @author karat
 */
public interface TrainerServiceInterface {
    
    public void insertTrainer(Trainer t);
    
    public List<Trainer> allTrainers();
    
    public Trainer GetById(Integer id); 
    
    public void updateTrainer(Integer id,String firstname,String lastname, String subject);
    
    public void deleteTrainer(Trainer t);
    
}
