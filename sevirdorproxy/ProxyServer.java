package sevirdorproxy;

import java.net.*;
import java.util.*;

import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;

import java.io.*;

public class ProxyServer extends Thread implements Runnable{
	private static ArrayList<BufferedWriter>clientes;
	public static boolean listening = true;
	
	public static void main(String[] args) throws Exception {

		int port = 10000;
		try (ServerSocket proxyServ = new ServerSocket(port)){
			System.out.println("Servidor conectado na porta " + port);
		} catch (Exception e) {
			
		}
				
	}			
	
	public void run(BufferedWriter proxyServ){
		while(listening){
		ProxyClient requisicao = new ProxyClient(proxyServ.accept());
		Thread thread = new Thread(requisicao);
		thread.start();
	}
	proxyServ.close();
  }

}
