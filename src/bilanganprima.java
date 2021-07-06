/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class bilanganprima {

    static int nomor;
    static int prima = 1;
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Masukkan bilangan yang akan di proses: ");
        nomor = input.nextInt();
        
        for(int loop = 2;loop < nomor; loop++){
            if(nomor % loop == 0){
                prima = 0;
            }
        }
        if(prima == 1){
            System.out.println("Bilangan termasuk bilangan prima");
        }
        else{
            System.out.println("Bilangan bukan bilangan prima");
        }
        
    }
    
}
