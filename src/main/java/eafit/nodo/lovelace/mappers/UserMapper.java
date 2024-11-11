package eafit.nodo.lovelace.mappers;

import eafit.nodo.lovelace.dtos.UserDTO;
import eafit.nodo.lovelace.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper mapper = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "lastName", source = "last_name")
    UserDTO userToUserDTO(User user);

}
