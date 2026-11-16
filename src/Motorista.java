
public class Motorista extends Pessoa {

    private boolean disponivel;
    private double avaliacaoMedia;

    // Construtor sem parâmetros
    public Motorista() {
        super();
    }

    // Construtor com parâmetros
    public Motorista(int id, String nome, String telefone,
                     boolean disponivel, double avaliacaoMedia) {
        super(id, nome, telefone);
        this.disponivel = disponivel;
        this.avaliacaoMedia = avaliacaoMedia;
    }

    // Getters
    public boolean isDisponivel() {
        return disponivel;
    }

    public double getAvaliacaoMedia() {
        return avaliacaoMedia;
    }

    // Setters
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setAvaliacaoMedia(double avaliacaoMedia) {
        if (avaliacaoMedia >= 0 && avaliacaoMedia <= 5) {
            this.avaliacaoMedia = avaliacaoMedia;
        }
    }
}
