package com.akkim2.govuemobiletest;

import 

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "Echo")
public class WisdomPlugin extends Plugin {

    @PluginMethod()
    public void pleaseGiveMeWisdomSensei(PluginCall call) {
        String name = call.getString("name");



        JSObject ret = new JSObject();
        ret.put("value", value);
        call.resolve(ret);
    }
}