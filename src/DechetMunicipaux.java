public class DechetMunicipaux extends Page{


    public DechetMunicipaux(){
        entete("Etat de traitement des dechets municipaux");


        out("Recuperation : ");
        out("Livraison : ");
        out("Usage : ");
        filtrer();
    }


    @Override
    public void changerPage(int intNumeroOption) {
        switch (intNumeroOption) {
            case 0:
                tabNomOptions.clear();
                new Menu();
                break;
            case 99:
                System.exit(0);
                break;
            default:
                out("Svp, entrer un chiffre valide");
                //filtrer();
        }
    }
}
