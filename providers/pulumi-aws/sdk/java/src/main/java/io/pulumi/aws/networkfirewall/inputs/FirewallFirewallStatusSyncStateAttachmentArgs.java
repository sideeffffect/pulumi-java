// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallFirewallStatusSyncStateAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallFirewallStatusSyncStateAttachmentArgs Empty = new FirewallFirewallStatusSyncStateAttachmentArgs();

    /**
     * The identifier of the firewall endpoint that AWS Network Firewall has instantiated in the subnet. You use this to identify the firewall endpoint in the VPC route tables, when you redirect the VPC traffic through the endpoint.
     * 
     */
    @Import(name="endpointId")
      private final @Nullable Output<String> endpointId;

    public Output<String> endpointId() {
        return this.endpointId == null ? Codegen.empty() : this.endpointId;
    }

    /**
     * The unique identifier for the subnet.
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> subnetId() {
        return this.subnetId == null ? Codegen.empty() : this.subnetId;
    }

    public FirewallFirewallStatusSyncStateAttachmentArgs(
        @Nullable Output<String> endpointId,
        @Nullable Output<String> subnetId) {
        this.endpointId = endpointId;
        this.subnetId = subnetId;
    }

    private FirewallFirewallStatusSyncStateAttachmentArgs() {
        this.endpointId = Codegen.empty();
        this.subnetId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallFirewallStatusSyncStateAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endpointId;
        private @Nullable Output<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallFirewallStatusSyncStateAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointId = defaults.endpointId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder endpointId(@Nullable Output<String> endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public Builder endpointId(@Nullable String endpointId) {
            this.endpointId = Codegen.ofNullable(endpointId);
            return this;
        }
        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Codegen.ofNullable(subnetId);
            return this;
        }        public FirewallFirewallStatusSyncStateAttachmentArgs build() {
            return new FirewallFirewallStatusSyncStateAttachmentArgs(endpointId, subnetId);
        }
    }
}
