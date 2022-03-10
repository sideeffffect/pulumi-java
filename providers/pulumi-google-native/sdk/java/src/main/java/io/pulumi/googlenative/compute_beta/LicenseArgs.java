// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.LicenseResourceRequirementsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LicenseArgs extends io.pulumi.resources.ResourceArgs {

    public static final LicenseArgs Empty = new LicenseArgs();

    /**
     * An optional textual description of the resource; provided by the client when the resource is created.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the resource. The name must be 1-63 characters long and comply with RFC1035.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    @InputImport(name="resourceRequirements")
      private final @Nullable Input<LicenseResourceRequirementsArgs> resourceRequirements;

    public Input<LicenseResourceRequirementsArgs> getResourceRequirements() {
        return this.resourceRequirements == null ? Input.empty() : this.resourceRequirements;
    }

    /**
     * If false, licenses will not be copied from the source resource when creating an image from a disk, disk from snapshot, or snapshot from disk.
     * 
     */
    @InputImport(name="transferable")
      private final @Nullable Input<Boolean> transferable;

    public Input<Boolean> getTransferable() {
        return this.transferable == null ? Input.empty() : this.transferable;
    }

    public LicenseArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<LicenseResourceRequirementsArgs> resourceRequirements,
        @Nullable Input<Boolean> transferable) {
        this.description = description;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.resourceRequirements = resourceRequirements;
        this.transferable = transferable;
    }

    private LicenseArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.resourceRequirements = Input.empty();
        this.transferable = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<LicenseResourceRequirementsArgs> resourceRequirements;
        private @Nullable Input<Boolean> transferable;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.resourceRequirements = defaults.resourceRequirements;
    	      this.transferable = defaults.transferable;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder requestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder resourceRequirements(@Nullable Input<LicenseResourceRequirementsArgs> resourceRequirements) {
            this.resourceRequirements = resourceRequirements;
            return this;
        }

        public Builder resourceRequirements(@Nullable LicenseResourceRequirementsArgs resourceRequirements) {
            this.resourceRequirements = Input.ofNullable(resourceRequirements);
            return this;
        }

        public Builder transferable(@Nullable Input<Boolean> transferable) {
            this.transferable = transferable;
            return this;
        }

        public Builder transferable(@Nullable Boolean transferable) {
            this.transferable = Input.ofNullable(transferable);
            return this;
        }
        public LicenseArgs build() {
            return new LicenseArgs(description, name, project, requestId, resourceRequirements, transferable);
        }
    }
}
