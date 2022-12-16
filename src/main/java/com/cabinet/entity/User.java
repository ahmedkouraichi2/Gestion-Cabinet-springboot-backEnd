package com.cabinet.entity;

import java.util.Collection;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


import javax.persistence.*;


import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")

public class User
{
	    
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	  private String name;
	  
	   @Column(unique = true,updatable = true)
	    private String username;
	   
	    
	    private String password;
	    
	   @ManyToMany(fetch = FetchType.LAZY)
	   private Collection<Role> roles;
	   
	   
	    @JsonIgnore
	    @OneToMany (mappedBy = "userRdv")
	    private Set<Rdv> rdvSet;
	    
	  
	    @JsonIgnore
	    @OneToMany(fetch = FetchType.LAZY)
	    private Set<Consultation> consultationSet;
	    
	   
	   public User( String name, String username, String password, Collection<Role> roles) {
	        this.name = name;
	        this.username = username;
	        this.password = password;
	        this.roles = roles;
	    }

}
