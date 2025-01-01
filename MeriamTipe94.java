import java.util.Stack;

public class MeriamTipe94 implements sistemMeriam {
    private Stack<Peluru> mag;

    public MeriamTipe94() {
        mag = new Stack<>();
    }

    @Override
    public void reloading(String jenis) {
        Peluru peluru = new Peluru(jenis);
        mag.push(peluru);
        System.out.println("\nPeluru dimuat: " + peluru);
    }

    @Override
    public void fire() {
        if (mag.isEmpty()) {
            System.out.println("\nMeriam kosong kapten, tidak bisa menembak!!!");
        } else {
            Peluru peluru = mag.pop();
            System.out.println("\nPeluru ditembakkan: " + peluru);
        }
    }

    @Override
    public void checkAmmo() {
        if (mag.isEmpty()) {
            System.out.println("\nTidak ada peluru di magazinenya kapten!! Disarankan untuk diisi!!!");
        } else {
            Peluru peluru = mag.peek();
            System.out.println("\nPeluru " + peluru + " siap untuk ditembakkan kapten!!");
        }
    }

    public void displayAmmo() {
        if (mag.isEmpty()) {
            System.out.println("\nMagazine kosong, tidak ada peluru yang tersedia.");
        } else {
            System.out.println("\nDaftar peluru di magazine:");
            for (int i = mag.size() - 1; i >= 0; i--) {
                System.out.println("- " + mag.get(i));
            }
        }
    }
}
