import java.io.*; 
import java.net.*;

class TCPClient { 
	public static void main(String argv[]) throws Exception {
		String num2, num1;

		/* Inizializza l'input stream (da tastiera) */
		BufferedReader inFromUser = 
			new BufferedReader(new InputStreamReader(System.in)); 

		/* Inizializza una socket client, connessa al server */
		Socket clientSocket = new Socket("localhost", 6793);

		/* Inizializza lo stream di output verso la socket */
		DataOutputStream outToServer = 
			new DataOutputStream(clientSocket.getOutputStream()); 

		/* Inizializza lo stream di input dalla socket */
		BufferedReader inFromServer = 
			new BufferedReader(new
					InputStreamReader(clientSocket.getInputStream())); 

		/* Legge una linea da tastiera */
		System.out.print("Inserire un valore: ");
		num1 = inFromUser.readLine();
		System.out.print("Inserire un valore: ");
		num2 = inFromUser.readLine();

		/* Invia la linea al server */
		outToServer.writeBytes(num1 + "\n");
		outToServer.writeBytes(num2 + "\n");

		/* Legge la risposta inviata dal server (linea terminata da \n) */

		System.out.println("FROM SERVER: " + inFromServer.readLine());

		clientSocket.close(); 
	}
}
