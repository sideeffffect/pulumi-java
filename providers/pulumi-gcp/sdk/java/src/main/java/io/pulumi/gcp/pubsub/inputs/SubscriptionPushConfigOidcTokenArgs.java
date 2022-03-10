// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionPushConfigOidcTokenArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionPushConfigOidcTokenArgs Empty = new SubscriptionPushConfigOidcTokenArgs();

    /**
     * Audience to be used when generating OIDC token. The audience claim
     * identifies the recipients that the JWT is intended for. The audience
     * value is a single case-sensitive string. Having multiple values (array)
     * for the audience field is not supported. More info about the OIDC JWT
     * token audience here: https://tools.ietf.org/html/rfc7519#section-4.1.3
     * Note: if not specified, the Push endpoint URL will be used.
     * 
     */
    @InputImport(name="audience")
      private final @Nullable Input<String> audience;

    public Input<String> getAudience() {
        return this.audience == null ? Input.empty() : this.audience;
    }

    /**
     * Service account email to be used for generating the OIDC token.
     * The caller (for subscriptions.create, subscriptions.patch, and
     * subscriptions.modifyPushConfig RPCs) must have the
     * iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    @InputImport(name="serviceAccountEmail", required=true)
      private final Input<String> serviceAccountEmail;

    public Input<String> getServiceAccountEmail() {
        return this.serviceAccountEmail;
    }

    public SubscriptionPushConfigOidcTokenArgs(
        @Nullable Input<String> audience,
        Input<String> serviceAccountEmail) {
        this.audience = audience;
        this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail, "expected parameter 'serviceAccountEmail' to be non-null");
    }

    private SubscriptionPushConfigOidcTokenArgs() {
        this.audience = Input.empty();
        this.serviceAccountEmail = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionPushConfigOidcTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> audience;
        private Input<String> serviceAccountEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionPushConfigOidcTokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
        }

        public Builder audience(@Nullable Input<String> audience) {
            this.audience = audience;
            return this;
        }

        public Builder audience(@Nullable String audience) {
            this.audience = Input.ofNullable(audience);
            return this;
        }

        public Builder serviceAccountEmail(Input<String> serviceAccountEmail) {
            this.serviceAccountEmail = Objects.requireNonNull(serviceAccountEmail);
            return this;
        }

        public Builder serviceAccountEmail(String serviceAccountEmail) {
            this.serviceAccountEmail = Input.of(Objects.requireNonNull(serviceAccountEmail));
            return this;
        }
        public SubscriptionPushConfigOidcTokenArgs build() {
            return new SubscriptionPushConfigOidcTokenArgs(audience, serviceAccountEmail);
        }
    }
}
