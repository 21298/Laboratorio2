/*
Universidad del Valle de Guatemala
Programación Orientada a objetos
Autor: Angel Gabriel Perez Figueroa
Carné: 21298
Maestro: Tomás Gálvez
Programa: Visual Studio Code
*/ 

//------------------------------------------------------------------------------------------------
public class Programa{
        private String memory;
        private int tamano;
        private int ciclo; 
        private int fase; 
        
        Programa(String[] datos){//Solo es para instanciar, pero sin ejecutar
            memory = datos[0].toUpperCase();
            tamano = Integer.valueOf(datos[1]);
            ciclo = Integer.valueOf(datos[2]);
            

            
        }
        Programa(int period, String[] datos){//Solo es para instanciar, pero sin ejecutar
            memory = datos[0].toUpperCase();
            tamano = Integer.valueOf(datos[1]);
            ciclo = Integer.valueOf(datos[2]);
            fase = fasec(period); 

            
        }
    
    //------------------------ //informacion de la RAM en cuestion-----------------------------------------------
    public String[] getdatos(){
        String[] datos = new String[4];     
        datos[0] = memory ; 
        datos[1] = String.valueOf(tamano); 
        datos[2] = String.valueOf(ciclo); 
        datos[3] = String.valueOf(tamanoRAM()); 

        return datos;
    }    

    //---------------Dar tiempo de cuando saldra el programa del ciclo-------------------------------------
    private int fasec(int reciente){ // 
        int result = ciclo + reciente;
        return  result; 


    }

    //------------------------------------------------------------------------------------------------
    public int getExit(){
        return fase; 
    }

    //---------------------------Calculo del tamaño de la RAM---------------------------------------------
    private int tamanoRAM(){
        int calculator = tamano/ 64; 
        if (tamano % 64 > 0 ){
            calculator++;
        }
        return calculator;
    }
}