// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1.inputs.MaterialArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.SlsaBuilderArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.SlsaMetadataArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.SlsaRecipeArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SlsaProvenanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SlsaProvenanceArgs Empty = new SlsaProvenanceArgs();

    /**
     * required
     * 
     */
    @Import(name="builder")
    private @Nullable Output<SlsaBuilderArgs> builder;

    /**
     * @return required
     * 
     */
    public Optional<Output<SlsaBuilderArgs>> builder_() {
        return Optional.ofNullable(this.builder);
    }

    /**
     * The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
     * 
     */
    @Import(name="materials")
    private @Nullable Output<List<MaterialArgs>> materials;

    /**
     * @return The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
     * 
     */
    public Optional<Output<List<MaterialArgs>>> materials() {
        return Optional.ofNullable(this.materials);
    }

    @Import(name="metadata")
    private @Nullable Output<SlsaMetadataArgs> metadata;

    public Optional<Output<SlsaMetadataArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit identical output (if the build is reproducible). required
     * 
     */
    @Import(name="recipe")
    private @Nullable Output<SlsaRecipeArgs> recipe;

    /**
     * @return Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit identical output (if the build is reproducible). required
     * 
     */
    public Optional<Output<SlsaRecipeArgs>> recipe() {
        return Optional.ofNullable(this.recipe);
    }

    private SlsaProvenanceArgs() {}

    private SlsaProvenanceArgs(SlsaProvenanceArgs $) {
        this.builder = $.builder;
        this.materials = $.materials;
        this.metadata = $.metadata;
        this.recipe = $.recipe;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlsaProvenanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlsaProvenanceArgs $;

        public Builder() {
            $ = new SlsaProvenanceArgs();
        }

        public Builder(SlsaProvenanceArgs defaults) {
            $ = new SlsaProvenanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param builder required
         * 
         * @return builder
         * 
         */
        public Builder builder_(@Nullable Output<SlsaBuilderArgs> builder) {
            $.builder = builder;
            return this;
        }

        /**
         * @param builder required
         * 
         * @return builder
         * 
         */
        public Builder builder_(SlsaBuilderArgs builder) {
            return builder_(Output.of(builder));
        }

        /**
         * @param materials The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
         * 
         * @return builder
         * 
         */
        public Builder materials(@Nullable Output<List<MaterialArgs>> materials) {
            $.materials = materials;
            return this;
        }

        /**
         * @param materials The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
         * 
         * @return builder
         * 
         */
        public Builder materials(List<MaterialArgs> materials) {
            return materials(Output.of(materials));
        }

        /**
         * @param materials The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
         * 
         * @return builder
         * 
         */
        public Builder materials(MaterialArgs... materials) {
            return materials(List.of(materials));
        }

        public Builder metadata(@Nullable Output<SlsaMetadataArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(SlsaMetadataArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param recipe Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit identical output (if the build is reproducible). required
         * 
         * @return builder
         * 
         */
        public Builder recipe(@Nullable Output<SlsaRecipeArgs> recipe) {
            $.recipe = recipe;
            return this;
        }

        /**
         * @param recipe Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit identical output (if the build is reproducible). required
         * 
         * @return builder
         * 
         */
        public Builder recipe(SlsaRecipeArgs recipe) {
            return recipe(Output.of(recipe));
        }

        public SlsaProvenanceArgs build() {
            return $;
        }
    }

}
