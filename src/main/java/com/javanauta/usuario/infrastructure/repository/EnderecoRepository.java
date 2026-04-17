package com.javanauta.usuario.infrastructure.repository;


import com.javanauta.usuario.infrastructure.entity.endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnderecoRepository extends JpaRepository<endereco, Long> {
}
