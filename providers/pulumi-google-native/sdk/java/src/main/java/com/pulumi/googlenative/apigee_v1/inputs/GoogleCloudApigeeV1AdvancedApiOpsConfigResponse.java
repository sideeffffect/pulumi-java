// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration for the Advanced API Ops add-on.
 * 
 */
public final class GoogleCloudApigeeV1AdvancedApiOpsConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1AdvancedApiOpsConfigResponse Empty = new GoogleCloudApigeeV1AdvancedApiOpsConfigResponse();

    /**
     * Flag that specifies whether the Advanced API Ops add-on is enabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    public GoogleCloudApigeeV1AdvancedApiOpsConfigResponse(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private GoogleCloudApigeeV1AdvancedApiOpsConfigResponse() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1AdvancedApiOpsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1AdvancedApiOpsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public GoogleCloudApigeeV1AdvancedApiOpsConfigResponse build() {
            return new GoogleCloudApigeeV1AdvancedApiOpsConfigResponse(enabled);
        }
    }
}
