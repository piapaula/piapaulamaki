import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna salattava merkkijono ");
        String merkkijono = lukija.nextLine();
        Caesar salaaja = new Caesar();
        String salattu = salaaja.salaa(merkkijono);
        System.out.println("Salattu: " + salattu);
        String palautettuTeksti = salaaja.palautus(merkkijono);
        System.out.println("Alkuperäinen merkkijono: " + palautettuTeksti);

    }

    public String salaa(String teksti) {
        String avattu = "";
        for (int i = 0; i < teksti.length(); i++) {
            char c = teksti.charAt(i);
            char uusi = (char) (c + 3);
            avattu+= uusi;




        }
        return (avattu);


    }
    public String palautus(String palautettava) {
        String palautettu = "";
        for (int i = 0; i < palautettava.length(); i++) {
            char c = palautettava.charAt(i);
            char uusi = (char) (c - 3);
            palautettu += uusi;


        }
        return (palautettava);
    }

}
