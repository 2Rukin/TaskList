package web.dto.mappers;

import domain.user.User;
import org.mapstruct.Mapper;
import web.dto.user.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto userDto);
}
