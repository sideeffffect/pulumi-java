// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.DistributionTrustedKeyGroupItemGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionTrustedKeyGroupGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionTrustedKeyGroupGetArgs Empty = new DistributionTrustedKeyGroupGetArgs();

    /**
     * A flag that specifies whether Origin Shield is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * List of nested attributes for each trusted signer
     * 
     */
    @Import(name="items")
    private @Nullable Output<List<DistributionTrustedKeyGroupItemGetArgs>> items;

    public Optional<Output<List<DistributionTrustedKeyGroupItemGetArgs>>> items() {
        return Optional.ofNullable(this.items);
    }

    private DistributionTrustedKeyGroupGetArgs() {}

    private DistributionTrustedKeyGroupGetArgs(DistributionTrustedKeyGroupGetArgs $) {
        this.enabled = $.enabled;
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionTrustedKeyGroupGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionTrustedKeyGroupGetArgs $;

        public Builder() {
            $ = new DistributionTrustedKeyGroupGetArgs();
        }

        public Builder(DistributionTrustedKeyGroupGetArgs defaults) {
            $ = new DistributionTrustedKeyGroupGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder items(@Nullable Output<List<DistributionTrustedKeyGroupItemGetArgs>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<DistributionTrustedKeyGroupItemGetArgs> items) {
            return items(Output.of(items));
        }

        public Builder items(DistributionTrustedKeyGroupItemGetArgs... items) {
            return items(List.of(items));
        }

        public DistributionTrustedKeyGroupGetArgs build() {
            return $;
        }
    }

}
