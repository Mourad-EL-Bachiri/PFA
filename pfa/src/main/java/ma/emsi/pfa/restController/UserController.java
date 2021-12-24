package ma.emsi.pfa.restController;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.pfa.dto.UserDto;
import ma.emsi.pfa.requests.UserRequest;
import ma.emsi.pfa.responses.UserResponse;
import ma.emsi.pfa.services.UserService;

@RequestMapping("/users")
@Primary
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping
	public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest userRequest) {
		
		ModelMapper modelMapper = new ModelMapper();
		UserDto userDto = modelMapper.map(userRequest, UserDto.class);
		UserDto crateUser = userService.createUser(userDto);
		UserResponse userResponse = modelMapper.map(crateUser, UserResponse.class);
		return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
	}
	

}
