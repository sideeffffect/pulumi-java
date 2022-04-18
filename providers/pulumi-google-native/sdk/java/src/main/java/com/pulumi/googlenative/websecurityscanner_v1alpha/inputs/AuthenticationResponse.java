// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.websecurityscanner_v1alpha.inputs.CustomAccountResponse;
import com.pulumi.googlenative.websecurityscanner_v1alpha.inputs.GoogleAccountResponse;
import java.util.Objects;


/**
 * Scan authentication configuration.
 * 
 */
public final class AuthenticationResponse extends com.pulumi.resources.InvokeArgs {

    public static final AuthenticationResponse Empty = new AuthenticationResponse();

    /**
     * Authentication using a custom account.
     * 
     */
    @Import(name="customAccount", required=true)
      private final CustomAccountResponse customAccount;

    public CustomAccountResponse customAccount() {
        return this.customAccount;
    }

    /**
     * Authentication using a Google account.
     * 
     */
    @Import(name="googleAccount", required=true)
      private final GoogleAccountResponse googleAccount;

    public GoogleAccountResponse googleAccount() {
        return this.googleAccount;
    }

    public AuthenticationResponse(
        CustomAccountResponse customAccount,
        GoogleAccountResponse googleAccount) {
        this.customAccount = Objects.requireNonNull(customAccount, "expected parameter 'customAccount' to be non-null");
        this.googleAccount = Objects.requireNonNull(googleAccount, "expected parameter 'googleAccount' to be non-null");
    }

    private AuthenticationResponse() {
        this.customAccount = null;
        this.googleAccount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomAccountResponse customAccount;
        private GoogleAccountResponse googleAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customAccount = defaults.customAccount;
    	      this.googleAccount = defaults.googleAccount;
        }

        public Builder customAccount(CustomAccountResponse customAccount) {
            this.customAccount = Objects.requireNonNull(customAccount);
            return this;
        }
        public Builder googleAccount(GoogleAccountResponse googleAccount) {
            this.googleAccount = Objects.requireNonNull(googleAccount);
            return this;
        }        public AuthenticationResponse build() {
            return new AuthenticationResponse(customAccount, googleAccount);
        }
    }
}
