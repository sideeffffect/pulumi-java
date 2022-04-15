// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.composer.outputs.EnvironmentConfigWebServerNetworkAccessControlAllowedIpRange;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentConfigWebServerNetworkAccessControl {
    private final @Nullable List<EnvironmentConfigWebServerNetworkAccessControlAllowedIpRange> allowedIpRanges;

    @CustomType.Constructor
    private EnvironmentConfigWebServerNetworkAccessControl(@CustomType.Parameter("allowedIpRanges") @Nullable List<EnvironmentConfigWebServerNetworkAccessControlAllowedIpRange> allowedIpRanges) {
        this.allowedIpRanges = allowedIpRanges;
    }

    public List<EnvironmentConfigWebServerNetworkAccessControlAllowedIpRange> allowedIpRanges() {
        return this.allowedIpRanges == null ? List.of() : this.allowedIpRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigWebServerNetworkAccessControl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EnvironmentConfigWebServerNetworkAccessControlAllowedIpRange> allowedIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigWebServerNetworkAccessControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedIpRanges = defaults.allowedIpRanges;
        }

        public Builder allowedIpRanges(@Nullable List<EnvironmentConfigWebServerNetworkAccessControlAllowedIpRange> allowedIpRanges) {
            this.allowedIpRanges = allowedIpRanges;
            return this;
        }
        public Builder allowedIpRanges(EnvironmentConfigWebServerNetworkAccessControlAllowedIpRange... allowedIpRanges) {
            return allowedIpRanges(List.of(allowedIpRanges));
        }        public EnvironmentConfigWebServerNetworkAccessControl build() {
            return new EnvironmentConfigWebServerNetworkAccessControl(allowedIpRanges);
        }
    }
}
