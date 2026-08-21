package br.edu.ifpe.oxefood_api.util;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;

@Getter
@Setter
@EqualsAndHashCode(of = { "id" })
@MappedSuperclass
public abstract class EntidadeNegocio {

     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

      @JsonIgnore
    @Column
    private Boolean habilitado;
    
}
