package structural.proxy;

public class CommandExecutorProxy extends CommandExecutorImpl{
	
	private boolean isAdmin;
	
	CommandExecutorProxy(String username, String pass){
		if(username.equals("racks") && pass.equals("123") )
			isAdmin=true;
	}
	
	@Override
	public void runCommand(String cmd) {
		if(isAdmin) {
			super.runCommand(cmd);
		}else {
			if(cmd.startsWith("rm")) {
				System.out.println("User is not allowed to execute remove command as he is not admin");
			}else {
				super.runCommand(cmd);
			}
		}
	}
	
}
