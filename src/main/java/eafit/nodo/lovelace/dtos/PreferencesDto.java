package eafit.nodo.lovelace.dtos;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PreferencesDto {
    String climate;
    String activity;
    String housing;
    int duration;
    int age;
}
