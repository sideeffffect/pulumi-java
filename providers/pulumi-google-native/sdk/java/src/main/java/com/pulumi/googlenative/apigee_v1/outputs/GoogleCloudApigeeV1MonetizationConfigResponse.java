// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GoogleCloudApigeeV1MonetizationConfigResponse {
    /**
     * Flag that specifies whether the Monetization add-on is enabled.
     * 
     */
    private final Boolean enabled;

    @CustomType.Constructor
    private GoogleCloudApigeeV1MonetizationConfigResponse(@CustomType.Parameter("enabled") Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Flag that specifies whether the Monetization add-on is enabled.
     * 
    */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1MonetizationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1MonetizationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public GoogleCloudApigeeV1MonetizationConfigResponse build() {
            return new GoogleCloudApigeeV1MonetizationConfigResponse(enabled);
        }
    }
}
