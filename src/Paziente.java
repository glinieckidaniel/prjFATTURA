public class Paziente {
    private String condominio;

    public Paziente(String condominio) {
        this.condominio = condominio;
    }

    public String getCondominio() {
        return condominio;
    }

    public void setCondominio(String condominio) {
        this.condominio = condominio;
    }

    @Override
    public String toString() {
        String t = "";
        t = " Condominio : " + condominio + "\n";
        return t;
    }
}
