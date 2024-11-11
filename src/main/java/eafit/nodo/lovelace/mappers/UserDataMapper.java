package eafit.nodo.lovelace.mappers;

import eafit.nodo.lovelace.dtos.CountryDto;
import eafit.nodo.lovelace.dtos.UserDataDto;
import eafit.nodo.lovelace.entities.Countries;
import eafit.nodo.lovelace.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserDataMapper {
    UserDataMapper mapper = Mappers.getMapper(UserDataMapper.class);

    @Mapping(target = "lastName", source = "last_name")
    UserDataDto userToUserDataDTO(User user);

    @Mapping(target = "img", source = "photos_url")
    CountryDto countryToCountryDTO(Countries country);
}