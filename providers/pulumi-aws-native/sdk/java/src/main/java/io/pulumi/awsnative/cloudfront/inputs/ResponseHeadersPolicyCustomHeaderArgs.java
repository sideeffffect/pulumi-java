// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ResponseHeadersPolicyCustomHeaderArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyCustomHeaderArgs Empty = new ResponseHeadersPolicyCustomHeaderArgs();

    @InputImport(name="header", required=true)
      private final Input<String> header;

    public Input<String> getHeader() {
        return this.header;
    }

    @InputImport(name="override", required=true)
      private final Input<Boolean> override;

    public Input<Boolean> getOverride() {
        return this.override;
    }

    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public ResponseHeadersPolicyCustomHeaderArgs(
        Input<String> header,
        Input<Boolean> override,
        Input<String> value) {
        this.header = Objects.requireNonNull(header, "expected parameter 'header' to be non-null");
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ResponseHeadersPolicyCustomHeaderArgs() {
        this.header = Input.empty();
        this.override = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyCustomHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> header;
        private Input<Boolean> override;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyCustomHeaderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.header = defaults.header;
    	      this.override = defaults.override;
    	      this.value = defaults.value;
        }

        public Builder header(Input<String> header) {
            this.header = Objects.requireNonNull(header);
            return this;
        }

        public Builder header(String header) {
            this.header = Input.of(Objects.requireNonNull(header));
            return this;
        }

        public Builder override(Input<Boolean> override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }

        public Builder override(Boolean override) {
            this.override = Input.of(Objects.requireNonNull(override));
            return this;
        }

        public Builder value(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public ResponseHeadersPolicyCustomHeaderArgs build() {
            return new ResponseHeadersPolicyCustomHeaderArgs(header, override, value);
        }
    }
}
