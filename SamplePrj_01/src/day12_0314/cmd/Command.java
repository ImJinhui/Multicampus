package day12_0314.cmd;

public interface Command {
	
	public abstract void exec();
	default void print(){
		System.out.println("Command print");
	}
}
