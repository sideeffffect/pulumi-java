// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.serviceAccount.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountIdTokenArgs extends InvokeArgs {

    public static final GetAccountIdTokenArgs Empty = new GetAccountIdTokenArgs();

    /**
     * Delegate chain of approvals needed to perform full impersonation. Specify the fully qualified service account name.   Used only when using impersonation mode.
     * 
     */
    @Import(name="delegates")
    private @Nullable List<String> delegates;

    /**
     * @return Delegate chain of approvals needed to perform full impersonation. Specify the fully qualified service account name.   Used only when using impersonation mode.
     * 
     */
    public Optional<List<String>> delegates() {
        return Optional.ofNullable(this.delegates);
    }

    /**
     * Include the verified email in the claim. Used only when using impersonation mode.
     * 
     */
    @Import(name="includeEmail")
    private @Nullable Boolean includeEmail;

    /**
     * @return Include the verified email in the claim. Used only when using impersonation mode.
     * 
     */
    public Optional<Boolean> includeEmail() {
        return Optional.ofNullable(this.includeEmail);
    }

    /**
     * The audience claim for the `id_token`.
     * 
     */
    @Import(name="targetAudience", required=true)
    private String targetAudience;

    /**
     * @return The audience claim for the `id_token`.
     * 
     */
    public String targetAudience() {
        return this.targetAudience;
    }

    /**
     * The email of the service account being impersonated.  Used only when using impersonation mode.
     * 
     */
    @Import(name="targetServiceAccount")
    private @Nullable String targetServiceAccount;

    /**
     * @return The email of the service account being impersonated.  Used only when using impersonation mode.
     * 
     */
    public Optional<String> targetServiceAccount() {
        return Optional.ofNullable(this.targetServiceAccount);
    }

    private GetAccountIdTokenArgs() {}

    private GetAccountIdTokenArgs(GetAccountIdTokenArgs $) {
        this.delegates = $.delegates;
        this.includeEmail = $.includeEmail;
        this.targetAudience = $.targetAudience;
        this.targetServiceAccount = $.targetServiceAccount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountIdTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountIdTokenArgs $;

        public Builder() {
            $ = new GetAccountIdTokenArgs();
        }

        public Builder(GetAccountIdTokenArgs defaults) {
            $ = new GetAccountIdTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param delegates Delegate chain of approvals needed to perform full impersonation. Specify the fully qualified service account name.   Used only when using impersonation mode.
         * 
         * @return builder
         * 
         */
        public Builder delegates(@Nullable List<String> delegates) {
            $.delegates = delegates;
            return this;
        }

        /**
         * @param delegates Delegate chain of approvals needed to perform full impersonation. Specify the fully qualified service account name.   Used only when using impersonation mode.
         * 
         * @return builder
         * 
         */
        public Builder delegates(String... delegates) {
            return delegates(List.of(delegates));
        }

        /**
         * @param includeEmail Include the verified email in the claim. Used only when using impersonation mode.
         * 
         * @return builder
         * 
         */
        public Builder includeEmail(@Nullable Boolean includeEmail) {
            $.includeEmail = includeEmail;
            return this;
        }

        /**
         * @param targetAudience The audience claim for the `id_token`.
         * 
         * @return builder
         * 
         */
        public Builder targetAudience(String targetAudience) {
            $.targetAudience = targetAudience;
            return this;
        }

        /**
         * @param targetServiceAccount The email of the service account being impersonated.  Used only when using impersonation mode.
         * 
         * @return builder
         * 
         */
        public Builder targetServiceAccount(@Nullable String targetServiceAccount) {
            $.targetServiceAccount = targetServiceAccount;
            return this;
        }

        public GetAccountIdTokenArgs build() {
            $.targetAudience = Objects.requireNonNull($.targetAudience, "expected parameter 'targetAudience' to be non-null");
            return $;
        }
    }

}
