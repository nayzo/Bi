/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bi;
/**
 *
 * @author nayzo
 */
public class Bi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConnexionBD connexion = new ConnexionBD();
        connexion.openConnectionForMySql(Constante.db_trans);
        System.out.println("Start");
        connexion.remplirEtudiant(1);
        System.out.println("Stop");
        connexion.closeConnection();
    }
}
