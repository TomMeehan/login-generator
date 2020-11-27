package geco;

import java.util.Random;

/**
 * Génère un mot de passe aléatoires parmis les chars de taille PWD_SIZE
 */
public class PasswordGeneration {
    /**
     * Caractères possibles pour le mot de passe généré.
     */
    private final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_-0123456789";

    /**
     * La taille du mot de passe généré.
     */
    private static final int PWD_SIZE = 8;

    /**
     * Génère le mot de passe.
     * @return le mot de passe généré
     */
    public String getRandomPassword(){
        StringBuilder s = new StringBuilder();
        Random r = new Random();

        while (s.length() < PWD_SIZE){
            s.append(chars.charAt((int) (r.nextFloat() * PWD_SIZE)));
        }

        return s.toString();
    }

}
