/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.edu.frostburg.cosc310.lab00;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author ruded
 */
public class MasonDaveLab00 implements Lab00{
     
    @Override
    public long problem0(int size) {
        System.out.println("This is just an example, but please follow this template.");
        String s = "";
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            s = s + i ;
            System.out.println(i + "");
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");    
        Date resultdate = new Date(start);
        System.out.println(sdf.format(start));
        
        long end = System.currentTimeMillis();
        return end - start;
        
    }

     
    @Override
    public long problem1(int size) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            sb.append(i);
           System.out.println(i);
        }
        
        long end = System.currentTimeMillis();
        
        
        System.out.println(start);
        System.out.println(end);
        
        return end - start;
    }
    
    @Override
    public long problem2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
