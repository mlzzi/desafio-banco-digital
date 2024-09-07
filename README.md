# Banco Simples

# Criando um Banco Digital com Java e Orientação a Objetos

Este projeto é um estudo de um sistema bancário simples, desenvolvido em Java a partir de um desafio do Bootcamp em Java da DIO. Ele simula operações básicas de um banco, como criação de contas, depósitos, saques e transferências. O projeto foi desenvolvido com foco em praticar conceitos de POO (Programação Orientada a Objetos) e o uso de interfaces.

## Os seguintes conceitos de OOP foram praticados:
- ### Abstração
- ### Encapsulamento
- ### Herança
- ### Polimorfismo

## Funcionalidades

- Criação de contas correntes, poupança e conta em dólar
- Autenticação por senha no terminal
- Realização de depósitos
- Saques
- Transferências entre contas, inclusive com conversão para dólar para conta em dólar e vice-versa
- Realização de empréstimo com juros e pagamento de parcelas do empréstimo
- Exibição do extrato

## Tecnologias Utilizadas

- **Java** - Linguagem principal do projeto
- **IntelliJ IDEA** - IDE usada no desenvolvimento

## Estrutura do Projeto

O projeto é dividido nas seguintes classes:

- `Banco`: Gerencia as contas e suas operações
- `Conta`: Classe abstrata que define o comportamento comum entre Conta Corrente e Conta Poupança
- `ContaCorrente`: Implementa as especificidades de uma conta corrente como empréstimo
- `ContaPoupanca`: Implementa as especificidades de uma conta poupança como rendimento mensal
- `ContaEmDolar`: Implementa as especificidades de uma conta em dolar com valores convertidos para dólar
- `IConta`: Interface que define as operações de uma conta bancária