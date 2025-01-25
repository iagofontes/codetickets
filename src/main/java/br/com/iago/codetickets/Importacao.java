package br.com.iago.codetickets;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table
public class Importacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cpf;

    private String cliente;

    private LocalDate nascimento;

    private String evento;

    private LocalDate data;

    private String tipoIngresso;

    private Double valor;

    private LocalDateTime horaImportacao;

}
