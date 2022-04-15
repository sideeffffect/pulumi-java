// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.DistributionTrustedKeyGroupItem;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistributionTrustedKeyGroup {
    /**
     * A flag that specifies whether Origin Shield is enabled.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * List of nested attributes for each trusted signer
     * 
     */
    private final @Nullable List<DistributionTrustedKeyGroupItem> items;

    @CustomType.Constructor
    private DistributionTrustedKeyGroup(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("items") @Nullable List<DistributionTrustedKeyGroupItem> items) {
        this.enabled = enabled;
        this.items = items;
    }

    /**
     * A flag that specifies whether Origin Shield is enabled.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * List of nested attributes for each trusted signer
     * 
    */
    public List<DistributionTrustedKeyGroupItem> items() {
        return this.items == null ? List.of() : this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionTrustedKeyGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable List<DistributionTrustedKeyGroupItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionTrustedKeyGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.items = defaults.items;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder items(@Nullable List<DistributionTrustedKeyGroupItem> items) {
            this.items = items;
            return this;
        }
        public Builder items(DistributionTrustedKeyGroupItem... items) {
            return items(List.of(items));
        }        public DistributionTrustedKeyGroup build() {
            return new DistributionTrustedKeyGroup(enabled, items);
        }
    }
}
