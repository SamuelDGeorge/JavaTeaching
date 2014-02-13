package lectures.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimingLinesReaderWithFinally {
	static BufferedReader input = new BufferedReader(
			new InputStreamReader(System.in));
//	static void echoLines(int numberOfInputLines) throws IOException {
//		for (int inputNum = 0; inputNum < numberOfInputLines; inputNum++)
//			System.out.println(input.readLine());
//	}

	static int numberOfInputLines(String[] args) throws AMissingArgumentException {
		long startTime = System.currentTimeMillis();
		try {
			return Integer.parseInt(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(System.currentTimeMillis() - startTime);
			throw new AMissingArgumentException("Missing first argument");
		} catch (NumberFormatException e) {
			System.out.println("Non number argument. Returning 0.");
			return 0;
		}
		finally {
			System.out.println(System.currentTimeMillis() - startTime);
		}
	}
	public static void main(String args[]) throws AMissingArgumentException {
		System.out.println(numberOfInputLines(args));
	}

//	public static void main(String args[]) {
//		long startTime = System.currentTimeMillis();
//		try {
//			echoLines(numberOfInputLines(args));
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out
//					.println("Did not enter an argument. Assuming a single input line.");
//			try {
//				echoLines(1);
//				System.exit(-1);
//			} catch (IOException ioe) {
//				System.out
//						.println("Did not input the one input string, which is the default in case of missing argument, before input was closed. ");
//				System.out.println(System.currentTimeMillis() - startTime);
//			} 
//		} catch (IOException e) {
//			System.out
//					.println("Did not input the correct number of input strings before input was closed. ");
//		}
//		finally {
//			System.out.println(System.currentTimeMillis() - startTime);
//		}
//	}
	
//	public static void main(String args[]) {
//		long startTime = System.currentTimeMillis();
//		try {
//			echoLines(numberOfInputLines(args));
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out
//					.println("Did not enter an argument. Assuming a single input line.");
//			try {
////				echoLines(1);
//				System.out.println(args[5]);
//			} catch (Exception ioe) {
//				System.out
//						.println("Did not input the one input string, which is the default in case of missing argument, before input was closed. ");
//				System.out.println(System.currentTimeMillis() - startTime);
//			} 
//		} catch (IOException e) {
//			System.out
//					.println("Did not input the correct number of input strings before input was closed. ");
//		}
//		finally {
//			System.out.println(System.currentTimeMillis() - startTime);
//		}
//	}



}
