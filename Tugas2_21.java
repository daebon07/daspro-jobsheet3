import java.util.Scanner;
public class Tugas2_21 {
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        double upah, akumulasi, gajikotor, gajibulanankaryawan, bonus, pajak ;
        int jamkerja;
        

        System.out.println("masukan upah perjam");
        upah = input.nextDouble();
        System.out.println("masukan jam kerja");
        jamkerja = input.nextInt();

        akumulasi = jamkerja*upah;
        bonus = akumulasi*0.1;
        gajikotor = akumulasi + bonus;
        pajak = gajikotor*0.05;
        gajibulanankaryawan = gajikotor - pajak;
        
        System.out.println("total gaji bulanan karyawan : ");
        System.out.println(gajibulanankaryawan);
    

    }

    
}
