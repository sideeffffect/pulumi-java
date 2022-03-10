// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFirewallPolicyIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFirewallPolicyIamPolicyArgs Empty = new GetFirewallPolicyIamPolicyArgs();

    @InputImport(name="optionsRequestedPolicyVersion")
      private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> getOptionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @InputImport(name="resource", required=true)
      private final String resource;

    public String getResource() {
        return this.resource;
    }

    public GetFirewallPolicyIamPolicyArgs(
        @Nullable String optionsRequestedPolicyVersion,
        String resource) {
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
    }

    private GetFirewallPolicyIamPolicyArgs() {
        this.optionsRequestedPolicyVersion = null;
        this.resource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String optionsRequestedPolicyVersion;
        private String resource;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallPolicyIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.resource = defaults.resource;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder resource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }
        public GetFirewallPolicyIamPolicyArgs build() {
            return new GetFirewallPolicyIamPolicyArgs(optionsRequestedPolicyVersion, resource);
        }
    }
}
