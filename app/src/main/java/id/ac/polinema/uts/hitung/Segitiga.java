package id.ac.polinema.uts.hitung;

public class Segitiga {

    private float a, b, c, hasilHitung;
    private String hasil;

    public String getIndex() {
        return String.format(hasil);
    }

    public Segitiga(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public float hitungKeliling() {
        hasilHitung = a + b + c;
        return hasilHitung;
    }
}
