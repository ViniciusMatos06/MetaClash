🦸 MetaClash

MetaClash é um mini game backend desenvolvido em Java (POO) com foco em prática de arquitetura orientada a objetos.

O projeto simula um sistema de:

🛒 Compra de heróis

👥 Formação de time (máximo 3 heróis)

⚔️ Sistema de batalha baseado em estatísticas

📊 Cálculo de média de atributos do time

🚀 Objetivo do Projeto

Treinar conceitos de:

- Programação Orientada a Objetos

- Encapsulamento

- Listas (ArrayList)

- Regras de negócio

- Separação de responsabilidades

- Arquitetura básica de sistemas backend

🧱 Estrutura do Projeto
📦 model

Player
Responsável por:

- Saldo

- Time de heróis (máx. 3)

- Compra de heróis

- Heroes

Modelo base de um herói:

- Nome

- HP

- Strength

- Speed

- Defence

- Intelligence

- Price

HeroesCatalog
- Catálogo de heróis disponíveis para compra.

BattleSystem
- Responsável pelos cálculos de média de atributos e futura lógica de batalha.

⚔️ Sistema de Batalha

O sistema utiliza a média dos atributos dos 3 heróis do time para calcular:

- Força média

- Defesa média

- Velocidade média

- Inteligência média

Esses valores são usados para determinar dano e ordem de turno.

🛒 Regras de Compra

- O jogador começa com saldo inicial.

- Só pode possuir até 3 heróis.

- Não pode comprar se:

- Não tiver saldo suficiente

- Já possuir 3 heróis

🧠 Conceitos Aplicados

- Encapsulamento

- Uso de List<Heroes>

- Verificação de regras antes de modificar estado

- Separação de responsabilidades entre classes

- Evitar compartilhamento de instâncias do catálogo

📌 Próximos Passos

- Implementar sistema completo de batalha 3v3

- Sistema de turnos

- Sistema de ataque (físico, tático, área)

- HP individual por herói

- Sistema de vitória/derrota

- Interface de console interativa

🛠 Tecnologias

Java

IntelliJ IDEA

🎯 Status

🚧 Em desenvolvimento – Projeto para prática de arquitetura e lógica de jogo backend.

![Concept art](img/Dark%20Knight%20vs%20Thor.png)