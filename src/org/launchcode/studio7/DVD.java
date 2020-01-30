package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    private static final String spinRate = "570 - 1600";

    private String name;
    private String contents;

    // Basic constructor
    public DVD(boolean aIsBlank, boolean aRewritable, int aCapacity, String aName, String aContents) {
        super(aIsBlank, aRewritable, aCapacity);
        name = aName;
        contents = aContents;
    }

    // Movie DVD constructor
    public DVD(String aName, String aContents) {
        super();
        name = aName;
        contents = aContents;
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + spinRate + " rpm.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
