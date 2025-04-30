package com.akkim2.govuemobiletest;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        registerPlugin(WisdomPlugin.class);
        super.onCreate(savedInstanceState);
    }
}
