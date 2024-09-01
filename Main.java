import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Gajah Gajah = new Gajah();
        Paus Paus = new Paus();
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nama hewan (Gajah/Paus) : ");
        String hewan = scanner.nextLine();

        if (hewan.equalsIgnoreCase("Gajah")) {
            Gajah.Darat();
        } else if (hewan.equalsIgnoreCase("Paus")) {
            Paus.Laut();
        } else {
            System.out.println("Hewan bukan termasuk pilihan");
        }
    }
}
