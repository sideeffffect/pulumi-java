// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53resolver.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallDomainListArgs extends InvokeArgs {

    public static final GetFirewallDomainListArgs Empty = new GetFirewallDomainListArgs();

    /**
     * ResourceId
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return ResourceId
     * 
     */
    public String id() {
        return this.id;
    }

    private GetFirewallDomainListArgs() {}

    private GetFirewallDomainListArgs(GetFirewallDomainListArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallDomainListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallDomainListArgs $;

        public Builder() {
            $ = new GetFirewallDomainListArgs();
        }

        public Builder(GetFirewallDomainListArgs defaults) {
            $ = new GetFirewallDomainListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ResourceId
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetFirewallDomainListArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
