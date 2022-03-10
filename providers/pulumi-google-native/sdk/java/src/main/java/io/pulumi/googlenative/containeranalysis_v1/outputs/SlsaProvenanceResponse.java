// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.MaterialResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.SlsaBuilderResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.SlsaMetadataResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.SlsaRecipeResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SlsaProvenanceResponse {
    /**
     * required
     * 
     */
    private final SlsaBuilderResponse builder;
    /**
     * The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
     * 
     */
    private final List<MaterialResponse> materials;
    private final SlsaMetadataResponse metadata;
    /**
     * Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit identical output (if the build is reproducible). required
     * 
     */
    private final SlsaRecipeResponse recipe;

    @OutputCustomType.Constructor
    private SlsaProvenanceResponse(
        @OutputCustomType.Parameter("builder") SlsaBuilderResponse builder,
        @OutputCustomType.Parameter("materials") List<MaterialResponse> materials,
        @OutputCustomType.Parameter("metadata") SlsaMetadataResponse metadata,
        @OutputCustomType.Parameter("recipe") SlsaRecipeResponse recipe) {
        this.builder = builder;
        this.materials = materials;
        this.metadata = metadata;
        this.recipe = recipe;
    }

    /**
     * required
     * 
    */
    public SlsaBuilderResponse getBuilder() {
        return this.builder;
    }
    /**
     * The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
     * 
    */
    public List<MaterialResponse> getMaterials() {
        return this.materials;
    }
    public SlsaMetadataResponse getMetadata() {
        return this.metadata;
    }
    /**
     * Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit identical output (if the build is reproducible). required
     * 
    */
    public SlsaRecipeResponse getRecipe() {
        return this.recipe;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlsaProvenanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlsaBuilderResponse builder;
        private List<MaterialResponse> materials;
        private SlsaMetadataResponse metadata;
        private SlsaRecipeResponse recipe;

        public Builder() {
    	      // Empty
        }

        public Builder(SlsaProvenanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builder = defaults.builder;
    	      this.materials = defaults.materials;
    	      this.metadata = defaults.metadata;
    	      this.recipe = defaults.recipe;
        }

        public Builder builder(SlsaBuilderResponse builder) {
            this.builder = Objects.requireNonNull(builder);
            return this;
        }

        public Builder materials(List<MaterialResponse> materials) {
            this.materials = Objects.requireNonNull(materials);
            return this;
        }

        public Builder metadata(SlsaMetadataResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder recipe(SlsaRecipeResponse recipe) {
            this.recipe = Objects.requireNonNull(recipe);
            return this;
        }
        public SlsaProvenanceResponse build() {
            return new SlsaProvenanceResponse(builder, materials, metadata, recipe);
        }
    }
}
