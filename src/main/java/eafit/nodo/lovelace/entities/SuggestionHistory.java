package eafit.nodo.lovelace.entities;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class SuggestionHistory {
    @Id
    private int id;

    @Column(length = 40)
    private String climate;


    @Column(length = 40)
    private String activity;

    @Column(length = 40)
    private String housing;

    private int duration;
    private int age;

    @ManyToOne
    @JoinColumn(name = "america_country_id")
    private Countries america_country;

    @ManyToOne
    @JoinColumn(name = "europa_country_id")
    private Countries europa_country;

}
