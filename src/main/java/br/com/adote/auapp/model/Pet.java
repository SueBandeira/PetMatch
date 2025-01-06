package br.com.adote.auapp.model;

import br.com.adote.auapp.enums.Status;
import jakarta.persistence.*;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pet {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotEmpty
  @Column(name = "nome", length = 50, nullable = false, unique = false)
  private String nome;

  @PositiveOrZero
  @Column(name = "idade", nullable = false)
  private Integer idade;

  @NotEmpty
  @Size(max = 100)
  @Column(name = "tipo", length = 100, nullable = false)
  private String tipo;

  @NotEmpty
  @Size(max = 60)
  @Column(name = "raca", length = 60, nullable = false)
  private String raca;

  @NotEmpty
  @Size(max = 15)
  @Column(name = "tamanho", length = 15, nullable = false)
  private String tamanho;

  @NotEmpty
  @Size(max = 25)
  @Column(name = "temperamento", length = 25, nullable = false)
  private String temperamento;

  @NotEmpty
  @Size(max = 100)
  @Column(name = "localizacao", length = 100, nullable = false)
  private String localizacao;

  @Enumerated(EnumType.STRING)
  @Column(name = "status", length = 25, nullable = false)
  private Status status;
}
