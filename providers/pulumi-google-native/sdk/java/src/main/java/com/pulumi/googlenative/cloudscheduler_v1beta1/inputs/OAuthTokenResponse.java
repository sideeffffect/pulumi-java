// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudscheduler_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information needed for generating an [OAuth token](https://developers.google.com/identity/protocols/OAuth2). This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
 * 
 */
public final class OAuthTokenResponse extends com.pulumi.resources.InvokeArgs {

    public static final OAuthTokenResponse Empty = new OAuthTokenResponse();

    /**
     * OAuth scope to be used for generating OAuth access token. If not specified, &#34;https://www.googleapis.com/auth/cloud-platform&#34; will be used.
     * 
     */
    @Import(name="scope", required=true)
    private String scope;

    public String scope() {
        return this.scope;
    }

    /**
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OAuth token. The service account must be within the same project as the job. The caller must have iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    @Import(name="serviceAccountEmail", required=true)
    private String serviceAccountEmail;

    public String serviceAccountEmail() {
        return this.serviceAccountEmail;
    }

    private OAuthTokenResponse() {}

    private OAuthTokenResponse(OAuthTokenResponse $) {
        this.scope = $.scope;
        this.serviceAccountEmail = $.serviceAccountEmail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OAuthTokenResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OAuthTokenResponse $;

        public Builder() {
            $ = new OAuthTokenResponse();
        }

        public Builder(OAuthTokenResponse defaults) {
            $ = new OAuthTokenResponse(Objects.requireNonNull(defaults));
        }

        public Builder scope(String scope) {
            $.scope = scope;
            return this;
        }

        public Builder serviceAccountEmail(String serviceAccountEmail) {
            $.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        public OAuthTokenResponse build() {
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            $.serviceAccountEmail = Objects.requireNonNull($.serviceAccountEmail, "expected parameter 'serviceAccountEmail' to be non-null");
            return $;
        }
    }

}
