

public class ChildClass1 extends ParentClass {

    private String childAttribute;


    public ChildClass1(String attribute1, int attribute2, String childAttribute) {
        super(attribute1, attribute2);
        this.childAttribute = childAttribute;
    }

    @Override
    public void showDetails() {
        super.showDetails();

        System.out.println("ChildClass1 Attribute is : " +childAttribute);
    }

    public String getChildAttribute() {
        return childAttribute;
    }
}
