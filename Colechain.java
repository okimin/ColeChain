/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleC;
import java.io.*;
import java.util.*;
/**
 *
 * @author agathearmand
 */
public class Colechain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       double baseSal=50000;// base salary for a computer engineer
        ArrayList <Integer> skillset= new ArrayList<>();// number of skill sets
        ArrayList <Double> salary= new ArrayList<>();//the salary of each employee
        for(int x=0; x<5;x++){
            for(int y=0; y<3;y++){
        skillset.add(y);//putting the skillsets in an arraylist
    }
        }
        for(int x=0; x<skillset.size();x++){
            salary.add(baseSal+baseSal*(baseSal*(.05*skillset.get(x))));//anaylze the skillsets and outputs gives a salary
        System.out.println("This worker is paid "+ salary.get(x)+"due to having "+ skillset.get(x)+ " skill sets." );
        }
        
        
    }
    
}
