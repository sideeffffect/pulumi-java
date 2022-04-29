// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.evidently.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureEntityOverrideArgs extends ResourceArgs {

    public static final FeatureEntityOverrideArgs Empty = new FeatureEntityOverrideArgs();

    @Import(name="entityId")
    private @Nullable Output<String> entityId;

    public Optional<Output<String>> entityId() {
        return Optional.ofNullable(this.entityId);
    }

    @Import(name="variation")
    private @Nullable Output<String> variation;

    public Optional<Output<String>> variation() {
        return Optional.ofNullable(this.variation);
    }

    private FeatureEntityOverrideArgs() {}

    private FeatureEntityOverrideArgs(FeatureEntityOverrideArgs $) {
        this.entityId = $.entityId;
        this.variation = $.variation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureEntityOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureEntityOverrideArgs $;

        public Builder() {
            $ = new FeatureEntityOverrideArgs();
        }

        public Builder(FeatureEntityOverrideArgs defaults) {
            $ = new FeatureEntityOverrideArgs(Objects.requireNonNull(defaults));
        }

        public Builder entityId(@Nullable Output<String> entityId) {
            $.entityId = entityId;
            return this;
        }

        public Builder entityId(String entityId) {
            return entityId(Output.of(entityId));
        }

        public Builder variation(@Nullable Output<String> variation) {
            $.variation = variation;
            return this;
        }

        public Builder variation(String variation) {
            return variation(Output.of(variation));
        }

        public FeatureEntityOverrideArgs build() {
            return $;
        }
    }

}
