package org.example;

import lombok.Data;

@Data
public class Appartement {
    private String id;
    private String titre;
    private String description;
    private int loyerMensuel;
    private Status statut;
}
