// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex;

import io.pulumi.awsnative.lex.inputs.ResourcePolicyPolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ResourcePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyArgs Empty = new ResourcePolicyArgs();

    @InputImport(name="policy", required=true)
      private final Input<ResourcePolicyPolicyArgs> policy;

    public Input<ResourcePolicyPolicyArgs> getPolicy() {
        return this.policy;
    }

    @InputImport(name="resourceArn", required=true)
      private final Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn;
    }

    public ResourcePolicyArgs(
        Input<ResourcePolicyPolicyArgs> policy,
        Input<String> resourceArn) {
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
    }

    private ResourcePolicyArgs() {
        this.policy = Input.empty();
        this.resourceArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ResourcePolicyPolicyArgs> policy;
        private Input<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder policy(Input<ResourcePolicyPolicyArgs> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder policy(ResourcePolicyPolicyArgs policy) {
            this.policy = Input.of(Objects.requireNonNull(policy));
            return this;
        }

        public Builder resourceArn(Input<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Input.of(Objects.requireNonNull(resourceArn));
            return this;
        }
        public ResourcePolicyArgs build() {
            return new ResourcePolicyArgs(policy, resourceArn);
        }
    }
}
