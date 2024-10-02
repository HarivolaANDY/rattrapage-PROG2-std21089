package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Immeuble extends Endroit{
    private int nombreEtages;
    private List<Appartement> appartements = new ArrayList<>();

    @Override
    public int getNombreAppartements() {
        return appartements.size();
    }
}
