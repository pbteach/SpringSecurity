package com.pbteach.security.distributed.uaa.model;

import lombok.Data;

/**
 * @author Administrator
 * @version 1.0
 **/
@Data
public class PermissionDto {

    private String id;
    private String code;
    private String description;
    private String url;
}
