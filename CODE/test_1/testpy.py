lista = [10, 20, 30, 40, 50]

primeiro_elemento = lista[0]
segundo_elemento = lista[1]

print(f'O primeiro elemento da lista é {primeiro_elemento}')
print(f'O segundo elemento da lista é {segundo_elemento}')

lista.append(60)
print(f'Lista após adicionar 60: {lista}')

lista.insert( _index: 2, _object: 25)
print(f'Lista após inserir 25 na posição 2: {lista}')

lista.remove(40)
print(f'Lista após remover 40: {lista}')

ultimo_elemento = lista.pop()
print(f'Elemento removido: {ultimo_elemento}')
print(f'Lista após remover o último elemento: {lista}')

sub_lista = lista[1:4]
print(f'Sub-lista (elementos de índice 1 a 3): {sub_lista}')

lista.sort()
print(f'Lista ordenada: {lista}')

print('Iterando sobre a lista: ')
for elemento in lista:
    print(elemento)
