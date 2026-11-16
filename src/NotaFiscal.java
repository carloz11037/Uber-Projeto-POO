public class NotaFiscal {
    private int id;
    private String numero;
    private String dataEmissao;
    private double valor;

    public NotaFiscal() {
    }

    public NotaFiscal(int id, String numero,
                      String dataEmissao, double valor) {
        this.id = id;
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.valor = valor;
    }

    NotaFiscal notaFiscal1 = new NotaFiscal();

    NotaFiscal notaFiscal2 = new NotaFiscal(
            1, "NF001", "21/10/2026", 18.50
    );

    public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public double getValor() {
        return valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public void setValor(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        }
    }
}