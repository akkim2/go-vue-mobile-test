package com.akkim2.govuemobiletest;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import wisdom.Wisdom;

@CapacitorPlugin(name = "Wisdom")
public class WisdomPlugin extends Plugin {

    @PluginMethod()
    public void pleaseGiveMeWisdomSensei(PluginCall call) {
        String name = call.getString("name");
        String result = Wisdom.pleaseGiveMeWisdomSensei(name);
        JSObject ret = new JSObject();
        ret.put("result", result);
        call.resolve(ret);
    }
}