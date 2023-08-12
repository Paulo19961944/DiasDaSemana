public class DiasDaSemana {
    public static void main(String[] args) {
        /** Variáveis */
        String[] dias = {"Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado"};

        /** Lista de Números */
        int[] numeros = {0, 1, 2, 3, 4, 5, 6};

        /** Mostrar os dias */
        for (int i = 0; i < numeros.length; i++) {
            int numDia = numeros[i];
            if (numDia >= 0 && numDia < dias.length) {
                System.out.println("Dia " + numDia + ": " + dias[numDia]);
            } else {
                System.out.println("Dia inválido");
            }
        }
    }
}
