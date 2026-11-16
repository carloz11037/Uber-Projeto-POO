public class solicitarCorrida {

    public static void main(String[] args) {

        // Criando o passageiro
        Passageiro passageiro = new Passageiro(
                1, "Carlos", "81999999999", "carlos@email.com"
        );

        // Criando o motorista
        Motorista motorista = new Motorista(
                2, "Ana", "81988888888", true, 4.8
        );

        // Verificando disponibilidade do motorista
        if (motorista.isDisponivel()) {

            // Criando a corrida
            Corrida corrida = new Corrida(
                    1,
                    "Centro de Gravatá",
                    "UNIFACOL",
                    18.50,
                    "Solicitada"
            );

            System.out.println("=== CORRIDA SOLICITADA ===");
            System.out.println("Passageiro: " + passageiro.getNome());
            System.out.println("Motorista: " + motorista.getNome());
            System.out.println("Origem: " + corrida.getOrigem());
            System.out.println("Destino: " + corrida.getDestino());
            System.out.println("Valor: R$ " + corrida.getValor());
            System.out.println("Status: " + corrida.getStatus());

            // Atualizando a disponibilidade do motorista
            motorista.setDisponivel(false);

            System.out.println("\nMotorista disponível: "
                    + motorista.isDisponivel());

        } else {
            System.out.println("Não há motorista disponível.");
        }
    }
}

