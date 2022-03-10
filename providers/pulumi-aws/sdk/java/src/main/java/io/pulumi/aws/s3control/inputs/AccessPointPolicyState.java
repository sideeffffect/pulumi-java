// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessPointPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final AccessPointPolicyState Empty = new AccessPointPolicyState();

    /**
     * The ARN of the access point that you want to associate with the specified policy.
     * 
     */
    @InputImport(name="accessPointArn")
      private final @Nullable Input<String> accessPointArn;

    public Input<String> getAccessPointArn() {
        return this.accessPointArn == null ? Input.empty() : this.accessPointArn;
    }

    /**
     * Indicates whether this access point currently has a policy that allows public access.
     * 
     */
    @InputImport(name="hasPublicAccessPolicy")
      private final @Nullable Input<Boolean> hasPublicAccessPolicy;

    public Input<Boolean> getHasPublicAccessPolicy() {
        return this.hasPublicAccessPolicy == null ? Input.empty() : this.hasPublicAccessPolicy;
    }

    /**
     * The policy that you want to apply to the specified access point.
     * 
     */
    @InputImport(name="policy")
      private final @Nullable Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    public AccessPointPolicyState(
        @Nullable Input<String> accessPointArn,
        @Nullable Input<Boolean> hasPublicAccessPolicy,
        @Nullable Input<String> policy) {
        this.accessPointArn = accessPointArn;
        this.hasPublicAccessPolicy = hasPublicAccessPolicy;
        this.policy = policy;
    }

    private AccessPointPolicyState() {
        this.accessPointArn = Input.empty();
        this.hasPublicAccessPolicy = Input.empty();
        this.policy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessPointArn;
        private @Nullable Input<Boolean> hasPublicAccessPolicy;
        private @Nullable Input<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointArn = defaults.accessPointArn;
    	      this.hasPublicAccessPolicy = defaults.hasPublicAccessPolicy;
    	      this.policy = defaults.policy;
        }

        public Builder accessPointArn(@Nullable Input<String> accessPointArn) {
            this.accessPointArn = accessPointArn;
            return this;
        }

        public Builder accessPointArn(@Nullable String accessPointArn) {
            this.accessPointArn = Input.ofNullable(accessPointArn);
            return this;
        }

        public Builder hasPublicAccessPolicy(@Nullable Input<Boolean> hasPublicAccessPolicy) {
            this.hasPublicAccessPolicy = hasPublicAccessPolicy;
            return this;
        }

        public Builder hasPublicAccessPolicy(@Nullable Boolean hasPublicAccessPolicy) {
            this.hasPublicAccessPolicy = Input.ofNullable(hasPublicAccessPolicy);
            return this;
        }

        public Builder policy(@Nullable Input<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder policy(@Nullable String policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }
        public AccessPointPolicyState build() {
            return new AccessPointPolicyState(accessPointArn, hasPublicAccessPolicy, policy);
        }
    }
}
