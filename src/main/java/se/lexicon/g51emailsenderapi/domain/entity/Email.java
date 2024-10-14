package se.lexicon.g51emailsenderapi.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "_to", nullable = false)
    private String to;
    @Column(name = "_from", nullable = false)
    private String from;
    private String subject;

    @Lob
    @Column(length = 65000)
    private String content;

    @Lob
    private List<String> attachments;
    private LocalDateTime dateTime;
    private Integer type; // 1 registration, 2 reset password
    //Add more fields as needed

    @PrePersist
    public void initialData() {
        dateTime = LocalDateTime.now();
    }
}
