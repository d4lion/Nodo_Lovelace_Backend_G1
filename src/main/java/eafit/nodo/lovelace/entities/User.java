package eafit.nodo.lovelace.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


import java.util.Date;
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
    private Date register_at;

    @OneToMany
    @JoinColumn(name = "user_suggestion_id")
    private List<Suggestion> suggestions;

    @OneToMany
    @JoinColumn(name = "user_preference_id")
    private List<Preferences> preferences;

}
