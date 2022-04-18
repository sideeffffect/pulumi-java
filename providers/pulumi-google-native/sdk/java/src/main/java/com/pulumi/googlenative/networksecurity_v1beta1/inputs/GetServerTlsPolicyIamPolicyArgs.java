// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServerTlsPolicyIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerTlsPolicyIamPolicyArgs Empty = new GetServerTlsPolicyIamPolicyArgs();

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
      private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="serverTlsPolicyId", required=true)
      private final String serverTlsPolicyId;

    public String serverTlsPolicyId() {
        return this.serverTlsPolicyId;
    }

    public GetServerTlsPolicyIamPolicyArgs(
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project,
        String serverTlsPolicyId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
        this.serverTlsPolicyId = Objects.requireNonNull(serverTlsPolicyId, "expected parameter 'serverTlsPolicyId' to be non-null");
    }

    private GetServerTlsPolicyIamPolicyArgs() {
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
        this.serverTlsPolicyId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerTlsPolicyIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;
        private String serverTlsPolicyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerTlsPolicyIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
    	      this.serverTlsPolicyId = defaults.serverTlsPolicyId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder serverTlsPolicyId(String serverTlsPolicyId) {
            this.serverTlsPolicyId = Objects.requireNonNull(serverTlsPolicyId);
            return this;
        }        public GetServerTlsPolicyIamPolicyArgs build() {
            return new GetServerTlsPolicyIamPolicyArgs(location, optionsRequestedPolicyVersion, project, serverTlsPolicyId);
        }
    }
}
