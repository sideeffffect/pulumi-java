// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTaxonomyPolicyTagIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTaxonomyPolicyTagIamPolicyArgs Empty = new GetTaxonomyPolicyTagIamPolicyArgs();

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="policyTagId", required=true)
      private final String policyTagId;

    public String getPolicyTagId() {
        return this.policyTagId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="taxonomyId", required=true)
      private final String taxonomyId;

    public String getTaxonomyId() {
        return this.taxonomyId;
    }

    public GetTaxonomyPolicyTagIamPolicyArgs(
        String location,
        String policyTagId,
        @Nullable String project,
        String taxonomyId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.policyTagId = Objects.requireNonNull(policyTagId, "expected parameter 'policyTagId' to be non-null");
        this.project = project;
        this.taxonomyId = Objects.requireNonNull(taxonomyId, "expected parameter 'taxonomyId' to be non-null");
    }

    private GetTaxonomyPolicyTagIamPolicyArgs() {
        this.location = null;
        this.policyTagId = null;
        this.project = null;
        this.taxonomyId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaxonomyPolicyTagIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String policyTagId;
        private @Nullable String project;
        private String taxonomyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaxonomyPolicyTagIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.policyTagId = defaults.policyTagId;
    	      this.project = defaults.project;
    	      this.taxonomyId = defaults.taxonomyId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder policyTagId(String policyTagId) {
            this.policyTagId = Objects.requireNonNull(policyTagId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder taxonomyId(String taxonomyId) {
            this.taxonomyId = Objects.requireNonNull(taxonomyId);
            return this;
        }
        public GetTaxonomyPolicyTagIamPolicyArgs build() {
            return new GetTaxonomyPolicyTagIamPolicyArgs(location, policyTagId, project, taxonomyId);
        }
    }
}
