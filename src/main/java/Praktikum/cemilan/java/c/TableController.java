/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.cemilan.java.c;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author asus
 */
@Controller
public class TableController {
    public int gethitung(int jumlah, int harga){
        int hargatotal;
        int total = harga*jumlah;
        
        if(total<16000){
            hargatotal = total - (total * 0);
        }
        else if((total > 16000) && (total < 25000)){
            hargatotal = total - (total * 10/100);
        }
        else{
            hargatotal = total - (total * 15/100);
        }
        return hargatotal;
    }
   
    public int getharga(int jumlah, int harga){
        int total = harga*jumlah;
        int totalDiskon;
        
        if(total < 16000){
            totalDiskon = 0;
        }else if((total > 16000)&&(total < 25000)){
            totalDiskon = 10;
        }else{
            totalDiskon = 15;
        }
        return totalDiskon;
    }
}
