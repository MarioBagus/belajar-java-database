/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author MBagus
 */
public class Murid {
    private int id;
    private String name;
    private int umur;
    private String quirk;
    private String gambar;
    
    public Murid(int id, String name, int umur, String quirk, String gambar){
        this.id = id;
        this.name = name;
        this.umur = umur;
        this.quirk = quirk;
        this.gambar = gambar;
    }
    public Murid(String name, int umur, String quirk, String gambar){
        this.name = name;
        this.umur = umur;
        this.quirk = quirk;
        this.gambar = gambar;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the umur
     */
    public int getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(int umur) {
        this.umur = umur;
    }

    /**
     * @return the quirk
     */
    public String getQuirk() {
        return quirk;
    }

    /**
     * @param quirk the quirk to set
     */
    public void setQuirk(String quirk) {
        this.quirk = quirk;
    }

    /**
     * @return the gambar
     */
    public String getGambar() {
        return gambar;
    }

    /**
     * @param gambar the gambar to set
     */
    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
    
}
