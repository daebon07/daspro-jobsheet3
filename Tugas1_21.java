import java.util.Scanner;
    public class Tugas1_21 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        double jmllistrik, totaltagihan, tariflistrik=1500;
        boolean cek;

        System.out.println ("Masukan jumlah penggunaan listrik anda?");
        jmllistrik = input.nextDouble();

        totaltagihan = tariflistrik*jmllistrik;
        cek= jmllistrik > 500;

        System.out.println ("Lumlah Listrik" + jmllistrik);
        System.out.println ("Total Tagihan Anda" + totaltagihan);
        System.out.println ("Apakah Penggunaan Listrik Lebih Dari 500Kwh" + cek);
    }
    }