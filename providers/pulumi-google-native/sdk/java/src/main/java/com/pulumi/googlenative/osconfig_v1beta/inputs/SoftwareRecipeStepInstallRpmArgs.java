// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Installs an rpm file via the rpm utility.
 * 
 */
public final class SoftwareRecipeStepInstallRpmArgs extends com.pulumi.resources.ResourceArgs {

    public static final SoftwareRecipeStepInstallRpmArgs Empty = new SoftwareRecipeStepInstallRpmArgs();

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @Import(name="artifactId", required=true)
    private Output<String> artifactId;

    /**
     * @return The id of the relevant artifact in the recipe.
     * 
     */
    public Output<String> artifactId() {
        return this.artifactId;
    }

    private SoftwareRecipeStepInstallRpmArgs() {}

    private SoftwareRecipeStepInstallRpmArgs(SoftwareRecipeStepInstallRpmArgs $) {
        this.artifactId = $.artifactId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SoftwareRecipeStepInstallRpmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SoftwareRecipeStepInstallRpmArgs $;

        public Builder() {
            $ = new SoftwareRecipeStepInstallRpmArgs();
        }

        public Builder(SoftwareRecipeStepInstallRpmArgs defaults) {
            $ = new SoftwareRecipeStepInstallRpmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactId The id of the relevant artifact in the recipe.
         * 
         * @return builder
         * 
         */
        public Builder artifactId(Output<String> artifactId) {
            $.artifactId = artifactId;
            return this;
        }

        /**
         * @param artifactId The id of the relevant artifact in the recipe.
         * 
         * @return builder
         * 
         */
        public Builder artifactId(String artifactId) {
            return artifactId(Output.of(artifactId));
        }

        public SoftwareRecipeStepInstallRpmArgs build() {
            $.artifactId = Objects.requireNonNull($.artifactId, "expected parameter 'artifactId' to be non-null");
            return $;
        }
    }

}
