package com.corenetworks.Presentacion;

import com.corenetworks.modelo.Ave;
import com.corenetworks.modelo.Avion;
import com.corenetworks.modelo.iObjetoVolador;


public class ProbarInterfaces {
    public static void main(String[] args) {
        //Instanciar un objeto con nombre de objto ax
        Avion ax2=new Avion("Plata");
        //Polimorfismo
        iObjetoVolador ax3= new Avion("rojo");
        iObjetoVolador ave1=new Ave();
        iObjetoVolador[]voladores={ax2,ax3,ave1};



        for (iObjetoVolador elemento:voladores){
            System.out.println(elemento.despegar());
            System.out.println(elemento.volar());
            System.out.println(elemento.aterrizar());

            System.out.println(elemento.toString());
            if (elemento instanceof Ave) {
                System.out.println(((Ave) elemento).ponerHUevo());
                System.out.println(((Ave) elemento).hacerNido());

            }
        }



    }
}
