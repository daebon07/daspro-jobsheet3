import java.util.Scanner;
public class siakad21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String nama, nim, kelas;
    byte absen;
    double nilaikuis, nilaitugas, nilaiuts, nilaiuas, nilaiakhir;

    System.out.println("masukan Nama");
    nama = sc.nextLine();
    System.out.println("masukan NIM");
    nim = sc.nextLine();
    System.out.println("masukan Kelas");
    kelas = sc.nextLine();
    System.out.println("masukan Absen");
    absen = sc.nextByte();
    System.out.println("masukan Nilai kuis");
    nilaikuis = sc.nextDouble();
    System.out.println("masukan Nilai Tugas");
    nilaitugas = sc.nextDouble();
    System.out.println("masukan Nilai Uts");
    nilaiuts = sc.nextDouble();
    System.out.println("masukan Nilai Uas");
    nilaiuas = sc.nextDouble();

    nilaiakhir = (nilaikuis*0.2 + nilaitugas*0.15 + nilaiuts*0.3 + nilaiuas*0.35);

    System.out.println("Mahasiswa dengan Nama " + nama + ("NIM : " + nim) + " kelas " + kelas + " Absen " + absen);
    System.out.println("nilai akhir " + nilaiakhir);
   

    
}

}