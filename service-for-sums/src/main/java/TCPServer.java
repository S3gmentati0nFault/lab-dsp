import java.io.*; 
import java.net.*;

import static java.lang.Thread.sleep;

/**
 * Experiment server for a sum service
 */
class TCPServer { 
	/**
	 * Main method for the Server.
	 * 
	 * @throws Exception Very undescriptive exception, I suppose this one was used to avoid throwing all of the different kinds of exceptions required by the different operations.
	 */
	public static void main(String argv[]) throws Exception 
	{ 
		int num1, num2;
		Integer sum;
		String s1, s2;

		/* Crea una "listening socket" sulla porta specificata */
		ServerSocket welcomeSocket = new ServerSocket(6793);

		while(true) { 
			/* 
			 * Viene chiamata accept (bloccante). 
			 * All'arrivo di una nuova connessione crea una nuova
			 * "established socket"
			 */
			Socket connectionSocket = welcomeSocket.accept(); 

			/* Inizializza lo stream di input dalla socket */
			BufferedReader inFromClient = 
				new BufferedReader(new
						InputStreamReader(connectionSocket.getInputStream())); 

			/* Inizializza lo stream di output verso la socket */
			DataOutputStream  outToClient = 
				new DataOutputStream(connectionSocket.getOutputStream()); 

			/* Legge una linea (terminata da \n) dal client */
			num1 = Integer.parseInt(inFromClient.readLine());
			System.out.println(num1);
			num2 = Integer.parseInt(inFromClient.readLine());
			System.out.println(num2);

			sum = num1 + num2;

			/* Invia la risposta al client */
			outToClient.writeBytes(sum.toString());

			connectionSocket.close();
		}
	}
}
