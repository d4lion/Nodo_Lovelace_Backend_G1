package eafit.nodo.lovelace.dtos;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SuggestionHistoryDto {
    Long user_id;
    String climate;
    String activity;
    String housing;
    String duration;
    String age;
    CountryDto america_country;
    CountryDto europa_country;
}