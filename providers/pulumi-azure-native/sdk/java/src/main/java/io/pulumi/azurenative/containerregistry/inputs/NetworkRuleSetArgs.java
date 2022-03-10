// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.DefaultAction;
import io.pulumi.azurenative.containerregistry.inputs.IPRuleArgs;
import io.pulumi.azurenative.containerregistry.inputs.VirtualNetworkRuleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The network rule set for a container registry.
 * 
 */
public final class NetworkRuleSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkRuleSetArgs Empty = new NetworkRuleSetArgs();

    /**
     * The default action of allow or deny when no other rules match.
     * 
     */
    @InputImport(name="defaultAction", required=true)
      private final Input<Either<String,DefaultAction>> defaultAction;

    public Input<Either<String,DefaultAction>> getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * The IP ACL rules.
     * 
     */
    @InputImport(name="ipRules")
      private final @Nullable Input<List<IPRuleArgs>> ipRules;

    public Input<List<IPRuleArgs>> getIpRules() {
        return this.ipRules == null ? Input.empty() : this.ipRules;
    }

    /**
     * The virtual network rules.
     * 
     */
    @InputImport(name="virtualNetworkRules")
      private final @Nullable Input<List<VirtualNetworkRuleArgs>> virtualNetworkRules;

    public Input<List<VirtualNetworkRuleArgs>> getVirtualNetworkRules() {
        return this.virtualNetworkRules == null ? Input.empty() : this.virtualNetworkRules;
    }

    public NetworkRuleSetArgs(
        Input<Either<String,DefaultAction>> defaultAction,
        @Nullable Input<List<IPRuleArgs>> ipRules,
        @Nullable Input<List<VirtualNetworkRuleArgs>> virtualNetworkRules) {
        this.defaultAction = defaultAction == null ? Input.ofLeft("Allow") : Objects.requireNonNull(defaultAction, "expected parameter 'defaultAction' to be non-null");
        this.ipRules = ipRules;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    private NetworkRuleSetArgs() {
        this.defaultAction = Input.empty();
        this.ipRules = Input.empty();
        this.virtualNetworkRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,DefaultAction>> defaultAction;
        private @Nullable Input<List<IPRuleArgs>> ipRules;
        private @Nullable Input<List<VirtualNetworkRuleArgs>> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder defaultAction(Input<Either<String,DefaultAction>> defaultAction) {
            this.defaultAction = Objects.requireNonNull(defaultAction);
            return this;
        }

        public Builder defaultAction(Either<String,DefaultAction> defaultAction) {
            this.defaultAction = Input.of(Objects.requireNonNull(defaultAction));
            return this;
        }

        public Builder ipRules(@Nullable Input<List<IPRuleArgs>> ipRules) {
            this.ipRules = ipRules;
            return this;
        }

        public Builder ipRules(@Nullable List<IPRuleArgs> ipRules) {
            this.ipRules = Input.ofNullable(ipRules);
            return this;
        }

        public Builder virtualNetworkRules(@Nullable Input<List<VirtualNetworkRuleArgs>> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }

        public Builder virtualNetworkRules(@Nullable List<VirtualNetworkRuleArgs> virtualNetworkRules) {
            this.virtualNetworkRules = Input.ofNullable(virtualNetworkRules);
            return this;
        }
        public NetworkRuleSetArgs build() {
            return new NetworkRuleSetArgs(defaultAction, ipRules, virtualNetworkRules);
        }
    }
}
