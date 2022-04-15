// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LifecyclePolicyState extends io.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyState Empty = new LifecyclePolicyState();

    /**
     * The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> policy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    /**
     * The registry ID where the repository was created.
     * 
     */
    @Import(name="registryId")
      private final @Nullable Output<String> registryId;

    public Output<String> registryId() {
        return this.registryId == null ? Codegen.empty() : this.registryId;
    }

    /**
     * Name of the repository to apply the policy.
     * 
     */
    @Import(name="repository")
      private final @Nullable Output<String> repository;

    public Output<String> repository() {
        return this.repository == null ? Codegen.empty() : this.repository;
    }

    public LifecyclePolicyState(
        @Nullable Output<String> policy,
        @Nullable Output<String> registryId,
        @Nullable Output<String> repository) {
        this.policy = policy;
        this.registryId = registryId;
        this.repository = repository;
    }

    private LifecyclePolicyState() {
        this.policy = Codegen.empty();
        this.registryId = Codegen.empty();
        this.repository = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> policy;
        private @Nullable Output<String> registryId;
        private @Nullable Output<String> repository;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.registryId = defaults.registryId;
    	      this.repository = defaults.repository;
        }

        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder registryId(@Nullable Output<String> registryId) {
            this.registryId = registryId;
            return this;
        }
        public Builder registryId(@Nullable String registryId) {
            this.registryId = Codegen.ofNullable(registryId);
            return this;
        }
        public Builder repository(@Nullable Output<String> repository) {
            this.repository = repository;
            return this;
        }
        public Builder repository(@Nullable String repository) {
            this.repository = Codegen.ofNullable(repository);
            return this;
        }        public LifecyclePolicyState build() {
            return new LifecyclePolicyState(policy, registryId, repository);
        }
    }
}
