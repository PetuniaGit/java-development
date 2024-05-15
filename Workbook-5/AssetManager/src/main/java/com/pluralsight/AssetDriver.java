package com.pluralsight;

import java.util.ArrayList;

public class AssetDriver {
    public static void main(String[] args) {
        ArrayList<Asset> properties = new ArrayList<>();


        properties.add(new House(" main House", "2012-01-03", 400000, "123 candy cane lane", 1, 2000, 5000));
        properties.add(new House("Vaccation House", "2020-02-05", 450000, "4578 bernard avenue", 1, 2500, 1000));
        properties.add(new Vehicle("Car", "2021-03-04", 65000, "Tesla", 2014, 80000));
        properties.add(new Vehicle("other Car", "2022-03-04", 30000, "BMW ", 2017, 60000));

    for (Asset asset : properties) {
        System.out.println("Description: " + asset.getDescription());
        System.out.println("Date Acquired: " + asset.getDateAcquired());
        System.out.println("Original Cost: $" + asset.getOriginalCost());
        System.out.println("Value: $" + asset.getValue());
        if (asset instanceof House) {
            House h = (House) asset;
            System.out.println("Address: " + h.getAddress());
        } else if (asset instanceof Vehicle) {
            Vehicle v = (Vehicle) asset;
            System.out.println("Year: " + v.getYear());
            System.out.println("Make/Model: " + v.getMakeModel());
        }

        System.out.println();
    }
}

}
