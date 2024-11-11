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
public class Preferences {
    @Id
    @UuidGenerator
    private UUID id;

    @Column(length = 40)
    private String climate;

    @Column(length = 40)
    private String activity;

    @Column(length = 40)
    private String housing;

    private int duration;
    private int age;
}
