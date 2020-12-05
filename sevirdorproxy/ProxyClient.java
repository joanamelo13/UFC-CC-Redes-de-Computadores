package sevirdorproxy;

import java.net.Socket;

public final class ProxyClient implements Runnable {
	private static Socket client;
	public ProxyClient(Socket accept) {
		ProxyClient.setClient(client);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	public static Socket getClient() {
		return client;
	}

	public static void setClient(Socket client) {
		ProxyClient.client = client;
	}

}
