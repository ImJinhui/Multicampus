package day12_0314.cmd;

public class CommandTest2 {

	public static void main(String[] args) {
		Command delete = new Command() {

			@Override
			public void exec() {
				System.out.println("delete 작업 수행");

			}

		};

		Command update = new Command() {

			@Override
			public void exec() {
				System.out.println("update 작업 수행");
			}
		};

		Command select = new Command() {

			@Override
			public void exec() {
				System.out.println("select 작업 수행");
			}
		};

		Command insert = new Command() {

			@Override
			public void exec() {
				System.out.println("insert 작업 수행");
			}
		};
		delete.exec();
		update.exec();
		select.exec();
		insert.exec();

	}

}

class Delete implements Command {

	@Override
	public void exec() {

	}

}
