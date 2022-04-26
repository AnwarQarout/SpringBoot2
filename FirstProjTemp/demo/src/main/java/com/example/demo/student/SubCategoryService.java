package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubCategoryService {

    private final SubCategoryRepository subCategoryRepository;

    @Autowired
    public SubCategoryService(SubCategoryRepository subCategoryRepository) {
        this.subCategoryRepository = subCategoryRepository;
    }


    public List<SubCategory> getSubCategories(){
        return subCategoryRepository.findAll();
    }

    public void addSubCategory(SubCategory category) {
        subCategoryRepository.save(category);

    }
}
