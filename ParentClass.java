
public class ParentClass {

    protected String attribute1;
    protected int attribute2;

    public ParentClass(String attribute1, int attribute2) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
    }

    public void showDetails() {
        System.out.println(" Parent Attribute1 is :" +attribute1);
        System.out.println(" Parent Attribute2 is :" +attribute2);
    }

    public final void displayMessage() {
        System.out.println("This is a final message from the Parent Class.");
    }
}

