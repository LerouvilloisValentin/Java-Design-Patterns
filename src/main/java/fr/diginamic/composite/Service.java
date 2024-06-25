package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service implements IElement {
    protected String nom;
    List<IElement> listElement = new ArrayList<>();

    @Override
    public Double calculerSalaire() {
        double totalSalaire = 0;
        for (IElement element : listElement) {
            totalSalaire += element.calculerSalaire();
        }
        return totalSalaire;
    }
    
    public Service(String nom, IElement... nvxElem) {
        this.nom = nom;
        Collections.addAll(this.listElement, nvxElem);
    }

    public String getNom() {
        return nom;
    }

    public List<IElement> getListElement() {
        return listElement;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void addElement(IElement element) {
        listElement.add(element);
    }


}
