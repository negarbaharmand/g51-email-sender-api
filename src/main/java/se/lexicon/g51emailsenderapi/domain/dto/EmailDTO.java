package se.lexicon.g51emailsenderapi.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString


public class EmailDTO {
    @NotBlank(message = "To field cannot be empty.")
    @Email(message = "To field must be a valid email address.")
    private String to;
    @NotBlank(message = "Subject field cannot be empty.")
    private String subject;
    @NotBlank(message = "HTML field cannot be empty.")
    private String html;
    @Positive(message = "Type should be a positive number.")
    private Integer type;
}
