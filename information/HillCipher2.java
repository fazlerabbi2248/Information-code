/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package information;

/**
 *
 * @author Masum Billah
 */
public class HillCipher2 {
    
    static void getKeyMatrix(String key, int keyMatrix[][]) 
{ 
    int k = 0; 
    for (int i = 0; i < 2; i++)  
    { 
        for (int j = 0; j < 2; j++)  
        { 
            keyMatrix[i][j] = (key.charAt(k)) % 97; 
            k++; 
        } 
    }
    
    System.out.println("Key matrix:");
       for(int i=0;i<2;i++)
       {
           for(int j=0;j<2;j++)
           {
               System.out.print(" "+keyMatrix[+i][+j]);
           }
           System.out.println("");
       }
} 
 static void getMesssageMatrix(String Message, int MMatrix[][]) 
{ 
    int k = 0; 
    for (int i = 0; i < 2; i++)  
    { 
        for (int j = 0; j < 2; j++)  
        { 
            MMatrix[i][j] = (Message.charAt(k)) % 97; 
            k++; 
        } 
    }
    
    System.out.println("Message matrix:");
       for(int i=0;i<2;i++)
       {
           for(int j=0;j<2;j++)
           {
               System.out.print(" "+MMatrix[+i][+j]);
           }
           System.out.println("");
       }
}
static void Dekey(int k[][],int adjkey[][])
{
    System.out.println("Decryption Key:");
        //int adjkey[][] = new int[2][2];
        adjkey[0][0] = (k[1][1] * 7) % 26;
        adjkey[0][1] = ((-k[0][1] + 26) * 7) % 26;
        adjkey[1][0] = ((-k[1][0] + 26) * 7) % 26;
        adjkey[1][1] = (k[0][0] * 7) % 26;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(adjkey[i][j] + " ");
            }
            System.out.println();
        }
}
  
static void encrypt(int cipherMatrix[][], int keyMatrix[][],int messageMatrix[][]) 
{ 
    int x, i, j; 
    for (i = 0; i < 2; i++)  
    { 
        for (j = 0; j < 1; j++) 
        { 
            cipherMatrix[i][j] = 0; 
          
            for (x = 0; x < 2; x++) 
            { 
                cipherMatrix[i][j] +=  
                    keyMatrix[i][x] * messageMatrix[x][j]; 
            } 
          
            cipherMatrix[i][j] = cipherMatrix[i][j] % 26; 
        } 
    } 
} 
  
// Function to implement Hill Cipher 
static void HillCipher(String message, String key) 
{ 
    // Get key matrix from the key string 
    int [][]keyMatrix = new int[2][2]; 
    getKeyMatrix(key, keyMatrix); 
    
    message = message.toLowerCase();
    int len=message.length();
    System.out.println(len);
    if(len%2!=0)
    {
        message=message+"x";
    }
    System.out.println(message);
    int len1=message.length();
    String CipherText="";
    for(int i=0;i<len1;i=i+2)
    {
        String str=message.substring(i,i+2);
        System.out.println(str);
        int [][]messageMatrix = new int[2][1];
        for (int j = 0; j < 2; j++){
            messageMatrix[j][0] = (str.charAt(j)) % 97; 
 
        }
        
        
        int [][]cipherMatrix = new int[2][1]; 
      String newCipher="";
       encrypt(cipherMatrix, keyMatrix, messageMatrix); 
       
       System.out.println("Message matrix:");
       for(int k=0;k<2;k++)
       {
           for(int j=0;j<1;j++)
           {
               System.out.print(" "+messageMatrix[+k][+j]);
           }
           System.out.println("");
       }
       for (int k = 0; k < 2; k++) 
        newCipher += (char)(cipherMatrix[k][0] + 97);
       
       CipherText=CipherText.concat(newCipher);
  
    
     
        
    }
    
     System.out.print(" Ciphertext:" + CipherText);
     
     int [][]adkey = new int[2][2];
     Dekey(keyMatrix,adkey);
     String decrypt="";
     for(int i=0;i<len1;i=i+2)
    {
        String str=CipherText.substring(i,i+2);
        System.out.println(str);
        int [][]cipherMatrix = new int[2][1];
        for (int j = 0; j < 2; j++){
            cipherMatrix[j][0] = (str.charAt(j)) % 97; 
 
        }
        
        
        int [][]decryptMatrix = new int[2][1]; 
        
        
        
       String newm="";
       encrypt(decryptMatrix, adkey, cipherMatrix); 
       
       System.out.println("Cipher matrix:");
       for(int k=0;k<2;k++)
       {
           for(int j=0;j<1;j++)
           {
               System.out.print(" "+cipherMatrix[+k][+j]);
           }
           System.out.println("");
       }
       for (int k = 0; k < 2; k++) 
        newm += (char)(decryptMatrix[k][0] + 97);
       
       decrypt=decrypt.concat(newm);
  
    
     
        
    }
    
     System.out.print(" Decryptext:" +decrypt);
  
} 
public static void main(String[] args)  
{  
    String message = "shortexample"; 
 
    String key = "hill"; 
  
    HillCipher(message, key); 
    } 
    
}
