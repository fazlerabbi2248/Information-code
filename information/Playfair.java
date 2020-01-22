
package information;

import static java.lang.Math.abs;
import java.util.Scanner;


public class Playfair {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char [][]table = new char[5][5];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                char c=sc.next().charAt(0);
                table[i][j]= c;
            }
        }
        System.out.println("table:\n");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(table[+i][+j]+" ");
                
            }
            System.out.println("");
        }
        System.out.println("Enter the plain text:");
        String plaintext=sc.next();
        
        int len = plaintext.length();
        
        if(len%2!=0)
        {
            plaintext=plaintext+"x";
        }
        
        int l =plaintext.length();
        
        System.out.println(plaintext);
       int k=0;
       char []ciphertext = new char[l];
       int r1=0,r2=0,c1=0,c2=0;
  for(int size=0;size<l;size+=2){

       for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){

          if(table[i][j]==plaintext.charAt(size)){
          r1=i;
          c1=j;
          }
          if(table[i][j]==plaintext.charAt(size+1)){
            r2=i;
            c2=j;
          }

        }
    }
     if(r1==r2){
        ciphertext[k]=table[r1][(c1+1)%5];
        k++;
        ciphertext[k]=table[r2][(c2+1)%5];
        k++;

    }
    if(c1==c2)
    {
        ciphertext[k]=table[(r1+1)%5][c1];
        k++;
        ciphertext[k]=table[(r2+1)%5][c2];
        k++;
    }
     int cal=abs(c1-c2);
    if(cal==1 && (r1!=r2 && c1!=c2)){
        if(c2>c1){
             ciphertext[k]=table[r1][c1+1];
             k++;
             ciphertext[k]=table[r2][c2-1];
             k++;
        }else{
             ciphertext[k]=table[r1][c1-1];
             k++;
             ciphertext[k]=table[r2][c2+1];
             k++;

        }
    }else if(cal==2  && (r1!=r2 && c1!=c2)){
        if(c2>c1){
             ciphertext[k]=table[r1][c1+2];
             k++;
             ciphertext[k]=table[r2][c2-2];
             k++;

        }else{
             ciphertext[k]=table[r1][c1-2];
             k++;
             ciphertext[k]=table[r2][c2+2];
             k++;

        }

    }else if(cal==3  && (r1!=r2 && c1!=c2)){
        if(c2>c1){
             ciphertext[k]=table[r1][c1+3];
             k++;
             ciphertext[k]=table[r2][c2-3];
             k++;

        }else{
             ciphertext[k]=table[r1][c1-3];
             k++;
             ciphertext[k]=table[r2][c2+3];
             k++;

        }

    }else if(cal==4  && (r1!=r2 && c1!=c2)){
        if(c2>c1){
             ciphertext[k]=table[r1][c1+4];
             k++;
             ciphertext[k]=table[r2][c2-4];
             k++;

        }else{
             ciphertext[k]=table[r1][c1-4];
             k++;
             ciphertext[k]=table[r2][c2+4];
             k++;

        }

    }
  } 
        
       
        
        
        System.out.println(ciphertext);
        
        
    }
    
}
