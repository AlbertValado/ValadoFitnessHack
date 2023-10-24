/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avp.valadofitnesshack.src.main.dto;

/**
 *
 * @author Albert
 */
public class Review {
    private int idIntent;
    private int idReviewer;
    private int valoracio;
    private String comentari;

    public Review() {
    }

    public Review(int idIntent, int idReviewer, int valoracio, String comentari) {
        this.idIntent = idIntent;
        this.idReviewer = idReviewer;
        this.valoracio = valoracio;
        this.comentari = comentari;
    }

    public int getIdIntent() {
        return idIntent;
    }

    public void setIdIntent(int idIntent) {
        this.idIntent = idIntent;
    }

    public int getIdReviewer() {
        return idReviewer;
    }

    public void setIdReviewer(int idReviewer) {
        this.idReviewer = idReviewer;
    }

    public int getValoracio() {
        return valoracio;
    }

    public void setValoracio(int valoracio) {
        this.valoracio = valoracio;
    }

    public String getComentari() {
        return comentari;
    }

    public void setComentari(String comentari) {
        this.comentari = comentari;
    }
    
    
}
