package zoologico;

import java.util.ArrayList;
import java.util.List;

public class Array {

	//Demostra��o do uso do array list
	
	public static void main(String[] args) {
		List<String>lista = new ArrayList<String>();
	
        lista.add("Matheus");
        lista.add("Danilo");
        lista.add("Beatriz");
        lista.add("Felipe");
        
        //For  aperfei�oado  lendo o Array List
        for(String temp: lista) {
        	System.out.println(temp);
        }
        
        //Procurando a Beatriz
       System.out.println(" O Array tem " + lista.size() + " elementos");
       System.out.println(lista.contains("Beatriz"));
       System.out.println("O valor est� no �ndice " + lista.indexOf("Beatriz")); 
       System.out.println(" O conte�do do indice 3 � " +  lista.get(3));
	}
}
