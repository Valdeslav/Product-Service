package com.valdeslav.product.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/test")
@SuppressWarnings("unused")
public class TestController {
    @GetMapping("access")
    public String testAccess() {
        return "You have access!";
    }
}
