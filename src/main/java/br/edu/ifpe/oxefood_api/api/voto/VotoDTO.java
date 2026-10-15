package br.edu.ifpe.oxefood_api.api.voto;
import java.time.LocalDate;
import org.hibernate.validator.constraints.Length;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VotoDTO {

    private Long id;

    @NotNull(message = "O Nome é de preenchimento obrigatório")
   @NotEmpty(message = "O Nome é de preenchimento obrigatório")
   @Length(max = 100, message = "O Nome deverá ter no máximo {max} caracteres")
    private String nomeEleitor;

   @NotBlank(message = "O numero do registro eleitoral é de preenchimento obrigatório")
    private String numeroRegistroEleitoral;

    private LocalDate dataVotacao;

    @Length(min = 4, max = 4, message = "O campo tem que ter entre {min} e {max}")
    private Integer numeroCandidatoDepFederal;

    @Length(min = 5, max = 5, message = "O campo tem que ter entre {min} e {max}")
    private Integer numeroCandidatoDepEstadual;

    @Length(min = 3, max = 3, message = "O campo tem que ter entre {min} e {max}")
    private Integer numeroCandidatoSenador;

    @Length(min = 2, max = 2, message = "O campo tem que ter entre {min} e {max}")
    private Integer numeroCandidatoGovernador;

    @Length(min = 2, max = 2, message = "O campo tem que ter entre {min} e {max}")
    private Integer numeroCandidatoPresidente;
}
