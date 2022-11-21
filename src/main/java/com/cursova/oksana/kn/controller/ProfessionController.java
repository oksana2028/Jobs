package com.cursova.oksana.kn.controller;

import com.cursova.oksana.kn.model.Profession;
import com.cursova.oksana.kn.service.impl.ProfessionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/profession")
public class ProfessionController {

    private final ProfessionServiceImpl professionService;

    @Autowired
    public ProfessionController(ProfessionServiceImpl professionService) {
        this.professionService = professionService;
    }


    @RequestMapping(method = RequestMethod.GET)
    public String showProfessionPage() {
        return "profession/profession";
    }


    @GetMapping("/all")
    public String showAllMentors(Model model) {
        List<Profession> profession = professionService.findAll();
        model.addAttribute("professionModel", profession);
        return "/profession/all";
    }

    @GetMapping("/{id}")
    public String getProfession(@PathVariable int id, Model model) {
        Profession profession = professionService.findById(id);
        if (profession == null) return "redirect:/profession/all";
        model.addAttribute("professionModel", professionService.findById(id));
        return "profession/profession";
    }

}
