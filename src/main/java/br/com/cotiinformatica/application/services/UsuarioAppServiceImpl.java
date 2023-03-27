package br.com.cotiinformatica.application.services;

import br.com.cotiinformatica.application.dtos.CriarContaDTO;
import br.com.cotiinformatica.application.dtos.CriarContaResponseDTO;
import br.com.cotiinformatica.application.interfaces.IUsuarioAppService;
import br.com.cotiinformatica.domain.interfaces.IUsuarioDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioAppServiceImpl implements IUsuarioAppService {

    @Autowired
    private IUsuarioDomainService usuarioDomainService;

    @Override
    public CriarContaResponseDTO criarConta(CriarContaDTO dto) {
        return null;
    }
}
