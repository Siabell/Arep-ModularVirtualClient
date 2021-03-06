package edu.escuelaing.arep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.concurrent.atomic.AtomicLong;

public class ThreadClient implements Runnable{
	
	private static URL url;
	private static long start;
	private static AtomicLong num;
	
	/**
	 * El threadClient inicia con una url, el tiempo inicial y una varible atomica
	 * @param url1
	 * @param timeStart
	 * @param numT
	 */
	public ThreadClient(URL url1, long timeStart, AtomicLong numT) {
		this.url = url1;
		this.start = timeStart;
		this.num = numT;
	}
	
	/**
	 * El ThreadClient hace la peticion a la url y cuando termina, retorna el
	 * tiempo que se tarda en terminar.
	 */
	@Override
	public void run() {
		try (BufferedReader reader = new BufferedReader(
	          new InputStreamReader(url.openStream()))) { 
	            String inputLine = null; 
	            while ((inputLine = reader.readLine()) != null) { 
	                  System.out.println(inputLine); 
	             } 
	       } catch (IOException x) { 
	               System.err.println(x); 
	       } 
		long elapsedTimeMillis = System.currentTimeMillis()-start;
		num.set(elapsedTimeMillis);
		System.out.println(" thread time "+ elapsedTimeMillis/1000F);
		
		try {
			this.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
	}
	
	

}
