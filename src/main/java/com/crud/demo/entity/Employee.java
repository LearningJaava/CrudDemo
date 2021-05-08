package com.crud.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

@Entity
@Table(name = "employee")

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,
	   generator="native"
   )
    @GenericGenerator( name = "native", strategy = "native" )
	 
	//getters and setters with lombok ok
	private long id;	
	private String name;

}
