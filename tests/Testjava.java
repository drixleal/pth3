//package tests;

import java.util.ArrayList;  // Para usar listas dinâmicas
import java.util.Arrays;    // Para ajudar a criar a lista inicial
import java.util.Collections; // Para a ordenação
import java.util.List;      // Usar a interface List (boa prática)

public class Testjava {

    public static void main(String[] args) {

        // Em Java, precisamos declarar o tipo. Usamos ArrayList<Integer>
        // Uma forma de inicializar (outras existem)
        List<Integer> lista = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        // Acessar elementos usa o método .get(indice)
        Integer primeiroElemento = lista.get(0);
        Integer segundoElemento = lista.get(1);

        // Saída em Java usa System.out.println() (concatenação é a forma mais simples aqui)
        System.out.println("O primeiro elemento da lista é " + primeiroElemento);
        System.out.println("O segundo elemento da lista é " + segundoElemento);

        // Adicionar ao final usa .add(elemento)
        lista.add(60);
        // Imprimir a lista inteira mostra sua representação padrão
        System.out.println("Lista após adicionar 60: " + lista);

        // Inserir em um índice específico usa .add(indice, elemento)
        lista.add(2, 25); // Adiciona 25 na posição 2
        System.out.println("Lista após inserir 25 na posição 2: " + lista);

        // Remover por VALOR requer cuidado: .remove(Object)
        // Se passarmos um int (40), ele tentaria remover pelo ÍNDICE 40.
        // Precisamos passar um objeto Integer.
        lista.remove(Integer.valueOf(40));
        System.out.println("Lista após remover 40: " + lista);

        // Remover o ÚLTIMO elemento usa .remove(indice) com o último índice
        // O método remove(indice) também retorna o elemento removido, como o pop()
        Integer ultimoElemento = lista.remove(lista.size() - 1);
        System.out.println("Elemento removido: " + ultimoElemento);
        System.out.println("Lista após remover o último elemento: " + lista);

        // Sub-lista usa .subList(inicio_inclusivo, fim_exclusivo)
        // Importante: subList retorna uma VIEW, não uma cópia! Se quisermos uma cópia:
        List<Integer> subLista = new ArrayList<>(lista.subList(1, 4)); // Cria nova lista baseada na sublista
        System.out.println("Sub-lista (elementos de índice 1 a 3): " + subLista);

        // Ordenar a lista usa Collections.sort() ou lista.sort() (desde Java 8)
        Collections.sort(lista);
        // Ou, alternativamente (Java 8+): lista.sort(null);
        System.out.println("Lista ordenada: " + lista);

        // Iterar sobre a lista usa o "enhanced for loop" (parecido com o Python)
        System.out.println("\nIterando sobre a lista:"); // \n para pular linha
        for (Integer elemento : lista) {
            System.out.println(elemento);
        }
    }
}
