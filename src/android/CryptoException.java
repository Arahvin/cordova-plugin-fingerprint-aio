package de.niklasmerz.cordova.biometric;

import android.util.Log;

class CryptoException extends Exception {
    private PluginError error;

    CryptoException(String message, Exception cause) {
        this(PluginError.BIOMETRIC_UNKNOWN_ERROR, message, cause);
    }

    CryptoException(PluginError error) {
        this(error, error.getMessage(), null);
    }

    CryptoException(PluginError error, Exception cause) {
        this(error, error.getMessage(), cause);
    }

    private CryptoException(PluginError error, String message, Exception cause) {
        super(message, cause);
        Log.d("CORDOVA_BIOMETRIC CryptoException", message);
        Log.d("CORDOVA_BIOMETRIC CryptoException", cause.toString());
        this.error = error;
    }

    public PluginError getError() {
        return error;
    }
}
