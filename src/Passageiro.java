
public class Passageiro extends Pessoa {

    private String email;

    // Construtor sem parâmetros
    public Passageiro() {
        super();
    }

    // Construtor com parâmetros
    public Passageiro(int id, String nome, String telefone, String email) {
        super(id, nome, telefone);
        this.email = email;
    }

    // Getter
    public String getEmail() {
        return email;
    }

    // Setter
    public void setEmail(String email) {
        this.email = email;
    }
}
