public class Peluru {
    private String jenis;

    // Konstruktor
    public Peluru(String jenis) {
        this.jenis = jenis;
    }

    // Getter
    public String getJenis() {
        return jenis;
    }

    @Override
    public String toString() {
        return  jenis;
    }
}
