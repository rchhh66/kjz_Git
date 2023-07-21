package com.itheima.test;

import org.junit.Test;


public class UploadFileTest {
    @Test
    public void test(){
        String fileName="ererwe.jpg";
        String suffix=fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }

}
