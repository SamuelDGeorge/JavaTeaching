package lectures.exceptions;

import java.rmi.RemoteException;

public interface Adder {
	public int sum(int arg1, int arg2) throws RemoteException;

}
