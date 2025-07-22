package com.pisidro.apiAcademico.models;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstudiante;

    private String nomEstudiante;
    private String dirEstudiante;
    private String ciuEstudiante;

    // Getters y setters

    public String getNomEstudiante() {
        return nomEstudiante;
    }

    public void setNomEstudiante(String nomEstudiante) {
        this.nomEstudiante = nomEstudiante;
    }

    public String getDirEstudiante() {
        return dirEstudiante;
    }

    public void setDirEstudiante(String dirEstudiante) {
        this.dirEstudiante = dirEstudiante;
    }

    public String getCiuEstudiante() {
        return ciuEstudiante;
    }

    public void setCiuEstudiante(String ciuEstudiante) {
        this.ciuEstudiante = ciuEstudiante;
    }
}