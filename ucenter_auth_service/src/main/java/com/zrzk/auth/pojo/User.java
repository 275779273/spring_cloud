package com.zrzk.auth.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;

    private String password;

    //权限信息
    private List<XcMenu> permissions;


}
