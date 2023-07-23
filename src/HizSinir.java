public class HizSinir {

    private String arac;

    private int sehirIciHiz;

    private int ciftYonluHiz;

    private int bolunmusYolHiz;

    private int otoyolHiz;

    public HizSinir(String arac, int sehirIciHiz, int ciftYonluHiz, int bolunmusYolHiz, int otoyolHiz) {
        this.arac = arac;
        this.sehirIciHiz = sehirIciHiz;
        this.ciftYonluHiz = ciftYonluHiz;
        this.bolunmusYolHiz = bolunmusYolHiz;
        this.otoyolHiz = otoyolHiz;
    }

    public String getArac() {
        return arac;
    }

    public int getBolunmusYolHiz() {
        return bolunmusYolHiz;
    }

    public int getCiftYonluHiz() {
        return ciftYonluHiz;
    }

    public int getOtoyolHiz() {
        return otoyolHiz;
    }

    public int getSehirIciHiz() {
        return sehirIciHiz;
    }
}
