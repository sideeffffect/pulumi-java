// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusSyncStateArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallFirewallStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallFirewallStatusArgs Empty = new FirewallFirewallStatusArgs();

    /**
     * Set of subnets configured for use by the firewall.
     * 
     */
    @Import(name="syncStates")
      private final @Nullable Output<List<FirewallFirewallStatusSyncStateArgs>> syncStates;

    public Output<List<FirewallFirewallStatusSyncStateArgs>> syncStates() {
        return this.syncStates == null ? Codegen.empty() : this.syncStates;
    }

    public FirewallFirewallStatusArgs(@Nullable Output<List<FirewallFirewallStatusSyncStateArgs>> syncStates) {
        this.syncStates = syncStates;
    }

    private FirewallFirewallStatusArgs() {
        this.syncStates = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallFirewallStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FirewallFirewallStatusSyncStateArgs>> syncStates;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallFirewallStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.syncStates = defaults.syncStates;
        }

        public Builder syncStates(@Nullable Output<List<FirewallFirewallStatusSyncStateArgs>> syncStates) {
            this.syncStates = syncStates;
            return this;
        }
        public Builder syncStates(@Nullable List<FirewallFirewallStatusSyncStateArgs> syncStates) {
            this.syncStates = Codegen.ofNullable(syncStates);
            return this;
        }
        public Builder syncStates(FirewallFirewallStatusSyncStateArgs... syncStates) {
            return syncStates(List.of(syncStates));
        }        public FirewallFirewallStatusArgs build() {
            return new FirewallFirewallStatusArgs(syncStates);
        }
    }
}
