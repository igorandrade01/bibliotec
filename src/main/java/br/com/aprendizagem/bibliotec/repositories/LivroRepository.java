package br.com.aprendizagem.bibliotec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aprendizagem.bibliotec.models.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
