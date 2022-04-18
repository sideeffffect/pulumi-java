// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ResponseHeadersPolicyContentTypeOptions extends com.pulumi.resources.InvokeArgs {

    public static final ResponseHeadersPolicyContentTypeOptions Empty = new ResponseHeadersPolicyContentTypeOptions();

    @Import(name="override", required=true)
      private final Boolean override;

    public Boolean override() {
        return this.override;
    }

    public ResponseHeadersPolicyContentTypeOptions(Boolean override) {
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
    }

    private ResponseHeadersPolicyContentTypeOptions() {
        this.override = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyContentTypeOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean override;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyContentTypeOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.override = defaults.override;
        }

        public Builder override(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }        public ResponseHeadersPolicyContentTypeOptions build() {
            return new ResponseHeadersPolicyContentTypeOptions(override);
        }
    }
}
