package com.example.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.entity.User;

public class LoginUser implements UserDetails {
	
	private final User user;
	
	public LoginUser(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return this.user;
	}

	@Override
	public String getPassword() {
		
		return this.user.getPassword();
	}

	@Override
	public String getUsername() {
		
		return this.user.getEmail();
	}
	

	@Override
	public boolean isAccountNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO 自動生成されたメソッド・スタブ
		return AuthorityUtils.NO_AUTHORITIES;
	}

}