// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DefaultRolloutSpecificationResponseCanary {
    private final @Nullable List<String> regions;
    private final @Nullable List<String> skipRegions;

    @CustomType.Constructor
    private DefaultRolloutSpecificationResponseCanary(
        @CustomType.Parameter("regions") @Nullable List<String> regions,
        @CustomType.Parameter("skipRegions") @Nullable List<String> skipRegions) {
        this.regions = regions;
        this.skipRegions = skipRegions;
    }

    public List<String> regions() {
        return this.regions == null ? List.of() : this.regions;
    }
    public List<String> skipRegions() {
        return this.skipRegions == null ? List.of() : this.skipRegions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultRolloutSpecificationResponseCanary defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> regions;
        private @Nullable List<String> skipRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultRolloutSpecificationResponseCanary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regions = defaults.regions;
    	      this.skipRegions = defaults.skipRegions;
        }

        public Builder regions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }
        public Builder skipRegions(@Nullable List<String> skipRegions) {
            this.skipRegions = skipRegions;
            return this;
        }
        public Builder skipRegions(String... skipRegions) {
            return skipRegions(List.of(skipRegions));
        }        public DefaultRolloutSpecificationResponseCanary build() {
            return new DefaultRolloutSpecificationResponseCanary(regions, skipRegions);
        }
    }
}
