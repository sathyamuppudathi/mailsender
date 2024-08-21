package com.tvm.Email_service.controller;


import com.tvm.Email_service.service.mail_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mailservice_controller {

    @Autowired
    private  mail_service emailService;

    @GetMapping("/send")
    public String sendEmail() {
        emailService.sendEmail("sathyadharsan93@gmail.com", "Testing Mail", "Mail send Successfully......");
        return "Send Successfully...";
    }
}
