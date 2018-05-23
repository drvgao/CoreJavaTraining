package com.corejava.classes;

interface ConnectionService
{
	int i =10;
	public void connect();
	public void disConnect();
}

class ConnectionServiceImpl implements ConnectionService
{
	public void connect()
	{
		System.out.println("Connected");
	}
	public void disConnect()
	{
		System.out.println("DisConnected");
	}

}
class InterfaceEx 
{
	public static void main(String[] args) 
	{
		ConnectionService csi = new ConnectionServiceImpl();
			csi.connect();
			csi.disConnect();		
	}
}
