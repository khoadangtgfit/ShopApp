package com.example.ShopApp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {

    @CrossOrigin
    @GetMapping("")
    public ResponseEntity<String> getAllCategories(){
        return ResponseEntity.ok("hello");
    }

    @PostMapping("")
    public ResponseEntity<String> insertCategory(){
        return ResponseEntity.ok("this is insert");
    }
}
