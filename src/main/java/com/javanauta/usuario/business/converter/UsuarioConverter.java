package com.javanauta.usuario.business.converter;

import com.javanauta.usuario.business.dto.EnderecoDTO;
import com.javanauta.usuario.business.dto.TelefoneDTO;
import com.javanauta.usuario.business.dto.UsuarioDTO;
import com.javanauta.usuario.infrastructure.entity.Telefone;
import com.javanauta.usuario.infrastructure.entity.Usuario;
import com.javanauta.usuario.infrastructure.entity.endereco;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class UsuarioConverter {

    public Usuario paraUsuario(UsuarioDTO usuarioDTO) {
        return Usuario.builder()
                .nome(usuarioDTO.getNome())
                .email(usuarioDTO.getEmail())
                .senha(usuarioDTO.getSenha())
                .enderecos(paraListaEndereco(usuarioDTO.getEnderecos()))
                .telefones(paraListaTelefone(usuarioDTO.getTelefones()))
                .build();
    }

    public List<endereco> paraListaEndereco(List<EnderecoDTO> enderecoDTOS) {
        return enderecoDTOS.stream().map(this::paraEndereco).toList();

    }

    public endereco paraEndereco(EnderecoDTO enderecoDTO) {
        return endereco.builder()

                .numero(enderecoDTO.getNumero())
                .cep(enderecoDTO.getCep())
                .cidade(enderecoDTO.getCidade())
                .complemento(enderecoDTO.getComplemento())
                .rua(enderecoDTO.getRua())
                .estado(enderecoDTO.getEstado())
                .build();
    }

    public List<Telefone> paraListaTelefone(List<TelefoneDTO> telefoneDTOS) {
        return telefoneDTOS.stream().map(this::paraTelefone).toList();


    }

    public Telefone paraTelefone(TelefoneDTO telefoneDTO) {
        return Telefone.builder()
                .numero(telefoneDTO.getNumero())
                .ddd(telefoneDTO.getDdd())
                .build();
    }



        public UsuarioDTO paraUsuarioDTO (Usuario usuarioDTO){
            return UsuarioDTO.builder()
                    .nome(usuarioDTO.getNome())
                    .email(usuarioDTO.getEmail())
                    .senha(usuarioDTO.getSenha())
                    .enderecos(paraListaEnderecoDTO(usuarioDTO.getEnderecos()))
                    .telefones(paraListaTelefoneDTO(usuarioDTO.getTelefones()))
                    .build();
        }

        public List<EnderecoDTO> paraListaEnderecoDTO (List < endereco > enderecoDTOS) {
            return enderecoDTOS.stream().map(this::paraEnderecoDTO).toList();

        }

        public EnderecoDTO paraEnderecoDTO (endereco enderecoDTO){
            return EnderecoDTO.builder()

                    .numero(enderecoDTO.getNumero())
                    .cep(enderecoDTO.getCep())
                    .cidade(enderecoDTO.getCidade())
                    .complemento(enderecoDTO.getComplemento())
                    .rua(enderecoDTO.getRua())
                    .estado(enderecoDTO.getEstado())
                    .build();
        }
        public List<TelefoneDTO> paraListaTelefoneDTO (List < Telefone > telefoneDTOS) {
            return telefoneDTOS.stream().map(this::paraTelefoneDTO).toList();


        }
        public TelefoneDTO paraTelefoneDTO (Telefone telefoneDTO){
            return TelefoneDTO.builder()
                    .numero(telefoneDTO.getNumero())
                    .ddd(telefoneDTO.getDdd())
                    .build();
        }
    }

