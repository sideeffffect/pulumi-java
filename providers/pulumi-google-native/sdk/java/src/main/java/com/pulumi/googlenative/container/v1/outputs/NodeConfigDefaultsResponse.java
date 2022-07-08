// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.container.v1.outputs.GcfsConfigResponse;
import java.util.Objects;

@CustomType
public final class NodeConfigDefaultsResponse {
    /**
     * @return GCFS (Google Container File System, a.k.a. Riptide) options.
     * 
     */
    private final GcfsConfigResponse gcfsConfig;

    @CustomType.Constructor
    private NodeConfigDefaultsResponse(@CustomType.Parameter("gcfsConfig") GcfsConfigResponse gcfsConfig) {
        this.gcfsConfig = gcfsConfig;
    }

    /**
     * @return GCFS (Google Container File System, a.k.a. Riptide) options.
     * 
     */
    public GcfsConfigResponse gcfsConfig() {
        return this.gcfsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigDefaultsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcfsConfigResponse gcfsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConfigDefaultsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcfsConfig = defaults.gcfsConfig;
        }

        public Builder gcfsConfig(GcfsConfigResponse gcfsConfig) {
            this.gcfsConfig = Objects.requireNonNull(gcfsConfig);
            return this;
        }        public NodeConfigDefaultsResponse build() {
            return new NodeConfigDefaultsResponse(gcfsConfig);
        }
    }
}
