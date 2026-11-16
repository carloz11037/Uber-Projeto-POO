public class Corrida {
    private int id;
    private String origem;
    private String destino;
    private double valor;
    private String status;

    public Corrida() {
    }

    public Corrida(int id, String origem, String destino,
                   double valor, String status) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
        this.status = status;
    }

    Corrida corrida1 = new Corrida();

    Corrida corrida2 = new Corrida(
            1, "Centro", "Faculdade", 18.50, "Solicitada"
    );

    public int getId() {
        return id;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setValor(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        }
    }

    public void setStatus(String status) {
        this.status = status;
    }

}