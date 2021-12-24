package ma.emsi.pfa.services;

import ma.emsi.pfa.dto.UserDto;

public interface UserService extends ParticipentService {
	
	UserDto createUser(UserDto userDto);
	UserDto getUser(String email);

}
