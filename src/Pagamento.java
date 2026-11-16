public class Pagamento {
    private int id;
    private double valor;
    private String metodo;
    private String status;

    public Pagamento() {
    }

    public Pagamento(int id, double valor, String metodo, String status) {
        this.id = id;
        this.valor = valor;
        this.metodo = metodo;
        this.status = status;
    }

    Pagamento pagamento1 = new Pagamento();

    Pagamento pagamento2 = new Pagamento(
            1, 18.50, "Pix", "Pendente"
    );

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public String getMetodo() {
        return metodo;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValor(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        }
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}