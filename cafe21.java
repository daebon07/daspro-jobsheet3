import java.util.Scanner;
public class cafe21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jumlahkopi, jumlahteh, jumlahroti;
        double hargakopi = 12000.0, hargateh= 7000.0, hargaroti= 20000.0, totalharga, nominalbayar;
        float diskon= 10 / 100f;

        System.out.print("Keanggotaan (true/false)");
        keanggotaan = input.nextBoolean();
        System.out.print("Jumlah pembelian kopi");
        jumlahkopi = input.nextInt();
        System.out.print("Jumlah pembelian teh");
        jumlahteh = input.nextInt();
        System.out.print("Jumlah pembelian roti");
        jumlahroti = input.nextInt();


        totalharga = (jumlahkopi*hargakopi) + (jumlahteh*hargateh) + (jumlahroti*hargaroti);
        nominalbayar = totalharga - (diskon*totalharga);
        int nominalInt = (int) nominalbayar;
        byte totalbyte = (byte) totalharga;

        System.out.println("keanggotaan" + keanggotaan);
        System.out.println("Item Pembelian" + jumlahkopi + "kopi" + jumlahteh + "teh" + jumlahroti + "roti" );
        System.out.println("Nominal Bayar" + nominalbayar);
        System.out.println("Nominal Int" + nominalInt);
        System.out.println("Totalbyte" + totalbyte);
    }
    
}