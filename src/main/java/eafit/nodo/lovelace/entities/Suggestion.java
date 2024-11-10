package eafit.nodo.lovelace.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Suggestion {
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

    @OneToOne
    @JoinColumn(name = "country_id")
    private Countries country;

}
