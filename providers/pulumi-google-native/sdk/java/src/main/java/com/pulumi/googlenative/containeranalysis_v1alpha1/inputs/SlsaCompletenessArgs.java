// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Indicates that the builder claims certain fields in this message to be complete.
 * 
 */
public final class SlsaCompletenessArgs extends com.pulumi.resources.ResourceArgs {

    public static final SlsaCompletenessArgs Empty = new SlsaCompletenessArgs();

    /**
     * If true, the builder claims that recipe.arguments is complete, meaning that all external inputs are properly captured in the recipe.
     * 
     */
    @Import(name="arguments")
    private @Nullable Output<Boolean> arguments;

    public Optional<Output<Boolean>> arguments() {
        return Optional.ofNullable(this.arguments);
    }

    /**
     * If true, the builder claims that recipe.environment is claimed to be complete.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<Boolean> environment;

    public Optional<Output<Boolean>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * If true, the builder claims that materials are complete, usually through some controls to prevent network access. Sometimes called &#34;hermetic&#34;.
     * 
     */
    @Import(name="materials")
    private @Nullable Output<Boolean> materials;

    public Optional<Output<Boolean>> materials() {
        return Optional.ofNullable(this.materials);
    }

    private SlsaCompletenessArgs() {}

    private SlsaCompletenessArgs(SlsaCompletenessArgs $) {
        this.arguments = $.arguments;
        this.environment = $.environment;
        this.materials = $.materials;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlsaCompletenessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlsaCompletenessArgs $;

        public Builder() {
            $ = new SlsaCompletenessArgs();
        }

        public Builder(SlsaCompletenessArgs defaults) {
            $ = new SlsaCompletenessArgs(Objects.requireNonNull(defaults));
        }

        public Builder arguments(@Nullable Output<Boolean> arguments) {
            $.arguments = arguments;
            return this;
        }

        public Builder arguments(Boolean arguments) {
            return arguments(Output.of(arguments));
        }

        public Builder environment(@Nullable Output<Boolean> environment) {
            $.environment = environment;
            return this;
        }

        public Builder environment(Boolean environment) {
            return environment(Output.of(environment));
        }

        public Builder materials(@Nullable Output<Boolean> materials) {
            $.materials = materials;
            return this;
        }

        public Builder materials(Boolean materials) {
            return materials(Output.of(materials));
        }

        public SlsaCompletenessArgs build() {
            return $;
        }
    }

}
