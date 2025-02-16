# Sistema de Controle de Estoque

Este é um sistema de controle de estoque desenvolvido com Java, Spring Boot, Thymeleaf e MySQL. O objetivo do projeto é gerenciar o inventário de produtos de forma eficiente, permitindo cadastrar, editar, listar e excluir produtos.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **Thymeleaf**: Motor de templates para renderização de páginas HTML.
- **MySQL**: Banco de dados relacional para armazenamento dos dados.
- **Maven**: Gerenciador de dependências e build do projeto.
- **JUnit 5**: Framework para testes unitários e de integração.
- **Mockito**: Biblioteca para simulação de objetos em testes.

## Funcionalidades

- Cadastro de produtos.
- Edição de produtos.
- Listagem de produtos.
- Exclusão de produtos.

## Como Executar o Projeto

1. **Pré-requisitos**:
   - Java 17 ou superior.
   - MySQL instalado e configurado.
   - Maven instalado.

2. **Configuração do Banco de Dados**:
   - Crie um banco de dados chamado `estoque` no MySQL.
   - Configure as credenciais no arquivo `application.properties`.

3. **Executando a Aplicação**:
   - Clone o repositório:
     ```bash
     git clone https://github.com/seu-usuario/estoque-controle.git
     ```
   - Navegue até o diretório do projeto:
     ```bash
     cd estoque-controle
     ```
   - Execute o projeto com Maven:
     ```bash
     mvn spring-boot:run
     ```
   - Acesse a aplicação no navegador:
     ```
     http://localhost:8080
     ```

## Testes

O projeto inclui testes unitários e de integração para garantir a qualidade do código. Para executar os testes, use o seguinte comando:

```bash
mvn test
```

## Estrutura de Testes
- EstoqueApplicationTests: Verifica se o contexto da aplicação é carregado corretamente.
- ProdutoControllerTest: Testa os endpoints do ProdutoController usando MockMvc.
- ProdutoServiceTest: Testa a lógica de negócio do ProdutoService usando Mockito.
- ProdutoRepositoryTest: Testa a interação com o banco de dados usando DataJpaTest.

### Contribuição

- Contribuições são bem-vindas! Siga os passos abaixo:

- Faça um fork do projeto.

- Crie uma branch para sua feature (git checkout -b feature/nova-feature).

- Commit suas mudanças (git commit -m 'Adicionando nova feature').

- Push para a branch (git push origin feature/nova-feature).

- Abra um Pull Request.

### Licença
Este projeto está licenciado sob a licença **MIT**. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.
