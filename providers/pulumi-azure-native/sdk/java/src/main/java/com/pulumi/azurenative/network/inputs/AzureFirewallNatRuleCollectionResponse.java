// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.AzureFirewallNatRCActionResponse;
import com.pulumi.azurenative.network.inputs.AzureFirewallNatRuleResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NAT rule collection resource.
 * 
 */
public final class AzureFirewallNatRuleCollectionResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureFirewallNatRuleCollectionResponse Empty = new AzureFirewallNatRuleCollectionResponse();

    /**
     * The action type of a NAT rule collection.
     * 
     */
    @Import(name="action")
    private @Nullable AzureFirewallNatRCActionResponse action;

    public Optional<AzureFirewallNatRCActionResponse> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within the Azure firewall. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Priority of the NAT rule collection resource.
     * 
     */
    @Import(name="priority")
    private @Nullable Integer priority;

    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The provisioning state of the NAT rule collection resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Collection of rules used by a NAT rule collection.
     * 
     */
    @Import(name="rules")
    private @Nullable List<AzureFirewallNatRuleResponse> rules;

    public Optional<List<AzureFirewallNatRuleResponse>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private AzureFirewallNatRuleCollectionResponse() {}

    private AzureFirewallNatRuleCollectionResponse(AzureFirewallNatRuleCollectionResponse $) {
        this.action = $.action;
        this.etag = $.etag;
        this.id = $.id;
        this.name = $.name;
        this.priority = $.priority;
        this.provisioningState = $.provisioningState;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFirewallNatRuleCollectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFirewallNatRuleCollectionResponse $;

        public Builder() {
            $ = new AzureFirewallNatRuleCollectionResponse();
        }

        public Builder(AzureFirewallNatRuleCollectionResponse defaults) {
            $ = new AzureFirewallNatRuleCollectionResponse(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable AzureFirewallNatRCActionResponse action) {
            $.action = action;
            return this;
        }

        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            $.priority = priority;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder rules(@Nullable List<AzureFirewallNatRuleResponse> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(AzureFirewallNatRuleResponse... rules) {
            return rules(List.of(rules));
        }

        public AzureFirewallNatRuleCollectionResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
