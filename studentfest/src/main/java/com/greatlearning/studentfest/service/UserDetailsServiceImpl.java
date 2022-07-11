package com.greatlearning.studentfest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.studentfest.entity.User;
import com.greatlearning.studentfest.repository.UserRepository;
import com.greatlearning.studentfest.security.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub

		User user = userRepository.getUserByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException("User Record Not Found");
		}
		return new MyUserDetails(user);
	}

}
