import java.util.Scanner;
import importservice.*;

public class addClientWS {

    static AddPojoService service;
    public static void main(String[] args) {
        try {

            //Instancier la classe AddPojoService (celle qui hérite de la classe service) pour récupérer une référence sur le WS
            AddPojoService service = new AddPojoService();
            System.out.println("Retrieving the port from the following service: "+ service);

            //Récupérer une référence de port qui permettra l'invocation des opérations
            AddPojo port = service.getAddPojoPort();
            System.out.println("Invoking the echo operation on the port.");


            for(int i=0; i<10;i++) {
                System.out.println("Saisir un entier a rajouter : ");
                Scanner s = new Scanner(System.in);
                int nombre1 = s.nextInt();
                System.out.println("Saisir un entier a rajouter : ");
                Scanner s2 = new Scanner(System.in);
                int nombre2 = s.nextInt();
                System.out.println("Somme :" + port.addTwo(nombre1,nombre2));
            }

        } catch (Exception e) {
            e.printStackTrace();}

    }


}
