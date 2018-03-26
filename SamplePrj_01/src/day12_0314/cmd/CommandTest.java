package day12_0314.cmd;

public class CommandTest {

	public static void main(String[] args) {
		
		Command cmd = null;
		
		switch (args[0]) {
		case "delete":
			cmd = new DeleteCommand();
			break;
		case "update":
			cmd = new UpdateCommand();
			break;
		case "insert":
			cmd = new InsertCommand();
			break;
		case "select":
			cmd = new SelectCommand();
			break;
		default:
			break;
		}
		
		cmd.exec();
		cmd.print();
	}

}
