// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.amplifyuibuilder.inputs;

import com.pulumi.awsnative.amplifyuibuilder.inputs.ComponentOverridesArgs;
import com.pulumi.awsnative.amplifyuibuilder.inputs.ComponentVariantValuesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ComponentVariantArgs extends ResourceArgs {

    public static final ComponentVariantArgs Empty = new ComponentVariantArgs();

    @Import(name="overrides")
    private @Nullable Output<ComponentOverridesArgs> overrides;

    public Optional<Output<ComponentOverridesArgs>> overrides() {
        return Optional.ofNullable(this.overrides);
    }

    @Import(name="variantValues")
    private @Nullable Output<ComponentVariantValuesArgs> variantValues;

    public Optional<Output<ComponentVariantValuesArgs>> variantValues() {
        return Optional.ofNullable(this.variantValues);
    }

    private ComponentVariantArgs() {}

    private ComponentVariantArgs(ComponentVariantArgs $) {
        this.overrides = $.overrides;
        this.variantValues = $.variantValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComponentVariantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComponentVariantArgs $;

        public Builder() {
            $ = new ComponentVariantArgs();
        }

        public Builder(ComponentVariantArgs defaults) {
            $ = new ComponentVariantArgs(Objects.requireNonNull(defaults));
        }

        public Builder overrides(@Nullable Output<ComponentOverridesArgs> overrides) {
            $.overrides = overrides;
            return this;
        }

        public Builder overrides(ComponentOverridesArgs overrides) {
            return overrides(Output.of(overrides));
        }

        public Builder variantValues(@Nullable Output<ComponentVariantValuesArgs> variantValues) {
            $.variantValues = variantValues;
            return this;
        }

        public Builder variantValues(ComponentVariantValuesArgs variantValues) {
            return variantValues(Output.of(variantValues));
        }

        public ComponentVariantArgs build() {
            return $;
        }
    }

}
