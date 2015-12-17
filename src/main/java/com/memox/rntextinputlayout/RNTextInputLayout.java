package com.memox.rntextinputlayout;

import android.content.Context;
import android.os.Build;
import android.support.design.widget.TextInputLayout;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;

/*package*/ class RNTextInputLayout extends TextInputLayout {

    public RNTextInputLayout(ReactContext reactContext) {
        super(reactContext);

    }
}
