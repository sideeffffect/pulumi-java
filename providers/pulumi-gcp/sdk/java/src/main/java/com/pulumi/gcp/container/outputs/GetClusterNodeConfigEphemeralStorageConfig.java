// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetClusterNodeConfigEphemeralStorageConfig {
    private final Integer localSsdCount;

    @CustomType.Constructor
    private GetClusterNodeConfigEphemeralStorageConfig(@CustomType.Parameter("localSsdCount") Integer localSsdCount) {
        this.localSsdCount = localSsdCount;
    }

    public Integer localSsdCount() {
        return this.localSsdCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodeConfigEphemeralStorageConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer localSsdCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodeConfigEphemeralStorageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localSsdCount = defaults.localSsdCount;
        }

        public Builder localSsdCount(Integer localSsdCount) {
            this.localSsdCount = Objects.requireNonNull(localSsdCount);
            return this;
        }        public GetClusterNodeConfigEphemeralStorageConfig build() {
            return new GetClusterNodeConfigEphemeralStorageConfig(localSsdCount);
        }
    }
}
