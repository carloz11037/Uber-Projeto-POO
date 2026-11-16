public class Trajeto {

        private int idsolicitacao;
        private String origem;
        private String destino;
        private Double valorEstimado;

        public Trajeto() {
        }

        public Trajeto(int idsolicitacao, String origem, String destino, Double valorEstimado) {
            this.idsolicitacao = idsolicitacao;
            this.origem = origem;
            this.destino = destino;
            this.valorEstimado = valorEstimado;
        }

        Trajeto trajeto1 = new Trajeto();

        Trajeto trajeto2 = new Trajeto(
                1, "RUA A", "RUA B", 10.00
        );

        public int getIdsolicitacao() {
            return idsolicitacao;
        }

        public String getorigem() {
            return origem;
        }

        public String getDestino() {
            return destino;
        }

        public double getvalorEstimado() {
            return valorEstimado;
        }

        public void setId(int idsolicitacao) {
            this.idsolicitacao = idsolicitacao;
        }

        public void setOrigem(String origem) {
                this.origem = origem;
        }

        public void setDestino(String destino) {
            this.destino = destino;
        }

        public void setValorEstimado(double valorEstimado) {
            this.valorEstimado = valorEstimado;
        }









}
