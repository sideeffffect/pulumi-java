// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.FirewallPolicyRuleApplicationProtocolArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Rule of type application.
 * 
 */
public final class ApplicationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationRuleArgs Empty = new ApplicationRuleArgs();

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
     * List of destination IP addresses or Service Tags.
     * 
     */
    @Import(name="destinationAddresses")
    private @Nullable Output<List<String>> destinationAddresses;

    public Optional<Output<List<String>>> destinationAddresses() {
        return Optional.ofNullable(this.destinationAddresses);
    }

    /**
     * List of FQDN Tags for this rule.
     * 
     */
    @Import(name="fqdnTags")
    private @Nullable Output<List<String>> fqdnTags;

    public Optional<Output<List<String>>> fqdnTags() {
        return Optional.ofNullable(this.fqdnTags);
    }

    /**
     * Name of the rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Array of Application Protocols.
     * 
     */
    @Import(name="protocols")
    private @Nullable Output<List<FirewallPolicyRuleApplicationProtocolArgs>> protocols;

    public Optional<Output<List<FirewallPolicyRuleApplicationProtocolArgs>>> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    /**
     * Rule Type.
     * Expected value is &#39;ApplicationRule&#39;.
     * 
     */
    @Import(name="ruleType", required=true)
    private Output<String> ruleType;

    public Output<String> ruleType() {
        return this.ruleType;
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

    /**
     * List of FQDNs for this rule.
     * 
     */
    @Import(name="targetFqdns")
    private @Nullable Output<List<String>> targetFqdns;

    public Optional<Output<List<String>>> targetFqdns() {
        return Optional.ofNullable(this.targetFqdns);
    }

    /**
     * List of Urls for this rule condition.
     * 
     */
    @Import(name="targetUrls")
    private @Nullable Output<List<String>> targetUrls;

    public Optional<Output<List<String>>> targetUrls() {
        return Optional.ofNullable(this.targetUrls);
    }

    /**
     * Terminate TLS connections for this rule.
     * 
     */
    @Import(name="terminateTLS")
    private @Nullable Output<Boolean> terminateTLS;

    public Optional<Output<Boolean>> terminateTLS() {
        return Optional.ofNullable(this.terminateTLS);
    }

    /**
     * List of destination azure web categories.
     * 
     */
    @Import(name="webCategories")
    private @Nullable Output<List<String>> webCategories;

    public Optional<Output<List<String>>> webCategories() {
        return Optional.ofNullable(this.webCategories);
    }

    private ApplicationRuleArgs() {}

    private ApplicationRuleArgs(ApplicationRuleArgs $) {
        this.description = $.description;
        this.destinationAddresses = $.destinationAddresses;
        this.fqdnTags = $.fqdnTags;
        this.name = $.name;
        this.protocols = $.protocols;
        this.ruleType = $.ruleType;
        this.sourceAddresses = $.sourceAddresses;
        this.sourceIpGroups = $.sourceIpGroups;
        this.targetFqdns = $.targetFqdns;
        this.targetUrls = $.targetUrls;
        this.terminateTLS = $.terminateTLS;
        this.webCategories = $.webCategories;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationRuleArgs $;

        public Builder() {
            $ = new ApplicationRuleArgs();
        }

        public Builder(ApplicationRuleArgs defaults) {
            $ = new ApplicationRuleArgs(Objects.requireNonNull(defaults));
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

        public Builder fqdnTags(@Nullable Output<List<String>> fqdnTags) {
            $.fqdnTags = fqdnTags;
            return this;
        }

        public Builder fqdnTags(List<String> fqdnTags) {
            return fqdnTags(Output.of(fqdnTags));
        }

        public Builder fqdnTags(String... fqdnTags) {
            return fqdnTags(List.of(fqdnTags));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder protocols(@Nullable Output<List<FirewallPolicyRuleApplicationProtocolArgs>> protocols) {
            $.protocols = protocols;
            return this;
        }

        public Builder protocols(List<FirewallPolicyRuleApplicationProtocolArgs> protocols) {
            return protocols(Output.of(protocols));
        }

        public Builder protocols(FirewallPolicyRuleApplicationProtocolArgs... protocols) {
            return protocols(List.of(protocols));
        }

        public Builder ruleType(Output<String> ruleType) {
            $.ruleType = ruleType;
            return this;
        }

        public Builder ruleType(String ruleType) {
            return ruleType(Output.of(ruleType));
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

        public Builder targetFqdns(@Nullable Output<List<String>> targetFqdns) {
            $.targetFqdns = targetFqdns;
            return this;
        }

        public Builder targetFqdns(List<String> targetFqdns) {
            return targetFqdns(Output.of(targetFqdns));
        }

        public Builder targetFqdns(String... targetFqdns) {
            return targetFqdns(List.of(targetFqdns));
        }

        public Builder targetUrls(@Nullable Output<List<String>> targetUrls) {
            $.targetUrls = targetUrls;
            return this;
        }

        public Builder targetUrls(List<String> targetUrls) {
            return targetUrls(Output.of(targetUrls));
        }

        public Builder targetUrls(String... targetUrls) {
            return targetUrls(List.of(targetUrls));
        }

        public Builder terminateTLS(@Nullable Output<Boolean> terminateTLS) {
            $.terminateTLS = terminateTLS;
            return this;
        }

        public Builder terminateTLS(Boolean terminateTLS) {
            return terminateTLS(Output.of(terminateTLS));
        }

        public Builder webCategories(@Nullable Output<List<String>> webCategories) {
            $.webCategories = webCategories;
            return this;
        }

        public Builder webCategories(List<String> webCategories) {
            return webCategories(Output.of(webCategories));
        }

        public Builder webCategories(String... webCategories) {
            return webCategories(List.of(webCategories));
        }

        public ApplicationRuleArgs build() {
            $.ruleType = Codegen.stringProp("ruleType").output().arg($.ruleType).require();
            return $;
        }
    }

}
