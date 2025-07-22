package com.pisidro.apiAcademico.repositories;

import com.pisidro.apiAcademico.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long>{
} 