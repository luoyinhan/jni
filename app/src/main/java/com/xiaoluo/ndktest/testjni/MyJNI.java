package com.xiaoluo.ndktest.testjni;

public class MyJNI {
    static {
        System.loadLibrary("Jnitest");
    }

    public native static String sayhello();
}
