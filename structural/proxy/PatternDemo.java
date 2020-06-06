package structural.proxy;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Command proxyObj = new CommandExecutorProxy("racks", "wrong_pass");
		proxyObj.runCommand("ls -ltr");
		proxyObj.runCommand("rm -rf *.xml");
	}

}
