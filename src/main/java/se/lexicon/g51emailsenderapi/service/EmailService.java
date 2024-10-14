package se.lexicon.g51emailsenderapi.service;

import se.lexicon.g51emailsenderapi.domain.dto.EmailDTO;

public interface EmailService {
    void sendEmail(EmailDTO emailDTO);
}
