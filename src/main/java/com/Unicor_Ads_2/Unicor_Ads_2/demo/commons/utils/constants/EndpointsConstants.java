package com.Unicor_Ads_2.Unicor_Ads_2.demo.commons.utils.constants;

public class EndpointsConstants {

    private  EndpointsConstants() {
        throw new IllegalStateException("Utility class");
    }

    public static  final String ENDPOINT_BASE_API="/api/v1/colombi_stock";
    public static  final String ENDPOINT_CATEGORIES=ENDPOINT_BASE_API+"/categories";
    public static  final String ENDPOINT_PRODUCTS=ENDPOINT_BASE_API+"/products";
    public static  final String ENDPOINT_SUPPLIERS=ENDPOINT_BASE_API+"/suppliers";
    public static  final String ENDPOINT_STOCK_MOVEMENT=ENDPOINT_BASE_API+"/stock_movement";
    public static  final String ENDPOINT_SALES_DETAILS=ENDPOINT_BASE_API+"/sales";


    //
}
