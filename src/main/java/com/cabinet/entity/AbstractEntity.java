package com.cabinet.entity;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;



public class AbstractEntity implements Serializable   {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	    @JsonIgnore
	    @CreatedDate
	    @Column(nullable = false,updatable = false)
	    private Instant crationDate;
	    
	    
	    
	    @JsonIgnore
	    @LastModifiedDate
	    private Instant lastModifiedDate;

}
