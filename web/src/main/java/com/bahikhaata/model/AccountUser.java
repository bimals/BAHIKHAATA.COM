package com.bahikhaata.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.mongodb.BasicDBList;

public class AccountUser implements Serializable,Cloneable, UserDetails {
	
	/**
	 * 
	 */
	protected static final long serialVersionUID = -7605052698976876820L;
	@Id
    protected String id;
	protected String userName;
	protected String password;
	protected String firstName;
	protected String lastName;
	protected String userType;
	protected String userTypeId;
	protected BasicDBList blogs;
	protected BasicDBList followers;
	protected BasicDBList followings;
	protected String photoLink;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	public String getUsername() {
		return userName;
	}
	public BasicDBList getBlogs() {
		if(blogs == null) {
			blogs = new BasicDBList();
		}
		return blogs;
	}
	public void setBlogs(BasicDBList blogs) {
		this.blogs = blogs;
	}
	public BasicDBList getFollowers() {
		if(followers == null) {
			followers = new BasicDBList();
		}
		return followers;
	}
	public void setFollowers(BasicDBList followers) {
		this.followers = followers;
	}
	public BasicDBList getFollowings() {
		if(followings == null) {
			followings = new BasicDBList();
		}
		return followings;
	}
	public void setFollowings(BasicDBList followings) {
		this.followings = followings;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(String userTypeId) {
		this.userTypeId = userTypeId;
	}
	public String getPhotoLink() {
		return photoLink;
	}
	public void setPhotoLink(String photoLink) {
		this.photoLink = photoLink;
	}

}
