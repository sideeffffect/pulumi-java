// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.outputs;

import io.pulumi.awsnative.mediaconnect.enums.FlowEntitlementEntitlementStatus;
import io.pulumi.awsnative.mediaconnect.outputs.FlowEntitlementEncryption;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFlowEntitlementResult {
    /**
     * A description of the entitlement.
     * 
     */
    private final @Nullable String description;
    /**
     * The type of encryption that will be used on the output that is associated with this entitlement.
     * 
     */
    private final @Nullable FlowEntitlementEncryption encryption;
    /**
     * The ARN of the entitlement.
     * 
     */
    private final @Nullable String entitlementArn;
    /**
     *  An indication of whether the entitlement is enabled.
     * 
     */
    private final @Nullable FlowEntitlementEntitlementStatus entitlementStatus;
    /**
     * The ARN of the flow.
     * 
     */
    private final @Nullable String flowArn;
    /**
     * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be allowed to create their own flow using your content as the source.
     * 
     */
    private final @Nullable List<String> subscribers;

    @OutputCustomType.Constructor
    private GetFlowEntitlementResult(
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("encryption") @Nullable FlowEntitlementEncryption encryption,
        @OutputCustomType.Parameter("entitlementArn") @Nullable String entitlementArn,
        @OutputCustomType.Parameter("entitlementStatus") @Nullable FlowEntitlementEntitlementStatus entitlementStatus,
        @OutputCustomType.Parameter("flowArn") @Nullable String flowArn,
        @OutputCustomType.Parameter("subscribers") @Nullable List<String> subscribers) {
        this.description = description;
        this.encryption = encryption;
        this.entitlementArn = entitlementArn;
        this.entitlementStatus = entitlementStatus;
        this.flowArn = flowArn;
        this.subscribers = subscribers;
    }

    /**
     * A description of the entitlement.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The type of encryption that will be used on the output that is associated with this entitlement.
     * 
    */
    public Optional<FlowEntitlementEncryption> getEncryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * The ARN of the entitlement.
     * 
    */
    public Optional<String> getEntitlementArn() {
        return Optional.ofNullable(this.entitlementArn);
    }
    /**
     *  An indication of whether the entitlement is enabled.
     * 
    */
    public Optional<FlowEntitlementEntitlementStatus> getEntitlementStatus() {
        return Optional.ofNullable(this.entitlementStatus);
    }
    /**
     * The ARN of the flow.
     * 
    */
    public Optional<String> getFlowArn() {
        return Optional.ofNullable(this.flowArn);
    }
    /**
     * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be allowed to create their own flow using your content as the source.
     * 
    */
    public List<String> getSubscribers() {
        return this.subscribers == null ? List.of() : this.subscribers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlowEntitlementResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable FlowEntitlementEncryption encryption;
        private @Nullable String entitlementArn;
        private @Nullable FlowEntitlementEntitlementStatus entitlementStatus;
        private @Nullable String flowArn;
        private @Nullable List<String> subscribers;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFlowEntitlementResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.encryption = defaults.encryption;
    	      this.entitlementArn = defaults.entitlementArn;
    	      this.entitlementStatus = defaults.entitlementStatus;
    	      this.flowArn = defaults.flowArn;
    	      this.subscribers = defaults.subscribers;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder encryption(@Nullable FlowEntitlementEncryption encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder entitlementArn(@Nullable String entitlementArn) {
            this.entitlementArn = entitlementArn;
            return this;
        }

        public Builder entitlementStatus(@Nullable FlowEntitlementEntitlementStatus entitlementStatus) {
            this.entitlementStatus = entitlementStatus;
            return this;
        }

        public Builder flowArn(@Nullable String flowArn) {
            this.flowArn = flowArn;
            return this;
        }

        public Builder subscribers(@Nullable List<String> subscribers) {
            this.subscribers = subscribers;
            return this;
        }
        public GetFlowEntitlementResult build() {
            return new GetFlowEntitlementResult(description, encryption, entitlementArn, entitlementStatus, flowArn, subscribers);
        }
    }
}
