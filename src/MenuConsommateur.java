import java.io.IOException;
import java.util.Scanner;

public class MenuConsommateur extends Page{
    public MenuConsommateur() throws IOException {

        /*if(Controller.liveUser.res){
            Controller.liveUser.getInfoRes();
        } else {
            Controller.liveUser.getInfoCons();
        }*/
        entete("Menu du consommateur");

        out( "**** Pour retourner au menu, appuyer 0 ****");
        out( "**** Pour quitter, appuyer 99 ****\n");

        addTabNomOptions("Consommateurs");
        addTabNomOptions("Suivi Ecologique");
        addTabNomOptions("Mon profil");
        addTabNomOptions("Notifier");
        out(afficherOptions ());

        //out("\nPour revenir au Menu appuyer 0");
        //out("Pour quitter appuyer 99");
        filtrer();
    }
    public void notifier() throws IOException {
        String msg = scannerInput("Message à transmettre");
        Controller.municipInfo.message.add(msg);
        out("Message transmis");
        new MenuConsommateur();
    }

    public String scannerInput(String message){
        out(message);
        Scanner temp = new Scanner(System.in);
        String wut = temp.nextLine();
        return wut;
    }

    @Override
    public void changerPage(int intNumeroOption) throws IOException {
        switch (intNumeroOption) {
            case 1:
                tabNomOptions.clear();
                new FindConsommateur();
                break;
            case 2:
                tabNomOptions.clear();
                new Suivi();
                break;
            case 3:
                tabNomOptions.clear();
                new ModifProfil();
                break;
            case 4:
                tabNomOptions.clear();
                notifier();
                break;
            case 99:
                effacer();
                System.exit(0);

                break;
            default:
                out("Svp, entrer un chiffre valide");
                filtrer();
        }
    }
}