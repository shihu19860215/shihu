package com.shihu.demo.mongodb.model;

import java.util.List;

public class MongoDBUser {

    private String id;

    private String username;

    private String password;

    private List<Address> addressList;
    private List<List<Corporation>> CorporationListList;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public List<List<Corporation>> getCorporationListList() {
        return CorporationListList;
    }

    public void setCorporationListList(List<List<Corporation>> corporationListList) {
        CorporationListList = corporationListList;
    }
}