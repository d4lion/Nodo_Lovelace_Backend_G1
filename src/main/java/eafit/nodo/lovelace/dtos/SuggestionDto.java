package eafit.nodo.lovelace.dtos;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SuggestionDto {
    UUID id;
    String climate;
    String activity;
    String housing;
    String duration;
    String age;

    CountryDto america_country;
    CountryDto europa_country;
}
