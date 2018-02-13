package com.huangfeng.uiwidgettest;

import android.app.Application;

/**
 * Created by huangfeng on 2018/2/13.
 */

public class App extends Application {


    private String textData = "default";

    public void setTextData(String textData) {
        this.textData = textData;
    }

    public String getTextData() {
        return textData;
    }
}
