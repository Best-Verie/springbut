package com.example.template.service;

import com.example.template.dto.CatDto;
import com.example.template.model.Cat;
import com.example.template.repository.ICatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {
    private final ICatRepository catRepository;

    @Autowired
    public CatService(ICatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public List<Cat> getAllCats(){
        //Constants.validatePageNumberAndSize(page,size);
        //Pageable pageable = (Pageable) PageRequest.of(page,size, Sort.Direction.ASC,"name");
        List<Cat> cats = catRepository.findAll();
        return cats;
    }

    public Cat addCat(CatDto catDto){
        Cat newCat = new Cat(catDto.getName());
        return catRepository.save(newCat);
    }

}
