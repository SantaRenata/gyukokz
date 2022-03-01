
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String valasztott = "";
        do{
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("1) Program inditasa");
        System.out.println();
        System.out.println("2) Nevjegy");
        System.out.println();
        System.out.println("3) Kilepes");

        System.out.println();
        System.out.println();
        System.out.print("Valasztas: ");

        valasztott = sc.nextLine();
        switch(valasztott) {
            case "1":
                System.out.println("Program...");
                double szam = 0;

                do{
                    System.out.print("Szam: ");
                    szam = sc.nextDouble();
                    if(szam != 0){
                        double ngyok = Math.sqrt(szam);
                        System.out.printf("Negyzetgyoke: %.2f\n" , ngyok);
                    }
                    
                }while(szam != 0);

                System.out.println("\nFolytatashoz Enter");
                sc.nextLine(); //Enter olvasása
                sc.nextLine(); //Várás Enterre
                break;

            case "2":
                System.out.println("Nevjegy...");
                System.out.println("Sánta Renáta Diána");
                System.out.println("2022-03-01");
                System.out.println("Szoft I N");
                System.out.println("Gyokszamito");
                System.out.println("\nFolytatashoz Enter");
            
                sc.nextLine();
                break;

            case "3":
                System.out.println("Kilepes...");
                break;
            
        }
        }while(!valasztott.equals("3"));

        sc.close();
    }
}
