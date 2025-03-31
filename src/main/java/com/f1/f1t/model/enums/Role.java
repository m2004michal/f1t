package com.f1.f1t.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.f1.f1t.model.enums.Permission.ADMIN_DELETE;
import static com.f1.f1t.model.enums.Permission.ADMIN_READ;
import static com.f1.f1t.model.enums.Permission.ADMIN_UPDATE;
import static com.f1.f1t.model.enums.Permission.ADMIN_CREATE;

@Getter
@RequiredArgsConstructor
public enum Role {
    USER(Collections.emptySet()),
    ADMIN(
            Set.of(
                    ADMIN_DELETE,
                    ADMIN_READ,
                    ADMIN_UPDATE,
                    ADMIN_CREATE
            )
    );

    private final Set<Permission> permissions;

    public List<SimpleGrantedAuthority> getAuthorities() {
        var authorities = getPermissions()
                .stream()
                .map(permission -> new SimpleGrantedAuthority(permission.name()))
                .collect(Collectors.toList());
        authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return authorities;
    }
}