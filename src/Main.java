
public class Main {

    public static void main(String[] args) {

        // 1. Criando um passageiro com o construtor com parâmetros
        Passageiro passageiro = new Passageiro(
                1, "Carlos", "81999999999", "carlos@email.com"
        );

        // 2. Criando um motorista com o construtor com parâmetros
        Motorista motorista = new Motorista(
                2, "Ana", "81988888888", true, 4.8
        );

        // 3. Criando um veículo com o construtor com parâmetros
        Veiculo veiculo = new Veiculo(
                1, "Onix", "Chevrolet", "ABC1D23", 2024
        );

        // 4. Consultando dados com getters
        System.out.println("=== PASSAGEIRO ===");
        System.out.println("Nome: " + passageiro.getNome());
        System.out.println("Email: " + passageiro.getEmail());

        // 5. Alterando dados com setters
        passageiro.setNome("Carlos Daniel");
        passageiro.setEmail("carlosdaniel@email.com");

        System.out.println("\n=== PASSAGEIRO ATUALIZADO ===");
        System.out.println("Nome: " + passageiro.getNome());
        System.out.println("Email: " + passageiro.getEmail());

        // 6. Utilizando métodos herdados de Pessoa
        System.out.println("\n=== MOTORISTA ===");
        System.out.println("Nome: " + motorista.getNome());
        System.out.println("Telefone: " + motorista.getTelefone());

        motorista.setTelefone("81977777777");

        System.out.println("Novo telefone: " + motorista.getTelefone());
        System.out.println("Disponível: " + motorista.isDisponivel());
        System.out.println("Avaliação média: " + motorista.getAvaliacaoMedia());

        // 7. Consultando os dados do veículo
        System.out.println("\n=== VEÍCULO ===");
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Ano: " + veiculo.getAno());
    }
}
