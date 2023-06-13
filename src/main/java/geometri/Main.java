
package geometri;

public class Main {
    public static void main(String[] args) {
        // objek
        Lingkaran z1 = new Lingkaran();
        PersegiPanjang z2 = new PersegiPanjang();
        
        z1.radius = 20;
        System.out.println("Tampil Luas Lingkaran = " + z1.luas());
        System.out.println("Tampil Keliling Lingkaran = " + z1.keliling());
        System.out.println("");
        
        z2.lebar = 5 ;
        z2.panjang = 3;
        System.out.println("Tampil Lebar Persegi Panjang = " + z2.lebar);
        System.out.println("Tampil Panjang Persegi Panjang = " + z2.panjang);
    }
}
