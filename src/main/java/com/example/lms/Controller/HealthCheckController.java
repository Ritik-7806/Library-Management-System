package com.example.lms.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/")
    public ResponseEntity<String> healthCheck(){
        return ResponseEntity.status(HttpStatus.OK).body("All the APIs and available endpoints can be accessed and tested via Swagger UI at the following URL:\n" +
                "\uD83D\uDC49 http://localhost:8081/swagger-ui/index.html") ;
    }

}
