// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class GetClusterNodeConfigEphemeralStorageConfig {
    private final Integer localSsdCount;

    @OutputCustomType.Constructor
    private GetClusterNodeConfigEphemeralStorageConfig(@OutputCustomType.Parameter("localSsdCount") Integer localSsdCount) {
        this.localSsdCount = localSsdCount;
    }

    public Integer getLocalSsdCount() {
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
        }
        public GetClusterNodeConfigEphemeralStorageConfig build() {
            return new GetClusterNodeConfigEphemeralStorageConfig(localSsdCount);
        }
    }
}
