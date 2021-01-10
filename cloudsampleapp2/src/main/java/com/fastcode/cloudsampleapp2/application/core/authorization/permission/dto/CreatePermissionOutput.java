package com.fastcode.cloudsampleapp2.application.core.authorization.permission.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreatePermissionOutput {

    private String displayName;
    private Long id;
    private String name;

}

