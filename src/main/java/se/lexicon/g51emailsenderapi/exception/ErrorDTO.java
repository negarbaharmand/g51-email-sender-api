package se.lexicon.g51emailsenderapi.exception;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ErrorDTO {
    private Integer errorCode;
    private String errorMessage;
    private LocalDateTime timestamp = LocalDateTime.now();

    public ErrorDTO(Integer errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
