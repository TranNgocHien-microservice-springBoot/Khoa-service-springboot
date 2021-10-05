package com.example.khoaservice.controller;

import com.example.khoaservice.entity.Khoa;
import com.example.khoaservice.service.KhoaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class KhoaController {
    @Autowired
    private KhoaService khoaService;


    @PostMapping("/")
    public Khoa saveKhoa(@RequestBody Khoa khoa){
        log.info("inside saveDeparment method if Department controller!");
        return khoaService.saveKhoa(khoa);
    }

    @GetMapping("/{id}")
    public Khoa findKhoaById(@PathVariable("id") Long khoaId){
        log.info("inside findDeparmentById method if Department controller!");
        return khoaService.findKhoaById(khoaId);
    }

    @GetMapping("/")
    public String helloWorld(){
        return "Hello Nguyen Trong Khoi!";
    }
}
