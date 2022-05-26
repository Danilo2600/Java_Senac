package zoologico;

import java.util.ArrayList;
import java.util.List;

public class Array {

	//Demostração do uso do array list
	
	public static void main(String[] args) {
		List<String>lista = new ArrayList<String>();
	
        lista.add("Matheus");
        lista.add("Danilo");
        lista.add("Beatriz");
        lista.add("Felipe");
        
        //For  aperfeiçoado  lendo o Array List
        for(String temp: lista) {
        	System.out.println(temp);
        }
        
        //Procurando a Beatriz
       System.out.println(" O Array tem " + lista.size() + " elementos");
       System.out.println(lista.contains("Beatriz"));
       System.out.println("O valor está no índice " + lista.indexOf("Beatriz")); 
       System.out.println(" O conteúdo do indice 3 é " +  lista.get(3));
	}
}
