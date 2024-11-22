package eafit.nodo.lovelace.entities;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "users")
@Table(name = "users")
public class User {
    @Id
    private Long id;

    @Column(length = 30)
    private String name;

    @Column(length = 30)
    private String last_name;

    @Column(length = 100)
    private String email;
    private LocalDate register_at;

    @OneToMany
    @JoinColumn(name = "user_suggestion_id")
    private List<SuggestionHistory> suggestions;

    @OneToMany
    @JoinColumn(name = "user_preference_id")
    private List<Preferences> preferences;
}
