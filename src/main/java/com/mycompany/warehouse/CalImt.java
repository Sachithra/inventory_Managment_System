/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.warehouse;

/**
 *
 * @author User
 */
public class CalImt implements cal{
    
    int months;
    int pricearea;
    int price;
    int tot;
    int AreaQ;
    int area;
    int day;
    int am2;

    @Override
    public int cal(int months, int pricearea, int price, int tot) {
        
         tot=months*price+pricearea;
        
        return tot;
    }

    @Override
    public int cal2(int AreaQ, int pricearea, int tot) {
        
        
         tot=pricearea;
        
         return tot;
    }

    @Override
    public int cal3(int day, int area, int am2, int tot) {
        
         tot=day*am2+area;
        
        return tot;
    }
    
}
