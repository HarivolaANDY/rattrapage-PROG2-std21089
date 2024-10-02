package org.example;

import static org.example.Status.LIBRE;

public class Main {
    public static void main(String[] args) {
        Quartier ivandry = new Quartier();
        ivandry.setId("Q1");
        ivandry.setNom("Ivandry");

        Immeuble jade = new Immeuble();
        jade.setId("I1");
        jade.setNom("Jade");
        jade.setNombreEtages(5);

        Appartement appartement1 = new Appartement();
        appartement1.setId("A1");
        appartement1.setTitre("Appartement1");
        appartement1.setDescription("Appartement1");
        appartement1.setLoyerMensuel(40000);
        appartement1.setStatut(LIBRE);

        Appartement appartement2 = new Appartement();
        appartement2.setId("A1");
        appartement2.setTitre("Appartement1");
        appartement2.setDescription("Appartement1");
        appartement2.setLoyerMensuel(40000);
        appartement2.setStatut(LIBRE);

        jade.getAppartements().add(appartement1);
        jade.getAppartements().add(appartement2);
        ivandry.getImmeubles().add(jade);

        boolean estPresent = ivandry.contientAppartement(appartement1);
        System.out.println("L'appartement est-il dans le quartier ? " + estPresent);

        int nombreAppartementsDansImmeuble = jade.getNombreAppartements();
        System.out.println("L'immeuble Jade contient " + nombreAppartementsDansImmeuble + " appartements.");

        int nombreAppartementsDansQuartier = ivandry.getNombreAppartements();
        System.out.println("Le quartier d'Ivandry contient " + nombreAppartementsDansQuartier + " appartements.");
    }
}