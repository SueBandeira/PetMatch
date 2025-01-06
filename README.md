# PetMatch: Plataforma de Adoção de Pets 🐶✨

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

## 📖 Sobre o Projeto

**PetMatch** é uma plataforma **open-source** que facilita o processo de adoção de pets. O objetivo principal é conectar pessoas interessadas em adotar animais com ONGs e abrigos, ajudando a encontrar o pet ideal com base em preferências como tipo, raça, idade, e localização.

Este projeto é **100% gratuito e colaborativo**, e contribuições são bem-vindas para backend, frontend, UI/UX, design, marketing e outros.

---

## 🚀 Funcionalidades

- Cadastro de pets para adoção.
- Filtro de pets por tipo, raça, tamanho, idade e localização.
- Controle de status dos pets (disponível ou adotado).
- Cadastro de usuários (adotantes e ONGs).
- Sistema seguro e escalável utilizando **Java** e **Spring Boot**.

---

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem de programação.
- **Spring Boot**: Framework para desenvolvimento de aplicações backend.
- **Hibernate/JPA**: Gerenciamento de persistência e mapeamento objeto-relacional (ORM).
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
- **Maven**: Gerenciador de dependências.
- **Lombok**: Redução de boilerplate no código.
- **Jakarta Validation**: Validações de dados.

---

## 📂 Estrutura do Projeto

```bash
src/main/java/com/seuprojeto/adocaopets
├── controller      # Controladores REST
├── model           # Classes de entidade e enums
├── repository      # Interfaces de repositórios (JPA)
├── service         # Lógica de negócios
└── dto             # Data Transfer Objects (opcional)
```

---

## ⚙️ Como Configurar o Ambiente

### Pré-requisitos

- **Java 17+**
- **Maven**
- **Git**

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/petmatch.git
   ```

2. Navegue até a pasta do projeto:
   ```bash
   cd petmatch
   ```

3. Instale as dependências:
   ```bash
   mvn clean install
   ```

4. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

5. Acesse a API no navegador:
   ```
   http://localhost:8080
   ```

---

## 📄 Rotas da API

### Pet
| Método | Rota             | Descrição                           |
|--------|------------------|-------------------------------------|
| GET    | `/pets`          | Lista todos os pets disponíveis.   |
| POST   | `/pets`          | Cadastra um novo pet.              |
| PUT    | `/pets/{id}`     | Atualiza informações de um pet.    |
| DELETE | `/pets/{id}`     | Remove um pet do sistema.          |

### User
| Método | Rota             | Descrição                           |
|--------|------------------|-------------------------------------|
| GET    | `/users`         | Lista todos os usuários.           |
| POST   | `/users`         | Cadastra um novo usuário.          |
| PUT    | `/users/{id}`    | Atualiza informações de um usuário.|
| DELETE | `/users/{id}`    | Remove um usuário do sistema.      |

---

## 🤝 Como Contribuir

1. Faça um fork do repositório.
2. Crie uma branch para suas alterações:
   ```bash
   git checkout -b minha-feature
   ```
3. Realize suas modificações e faça commit:
   ```bash
   git commit -m "Minha nova feature"
   ```
4. Envie suas alterações:
   ```bash
   git push origin minha-feature
   ```
5. Abra um **Pull Request** na página do projeto.

---

## 📜 Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## 💡 Ideias Futuras

- Implementar autenticação JWT para usuários.
- Adicionar integração com plataformas externas (ex.: Google Maps).
- Criar um painel administrativo para ONGs gerenciarem seus pets.

---

