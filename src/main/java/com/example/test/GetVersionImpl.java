package com.example.test;

public class GetVersionImpl implements GetVersion {
    @Override
    public String getVersion() {
        return PomVersion.VERSION;
    }
}
