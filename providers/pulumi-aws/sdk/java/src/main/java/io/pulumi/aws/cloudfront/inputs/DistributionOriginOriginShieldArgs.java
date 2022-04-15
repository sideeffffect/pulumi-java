// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class DistributionOriginOriginShieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginOriginShieldArgs Empty = new DistributionOriginOriginShieldArgs();

    /**
     * A flag that specifies whether Origin Shield is enabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The AWS Region for Origin Shield. To specify a region, use the region code, not the region name. For example, specify the US East (Ohio) region as us-east-2.
     * 
     */
    @Import(name="originShieldRegion", required=true)
      private final Output<String> originShieldRegion;

    public Output<String> originShieldRegion() {
        return this.originShieldRegion;
    }

    public DistributionOriginOriginShieldArgs(
        Output<Boolean> enabled,
        Output<String> originShieldRegion) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.originShieldRegion = Objects.requireNonNull(originShieldRegion, "expected parameter 'originShieldRegion' to be non-null");
    }

    private DistributionOriginOriginShieldArgs() {
        this.enabled = Codegen.empty();
        this.originShieldRegion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginOriginShieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enabled;
        private Output<String> originShieldRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginOriginShieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.originShieldRegion = defaults.originShieldRegion;
        }

        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public Builder originShieldRegion(Output<String> originShieldRegion) {
            this.originShieldRegion = Objects.requireNonNull(originShieldRegion);
            return this;
        }
        public Builder originShieldRegion(String originShieldRegion) {
            this.originShieldRegion = Output.of(Objects.requireNonNull(originShieldRegion));
            return this;
        }        public DistributionOriginOriginShieldArgs build() {
            return new DistributionOriginOriginShieldArgs(enabled, originShieldRegion);
        }
    }
}
