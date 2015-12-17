'use strict';

import React, {
  Component,
  StyleSheet,
  Text,
} from 'react-native';

var { requireNativeComponent, PropTypes } = React;

class TextInputLayout extends Component {
  constructor(props) {
    super(props);

    this.state = {

    };
  }

  render() {
    return (
      <RNTextInputLayout {...this.props} />
    );
  }
}

var styles = {

}

var RNTextInputLayout = requireNativeComponent('RNTextInputLayout', null);

module.exports = TextInputLayout;