package com.expensetracker.expense_tracker.dto;

public class UserResponseDTO {
     private Long id;
    private String name;
    private String UserName;
    private String email;

    public UserResponseDTO(Long id, String name, String userName, String email) {
        this.id = id;
        this.name = name;
        UserName = userName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
