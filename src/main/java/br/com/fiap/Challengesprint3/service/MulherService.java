package br.com.fiap.Challengesprint3.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.Challengesprint3.model.Mulher;
import br.com.fiap.Challengesprint3.repository.LocalEscolhidoRepository;
import br.com.fiap.Challengesprint3.repository.MulherRepository;

@Service
@Transactional
public class MulherService {

    @Autowired
    MulherRepository repository;

    @Autowired
    LocalEscolhidoRepository localRepository;

    public void save(Mulher mulher) {
        repository.save(mulher);
    }

    public List<Mulher> listAll() {
        return repository.findAll();
    }

    public void remove(Long id) {
        repository.deleteById(id);
    }

    public Optional<Mulher> getById(Long id) {
        return repository.findById(id);
    }

}
