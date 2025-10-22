package tests;

import java.util.Scanner; // Para ler a entrada do usuário
import java.util.regex.Pattern; // Para a verificação de dígitos repetidos com regex

public class ValidaCpf {

    /**
     * Valida um número de CPF brasileiro.
     * @param cpfStr A string do CPF, podendo conter pontos e traços.
     * @return true se o CPF for válido, false caso contrário.
     */
    public static boolean validarCpf(String cpfStr) {

        // 1. Removendo caracteres não numéricos (equivalente ao filter + join)
        // \\D representa qualquer caractere que NÃO seja dígito
        String cpf = cpfStr.replaceAll("\\D", "");

        // 2. Verificando se o CPF possui 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // 3. Verificando se todos os dígitos são iguais (usando regex)
        // (\\d) captura um dígito, \\1{10} verifica se ele se repete 10 vezes
        if (Pattern.matches("(\\d)\\1{10}", cpf)) {
             return false;
        }

        // --- Cálculo e Verificação do Primeiro Dígito Verificador ---
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            // Character.getNumericValue converte o char do dígito para int
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }

        int resto = soma % 11;
        int dv1Calculado = (resto < 2) ? 0 : (11 - resto); // Operador ternário (if/else curto)

        // Verificando o primeiro dígito verificador
        if (Character.getNumericValue(cpf.charAt(9)) != dv1Calculado) {
            return false;
        }

        // --- Cálculo e Verificação do Segundo Dígito Verificador ---
        soma = 0;
        for (int i = 0; i < 10; i++) { // Agora iteramos sobre os 10 primeiros dígitos
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i); // Pesos de 11 a 2
        }

        resto = soma % 11;
        int dv2Calculado = (resto < 2) ? 0 : (11 - resto);

        // Verificando o segundo dígito verificador
        if (Character.getNumericValue(cpf.charAt(10)) != dv2Calculado) {
            return false;
        }

        // Se passou por todas as verificações, o CPF é válido
        return true;
    }

    // --- Bloco Principal (equivalente ao if __name__ == "__main__":) ---
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do console
        // Usar try-with-resources garante que o scanner seja fechado
        try (Scanner scanner = new Scanner(System.in)) {

            // Pede o CPF ao usuário (equivalente ao input())
            System.out.print("Digite o CPF (somente números ou com pontuação): ");
            String cpfDigitado = scanner.nextLine();

            // Chama a função de validação
            if (validarCpf(cpfDigitado)) {
                // Imprime o resultado (usando printf para formatação similar a f-string)
                // %s é o placeholder para string, %n para nova linha
                System.out.printf("O CPF %s é válido.%n", cpfDigitado);
            } else {
                System.out.printf("O CPF %s é inválido.%n", cpfDigitado);
            }
        } // O scanner é fechado automaticamente aqui
    }
}