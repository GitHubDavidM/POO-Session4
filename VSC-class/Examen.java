public class Examen {
    String nomEtudiant;
    byte note;
    
    public Examen(String nomEtudiant, byte note){
        this.nomEtudiant = nomEtudiant;
        this.note = note;
    }

    public void afficherResultat(){
        System.out.println(this.nomEtudiant + " : " + convertNote());
    }

    public char convertNote(){
        char lettre = 'N';

        if(this.note <= 100 && this.note > 90){
            lettre = 'A';
        }
        else if (this.note <= 90 && this.note > 80) {
            lettre = 'B';
        }
        else if(this.note <= 80 && this.note > 70){
            lettre = 'C';
        }
        else if(this.note <= 70 && this.note > 60){
            lettre = 'D';
        }
        else if(this.note <= 60 && this.note >= 0){
            lettre = 'E';
        }
        return lettre;
        
    }

    public static void main(String[] args){
        Examen marie = new Examen( "Marie Curie",(byte)85);
        Examen jean = new Examen( "Jean Dupont",(byte)95);
        Examen paul = new Examen( "Paul Martin", (byte)72);
        Examen lucie = new Examen( "Lucie Durand", (byte)55);
        Examen sophie = new Examen( "Sophie Lefevre",(byte)65);

        marie.afficherResultat();
        jean.afficherResultat();
        paul.afficherResultat();
        lucie.afficherResultat();
        sophie.afficherResultat();

    }
}
