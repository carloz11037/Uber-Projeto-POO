public class Avaliacao {
    private int id;
    private int nota;
    private String comentario;
    private String data;

    public Avaliacao() {
    }

    public Avaliacao(int id, int nota, String comentario, String data) {
        this.id = id;
        this.nota = nota;
        this.comentario = comentario;
        this.data = data;
    }

    Avaliacao avaliacao1 = new Avaliacao();

    Avaliacao avaliacao2 = new Avaliacao(
            1, 5, "Motorista muito educada", "21/10/2026"
    );

    public int getId() {
        return id;
    }

    public int getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    public String getData() {
        return data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNota(int nota) {
        if (nota >= 1 && nota <= 5) {
            this.nota = nota;
        }
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setData(String data) {
        this.data = data;
    }
















}