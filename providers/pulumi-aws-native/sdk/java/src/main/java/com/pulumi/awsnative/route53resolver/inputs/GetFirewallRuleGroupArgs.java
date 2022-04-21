// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53resolver.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallRuleGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallRuleGroupArgs Empty = new GetFirewallRuleGroupArgs();

    /**
     * ResourceId
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    private GetFirewallRuleGroupArgs() {}

    private GetFirewallRuleGroupArgs(GetFirewallRuleGroupArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallRuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallRuleGroupArgs $;

        public Builder() {
            $ = new GetFirewallRuleGroupArgs();
        }

        public Builder(GetFirewallRuleGroupArgs defaults) {
            $ = new GetFirewallRuleGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetFirewallRuleGroupArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
