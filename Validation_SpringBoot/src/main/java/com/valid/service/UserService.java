package com.valid.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.valid.dto.UserRequest;
import com.valid.entity.User;
import com.valid.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User saveUser(UserRequest userRequest) {
		User user = User.build(0, userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(),
				userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());

		return userRepository.save(user);

	}

	public List<User> getALlUsers() {
		return userRepository.findAll();
	}

	public User getUser1(int id) {
		return userRepository.findById(id).get();
	}

	public User getUser(int id) {
		return userRepository.findByUserId(id);
	}
	 
}
