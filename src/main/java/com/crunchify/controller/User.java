package com.crunchify.controller;

import lombok.*;

/**
 * Created by liuhua on 16-6-22.
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private long id;

    private String name;

    private int age;
}
