// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.AzureFirewallNetworkRuleProtocol;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the network rule.
 * 
 */
public final class AzureFirewallNetworkRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureFirewallNetworkRuleArgs Empty = new AzureFirewallNetworkRuleArgs();

    /**
     * Description of the rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * List of destination IP addresses.
     * 
     */
    @Import(name="destinationAddresses")
    private @Nullable Output<List<String>> destinationAddresses;

    public Optional<Output<List<String>>> destinationAddresses() {
        return Optional.ofNullable(this.destinationAddresses);
    }

    /**
     * List of destination FQDNs.
     * 
     */
    @Import(name="destinationFqdns")
    private @Nullable Output<List<String>> destinationFqdns;

    public Optional<Output<List<String>>> destinationFqdns() {
        return Optional.ofNullable(this.destinationFqdns);
    }

    /**
     * List of destination IpGroups for this rule.
     * 
     */
    @Import(name="destinationIpGroups")
    private @Nullable Output<List<String>> destinationIpGroups;

    public Optional<Output<List<String>>> destinationIpGroups() {
        return Optional.ofNullable(this.destinationIpGroups);
    }

    /**
     * List of destination ports.
     * 
     */
    @Import(name="destinationPorts")
    private @Nullable Output<List<String>> destinationPorts;

    public Optional<Output<List<String>>> destinationPorts() {
        return Optional.ofNullable(this.destinationPorts);
    }

    /**
     * Name of the network rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Array of AzureFirewallNetworkRuleProtocols.
     * 
     */
    @Import(name="protocols")
    private @Nullable Output<List<Either<String,AzureFirewallNetworkRuleProtocol>>> protocols;

    public Optional<Output<List<Either<String,AzureFirewallNetworkRuleProtocol>>>> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    /**
     * List of source IP addresses for this rule.
     * 
     */
    @Import(name="sourceAddresses")
    private @Nullable Output<List<String>> sourceAddresses;

    public Optional<Output<List<String>>> sourceAddresses() {
        return Optional.ofNullable(this.sourceAddresses);
    }

    /**
     * List of source IpGroups for this rule.
     * 
     */
    @Import(name="sourceIpGroups")
    private @Nullable Output<List<String>> sourceIpGroups;

    public Optional<Output<List<String>>> sourceIpGroups() {
        return Optional.ofNullable(this.sourceIpGroups);
    }

    private AzureFirewallNetworkRuleArgs() {}

    private AzureFirewallNetworkRuleArgs(AzureFirewallNetworkRuleArgs $) {
        this.description = $.description;
        this.destinationAddresses = $.destinationAddresses;
        this.destinationFqdns = $.destinationFqdns;
        this.destinationIpGroups = $.destinationIpGroups;
        this.destinationPorts = $.destinationPorts;
        this.name = $.name;
        this.protocols = $.protocols;
        this.sourceAddresses = $.sourceAddresses;
        this.sourceIpGroups = $.sourceIpGroups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFirewallNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFirewallNetworkRuleArgs $;

        public Builder() {
            $ = new AzureFirewallNetworkRuleArgs();
        }

        public Builder(AzureFirewallNetworkRuleArgs defaults) {
            $ = new AzureFirewallNetworkRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder destinationAddresses(@Nullable Output<List<String>> destinationAddresses) {
            $.destinationAddresses = destinationAddresses;
            return this;
        }

        public Builder destinationAddresses(List<String> destinationAddresses) {
            return destinationAddresses(Output.of(destinationAddresses));
        }

        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }

        public Builder destinationFqdns(@Nullable Output<List<String>> destinationFqdns) {
            $.destinationFqdns = destinationFqdns;
            return this;
        }

        public Builder destinationFqdns(List<String> destinationFqdns) {
            return destinationFqdns(Output.of(destinationFqdns));
        }

        public Builder destinationFqdns(String... destinationFqdns) {
            return destinationFqdns(List.of(destinationFqdns));
        }

        public Builder destinationIpGroups(@Nullable Output<List<String>> destinationIpGroups) {
            $.destinationIpGroups = destinationIpGroups;
            return this;
        }

        public Builder destinationIpGroups(List<String> destinationIpGroups) {
            return destinationIpGroups(Output.of(destinationIpGroups));
        }

        public Builder destinationIpGroups(String... destinationIpGroups) {
            return destinationIpGroups(List.of(destinationIpGroups));
        }

        public Builder destinationPorts(@Nullable Output<List<String>> destinationPorts) {
            $.destinationPorts = destinationPorts;
            return this;
        }

        public Builder destinationPorts(List<String> destinationPorts) {
            return destinationPorts(Output.of(destinationPorts));
        }

        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder protocols(@Nullable Output<List<Either<String,AzureFirewallNetworkRuleProtocol>>> protocols) {
            $.protocols = protocols;
            return this;
        }

        public Builder protocols(List<Either<String,AzureFirewallNetworkRuleProtocol>> protocols) {
            return protocols(Output.of(protocols));
        }

        public Builder protocols(Either<String,AzureFirewallNetworkRuleProtocol>... protocols) {
            return protocols(List.of(protocols));
        }

        public Builder sourceAddresses(@Nullable Output<List<String>> sourceAddresses) {
            $.sourceAddresses = sourceAddresses;
            return this;
        }

        public Builder sourceAddresses(List<String> sourceAddresses) {
            return sourceAddresses(Output.of(sourceAddresses));
        }

        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }

        public Builder sourceIpGroups(@Nullable Output<List<String>> sourceIpGroups) {
            $.sourceIpGroups = sourceIpGroups;
            return this;
        }

        public Builder sourceIpGroups(List<String> sourceIpGroups) {
            return sourceIpGroups(Output.of(sourceIpGroups));
        }

        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }

        public AzureFirewallNetworkRuleArgs build() {
            return $;
        }
    }

}
