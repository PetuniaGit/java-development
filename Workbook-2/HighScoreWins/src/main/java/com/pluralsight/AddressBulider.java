package com.pluralsight;

public class AddressBulider {
    public static void main(String[] args) {
        StringBuilder BillingA= new StringBuilder();
        BillingA.append("123 Main Street,\n");
        BillingA.append(" Middleton,");
        BillingA.append(" Tx,");
        BillingA.append(" 75111,");

        String MyBillingA= BillingA.toString();

        StringBuilder ShippingA= new StringBuilder();
        ShippingA.append(" 456 Big Sky Blvd,\n");
        ShippingA.append(" Outer Rim,");
        ShippingA.append(" Tx,");
        ShippingA.append(" 75333,");

        String MyShippingA=ShippingA.toString();

        System.out.println("Billing Address :" + MyBillingA);
        System.out.println("Shipping Address :" + MyShippingA);
    }
}
