package kh.esprit.tpjpaentity.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kh.esprit.tpjpaentity.entity.User;
import kh.esprit.tpjpaentity.repositories.UserRepository;

@Service
public class UserService {

		@Autowired
		private UserRepository userRepository;
		
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		
		
		public User findUserByUserName(String userName) {
			return userRepository.findByUserName(userName);
		}
		
		public User saveUser(User user) {
			user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
			user.setActive(true);
			return userRepository.save(user);
			
		}
		
		
		
		
}
