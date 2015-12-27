# react-native-text-input-layout
Simple React Native Android module to use Android's Text Input Layout inside your app.

This module uses the native [TextInputLayout](http://developer.android.com/reference/android/support/design/widget/TextInputLayout.html)  component of the Design Support Library to create a floating label, as described on Material Design, like [this](http://www.google.com.br/design/spec/components/text-fields.html#text-fields-labels)

More info: http://developer.android.com/reference/android/support/design/widget/TextInputLayout.html and http://www.google.com.br/design/spec/components/text-fields.html#text-fields-labels

[![npm version](http://img.shields.io/npm/v/react-native-text-input-layout.svg?style=flat-square)](https://npmjs.org/package/react-native-text-input-layout "View this project on npm")
[![npm downloads](http://img.shields.io/npm/dm/react-native-text-input-layout.svg?style=flat-square)](https://npmjs.org/package/react-native-text-input-layout "View this project on npm")
[![npm licence](http://img.shields.io/npm/l/react-native-text-input-layout.svg?style=flat-square)](https://npmjs.org/package/react-native-text-input-layout "View this project on npm")

### Installation

```bash
npm install react-native-text-input-layout --save
```

### Add it to your android project

* In `android/settings.gradle`

```gradle
...
include ':react-native-text-input-layout'
project(':react-native-text-input-layout').projectDir = new File(settingsDir, '../node_modules/react-native-text-input-layout')
```

* In `android/app/build.gradle`

```gradle
...
dependencies {
    ...
    compile project(':RNTextInputLayout')
}
```

* Register Module (in MainActivity.java)

```java
import com.memox.rntextinputlayout.RNTextInputLayoutPackage;  // <--- import

public class MainActivity extends Activity implements DefaultHardwareBackBtnHandler {
  ......

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mReactRootView = new ReactRootView(this);

    mReactInstanceManager = ReactInstanceManager.builder()
      .setApplication(getApplication())
      .setBundleAssetName("index.android.bundle")
      .setJSMainModuleName("index.android")
      .addPackage(new MainReactPackage())
      .addPackage(new RNTextInputLayoutPackage()) // <------ add this line to yout MainActivity class
      .setUseDeveloperSupport(BuildConfig.DEBUG)
      .setInitialLifecycleState(LifecycleState.RESUMED)
      .build();

    mReactRootView.startReactApplication(mReactInstanceManager, "AndroidRNSample", null);

    setContentView(mReactRootView);
  }
  ......
}
```

## Example
```javascript
'use strict';

import React, {
  Component,
  StyleSheet,
  View,
  TextInput
} from 'react-native';

import TextInputLayout from 'react-native-text-input-layout';

class Example extends Component {
  constructor(props) {
    super(props);

    this.state = {
    }
  }

  render() {
    return (
      <View style={styles.container}>
        <TextInputLayout>
          <TextInput
            style={styles.textInput}
            placeholder='Name'
            />
        </TextInputLayout>
        <TextInputLayout>
          <TextInput
            style={styles.textInput}
            placeholder='Password'
            secureTextEntry={true}
            />
        </TextInputLayout>
      </View>
    );
  }
}

var styles = {
  container: {
    flex: 1,
  },
  textInput: {
    backgroundColor: 'transparent',
    color: 'blue',
    paddingLeft: 0,
    fontSize: 20,
  },
}

module.exports = Example;
```

## License
MIT
