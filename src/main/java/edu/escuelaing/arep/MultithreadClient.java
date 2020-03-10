package edu.escuelaing.arep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class MultithreadClient {
	
	/**
	 * Cliente multihilo, que recibe dos argumentos, una url y un numero n, el cual crea n hilos que 
	 * que son manejados por un pool de hilos
	 * @param args 
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception { 
	      URL url = new URL(args[0]); 
	      int numThreads = Integer.parseInt(args[1]);
	      ExecutorService executor = Executors.newFixedThreadPool(10);
	      int currentThreads = 0;
	      long start = System.currentTimeMillis();
	      AtomicLong numTime = new AtomicLong();
	      while (currentThreads<numThreads) {
	    	  
	    	  currentThreads++;
	    	  ThreadClient thread = new ThreadClient(url,start,numTime);
	    	  System.out.println(currentThreads);
	    	  executor.execute(thread);
	      }
	      
	      executor.shutdown();
	      
	  } 
	
	
}
