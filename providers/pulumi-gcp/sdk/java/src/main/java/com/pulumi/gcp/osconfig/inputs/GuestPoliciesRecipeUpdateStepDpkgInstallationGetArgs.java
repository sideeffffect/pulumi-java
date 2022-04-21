// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs Empty = new GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs();

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @Import(name="artifactId", required=true)
    private Output<String> artifactId;

    public Output<String> artifactId() {
        return this.artifactId;
    }

    private GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs() {}

    private GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs(GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs $) {
        this.artifactId = $.artifactId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs $;

        public Builder() {
            $ = new GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs();
        }

        public Builder(GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs defaults) {
            $ = new GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder artifactId(Output<String> artifactId) {
            $.artifactId = artifactId;
            return this;
        }

        public Builder artifactId(String artifactId) {
            return artifactId(Output.of(artifactId));
        }

        public GuestPoliciesRecipeUpdateStepDpkgInstallationGetArgs build() {
            $.artifactId = Objects.requireNonNull($.artifactId, "expected parameter 'artifactId' to be non-null");
            return $;
        }
    }

}
