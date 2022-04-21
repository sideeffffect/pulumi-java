// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne extends com.pulumi.resources.InvokeArgs {

    public static final DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne Empty = new DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne();

    @Import(name="regions")
    private @Nullable List<String> regions;

    public Optional<List<String>> regions() {
        return Optional.ofNullable(this.regions);
    }

    @Import(name="waitDuration")
    private @Nullable String waitDuration;

    public Optional<String> waitDuration() {
        return Optional.ofNullable(this.waitDuration);
    }

    private DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne() {}

    private DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne(DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne $) {
        this.regions = $.regions;
        this.waitDuration = $.waitDuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne $;

        public Builder() {
            $ = new DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne();
        }

        public Builder(DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne defaults) {
            $ = new DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne(Objects.requireNonNull(defaults));
        }

        public Builder regions(@Nullable List<String> regions) {
            $.regions = regions;
            return this;
        }

        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }

        public Builder waitDuration(@Nullable String waitDuration) {
            $.waitDuration = waitDuration;
            return this;
        }

        public DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne build() {
            return $;
        }
    }

}
