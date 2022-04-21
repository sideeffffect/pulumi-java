// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionOriginShieldArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionOriginShieldArgs Empty = new DistributionOriginShieldArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="originShieldRegion")
    private @Nullable Output<String> originShieldRegion;

    public Optional<Output<String>> originShieldRegion() {
        return Optional.ofNullable(this.originShieldRegion);
    }

    private DistributionOriginShieldArgs() {}

    private DistributionOriginShieldArgs(DistributionOriginShieldArgs $) {
        this.enabled = $.enabled;
        this.originShieldRegion = $.originShieldRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionOriginShieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOriginShieldArgs $;

        public Builder() {
            $ = new DistributionOriginShieldArgs();
        }

        public Builder(DistributionOriginShieldArgs defaults) {
            $ = new DistributionOriginShieldArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder originShieldRegion(@Nullable Output<String> originShieldRegion) {
            $.originShieldRegion = originShieldRegion;
            return this;
        }

        public Builder originShieldRegion(String originShieldRegion) {
            return originShieldRegion(Output.of(originShieldRegion));
        }

        public DistributionOriginShieldArgs build() {
            return $;
        }
    }

}
