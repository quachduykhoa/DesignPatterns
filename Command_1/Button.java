package Command_1;

public class Button {
	private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        if(command != null) {
            command.execute();
        } else {
            System.out.println("Không có lệnh nào được chỉ định");
        }
    }

}
