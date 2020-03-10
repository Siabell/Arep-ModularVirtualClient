package edu.escuelaing.arep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class Client
{
	/**
	 * El cliente hace una peticion a una url e imprime en pantalla
	 * lo que recibe
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception { 
	      URL url = new URL(args[0]); 
	      try (BufferedReader reader = new BufferedReader(
	          new InputStreamReader(url.openStream()))) { 
	            String inputLine = null; 
	            while ((inputLine = reader.readLine()) != null) { 
	                  System.out.println(inputLine); 
	             } 
	       } catch (IOException x) { 
	               System.err.println(x); 
	       } 
	  } 
}
