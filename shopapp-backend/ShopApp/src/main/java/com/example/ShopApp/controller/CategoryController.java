package com.example.ShopApp.controller;

import com.example.ShopApp.dtos.CategoryDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${api.prefix}/categories")
@Validated
public class CategoryController {

    @GetMapping("")
    public ResponseEntity<String> getAllCategories(@RequestParam("page") int page, @RequestParam("limit") int limit){
        return ResponseEntity.ok(String.format("Get all category, page = %d, limit = %d", page, limit));
    }

    @PostMapping("")
    public ResponseEntity<?> insertCategory(@Valid @RequestBody CategoryDTO categoryDTO, BindingResult result){
        if(result.hasErrors()){
           List<String> errorMessages = result.getFieldErrors().stream().map(FieldError::getDefaultMessage).toList();
           return ResponseEntity.badRequest().body(errorMessages);
        }
        return ResponseEntity.ok("this is insert");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCategory(@PathVariable Long id){
        return ResponseEntity.ok("this is update");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long id){
        return  ResponseEntity.ok("Delete category with id ="+" "+id);
    }
}
