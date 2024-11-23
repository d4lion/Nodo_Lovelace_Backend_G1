package eafit.nodo.lovelace.dtos;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SuggestionDto {
    String climate;
    String activity;
    String housing;
    String duration;
    int age;

    CountryDto america_country;
    CountryDto europa_country;
}
