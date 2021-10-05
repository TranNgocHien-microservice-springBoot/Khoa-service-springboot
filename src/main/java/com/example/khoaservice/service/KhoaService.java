package com.example.khoaservice.service;

import com.example.khoaservice.entity.Khoa;
import com.example.khoaservice.repository.KhoaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KhoaService {
    @Autowired
    private KhoaRepository khoaRepository;

    public Khoa saveKhoa(Khoa khoa) {

        log.info("Inside saveDepartment of Service! ");
        return khoaRepository.save(khoa);
    }

    public Khoa findKhoaById(Long khoaId) {
        log.info("inside findDeparmentById ");
        return khoaRepository.findById(khoaId).get();
    }
}
