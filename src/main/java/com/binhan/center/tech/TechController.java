package com.binhan.center.tech;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tech")
public class TechController {
    @GetMapping("/health")
    public ResponseEntity<String> getHealthInfo() {
        return ResponseEntity.ok("ok");
    }

}
