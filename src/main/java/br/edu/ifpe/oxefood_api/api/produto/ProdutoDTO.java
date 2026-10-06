package br.edu.ifpe.oxefood_api.api.produto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {

    private Long id;

    private Long idEmpresa;

    @NotBlank(message = "O código é de preenchimento obrigatório")
    private String codigo;

    @NotBlank(message = "O título é de preenchimento obrigatório")
    @Length(max = 100, message = "O título deverá ter no máximo {max} caracteres")
    private String titulo;

    private String descricao;

    @NotNull(message = "O valor unitário é obrigatório")
    private Double valorUnitario;

    private Integer tempoEntregaMinimo;

    private Integer tempoEntregaMaximo;
}