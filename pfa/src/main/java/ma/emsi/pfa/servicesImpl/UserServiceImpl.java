package ma.emsi.pfa.servicesImpl;


import java.util.ArrayList;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ma.emsi.pfa.dto.ParticipentDto;
import ma.emsi.pfa.dto.UserDto;
import ma.emsi.pfa.entities.UserEntity;
import ma.emsi.pfa.repositories.ParticipentRepository;
import ma.emsi.pfa.services.UserService;
import ma.emsi.pfa.shared.Utils;


@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	Utils util;
	@Autowired
	ParticipentRepository participentRepository;
	
	@Override
	public UserDto createUser(UserDto user) {
		
		
		UserEntity checkUser = participentRepository.findByEmail(user.getEmail());
		if(checkUser != null ) throw new RuntimeException("User already existe !!");
		ModelMapper modelMapper = new ModelMapper();
		UserEntity userEntity = modelMapper.map(user, UserEntity.class);
		userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userEntity.setParticipentId(util.generateId(20));
		UserEntity newUser = participentRepository.save(userEntity);
		UserDto userDto = modelMapper.map(newUser, UserDto.class);		
		return userDto;
		
	}
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		UserEntity userEntity = participentRepository.findByEmail(email);
		if(userEntity == null) throw new UsernameNotFoundException(email);
		return new User(userEntity.getEmail(), userEntity.getEncryptedPassword(), new ArrayList<>());
	}


	@Override
	public UserDto getUser(String email) {
		UserEntity userEntity = participentRepository.findByEmail(email);
		if(userEntity == null) throw new UsernameNotFoundException(email);
		UserDto userDto = new UserDto();
		BeanUtils.copyProperties(userEntity, userDto);
		return userDto;
	}

	@Override
	public ParticipentDto createParticipent(ParticipentDto participentDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
