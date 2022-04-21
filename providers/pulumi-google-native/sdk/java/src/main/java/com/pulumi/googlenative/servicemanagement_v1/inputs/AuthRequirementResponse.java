// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * User-defined authentication requirements, including support for [JSON Web Token (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
 * 
 */
public final class AuthRequirementResponse extends com.pulumi.resources.InvokeArgs {

    public static final AuthRequirementResponse Empty = new AuthRequirementResponse();

    /**
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is implemented and accepted in all the runtime components. The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When this setting is absent, only JWTs with audience &#34;https://Service_name/API_name&#34; will be accepted. For example, if no audiences are in the setting, LibraryService API will only accept JWTs with the following audience &#34;https://library-example.googleapis.com/google.example.library.v1.LibraryService&#34;. Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
     * 
     */
    @Import(name="audiences", required=true)
    private String audiences;

    public String audiences() {
        return this.audiences;
    }

    /**
     * id from authentication provider. Example: provider_id: bookstore_auth
     * 
     */
    @Import(name="providerId", required=true)
    private String providerId;

    public String providerId() {
        return this.providerId;
    }

    private AuthRequirementResponse() {}

    private AuthRequirementResponse(AuthRequirementResponse $) {
        this.audiences = $.audiences;
        this.providerId = $.providerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthRequirementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthRequirementResponse $;

        public Builder() {
            $ = new AuthRequirementResponse();
        }

        public Builder(AuthRequirementResponse defaults) {
            $ = new AuthRequirementResponse(Objects.requireNonNull(defaults));
        }

        public Builder audiences(String audiences) {
            $.audiences = audiences;
            return this;
        }

        public Builder providerId(String providerId) {
            $.providerId = providerId;
            return this;
        }

        public AuthRequirementResponse build() {
            $.audiences = Objects.requireNonNull($.audiences, "expected parameter 'audiences' to be non-null");
            $.providerId = Objects.requireNonNull($.providerId, "expected parameter 'providerId' to be non-null");
            return $;
        }
    }

}
