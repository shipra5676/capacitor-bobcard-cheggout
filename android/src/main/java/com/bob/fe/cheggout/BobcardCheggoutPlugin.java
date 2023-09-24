package com.bob.fe.cheggout;

import android.content.Context;
import android.util.Log;

//import com.cheggout.compare.CheggoutApplication;
import com.cheggout.compare.CheggoutApplication;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "BobcardCheggout")
public class BobcardCheggoutPlugin extends Plugin {

    private BobcardCheggout implementation = new BobcardCheggout();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        Log.i("plugin.call", "echo");
        call.resolve(ret);
    }

    @PluginMethod
    public void launchSDK(PluginCall call) {
        Log.i("plugin.call", "launchSDK");
        String virtualId = call.getString("virtualId");
        String sessionId = call.getString("sessionId");
        String payload = call.getString("payload");
        // String payload = "{'Component':'CHEGGOUT','IsEmployee':'','Language':'','DeeplinkInfo':''}";

       CheggoutApplication.Companion.launchCheggout(this.getContext(), virtualId, sessionId, payload);
//        session valid only once
        // CheggoutApplication.Companion.launchCheggout(this.getContext(), "123", "7a8c2d5b-765e-42f2-08be-d77b298844f7", payload);

        // JSObject ret = new JSObject();
        // ret.put("virtualId", implementation.launchSDK(this.getActivity().getApplicationContext(),virtualId));
        // call.resolve(ret);
        call.resolve();
    }
}
