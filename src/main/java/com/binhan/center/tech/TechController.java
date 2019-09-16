package com.binhan.center.tech;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tech")
public class TechController {

    /** @return health status. */
    @GetMapping("/health")
    public ResponseEntity<String> getHealthInfo() {
        return ResponseEntity.ok("ok");
    }

    /** @return my info. */
    @GetMapping("/whoami")
    public ResponseEntity<String> getMyInfo() {
        return ResponseEntity.ok("I am Hancock");
    }
}
