package com.example.template.controller;

import com.example.template.dto.CatDto;
import com.example.template.model.Cat;
import com.example.template.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/cats")
public class CatController {

    private final CatService catService;

    @Autowired
    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping
    public List<Cat> getAllCats(){
        return this.catService.getAllCats();
    }

    @PostMapping
    public Cat createCat(CatDto catDto){
        return  this.catService.addCat(catDto);
    }


}
