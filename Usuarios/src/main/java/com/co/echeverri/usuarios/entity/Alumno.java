package com.co.echeverri.usuarios.entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nombre;
	private String apellido;
	private String email;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
	
	@PrePersist
	private void prePersiste() {
		this.createAt = new Date();
	}
	

}
