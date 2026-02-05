package ru.sicampus.bootcamp2026.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sicampus.bootcamp2026.dto.AuthResponse;

@RestController
@Tag(name = "Контроллер аутентификации")
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthController {

    @GetMapping("/register")
    public ResponseEntity<AuthResponse> registerUser() {
        throw new NotImplementedException("Регистрация пользователя еще не добавлена");
    }

}
