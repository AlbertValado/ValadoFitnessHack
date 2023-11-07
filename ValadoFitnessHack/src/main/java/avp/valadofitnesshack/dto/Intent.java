/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avp.valadofitnesshack.dto;

/**
 *
 * @author Albert
 */
public class Intent {
    private int id;
    private int idUsuari;
    private String nomUsuari;
    private int idExercici;
    private String nomExercici;
    private String timestamp_Inici;
    private String timestamp_Fi;
    private String videofile;

    public Intent() {
    }
    
    @Override
    public String toString(){
        return "ID: " + id + ", ID Usuari: " + idUsuari + ", Nom: " + nomUsuari +  ", ID Exercici: " + idExercici +", Nom Exercici: "+ nomExercici;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuari() {
        return idUsuari;
    }

    public void setIdUsuari(int idUsuari) {
        this.idUsuari = idUsuari;
    }

    public String getNomUsuari() {
        return nomUsuari;
    }

    public void setNomUsuari(String nomUsuari) {
        this.nomUsuari = nomUsuari;
    }

    public int getIdExercici() {
        return idExercici;
    }

    public void setIdExercici(int idExercici) {
        this.idExercici = idExercici;
    }

    public String getNomExercici() {
        return nomExercici;
    }

    public void setNomExercici(String nomExercici) {
        this.nomExercici = nomExercici;
    }

    public String getTimestamp_Inici() {
        return timestamp_Inici;
    }

    public void setTimestamp_Inici(String timestamp_Inici) {
        this.timestamp_Inici = timestamp_Inici;
    }

    public String getTimestamp_Fi() {
        return timestamp_Fi;
    }

    public void setTimestamp_Fi(String timestamp_Fi) {
        this.timestamp_Fi = timestamp_Fi;
    }

    public String getVideofile() {
        return videofile;
    }

    public void setVideofile(String videofile) {
        this.videofile = videofile;
    }
    
    
}
