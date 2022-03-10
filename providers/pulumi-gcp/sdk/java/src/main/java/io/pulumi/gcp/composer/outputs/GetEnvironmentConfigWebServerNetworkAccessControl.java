// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.composer.outputs.GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetEnvironmentConfigWebServerNetworkAccessControl {
    private final List<GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange> allowedIpRanges;

    @OutputCustomType.Constructor
    private GetEnvironmentConfigWebServerNetworkAccessControl(@OutputCustomType.Parameter("allowedIpRanges") List<GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange> allowedIpRanges) {
        this.allowedIpRanges = allowedIpRanges;
    }

    public List<GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange> getAllowedIpRanges() {
        return this.allowedIpRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigWebServerNetworkAccessControl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange> allowedIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigWebServerNetworkAccessControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedIpRanges = defaults.allowedIpRanges;
        }

        public Builder allowedIpRanges(List<GetEnvironmentConfigWebServerNetworkAccessControlAllowedIpRange> allowedIpRanges) {
            this.allowedIpRanges = Objects.requireNonNull(allowedIpRanges);
            return this;
        }
        public GetEnvironmentConfigWebServerNetworkAccessControl build() {
            return new GetEnvironmentConfigWebServerNetworkAccessControl(allowedIpRanges);
        }
    }
}
