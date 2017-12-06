/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olap;
import java.util.Random;
/**
 *
 * @author Heli.Desai
 */
public class RandomNum {
    

    static public void randomNum(int randomNumbers[]){
     Random num = new Random();
        for (int i=0; i < randomNumbers.length; i++) {
        int n = num.nextInt(10);
        randomNumbers[i] = n+1;
        }
}
    public static void main(String[] args) {
        int n=1000000;
        int randomNumbers[]= new int[n];
        randomNum(randomNumbers);
        for (int i=0; i < randomNumbers.length; i++) {
        System.out.print(randomNumbers[i]+ ",");
        }
        
    }
    
}
