package org.smartregister.nativeform;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/*
* Author: Rex Thulani
* email: thulanirex@gmail.com
* phone: +26076242990
*/

public class ChildInfo {
    private String province;
    private String ward;
    private String district;
    private String village;
    private String compound;
    private String healthFacility;
    private int householdID;

    public ChildInfo(String province, String district, String village, String compound, String healthFacility, String ward, int householdID){
        this.province=province;
        this.district=district;
        this.compound=compound;
        this.village=village;
        this.ward=ward;
        this.healthFacility=healthFacility;
        this.householdID=householdID;
    }

    public String getProvince() {
        return province;
    }

    public int getHouseholdID() {
        return householdID;
    }

    public String getDistrict() {
        return district;
    }

    public String getVillage() {
        return village;
    }

    public String getWard() {
        return ward;
    }

    public String getHealthFacility() {
        return healthFacility;
    }

    public String getCompound() {
        return compound;
    }

    @NotNull
    public static ArrayList<ChildInfo> getChildInfo(){
        ArrayList<ChildInfo> childInfos = new ArrayList<ChildInfo>();
        childInfos.add(new ChildInfo("Lusaka",
                "Chongwe",
                "Blue Code Village",
                "Blue Code Compound",
                "BlueCode Hospital Lusaka",
                "Test Ward",
                109000));
        return childInfos;
    }
}
