package com.javanauta.usuario.infrastructure.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;





@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "endereco")
public class endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "rua")
    private String rua;
    @Column(name = "numero")
    private String numero;
    @Column(name = "complemento", length = 10)
    private String complemento;
    @Column(name = "Estado", length = 2)
    private String Estado;
    @Column(name = "cidade", length = 150)
    private String cidade;
    @Column(name = "cep", length = 9)
    private String cep;



}
