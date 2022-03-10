// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class GetDomainClusterConfigZoneAwarenessConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainClusterConfigZoneAwarenessConfig Empty = new GetDomainClusterConfigZoneAwarenessConfig();

    /**
     * Number of availability zones used.
     * 
     */
    @InputImport(name="availabilityZoneCount", required=true)
      private final Integer availabilityZoneCount;

    public Integer getAvailabilityZoneCount() {
        return this.availabilityZoneCount;
    }

    public GetDomainClusterConfigZoneAwarenessConfig(Integer availabilityZoneCount) {
        this.availabilityZoneCount = Objects.requireNonNull(availabilityZoneCount, "expected parameter 'availabilityZoneCount' to be non-null");
    }

    private GetDomainClusterConfigZoneAwarenessConfig() {
        this.availabilityZoneCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainClusterConfigZoneAwarenessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer availabilityZoneCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainClusterConfigZoneAwarenessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZoneCount = defaults.availabilityZoneCount;
        }

        public Builder availabilityZoneCount(Integer availabilityZoneCount) {
            this.availabilityZoneCount = Objects.requireNonNull(availabilityZoneCount);
            return this;
        }
        public GetDomainClusterConfigZoneAwarenessConfig build() {
            return new GetDomainClusterConfigZoneAwarenessConfig(availabilityZoneCount);
        }
    }
}
