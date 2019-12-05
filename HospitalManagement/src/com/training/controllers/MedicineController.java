package com.training.controllers;


import com.training.daos.MedicineDao;
import com.training.entity.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class MedicineController {

    @Autowired
    private MedicineDao dao;

    @Autowired
    private ModelAndView mdlView;

    @Autowired
    private Medicine medicine;

    @ModelAttribute("medicineTypes")
    public String[] loadMedicineType(){
        return new String[]{"Injection","Tablet","Bottle","Capsule"};
    }

    @RequestMapping(method = RequestMethod.GET,value = "/addMedicine")
    public ModelAndView init(){
        mdlView.addObject("command",medicine);
        mdlView.setViewName("addMedicine");
        return mdlView;
    }

    @RequestMapping(method=RequestMethod.POST, value = "/addMedicine")
    public String onSubmit(@ModelAttribute("addedObject") Medicine medicine){
        int rowAdded=dao.add(medicine);
        return "success";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/findAll")
    public ModelAndView findAll(){
        List<Map<String,Object>> List=dao.findAll();
        mdlView.addObject("show",List);
        mdlView.addObject("callFrom","multiEntity");
        mdlView.setViewName("showallmedicines");
        return mdlView;
    }

    @RequestMapping(value="/srch",method = RequestMethod.GET)
    public String srchPage(){

        return "searchById";
    }

    @RequestMapping(value="/srch", method = RequestMethod.POST)
    public String find(@RequestParam("code") long key, Model model){

        String nextPage="searchById";
        try {
            Medicine found = dao.findById(key);
            model.addAttribute("show", found);
            model.addAttribute("callFrom", "singleEntity");
            return "showallmedicines";
        }catch(EmptyResultDataAccessException e){
            model.addAttribute("errorMessage","Invalid Entity");
        }
        return nextPage;
    }

}
