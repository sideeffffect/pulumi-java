// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.OrganizationSecurityPolicyType;
import com.pulumi.googlenative.compute_beta.inputs.SecurityPolicyAdaptiveProtectionConfigArgs;
import com.pulumi.googlenative.compute_beta.inputs.SecurityPolicyAdvancedOptionsConfigArgs;
import com.pulumi.googlenative.compute_beta.inputs.SecurityPolicyAssociationArgs;
import com.pulumi.googlenative.compute_beta.inputs.SecurityPolicyRecaptchaOptionsConfigArgs;
import com.pulumi.googlenative.compute_beta.inputs.SecurityPolicyRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationSecurityPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationSecurityPolicyArgs Empty = new OrganizationSecurityPolicyArgs();

    @Import(name="adaptiveProtectionConfig")
    private @Nullable Output<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig;

    public Optional<Output<SecurityPolicyAdaptiveProtectionConfigArgs>> adaptiveProtectionConfig() {
        return Optional.ofNullable(this.adaptiveProtectionConfig);
    }

    @Import(name="advancedOptionsConfig")
    private @Nullable Output<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig;

    public Optional<Output<SecurityPolicyAdvancedOptionsConfigArgs>> advancedOptionsConfig() {
        return Optional.ofNullable(this.advancedOptionsConfig);
    }

    /**
     * A list of associations that belong to this policy.
     * 
     */
    @Import(name="associations")
    private @Nullable Output<List<SecurityPolicyAssociationArgs>> associations;

    public Optional<Output<List<SecurityPolicyAssociationArgs>>> associations() {
        return Optional.ofNullable(this.associations);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User-provided name of the Organization security plicy. The name should be unique in the organization in which the security policy is created. This should only be used when SecurityPolicyType is FIREWALL. The name must be 1-63 characters long, and comply with https://www.ietf.org/rfc/rfc1035.txt. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="parentId")
    private @Nullable Output<String> parentId;

    public Optional<Output<String>> parentId() {
        return Optional.ofNullable(this.parentId);
    }

    @Import(name="recaptchaOptionsConfig")
    private @Nullable Output<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig;

    public Optional<Output<SecurityPolicyRecaptchaOptionsConfigArgs>> recaptchaOptionsConfig() {
        return Optional.ofNullable(this.recaptchaOptionsConfig);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match &#34;*&#34;). If no rules are provided when creating a security policy, a default rule with action &#34;allow&#34; will be added.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<SecurityPolicyRuleArgs>> rules;

    public Optional<Output<List<SecurityPolicyRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * The type indicates the intended use of the security policy. CLOUD_ARMOR - Cloud Armor backend security policies can be configured to filter incoming HTTP requests targeting backend services. They filter requests before they hit the origin servers. CLOUD_ARMOR_EDGE - Cloud Armor edge security policies can be configured to filter incoming HTTP requests targeting backend services (including Cloud CDN-enabled) as well as backend buckets (Cloud Storage). They filter requests before the request is served from Google&#39;s cache.
     * 
     */
    @Import(name="type")
    private @Nullable Output<OrganizationSecurityPolicyType> type;

    public Optional<Output<OrganizationSecurityPolicyType>> type() {
        return Optional.ofNullable(this.type);
    }

    private OrganizationSecurityPolicyArgs() {}

    private OrganizationSecurityPolicyArgs(OrganizationSecurityPolicyArgs $) {
        this.adaptiveProtectionConfig = $.adaptiveProtectionConfig;
        this.advancedOptionsConfig = $.advancedOptionsConfig;
        this.associations = $.associations;
        this.description = $.description;
        this.displayName = $.displayName;
        this.labels = $.labels;
        this.name = $.name;
        this.parentId = $.parentId;
        this.recaptchaOptionsConfig = $.recaptchaOptionsConfig;
        this.requestId = $.requestId;
        this.rules = $.rules;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationSecurityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationSecurityPolicyArgs $;

        public Builder() {
            $ = new OrganizationSecurityPolicyArgs();
        }

        public Builder(OrganizationSecurityPolicyArgs defaults) {
            $ = new OrganizationSecurityPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder adaptiveProtectionConfig(@Nullable Output<SecurityPolicyAdaptiveProtectionConfigArgs> adaptiveProtectionConfig) {
            $.adaptiveProtectionConfig = adaptiveProtectionConfig;
            return this;
        }

        public Builder adaptiveProtectionConfig(SecurityPolicyAdaptiveProtectionConfigArgs adaptiveProtectionConfig) {
            return adaptiveProtectionConfig(Output.of(adaptiveProtectionConfig));
        }

        public Builder advancedOptionsConfig(@Nullable Output<SecurityPolicyAdvancedOptionsConfigArgs> advancedOptionsConfig) {
            $.advancedOptionsConfig = advancedOptionsConfig;
            return this;
        }

        public Builder advancedOptionsConfig(SecurityPolicyAdvancedOptionsConfigArgs advancedOptionsConfig) {
            return advancedOptionsConfig(Output.of(advancedOptionsConfig));
        }

        public Builder associations(@Nullable Output<List<SecurityPolicyAssociationArgs>> associations) {
            $.associations = associations;
            return this;
        }

        public Builder associations(List<SecurityPolicyAssociationArgs> associations) {
            return associations(Output.of(associations));
        }

        public Builder associations(SecurityPolicyAssociationArgs... associations) {
            return associations(List.of(associations));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder parentId(@Nullable Output<String> parentId) {
            $.parentId = parentId;
            return this;
        }

        public Builder parentId(String parentId) {
            return parentId(Output.of(parentId));
        }

        public Builder recaptchaOptionsConfig(@Nullable Output<SecurityPolicyRecaptchaOptionsConfigArgs> recaptchaOptionsConfig) {
            $.recaptchaOptionsConfig = recaptchaOptionsConfig;
            return this;
        }

        public Builder recaptchaOptionsConfig(SecurityPolicyRecaptchaOptionsConfigArgs recaptchaOptionsConfig) {
            return recaptchaOptionsConfig(Output.of(recaptchaOptionsConfig));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder rules(@Nullable Output<List<SecurityPolicyRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<SecurityPolicyRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(SecurityPolicyRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public Builder type(@Nullable Output<OrganizationSecurityPolicyType> type) {
            $.type = type;
            return this;
        }

        public Builder type(OrganizationSecurityPolicyType type) {
            return type(Output.of(type));
        }

        public OrganizationSecurityPolicyArgs build() {
            return $;
        }
    }

}
