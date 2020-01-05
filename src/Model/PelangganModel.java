/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class PelangganModel {
    private String nama, email, noTlp;
    
    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTlp() {
        return noTlp;
    }

    public void setNoTlp(String noTlp) {
        this.noTlp = noTlp;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if(pelangganListener != null){
            pelangganListener.onChange(this);
            
        }
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setNoTlp("");
    }
    
    public void submitForm(){
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        resetForm();
    }
    
}
