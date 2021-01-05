package com.chai.utils;

import java.util.UUID;




public class IdUtils {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }


//    public static void main(String[] args) {
//        System.out.println(IdUtils.getId());
//    }

}
