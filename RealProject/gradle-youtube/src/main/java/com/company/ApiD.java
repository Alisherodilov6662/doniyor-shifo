package com.company;

import jakarta.validation.constraints.NotNull;

/**
 * Author: Alisher Odilov
 * Date: 25.01.2023
 */

public record ApiD(
        @NotNull Integer postId,
        Integer id,
        String name,
        String email,
        String body
) {

}
/*
* "postId": 1,
    "id": 1,
    "name": "id labore ex et quam laborum",
    "email": "Eliseo@gardner.biz",
    "body": "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"*/
