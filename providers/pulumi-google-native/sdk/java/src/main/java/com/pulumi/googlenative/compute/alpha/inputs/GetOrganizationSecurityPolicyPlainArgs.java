// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationSecurityPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationSecurityPolicyPlainArgs Empty = new GetOrganizationSecurityPolicyPlainArgs();

    @Import(name="securityPolicy", required=true)
    private String securityPolicy;

    public String securityPolicy() {
        return this.securityPolicy;
    }

    private GetOrganizationSecurityPolicyPlainArgs() {}

    private GetOrganizationSecurityPolicyPlainArgs(GetOrganizationSecurityPolicyPlainArgs $) {
        this.securityPolicy = $.securityPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationSecurityPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationSecurityPolicyPlainArgs $;

        public Builder() {
            $ = new GetOrganizationSecurityPolicyPlainArgs();
        }

        public Builder(GetOrganizationSecurityPolicyPlainArgs defaults) {
            $ = new GetOrganizationSecurityPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder securityPolicy(String securityPolicy) {
            $.securityPolicy = securityPolicy;
            return this;
        }

        public GetOrganizationSecurityPolicyPlainArgs build() {
            $.securityPolicy = Objects.requireNonNull($.securityPolicy, "expected parameter 'securityPolicy' to be non-null");
            return $;
        }
    }

}
