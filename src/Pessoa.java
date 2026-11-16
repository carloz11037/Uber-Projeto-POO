
public class Pessoa {

    private int id;
    private String nome;
    private String telefone;

    // Construtor sem parâmetros
    public Pessoa() {
    }

    // Construtor com parâmetros
    public Pessoa(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
