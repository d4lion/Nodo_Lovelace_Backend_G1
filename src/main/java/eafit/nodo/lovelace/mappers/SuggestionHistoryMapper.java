package eafit.nodo.lovelace.mappers;

import eafit.nodo.lovelace.dtos.CountryDto;
import eafit.nodo.lovelace.dtos.SuggestionHistoryDto;
import eafit.nodo.lovelace.entities.Countries;
import eafit.nodo.lovelace.entities.SuggestionHistory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SuggestionHistoryMapper {
    SuggestionHistoryMapper mapper = Mappers.getMapper(SuggestionHistoryMapper.class);

    @Mapping(source = "user.id", target = "user_id")
    @Mapping(source = "america_country", target = "america_country")
    @Mapping(source = "europa_country", target = "europa_country")
    SuggestionHistoryDto suggestionToSuggestionDataDto(SuggestionHistory suggestionHistory);

    @Mapping(target = "img", source = "photos_url")
    CountryDto countryToCountryDTO(Countries country);
}
