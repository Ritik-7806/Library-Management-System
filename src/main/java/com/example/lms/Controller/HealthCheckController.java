package com.example.lms.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class HealthCheckController {

    @GetMapping("/")
    public ResponseEntity<String> healthCheck(HttpServletRequest request) {

        // Get current base URL (http://localhost:xxxx)
        String baseUrl = ServletUriComponentsBuilder
                .fromRequestUri(request)
                .replacePath(null)
                .build()
                .toString();

        String msg = """
        <h2>Library Management System</h2>

        <p>All the APIs and available endpoints can be accessed and tested via <b>Swagger UI</b>.</p>

        <p>
        <a href="%s/swagger-ui/index.html">
        Open Swagger UI
        </a>
        </p>

        <h3>Features:</h3>
        <ul>
            <li>JWT-based Authentication & Authorization</li>
            <li>Role-based access (ADMIN / USER)</li>
            <li>Secure Login & Signup</li>
            <li>Book Management APIs</li>
            <li>Stateless Session using Spring Security</li>
        </ul>
        """.formatted(baseUrl);

        return ResponseEntity.ok()
                .header("Content-Type", "text/html")
                .body(msg);
    }

}
