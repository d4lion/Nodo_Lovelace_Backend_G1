package eafit.nodo.lovelace.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class SuggestionsHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToMany
    @JoinColumn(name = "suggestion_id")
    private List<Suggestion> suggestions;

    @OneToMany(mappedBy = "suggestionsHistory")
    private List<User> users;
}
