package com.example.beanlifecycle.controller;

import com.example.beanlifecycle.beans.TheBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/askme")
public class askMeController {

    private final TheBean theBean;

    public askMeController(TheBean theBean) {
        this.theBean = theBean;
    }

    @GetMapping("/hi")
    public ResponseEntity<String> hiMethod() {

       theBean.beanMethod();

       return ResponseEntity.ok("ok bean created");
   }

}
