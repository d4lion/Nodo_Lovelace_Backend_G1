package eafit.nodo.lovelace.entities;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Suggestions {
    @Id
    private int id;

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
}