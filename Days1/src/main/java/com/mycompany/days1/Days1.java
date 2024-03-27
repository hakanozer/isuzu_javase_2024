
package com.mycompany.days1;


public class Days1 {
    

    public static void main(String[] args) {
        
        
        // String
        String name = "Ali";
        String surname = "Bilmem";
        String stAge = "30";
        String city = new String("İstanbul");
        System.out.println(city.hashCode());
        
        String namex = "Erkan";
        String namey = "Erkanx";
        System.out.println(namex.hashCode());
        System.out.println(namey.hashCode());
        
        
        // tam sayı
        
        // byte
        byte b1 = 127;
        
        
        // short
        short sh1 = 32500;
        
        // int
        int num1 = 2147000000;
        
        // long
        long lg1 = 999999999999999999l;
        
        // boolean
        boolean status = false;
        
        // ondalıklı değerler
        double d1 = 23534534534.6345345345345345;
        double d2 = 10;
        System.out.println("double: " + d2);
        
        float f1 = 99999.6238472f;
        
        // char
        String data  = "Adana";
        char c1 = 'A';

        // Type casting
        // String to int
        String stNum = "30";
        int cNum = Integer.parseInt(stNum);

        String stBoolean = "false";
        //boolean cBoolean = Boolean.parseBoolean(stBoolean);

        // int to String
        int num2 = 40;
        String stNum2 = String.valueOf(num2);
        String stData = ""+num2;

        // ilkel türlerin kendi arasında dönümüşü
        char c2 = '9';
        String sc2 = String.valueOf(c2);
        int nc2 = Integer.parseInt(sc2);
        int sum = num2 + nc2;
        System.out.println("Char Sum: " + sum);

        
        System.out.println("float: " + f1);
        int fint = (int) f1;
        System.out.println("int: " + fint);
       
    }
    
    public void call() {
        short sh1 = 32500;
    }
    
    
}
