// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PolicyAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyAttachmentArgs Empty = new PolicyAttachmentArgs();

    /**
     * The unique identifier (ID) of the policy that you want to attach to the target.
     * 
     */
    @InputImport(name="policyId", required=true)
      private final Input<String> policyId;

    public Input<String> getPolicyId() {
        return this.policyId;
    }

    /**
     * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
     * 
     */
    @InputImport(name="targetId", required=true)
      private final Input<String> targetId;

    public Input<String> getTargetId() {
        return this.targetId;
    }

    public PolicyAttachmentArgs(
        Input<String> policyId,
        Input<String> targetId) {
        this.policyId = Objects.requireNonNull(policyId, "expected parameter 'policyId' to be non-null");
        this.targetId = Objects.requireNonNull(targetId, "expected parameter 'targetId' to be non-null");
    }

    private PolicyAttachmentArgs() {
        this.policyId = Input.empty();
        this.targetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> policyId;
        private Input<String> targetId;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyId = defaults.policyId;
    	      this.targetId = defaults.targetId;
        }

        public Builder policyId(Input<String> policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }

        public Builder policyId(String policyId) {
            this.policyId = Input.of(Objects.requireNonNull(policyId));
            return this;
        }

        public Builder targetId(Input<String> targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }

        public Builder targetId(String targetId) {
            this.targetId = Input.of(Objects.requireNonNull(targetId));
            return this;
        }
        public PolicyAttachmentArgs build() {
            return new PolicyAttachmentArgs(policyId, targetId);
        }
    }
}
