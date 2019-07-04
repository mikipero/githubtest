package com.milan.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/test1")
    ResponseEntity getPricingParameters() {
        logger.info("Request for get");
        String result = "OK";
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
