package eafit.nodo.lovelace.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class SuggestionHistory {
    @Id
    @UuidGenerator
    private UUID id;

    @Column(length = 40)
    private String climate;


    @Column(length = 40)
    private String activity;

    @Column(length = 40)
    private String housing;

    @Column(length = 40)
    private String duration;

    private String age;

    @ManyToOne
    @JoinColumn(name = "america_country_id")
    private Countries america_country;

    @ManyToOne
    @JoinColumn(name = "europa_country_id")
    private Countries europa_country;

    @ManyToOne
    @JoinColumn(name="user_suggestion_id")
    private User user;
}
