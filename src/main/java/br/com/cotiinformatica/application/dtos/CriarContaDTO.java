package br.com.cotiinformatica.application.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CriarContaDTO {

    @Size(min = 8, max = 150, message = "Nome do usuário deve ter de 8 a 150 caracteres.")
    @NotBlank(message = "Nome do usuário é obrigatório.")
    private String nome;

    @Email(message = "Infome um endereço de email válido.")
    private String email;

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d)(?=.*[@$!%*?&])[A-Za-z\\\\d@$!%*?&]{8,}$",
            message = "A senha deve ter pelo menos 8 caracteres, uma letra maiúscula, uma letra minúscula, um número e um caractere especial")
    @NotBlank(message = "Senha do usuário é obrigatória.")
    private String senha;
}
