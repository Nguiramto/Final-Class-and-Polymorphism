public class ChildClass2 extends ParentClass {

    private  double childAttribute;


    public ChildClass2(String attribute1, int attribute2, double childAttribute) {
        super(attribute1, attribute2);
        this.childAttribute = childAttribute;

    }

    @Override
    public void showDetails() {
        super.showDetails();

        System.out.println("The ChildClass2 Attribute is : " +childAttribute);
    }

    public double getChildAttribute() {
        return childAttribute;
    }
}
