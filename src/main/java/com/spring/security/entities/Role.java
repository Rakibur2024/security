package com.spring.security.entities;

import java.util.Set;

public enum Role {
    ADMIN(Set.of(Permissions.SECURITY_READ,Permissions.SECURITY_WRITE,Permissions.SECURITY_DELETE)),
    USER(Set.of(Permissions.SECURITY_READ));

    private final Set<Permissions> permissions;

    Role(Set<Permissions> permissions){
        this.permissions = permissions;
    }

    public Set<Permissions> getPermissions() {
        return permissions;
    }
}
