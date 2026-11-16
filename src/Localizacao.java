public class Localizacao {
    private int id;
    private double latitude;
    private double longitude;
    private String descricao;

    public Localizacao() {
    }

    public Localizacao(int id, double latitude,
                       double longitude, String descricao) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.descricao = descricao;
    }

    Localizacao localizacao1 = new Localizacao();

    Localizacao localizacao2 = new Localizacao(
            1, -8.2833, -35.9667, "Centro de Gravatá"
    );

    public int getId() {
        return id;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLatitude(double latitude) {
        if (latitude >= -90 && latitude <= 90) {
            this.latitude = latitude;
        }
    }

    public void setLongitude(double longitude) {
        if (longitude >= -180 && longitude <= 180) {
            this.longitude = longitude;
        }
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }






}