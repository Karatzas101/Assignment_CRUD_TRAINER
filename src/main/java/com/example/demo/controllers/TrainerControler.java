/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controllers;

import com.example.demo.model.Trainer;
import com.example.demo.services.TrainerServiceImpl;
import com.example.demo.validation.Validation;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("trainer")

public class TrainerControler {

    @Autowired
    TrainerServiceImpl trainerService;

    @PostMapping("/insert")
    public String insertTrainer(
            @RequestParam ("firstname") String firstname,
            @RequestParam("lastname") String lastname,
            @RequestParam("subject")  String subject,
            RedirectAttributes redirectAttributes ) {
         
        
        Trainer trainer = new Trainer(firstname, lastname, subject);
        Validation valid = new Validation();

        if (valid.validTrainer(trainer) == true) {
            trainer.getFirstname();
            trainer.getLastname();
            trainer.getSubject();
          
            trainerService.insertTrainer(trainer);
             return "redirect:/trainer/showlist";
        }
        redirectAttributes.addFlashAttribute("errormessage", "Invalid Information :Insert need at least 3 alphabet letters for each field FirstName and LastName");
        return "redirect:/showTrainerform";
    }

    @GetMapping("/update/{trainerid}")
    public String updateForm(@PathVariable Integer trainerid, ModelMap mm
    ) {

        Trainer trainer = trainerService.GetById(trainerid);
        mm.addAttribute("trainertoupdate", trainer);
        return "trainerupdateform";
    }

    @PostMapping("/doupdate")
    public String doUpDate(
            @RequestParam("trainerid") Integer id,
            @RequestParam("firstname") String firstname,
            @RequestParam("lastname") String lastname,
            @RequestParam("subject") String subject,
            RedirectAttributes redirectAttributes
    ) {

        Validation valid = new Validation();
        Trainer trainer = trainerService.GetById(id);
        trainer.setFirstname(firstname);
        trainer.setLastname(lastname);
        trainer.setSubject(subject);

        if (valid.validTrainer(trainer) == true) {
            trainer.getFirstname();
            trainer.getLastname();
            trainer.getSubject();
          
            trainerService.insertTrainer(trainer);
             return "redirect:/trainer/showlist";
        }
        redirectAttributes.addFlashAttribute("errormessage", "Invalid Information : Update need at least 3 alphabet letters for each field FirstName and LastName");
        return "redirect:/trainer/showlist";
        
//     trainerService.updateTrainer(id, firstname, lastname, subject);
//        return "redirect:/trainer/showlist";
    }

    @GetMapping("/delete/{trainerid}")
    public String doDelete(
            @PathVariable Integer trainerid
    ) {

        System.out.println(trainerid);

        Trainer trainer = trainerService.GetById(trainerid);
        trainer.getFirstname();
        trainer.getLastname();
        trainer.getSubject();
        trainerService.deleteTrainer(trainer);

       return "redirect:/trainer/showlist";
       
    }

    @GetMapping("/showlist")
    public String showAllTrainers(ModelMap mm
    ) {

        mm.addAttribute("trainerlist", trainerService.allTrainers());
        return "trainerlist";
    }

}
