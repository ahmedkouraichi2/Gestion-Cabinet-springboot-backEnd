package com.cabinet.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="consutations")
public class Consultation {
	    @Id
	    @Column(name = "id", nullable = false)
	    private Long id;
	    private String date;
	    private String heure;
	    private String interpretation;
	    @ManyToOne
	    private User userc;

}
