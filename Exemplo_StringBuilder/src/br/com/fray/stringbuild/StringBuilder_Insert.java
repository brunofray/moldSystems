package br.com.fray.stringbuild;

public class StringBuilder_Insert {
    public static void main(String[] args) {    
        Object objetoRef = "Maria";
        String String = "Joaquina";
        char[] conjArray = {'S','i','l','v','a'};
 
        StringBuilder buffer = new StringBuilder(); 
        buffer.insert(0, objetoRef);
        buffer.insert(0, " ");
        buffer.insert(0, String);
        buffer.insert(0, " ");
        buffer.insert(0, conjArray);
        buffer.insert(0, " ");
         
        System.out.printf("Valores:\n%s\n\n", buffer.toString());   
    }
}