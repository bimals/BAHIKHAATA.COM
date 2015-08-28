package com.bahikhaata.db.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {

	UserDetails findByUserName(String userName);
}
