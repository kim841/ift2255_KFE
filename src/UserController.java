import java.io.*;

public class UserController extends Controller{



    public String user, mdp, name, adresse, telephone, courriel, numeroBac;



    public UserController(){


    }

    public void setUser(String usr){
        this.user = usr;
    }

    public void setMdp(String pass){
        this.mdp = pass;
    }


    public void getInfo() throws IOException {
        FileInputStream fstream = new FileInputStream("src/informations.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        while ((strLine = br.readLine()) != null)   {
            String[] tokens = strLine.split(",");
            this.name = tokens[2];
            this.courriel = tokens[3];
            this.adresse = tokens[4];
            this.telephone = tokens[5];
            this.numeroBac = tokens[6];
        }
    }

    public void afficherInfo(){

        System.out.println(this.name);
        System.out.println(this.courriel);
        System.out.println(this.adresse);
        System.out.println(this.telephone);
        System.out.println(this.numeroBac);

    }

}
