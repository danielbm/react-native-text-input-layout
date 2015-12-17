package com.memox.rntextinputlayout;

import javax.annotation.Nullable;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ReactProp;
import com.facebook.react.common.annotations.VisibleForTesting;

import java.util.Map;

public class RNTextInputLayoutManager extends ViewGroupManager<RNTextInputLayout> {

    @VisibleForTesting
    public static final String REACT_CLASS = "RNTextInputLayout";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public RNTextInputLayout createViewInstance(ThemedReactContext context) {
        return new RNTextInputLayout(context);
    }

}
