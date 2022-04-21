// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.aws.networkfirewall.inputs.FirewallFirewallStatusSyncStateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallFirewallStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallFirewallStatusArgs Empty = new FirewallFirewallStatusArgs();

    /**
     * Set of subnets configured for use by the firewall.
     * 
     */
    @Import(name="syncStates")
    private @Nullable Output<List<FirewallFirewallStatusSyncStateArgs>> syncStates;

    public Optional<Output<List<FirewallFirewallStatusSyncStateArgs>>> syncStates() {
        return Optional.ofNullable(this.syncStates);
    }

    private FirewallFirewallStatusArgs() {}

    private FirewallFirewallStatusArgs(FirewallFirewallStatusArgs $) {
        this.syncStates = $.syncStates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallFirewallStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallFirewallStatusArgs $;

        public Builder() {
            $ = new FirewallFirewallStatusArgs();
        }

        public Builder(FirewallFirewallStatusArgs defaults) {
            $ = new FirewallFirewallStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder syncStates(@Nullable Output<List<FirewallFirewallStatusSyncStateArgs>> syncStates) {
            $.syncStates = syncStates;
            return this;
        }

        public Builder syncStates(List<FirewallFirewallStatusSyncStateArgs> syncStates) {
            return syncStates(Output.of(syncStates));
        }

        public Builder syncStates(FirewallFirewallStatusSyncStateArgs... syncStates) {
            return syncStates(List.of(syncStates));
        }

        public FirewallFirewallStatusArgs build() {
            return $;
        }
    }

}
