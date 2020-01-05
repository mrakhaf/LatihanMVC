/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.PelangganModel;
import View.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view){
        String nama = view.getTxtName().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTlp().getText();
        
        if(nama.equals("") && email.equals("") && noTlp.equals("")){
            
        }else{
            model.resetForm();
        }
    }
    
    public void submitForm(PelangganView view){
        String nama = view.getTxtName().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTlp().getText();
        
        if(nama.trim().equals("")){
          JOptionPane.showMessageDialog(view, "Nama masih kosong");   
        }else if(email.trim().equals("")) {
          JOptionPane.showMessageDialog(view, "Email masih kosong"); 
        }else if(noTlp.trim().equals("")) {
          JOptionPane.showMessageDialog(view, "Nomor Telepon masih kosong"); 
        }else {
            model.submitForm();
        }
        
    }
}
