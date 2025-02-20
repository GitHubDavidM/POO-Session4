public class Etudiant{
    String nom;
    int age;

    public Etudiant(String nom, int age){
        this.nom = nom;
        this.age = age;
    }

    public void afficherInfo(){
        System.out.println("Je m'appelle ; " + this.nom + " et J 'ai " + this.age + " ans");
    }
    public static void afficher(){
        System.out.println("Je suis une classe");
    }


    public static void main(String[] args) {
        Etudiant maxi = new Etudiant("Bob", 15);
        Etudiant yassine = new Etudiant("Yassine", 35);
        maxi.afficherInfo();
        yassine.afficherInfo();
        Etudiant.afficher();
       
    }
}
