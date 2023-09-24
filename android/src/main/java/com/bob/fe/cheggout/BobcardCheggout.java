package com.bob.fe.cheggout;

import android.content.Context;
import android.util.Log;

import com.cheggout.compare.CheggoutApplication;

public class BobcardCheggout {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }

    public String launchSDK(Context context, String virtualId){
        Log.i("launchSDK", virtualId);
        String href = "https://www.ibm.com/in-en";
        String payload = "{'Component': 'CHEGGOUT', 'isEmployee': '0', 'Language':'', 'DeeplinkInfo':'"+href+"'}";
        CheggoutApplication.Companion.launchCheggout(context, virtualId, "456", payload);
        return virtualId;
    }
}
