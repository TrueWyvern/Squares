/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aipil3692
 */
import java.util.*;

public class Squares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Double> square = new ArrayList();
        int size = 10;
        for (int i=0; i<size ;i++) {
        square.add(Math.pow(i, 2));
        }
        System.out.println(square);
    }
    
}
