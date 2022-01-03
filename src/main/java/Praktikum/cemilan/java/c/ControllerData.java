/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.cemilan.java.c;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
/**
 *
 * @author asus
 */
@Controller
public class ControllerData {
    
    TableController result = new TableController();
    @RequestMapping("/Input")
    
    public String getHasil(HttpServletRequest data, Model model){
        
        String getNama = data.getParameter("NamaSayuran");
        int getHarga = Integer.parseInt(data.getParameter("HargaPerkilo"));
        int getJumlah = Integer.parseInt(data.getParameter("JumlahBarang"));
        int getBayar = Integer.parseInt(data.getParameter("Bayar"));
        
        int diskon = result.getharga(getJumlah, getHarga);
        int compute = result.gethitung(getJumlah, getHarga);
        
        model.addAttribute("Nama", getNama);
        model.addAttribute("Harga",("Rp. "+ getHarga));
        model.addAttribute("Barang", getJumlah);
        model.addAttribute("Total", ("Rp. " +(getHarga*getJumlah)));
        model.addAttribute("Diskon", "Rp. "+ compute);
        model.addAttribute("Bayar", "Rp. "+ getBayar);
        model.addAttribute("Kembalian", "Rp. "+(getBayar-compute));
        model.addAttribute("TotalDiskon", diskon + " %");
        
        return "TableViewer";
    }
}
