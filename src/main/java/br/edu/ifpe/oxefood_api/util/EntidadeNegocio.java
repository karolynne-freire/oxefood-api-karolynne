package br.edu.ifpe.oxefood_api.util;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = { "id" })
public abstract class EntidadeNegocio {

    private Long id;

    private Boolean habilitado;
    
}
