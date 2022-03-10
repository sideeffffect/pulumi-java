// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeInstallStepFileCopyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeInstallStepFileCopyGetArgs Empty = new GuestPoliciesRecipeInstallStepFileCopyGetArgs();

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @InputImport(name="artifactId", required=true)
      private final Input<String> artifactId;

    public Input<String> getArtifactId() {
        return this.artifactId;
    }

    /**
     * Directory to extract archive to. Defaults to / on Linux or C:\ on Windows.
     * 
     */
    @InputImport(name="destination", required=true)
      private final Input<String> destination;

    public Input<String> getDestination() {
        return this.destination;
    }

    /**
     * Whether to allow this step to overwrite existing files.If this is false and the file already exists the file
     * is not overwritten and the step is considered a success. Defaults to false.
     * 
     */
    @InputImport(name="overwrite")
      private final @Nullable Input<Boolean> overwrite;

    public Input<Boolean> getOverwrite() {
        return this.overwrite == null ? Input.empty() : this.overwrite;
    }

    /**
     * Consists of three octal digits which represent, in order, the permissions of the owner, group, and other users
     * for the file (similarly to the numeric mode used in the linux chmod utility). Each digit represents a three bit
     * number with the 4 bit corresponding to the read permissions, the 2 bit corresponds to the write bit, and the one
     * bit corresponds to the execute permission. Default behavior is 755.
     * Below are some examples of permissions and their associated values:
     * read, write, and execute: 7 read and execute: 5 read and write: 6 read only: 4
     * 
     */
    @InputImport(name="permissions")
      private final @Nullable Input<String> permissions;

    public Input<String> getPermissions() {
        return this.permissions == null ? Input.empty() : this.permissions;
    }

    public GuestPoliciesRecipeInstallStepFileCopyGetArgs(
        Input<String> artifactId,
        Input<String> destination,
        @Nullable Input<Boolean> overwrite,
        @Nullable Input<String> permissions) {
        this.artifactId = Objects.requireNonNull(artifactId, "expected parameter 'artifactId' to be non-null");
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.overwrite = overwrite;
        this.permissions = permissions;
    }

    private GuestPoliciesRecipeInstallStepFileCopyGetArgs() {
        this.artifactId = Input.empty();
        this.destination = Input.empty();
        this.overwrite = Input.empty();
        this.permissions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeInstallStepFileCopyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> artifactId;
        private Input<String> destination;
        private @Nullable Input<Boolean> overwrite;
        private @Nullable Input<String> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeInstallStepFileCopyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactId = defaults.artifactId;
    	      this.destination = defaults.destination;
    	      this.overwrite = defaults.overwrite;
    	      this.permissions = defaults.permissions;
        }

        public Builder artifactId(Input<String> artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }

        public Builder artifactId(String artifactId) {
            this.artifactId = Input.of(Objects.requireNonNull(artifactId));
            return this;
        }

        public Builder destination(Input<String> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder destination(String destination) {
            this.destination = Input.of(Objects.requireNonNull(destination));
            return this;
        }

        public Builder overwrite(@Nullable Input<Boolean> overwrite) {
            this.overwrite = overwrite;
            return this;
        }

        public Builder overwrite(@Nullable Boolean overwrite) {
            this.overwrite = Input.ofNullable(overwrite);
            return this;
        }

        public Builder permissions(@Nullable Input<String> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder permissions(@Nullable String permissions) {
            this.permissions = Input.ofNullable(permissions);
            return this;
        }
        public GuestPoliciesRecipeInstallStepFileCopyGetArgs build() {
            return new GuestPoliciesRecipeInstallStepFileCopyGetArgs(artifactId, destination, overwrite, permissions);
        }
    }
}
