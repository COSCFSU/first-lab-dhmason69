/*
 * .
 */
package src.edu.frostburg.cosc310.lab00;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author DHMason
 */
public class MasonDaveLab00 implements Lab00{
    
    // Problem0 performs an iteration and creates the printed date using the cureent time in 
    // milliseconds(long).
    @Override
    public long problem0(int size) {
        //System.out.println("This is just an example, but please follow this template.");
        String s = "";
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            s = s + i ;
            //System.out.println(i + "");
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");    
        Date resultdate = new Date(start);
        System.out.println(sdf.format(start));
        
        long end = System.currentTimeMillis();
        System.out.println("Problem0: ");
       return end - start;
        
    }

     
    // Problem1 uses StringBuilder method to build a form of a "String" list.
    // milliseconds(long).
    @Override
    public long problem1(int size) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            sb.append(i);
           //System.out.println(i);
        }
        
        long end = System.currentTimeMillis();
        
        
        //System.out.println(start);
        //System.out.println(end);
        System.out.println("Problem1: ");
        return end - start;
        
    }
    //This method is the exercise for COSC 310, that explores the efficiencies of the 
    //ArrayList and the LinkList.
    @Override
    public long problem2(int total) {
        
        ArrayList<String> list = new ArrayList<>();
        LinkedList<String> link = new LinkedList<>();
        
        String difference;
        long begin = System.currentTimeMillis();
        for (int i=0; i<total; i++) {
            String element = Integer.toString(i);
            list.add(element);
           //System.out.println(i);
        }
        long done = System.currentTimeMillis();
        long array = done-begin;
        difference = Long.toString(array);
           System.out.println("The ArrayList took  " + difference + " milliseconds");
        
        
       
           
        String totalTime;
        long first = System.currentTimeMillis();
          for (int j=0; j<total; j++) {
            String str = Integer.toString(j);
            link.add(str);
           //System.out.println(j);
          } 
        long last = System.currentTimeMillis();
        long lList = last-first;
        difference = Long.toString(lList); 
            System.out.println("The LinkedList took  " + difference + " milliseconds");
             
        
             
        System.out.println(" * The difference(in milliseconds) between the two lists is:");
        return Math.abs(array - lList);
    }
    
}
