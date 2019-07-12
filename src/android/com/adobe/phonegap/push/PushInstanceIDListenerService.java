package com.adobe.phonegap.push;

import android.content.Intent;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;


import org.json.JSONException;

import java.io.IOException;


public class PushInstanceIDListenerService extends FirebaseMessagingService implements PushConstants {
    public static final String LOG_TAG = "Push_InsIdService";

    @Override
    public void onNewToken(String s) {
        String refreshedToken = s;
        Log.d(LOG_TAG, "Refreshed token: " + refreshedToken);
        // TODO: Implement this method to send any registration to your app's servers.
        //sendRegistrationToServer(refreshedToken);
    }
}
