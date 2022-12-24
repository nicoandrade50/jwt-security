package com.example.security

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service


@Service
class SecurityApplication : UserDetailsService {
	override fun loadUserByUsername(username: String?): UserDetails {
		return User("user","{noop}admin", ArrayList())
	}
}
