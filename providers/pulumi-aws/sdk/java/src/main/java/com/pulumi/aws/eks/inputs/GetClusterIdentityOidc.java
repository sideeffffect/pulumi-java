// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterIdentityOidc extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterIdentityOidc Empty = new GetClusterIdentityOidc();

    /**
     * Issuer URL for the OpenID Connect identity provider.
     * 
     */
    @Import(name="issuer", required=true)
    private String issuer;

    public String issuer() {
        return this.issuer;
    }

    private GetClusterIdentityOidc() {}

    private GetClusterIdentityOidc(GetClusterIdentityOidc $) {
        this.issuer = $.issuer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterIdentityOidc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterIdentityOidc $;

        public Builder() {
            $ = new GetClusterIdentityOidc();
        }

        public Builder(GetClusterIdentityOidc defaults) {
            $ = new GetClusterIdentityOidc(Objects.requireNonNull(defaults));
        }

        public Builder issuer(String issuer) {
            $.issuer = issuer;
            return this;
        }

        public GetClusterIdentityOidc build() {
            $.issuer = Objects.requireNonNull($.issuer, "expected parameter 'issuer' to be non-null");
            return $;
        }
    }

}
