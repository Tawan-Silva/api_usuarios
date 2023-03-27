package br.com.cotiinformatica.domain.services;

import br.com.cotiinformatica.domain.interfaces.IUsuarioDomainService;
import br.com.cotiinformatica.domain.models.Usuario;
import br.com.cotiinformatica.infrastructure.components.MD5Component;
import br.com.cotiinformatica.infrastructure.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class UsuarioDomainServiceImpl implements IUsuarioDomainService {

    @Autowired
    private IUsuarioRepository IUsuarioRepository;

    @Autowired
    private MD5Component md5Component;

    @Override
    public void criarConta(Usuario usuario) {
        Optional<Usuario> optional = IUsuarioRepository.findByEmail(usuario.getEmail());
        if (optional.isPresent()) {
            throw new IllegalArgumentException("O email informado já está cadastrado.");
        }

        usuario.setSenha(md5Component.encrypt(usuario.getSenha()));
        usuario.setDataHoraCricao(Instant.now());
        usuario.setDataHoraUltimaAlteracao(Instant.now());

        IUsuarioRepository.save(usuario);
    }
}
