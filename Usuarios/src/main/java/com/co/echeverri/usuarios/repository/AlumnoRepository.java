package com.co.echeverri.usuarios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.co.echeverri.usuarios.entity.Alumno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long>{

}
