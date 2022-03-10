// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.eventschemas;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistryPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryPolicyArgs Empty = new RegistryPolicyArgs();

    @InputImport(name="policy", required=true)
      private final Input<Object> policy;

    public Input<Object> getPolicy() {
        return this.policy;
    }

    @InputImport(name="registryName", required=true)
      private final Input<String> registryName;

    public Input<String> getRegistryName() {
        return this.registryName;
    }

    @InputImport(name="revisionId")
      private final @Nullable Input<String> revisionId;

    public Input<String> getRevisionId() {
        return this.revisionId == null ? Input.empty() : this.revisionId;
    }

    public RegistryPolicyArgs(
        Input<Object> policy,
        Input<String> registryName,
        @Nullable Input<String> revisionId) {
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.revisionId = revisionId;
    }

    private RegistryPolicyArgs() {
        this.policy = Input.empty();
        this.registryName = Input.empty();
        this.revisionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Object> policy;
        private Input<String> registryName;
        private @Nullable Input<String> revisionId;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.registryName = defaults.registryName;
    	      this.revisionId = defaults.revisionId;
        }

        public Builder policy(Input<Object> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder policy(Object policy) {
            this.policy = Input.of(Objects.requireNonNull(policy));
            return this;
        }

        public Builder registryName(Input<String> registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }

        public Builder registryName(String registryName) {
            this.registryName = Input.of(Objects.requireNonNull(registryName));
            return this;
        }

        public Builder revisionId(@Nullable Input<String> revisionId) {
            this.revisionId = revisionId;
            return this;
        }

        public Builder revisionId(@Nullable String revisionId) {
            this.revisionId = Input.ofNullable(revisionId);
            return this;
        }
        public RegistryPolicyArgs build() {
            return new RegistryPolicyArgs(policy, registryName, revisionId);
        }
    }
}
