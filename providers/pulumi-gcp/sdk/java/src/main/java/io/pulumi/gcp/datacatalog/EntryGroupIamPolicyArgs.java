// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryGroupIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntryGroupIamPolicyArgs Empty = new EntryGroupIamPolicyArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="entryGroup", required=true)
      private final Input<String> entryGroup;

    public Input<String> getEntryGroup() {
        return this.entryGroup;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData", required=true)
      private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    public EntryGroupIamPolicyArgs(
        Input<String> entryGroup,
        Input<String> policyData,
        @Nullable Input<String> project,
        @Nullable Input<String> region) {
        this.entryGroup = Objects.requireNonNull(entryGroup, "expected parameter 'entryGroup' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
        this.region = region;
    }

    private EntryGroupIamPolicyArgs() {
        this.entryGroup = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryGroupIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> entryGroup;
        private Input<String> policyData;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryGroupIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entryGroup = defaults.entryGroup;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder entryGroup(Input<String> entryGroup) {
            this.entryGroup = Objects.requireNonNull(entryGroup);
            return this;
        }

        public Builder entryGroup(String entryGroup) {
            this.entryGroup = Input.of(Objects.requireNonNull(entryGroup));
            return this;
        }

        public Builder policyData(Input<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public Builder policyData(String policyData) {
            this.policyData = Input.of(Objects.requireNonNull(policyData));
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

        public Builder region(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }
        public EntryGroupIamPolicyArgs build() {
            return new EntryGroupIamPolicyArgs(entryGroup, policyData, project, region);
        }
    }
}
