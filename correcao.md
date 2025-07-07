# Correção

PS: que arquivos originais? eu não passei nada
PS: por que algs4? não precisa da biblioteca pra nada

## Diagrama de classes

- por que removeu coisas importantes do exemplo?
  - onde estão as interfaces?
  - a associação com App?
  - onde estão os métodos concretos de cada nave?

## Implementação

- App
  - nenhum polimorfismo implementado
- NaveEspacial
  - blindada, tripulada, autonoma... não são argumentos em um construtor. são interfaces para implementar
  - naves não blindadas com velocidades fora da faixa desejada lançam exceções...
    - ... que não são tratadas em nenhum lugar!
    - então a aplicação ainda dá erro quando elas são construídas dessa forma
    - esse não é o uso de exceções. elas devem ser tratadas.
  - há decolar, mas não pousar
- Naves concretas
  - apesar de seguirem a restrição imposta pela classe abstrata, não são bons exemplos para uso em polimorfismo

## Nota

2