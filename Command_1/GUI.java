package Command_1;

public class GUI {
	public static void main(String[] args) {

        // Receiver
        Document document = new Document();

        // Command
        Command saveCommand = new SaveCommand(document);
        Command printCommand = new PrintCommand(document);

        // Invoker
        Button saveButton = new Button();
        Button printButton = new Button();

        // Gán command cho button
        saveButton.setCommand(saveCommand);
        printButton.setCommand(printCommand);

//        saveButton.click();
//        printButton.click();
       saveButton.click();
    }
}
