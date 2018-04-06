package it.unipi.felicetollot.eicom;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContenxt;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class T1LLI extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("echo")) {
            String message = args.getString(0);
            this.echo(message, CallbackContext);
            return true;
        }

        return false;
    }

    private void echo(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
