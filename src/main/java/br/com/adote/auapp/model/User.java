package br.com.adote.auapp.model;

import br.com.adote.auapp.enums.Tipo;
import jakarta.persistence.*;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotEmpty
  @Size(max = 100)
  @Column(name = "nome", length = 100, nullable = false)
  private String nome;

  @NotEmpty
  @Email
  @Size(max = 100)
  @Column(name = "email", length = 100, nullable = false)
  private String email;

  @NotEmpty
  @Size(max = 25)
  @Pattern(regexp = "\\(\\d{2}\\)\\d{4,5}-\\d{4}", message = "Telefone inválido")//válida telefone
  @Column(name = "telefone", length = 25, nullable = false)
  private String telefone;

  @NotEmpty
  @Size(max = 100)
  @Column(name = "endereco", length = 100, nullable = false)
  private String endereco;

  @Enumerated(EnumType.STRING)
  @Column(name = "tipo", length = 15, nullable = false)
  private Tipo tipo;
}
