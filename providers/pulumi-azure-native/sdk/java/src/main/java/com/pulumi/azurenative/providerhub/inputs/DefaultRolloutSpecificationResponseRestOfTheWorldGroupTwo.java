// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo extends com.pulumi.resources.InvokeArgs {

    public static final DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo Empty = new DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo();

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

    private DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo() {}

    private DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo(DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo $) {
        this.regions = $.regions;
        this.waitDuration = $.waitDuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo $;

        public Builder() {
            $ = new DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo();
        }

        public Builder(DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo defaults) {
            $ = new DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo(Objects.requireNonNull(defaults));
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

        public DefaultRolloutSpecificationResponseRestOfTheWorldGroupTwo build() {
            return $;
        }
    }

}
