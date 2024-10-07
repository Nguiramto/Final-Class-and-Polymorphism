public final class BaseFinalClass {

    private String finalClassAttribute;

    public BaseFinalClass(String finalClassAttribute) {
        this.finalClassAttribute = finalClassAttribute;
    }

    public void displayFinalClassAttribute() {

        System.out.println("BaseFinalClass Attribute : " + finalClassAttribute);
    }
}