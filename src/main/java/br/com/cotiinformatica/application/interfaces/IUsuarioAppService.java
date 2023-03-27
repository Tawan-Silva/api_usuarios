package br.com.cotiinformatica.application.interfaces;

import br.com.cotiinformatica.application.dtos.CriarContaDTO;
import br.com.cotiinformatica.application.dtos.CriarContaResponseDTO;

public interface IUsuarioAppService {

    CriarContaResponseDTO criarConta(CriarContaDTO dto);
}
