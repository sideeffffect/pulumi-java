// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the FirewallPolicyNatRuleCollectionAction.
 * 
 */
public final class FirewallPolicyNatRuleCollectionActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyNatRuleCollectionActionResponse Empty = new FirewallPolicyNatRuleCollectionActionResponse();

    /**
     * The type of action.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private FirewallPolicyNatRuleCollectionActionResponse() {}

    private FirewallPolicyNatRuleCollectionActionResponse(FirewallPolicyNatRuleCollectionActionResponse $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyNatRuleCollectionActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyNatRuleCollectionActionResponse $;

        public Builder() {
            $ = new FirewallPolicyNatRuleCollectionActionResponse();
        }

        public Builder(FirewallPolicyNatRuleCollectionActionResponse defaults) {
            $ = new FirewallPolicyNatRuleCollectionActionResponse(Objects.requireNonNull(defaults));
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public FirewallPolicyNatRuleCollectionActionResponse build() {
            return $;
        }
    }

}
