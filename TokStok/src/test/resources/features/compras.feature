#Author: marcos.leite21@gmail.com

@executa
Feature: Adcionar produto no carrinho de compras
  Eu como usuario quero adicionar produto no carrinho de compras
  
  Scenario: Adicionar produto no carrinho
    Given que eu acesse o site "https://www.tokstok.com.br/"
    When escolho um movel
    Then valido produto adicionado no carrinho. 