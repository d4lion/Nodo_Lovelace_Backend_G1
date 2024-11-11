package eafit.nodo.lovelace.dtos;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CountryDto {
    String name;
    String city;
    String continent;
    String img;
}
