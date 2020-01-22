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
public class HillCipher1 {
    
    static void getKeyMatrix(String key, int keyMatrix[][]) 
{ 
    int k = 0; 
    for (int i = 0; i < 3; i++)  
    { 
        for (int j = 0; j < 3; j++)  
        { 
            keyMatrix[i][j] = (key.charAt(k)) % 97; 
            k++; 
        } 
    }
    
    System.out.println("Key matrix:");
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.print(" "+keyMatrix[+i][+j]);
           }
           System.out.println("");
       }
} 
 static void getMesssageMatrix(String Message, int MMatrix[][]) 
{ 
    int k = 0; 
    for (int i = 0; i < 3; i++)  
    { 
        for (int j = 0; j < 3; j++)  
        { 
            MMatrix[i][j] = (Message.charAt(k)) % 97; 
            k++; 
        } 
    }
    
    System.out.println("Message matrix:");
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.print(" "+MMatrix[+i][+j]);
           }
           System.out.println("");
       }
}
    
  
// Following function encrypts the message 
static void encrypt(int cipherMatrix[][], 
            int keyMatrix[][],  
            int messageMatrix[][]) 
{ 
    int x, i, j; 
    for (i = 0; i < 3; i++)  
    { 
        for (j = 0; j < 1; j++) 
        { 
            cipherMatrix[i][j] = 0; 
          
            for (x = 0; x < 3; x++) 
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
    int [][]keyMatrix = new int[3][3]; 
    getKeyMatrix(key, keyMatrix); 
    
    message = message.toLowerCase();
    int len=message.length();
    System.out.println(len);
    if(len%3==0)
    {
        
    }
    else if(len%3==1)
    {
        message=message+"x"+"x";
    }
    else if(len%3==2)
    {
        message=message+"x";
    }
    System.out.println(message);
    int len1=message.length();
    String CipherText="";
    for(int i=0;i<len1;i=i+3)
    {
        String str=message.substring(i,i+3);
        System.out.println(str);
        int [][]messageMatrix = new int[3][1];
        for (int j = 0; j < 3; j++){
            messageMatrix[j][0] = (str.charAt(j)) % 97; 
 
        }
        
        
        int [][]cipherMatrix = new int[3][1]; 
      String newCipher="";
       encrypt(cipherMatrix, keyMatrix, messageMatrix); 
       
       System.out.println("Message matrix:");
       for(int k=0;k<3;k++)
       {
           for(int j=0;j<1;j++)
           {
               System.out.print(" "+messageMatrix[+k][+j]);
           }
           System.out.println("");
       }
       for (int k = 0; k < 3; k++) 
        newCipher += (char)(cipherMatrix[k][0] + 97);
       
       CipherText=CipherText.concat(newCipher);
  
    
     
        
    }
    // Finally print the ciphertext 
     System.out.print(" Ciphertext:" + CipherText);
  
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    // Get the message to be encrypted 
    String message = "retreatnow"; 
  
    // Get the key 
    String key = "backupabc"; 
  
    HillCipher(message, key); 
    } 
    
}
