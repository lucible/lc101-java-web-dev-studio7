package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    private static final String spinRate = "200 - 500";

    private String name;
    private String contents;

    // Basic constructor
    public CD(boolean aIsBlank, boolean aIsRewritable, int aCapacity, String aName, String aContents) {
        super(aIsBlank, aIsRewritable, aCapacity);
        name = aName;
        contents = aContents;
    }

    // Music CD constructor
    public CD(String aName, String aContents) {
        super();
        name = aName;
        contents = aContents;
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + spinRate + " rpm.");
    }

    @Override
    public void getDiscInfo() {
        if (this.isBlank && this.isRewritable) {
            System.out.println("This is a blank, rewritable CD.");
            this.printCapacity();
        } else if (this.isBlank && !this.isRewritable) {
            System.out.println("This is a blank, non-rewritable CD.");
            this.printCapacity();
        } else if (!this.isBlank && this.isRewritable) {
            System.out.println(this.name + " is a rewritable CD.");
            this.printCapacity();
            System.out.println(this.name + " contains: " + this.contents);
        } else if (!this.isBlank && !this.isRewritable) {
            System.out.println("This is a CD named " + this.name + ".");
            System.out.println("It contains: " + this.contents);
        }
    }
}
