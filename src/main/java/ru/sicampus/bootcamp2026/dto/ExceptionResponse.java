package ru.sicampus.bootcamp2026.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Ответ с информацией об исключении")
public class ExceptionResponse {
    @Schema(description = "Код ошибки")
    private String errorCode;

    @Schema(description = "Сообщение об ошибке")
    private String message;
}
