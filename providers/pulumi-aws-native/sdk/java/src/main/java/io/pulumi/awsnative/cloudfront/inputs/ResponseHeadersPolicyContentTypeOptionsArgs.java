// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class ResponseHeadersPolicyContentTypeOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyContentTypeOptionsArgs Empty = new ResponseHeadersPolicyContentTypeOptionsArgs();

    @InputImport(name="override", required=true)
      private final Input<Boolean> override;

    public Input<Boolean> getOverride() {
        return this.override;
    }

    public ResponseHeadersPolicyContentTypeOptionsArgs(Input<Boolean> override) {
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
    }

    private ResponseHeadersPolicyContentTypeOptionsArgs() {
        this.override = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyContentTypeOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> override;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyContentTypeOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.override = defaults.override;
        }

        public Builder override(Input<Boolean> override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }

        public Builder override(Boolean override) {
            this.override = Input.of(Objects.requireNonNull(override));
            return this;
        }
        public ResponseHeadersPolicyContentTypeOptionsArgs build() {
            return new ResponseHeadersPolicyContentTypeOptionsArgs(override);
        }
    }
}
