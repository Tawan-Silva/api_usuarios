package br.com.cotiinformatica.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "usuarios")
public class Usuario {

    @Id
    private String id;
    private String nome;

    @Indexed(unique = true)
    private String email;
    private String senha;
    private Instant dataHoraCricao;
    private Instant dataHoraUltimaAlteracao;
}
