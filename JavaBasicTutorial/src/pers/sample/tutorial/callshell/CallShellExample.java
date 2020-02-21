package pers.sample.tutorial.callshell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CallShellExample {

	private static final String SH_COMMAND = "sh";
	
	public static void main(String[] args) {
		CallShellExample.callShellCommand("echo HelloWorld");
		//CallShellExample.callShellFile(SH_COMMAND, "/path/XXX.sh");
	}

	public static void callShellCommand(String command) {
		try {
			String line;
			Process p = Runtime.getRuntime().exec(command);

			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void callShellFile(String sh, String resartFilePath) {
		String command = sh + " " + resartFilePath;
		try {
			Process p = Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
