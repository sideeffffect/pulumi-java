// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.FirewallPolicyRuleApplicationProtocolResponse;
import io.pulumi.core.annotations.InputImport;
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
public final class ApplicationRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationRuleResponse Empty = new ApplicationRuleResponse();

    /**
     * Description of the rule.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * List of destination IP addresses or Service Tags.
     * 
     */
    @InputImport(name="destinationAddresses")
      private final @Nullable List<String> destinationAddresses;

    public List<String> getDestinationAddresses() {
        return this.destinationAddresses == null ? List.of() : this.destinationAddresses;
    }

    /**
     * List of FQDN Tags for this rule.
     * 
     */
    @InputImport(name="fqdnTags")
      private final @Nullable List<String> fqdnTags;

    public List<String> getFqdnTags() {
        return this.fqdnTags == null ? List.of() : this.fqdnTags;
    }

    /**
     * Name of the rule.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Array of Application Protocols.
     * 
     */
    @InputImport(name="protocols")
      private final @Nullable List<FirewallPolicyRuleApplicationProtocolResponse> protocols;

    public List<FirewallPolicyRuleApplicationProtocolResponse> getProtocols() {
        return this.protocols == null ? List.of() : this.protocols;
    }

    /**
     * Rule Type.
     * Expected value is 'ApplicationRule'.
     * 
     */
    @InputImport(name="ruleType", required=true)
      private final String ruleType;

    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * List of source IP addresses for this rule.
     * 
     */
    @InputImport(name="sourceAddresses")
      private final @Nullable List<String> sourceAddresses;

    public List<String> getSourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }

    /**
     * List of source IpGroups for this rule.
     * 
     */
    @InputImport(name="sourceIpGroups")
      private final @Nullable List<String> sourceIpGroups;

    public List<String> getSourceIpGroups() {
        return this.sourceIpGroups == null ? List.of() : this.sourceIpGroups;
    }

    /**
     * List of FQDNs for this rule.
     * 
     */
    @InputImport(name="targetFqdns")
      private final @Nullable List<String> targetFqdns;

    public List<String> getTargetFqdns() {
        return this.targetFqdns == null ? List.of() : this.targetFqdns;
    }

    /**
     * List of Urls for this rule condition.
     * 
     */
    @InputImport(name="targetUrls")
      private final @Nullable List<String> targetUrls;

    public List<String> getTargetUrls() {
        return this.targetUrls == null ? List.of() : this.targetUrls;
    }

    /**
     * Terminate TLS connections for this rule.
     * 
     */
    @InputImport(name="terminateTLS")
      private final @Nullable Boolean terminateTLS;

    public Optional<Boolean> getTerminateTLS() {
        return this.terminateTLS == null ? Optional.empty() : Optional.ofNullable(this.terminateTLS);
    }

    /**
     * List of destination azure web categories.
     * 
     */
    @InputImport(name="webCategories")
      private final @Nullable List<String> webCategories;

    public List<String> getWebCategories() {
        return this.webCategories == null ? List.of() : this.webCategories;
    }

    public ApplicationRuleResponse(
        @Nullable String description,
        @Nullable List<String> destinationAddresses,
        @Nullable List<String> fqdnTags,
        @Nullable String name,
        @Nullable List<FirewallPolicyRuleApplicationProtocolResponse> protocols,
        String ruleType,
        @Nullable List<String> sourceAddresses,
        @Nullable List<String> sourceIpGroups,
        @Nullable List<String> targetFqdns,
        @Nullable List<String> targetUrls,
        @Nullable Boolean terminateTLS,
        @Nullable List<String> webCategories) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.fqdnTags = fqdnTags;
        this.name = name;
        this.protocols = protocols;
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
        this.targetFqdns = targetFqdns;
        this.targetUrls = targetUrls;
        this.terminateTLS = terminateTLS;
        this.webCategories = webCategories;
    }

    private ApplicationRuleResponse() {
        this.description = null;
        this.destinationAddresses = List.of();
        this.fqdnTags = List.of();
        this.name = null;
        this.protocols = List.of();
        this.ruleType = null;
        this.sourceAddresses = List.of();
        this.sourceIpGroups = List.of();
        this.targetFqdns = List.of();
        this.targetUrls = List.of();
        this.terminateTLS = null;
        this.webCategories = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<String> fqdnTags;
        private @Nullable String name;
        private @Nullable List<FirewallPolicyRuleApplicationProtocolResponse> protocols;
        private String ruleType;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourceIpGroups;
        private @Nullable List<String> targetFqdns;
        private @Nullable List<String> targetUrls;
        private @Nullable Boolean terminateTLS;
        private @Nullable List<String> webCategories;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.fqdnTags = defaults.fqdnTags;
    	      this.name = defaults.name;
    	      this.protocols = defaults.protocols;
    	      this.ruleType = defaults.ruleType;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
    	      this.targetFqdns = defaults.targetFqdns;
    	      this.targetUrls = defaults.targetUrls;
    	      this.terminateTLS = defaults.terminateTLS;
    	      this.webCategories = defaults.webCategories;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }

        public Builder fqdnTags(@Nullable List<String> fqdnTags) {
            this.fqdnTags = fqdnTags;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder protocols(@Nullable List<FirewallPolicyRuleApplicationProtocolResponse> protocols) {
            this.protocols = protocols;
            return this;
        }

        public Builder ruleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }

        public Builder sourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }

        public Builder targetFqdns(@Nullable List<String> targetFqdns) {
            this.targetFqdns = targetFqdns;
            return this;
        }

        public Builder targetUrls(@Nullable List<String> targetUrls) {
            this.targetUrls = targetUrls;
            return this;
        }

        public Builder terminateTLS(@Nullable Boolean terminateTLS) {
            this.terminateTLS = terminateTLS;
            return this;
        }

        public Builder webCategories(@Nullable List<String> webCategories) {
            this.webCategories = webCategories;
            return this;
        }
        public ApplicationRuleResponse build() {
            return new ApplicationRuleResponse(description, destinationAddresses, fqdnTags, name, protocols, ruleType, sourceAddresses, sourceIpGroups, targetFqdns, targetUrls, terminateTLS, webCategories);
        }
    }
}
