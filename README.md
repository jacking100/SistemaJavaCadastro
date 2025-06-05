# Sistema Java de Cadastro de Clientes

Este é um sistema simples de cadastro de clientes desenvolvido em Java, ideal para fins educacionais. Ele utiliza entrada de dados via console e estrutura orientada a objetos para armazenar informações dos clientes.

## 🛠️ Tecnologias Utilizadas

- Java 17+ (ou compatível)
- Eclipse IDE (opcional, mas recomendado)
- Paradigma: Programação Orientada a Objetos (POO)
- Estrutura de diretórios `src/` com pacotes organizados

## 📁 Estrutura do Projeto

SistemaJavaCadastro-main/
├── src/
│ ├── entidades/
│ │ └── Cliente.java
│ ├── repositorios/
│ │ └── ClienteRepositorio.java
│ └── principal/
│ └── Main.java


## 📌 Funcionalidades

- Cadastro de cliente via console:
  - Nome
  - E-mail
  - Telefone
  - Geração automática de ID (UUID)
  - Registro da data/hora do cadastro
- Exibição dos dados do cliente após o cadastro

## ▶️ Como Executar

1. Clone ou baixe o projeto.
2. Importe no Eclipse como um projeto Java.
3. Execute o arquivo `Main.java`.

## 📄 Exemplo de Uso

```bash
Sistema de Cadastro de Clientes

Informe o nome do Cliente.....: Maria Silva
Informe o e-mail do Cliente.....: maria@email.com
Informe o telefone do cliente...: (11) 91234-5678

Dados do Cliente:
ID.....................: f47ac10b-58cc-4372-a567-0e02b2c3d479
Nome...................: Maria Silva
Email..................: maria@email.com
Telefone...............: (11) 91234-5678
Data de Cadastro.......: Wed Jun 05 10:30:00 BRT 2025
