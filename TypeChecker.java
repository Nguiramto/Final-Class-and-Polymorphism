

public class TypeChecker {

    public void objectIdrntifierType(ParentClass object) {
        if (object instanceof ChildClass1) {
            System.out.println("The object is an instance of ChildClass1.");
        } else if (object instanceof ChildClass2) {
            System.out.println("The object is an instance of ChildClass2.");
        } else {
            System.out.println("The object is an instance of ParentClass.");
        }
    }
}
