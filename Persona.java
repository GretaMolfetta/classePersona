package classePersona;

public class Persona {
     // Attributi
     private String nome;
     private int eta;

     // Costruttore
     public Persona(String nome, int eta) {
          this.nome = nome;
          this.eta = eta;
     }

     // Metodi getter e setter
     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public int getEta() {
          return eta;
     }

     public void setEta(int eta) {
          this.eta = eta;
     }

     // Metodo per settare le informazioni della persona
     public static Persona settaInformazioni(String nome, int eta) {
          return new Persona(nome, eta);
     }

     public static void main(String[] args) {
          Persona persona = settaInformazioni("Marco", 6);
          System.out.println(persona.getNome() + ' ' + persona.getEta());
     }
}