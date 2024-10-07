public class Main {

    public static void main(String[]args) {

        BaseFinalClass baseFinalClass = new BaseFinalClass("Final Class Attribute Value");
        baseFinalClass.displayFinalClassAttribute();
        System.out.println();

        ChildClass1 childClass1 = new ChildClass1("Parent 1",200,"Child 1");
        ChildClass2 childClass2 = new ChildClass2("Parent 2", 300,300.50);


        TypeChecker typeChecker = new TypeChecker();

        ParentClass[] objects = {childClass1, childClass2};

        for (ParentClass obj: objects) {
            System.out.println("...Object Details...");
            obj.showDetails();
            obj.displayMessage();


            typeChecker.objectIdrntifierType(obj);
            System.out.println();
        }
    }
}
