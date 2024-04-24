package com.co.echeverri.usuarios.service;

import java.util.Optional;

import com.co.echeverri.usuarios.entity.Alumno;

public interface AlumnoService {
	
	public Iterable<Alumno> findAll();
	
	public Optional<Alumno> findById(Long id);
	
	public Alumno save (Alumno alumno);
	
	public void deteById (Long id);

}
