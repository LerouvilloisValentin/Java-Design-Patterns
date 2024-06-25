package fr.diginamic.composite;

public class Employe implements IElement {
    protected String nom;
    protected String prenom;
    protected Double salaire;

    public Employe(String nom, String prenom, Double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    @Override
    public Double calculerSalaire() {
        return salaire;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }
}
