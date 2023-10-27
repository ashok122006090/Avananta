package com.Avananta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Avananta.entity.YourEntity;
import com.Avananta.service.YourEntityService;

@RestController
@RequestMapping("/api")
public class YourEntityController {
    private final YourEntityService yourEntityService;

    @Autowired
    public YourEntityController(YourEntityService yourEntityService) {
        this.yourEntityService = yourEntityService;
    }

    @PostMapping("/your-api-endpoint")
    public ResponseEntity<String> handlePostRequest(@RequestParam String yourParameter) {
        YourEntity result = yourEntityService.findRecordByYourColumn(yourParameter);
        if (result != null) {
            return ResponseEntity.ok(result.getYourColumn());
        } else {
            return ResponseEntity.ok("YourColumn is not present");
        }
       
    }
//    @PostMapping("/your-Api-endpoint")
//    public YourEntity handlePostRequest1(@RequestParam String yourParameter) {
//        YourEntity result = yourEntityService.findRecordByYourColumn(yourParameter);
//       
//            return result;
//      
//       
//    }
    @GetMapping("/testHello")
    public String TestHello() {
    	return "Hello Spring boot";
    }
    
    }


