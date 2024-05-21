package com.pluralsight;

public class gold extends FixedAsset {
    // Create the variables, as private.
    private double weight;

    // Create the constructor.
    public gold(double weight) {
        // Set the value.
        super("Gold", 0);
        this.weight = weight;
    }

    // Create the override getValue method.
    @Override
    public double getValue() {
        // Calculate the total value.
        return super.getValue() * weight;
    }
}