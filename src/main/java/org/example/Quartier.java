package org.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Quartier extends Endroit{
    private final List<Immeuble> immeubles = new ArrayList<>();

    @Override
    public int getNombreAppartements() {
        int totalAppartements = 0;
        for (Immeuble immeuble : immeubles) {
            totalAppartements += immeuble.getNombreAppartements();
        }
        return totalAppartements;
    }

    public boolean contientAppartement(Appartement appartement) {
        for (Immeuble immeuble : immeubles) {
            if (immeuble.getAppartements().contains(appartement)) {
                return true;
            }
        }
        return false;
    }
}
