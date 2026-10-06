package br.edu.ifpe.oxefood_api.api.empresa;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaDTO {

    private Long id;

    private String site;

    @NotBlank(message = "O CNPJ é obrigatório")
    @CNPJ(message = "CNPJ inválido")
    private String cnpj;

    private String inscricaoEstadual;

    @NotBlank(message = "O Nome Empresarial é obrigatório")
    @Length(max = 150, message = "O Nome Empresarial deve ter no máximo {max} caracteres")
    private String nomeEmpresarial;

    @Length(max = 150, message = "O Nome Fantasia deve ter no máximo {max} caracteres")
    private String nomeFantasia;

    @Length(min = 8, max = 20, message = "O Fone deve ter entre {min} e {max} caracteres")
    private String fone;

    private String foneAlternativo;
}