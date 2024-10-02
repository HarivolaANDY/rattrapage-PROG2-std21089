package org.example;

import lombok.Data;

@Data
public abstract class Endroit {
    private String id;
    private String nom;

    public abstract int getNombreAppartements();
}
