import java.util.Scanner;
public class siakad21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String nama, nim;
    char kelas;
    byte absen;
    double nilaikuis, nilaitugas, nilaiujian, nilaiakhir;

    System.out.println("masukan Nama");
    nama = sc.nextLine();
    System.out.println("masukan NIM");
    nim = sc.nextLine();
    System.out.println("masukan Kelas");
    kelas = sc.nextLine().charAt(0);
    System.out.println("masukan Absen");
    absen = sc.nextByte();
    System.out.println("masukan Nilai kuis");
    nilaikuis = sc.nextDouble();
    System.out.println("masukan Nilai Tugas");
    nilaitugas = sc.nextDouble();
    System.out.println("masukan Nilai Ujian");
    nilaiujian = sc.nextDouble();

    nilaiakhir = (nilaikuis + nilaitugas + nilaiujian) /3;

    System.out.println("Mahasiswa dengan Nama " + nama + ("NIM : " + nim) + " kelas " + kelas + " Absen " + absen);
    System.out.println("nilai akhir " + nilaiakhir);
   

    
}

}