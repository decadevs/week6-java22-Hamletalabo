package services.impl;

import Models.User;
import enums.Role;

import java.util.Comparator;

public class RoleComparator implements Comparator<User> {


    @Override
    public int compare(User role1, User role2) {
        return Comparator.comparingInt((User role)-> role.getRole().ordinal())
                .compare(role1, role2);
    }

}
