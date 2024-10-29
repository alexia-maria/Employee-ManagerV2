package com.example.TaskManagement.persistence.model;

public enum UserRole {

    ADMIN("admin"),
    MANAGER("manager"),
    EMPLOYEE("employee");
    private final String role;

    private UserRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }

}

