package eafit.nodo.lovelace.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.annotation.Target;
import java.util.Date;

@Data
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

    @ManyToOne
    @JoinColumn(name = "suggestions_history_id")
    private SuggestionsHistory suggestionsHistory;
}
