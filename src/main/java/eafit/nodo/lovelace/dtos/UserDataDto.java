package eafit.nodo.lovelace.dtos;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class UserDataDto {
    Long id;
    String name;
    String lastName;
    String email;
    LocalDate register_at;
    List<SuggestionDto> suggestions;
    List<PreferencesDto> preferences;
}
