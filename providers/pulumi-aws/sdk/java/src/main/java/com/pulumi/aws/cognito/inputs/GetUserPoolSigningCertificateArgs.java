// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetUserPoolSigningCertificateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserPoolSigningCertificateArgs Empty = new GetUserPoolSigningCertificateArgs();

    /**
     * The Cognito user pool ID.
     * 
     */
    @Import(name="userPoolId", required=true)
    private String userPoolId;

    public String userPoolId() {
        return this.userPoolId;
    }

    private GetUserPoolSigningCertificateArgs() {}

    private GetUserPoolSigningCertificateArgs(GetUserPoolSigningCertificateArgs $) {
        this.userPoolId = $.userPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserPoolSigningCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserPoolSigningCertificateArgs $;

        public Builder() {
            $ = new GetUserPoolSigningCertificateArgs();
        }

        public Builder(GetUserPoolSigningCertificateArgs defaults) {
            $ = new GetUserPoolSigningCertificateArgs(Objects.requireNonNull(defaults));
        }

        public Builder userPoolId(String userPoolId) {
            $.userPoolId = userPoolId;
            return this;
        }

        public GetUserPoolSigningCertificateArgs build() {
            $.userPoolId = Objects.requireNonNull($.userPoolId, "expected parameter 'userPoolId' to be non-null");
            return $;
        }
    }

}
