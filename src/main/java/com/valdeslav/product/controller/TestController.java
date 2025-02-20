package com.valdeslav.product.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/test")
@Tag(name = "Тестовый контроллер", description = "API для тестирования доступа")
public class TestController {
    
    @Operation(summary = "Проверка доступа", description = "Эндпоинт для проверки доступа к API")
    @ApiResponse(responseCode = "200", description = "Успешный доступ к API")
    @GetMapping("/access")
    public String testAccess() {
        return "You have access!";
    }
}
