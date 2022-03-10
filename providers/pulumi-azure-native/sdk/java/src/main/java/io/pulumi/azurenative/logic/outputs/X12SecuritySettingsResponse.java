// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class X12SecuritySettingsResponse {
    /**
     * The authorization qualifier.
     * 
     */
    private final String authorizationQualifier;
    /**
     * The authorization value.
     * 
     */
    private final @Nullable String authorizationValue;
    /**
     * The password value.
     * 
     */
    private final @Nullable String passwordValue;
    /**
     * The security qualifier.
     * 
     */
    private final String securityQualifier;

    @OutputCustomType.Constructor
    private X12SecuritySettingsResponse(
        @OutputCustomType.Parameter("authorizationQualifier") String authorizationQualifier,
        @OutputCustomType.Parameter("authorizationValue") @Nullable String authorizationValue,
        @OutputCustomType.Parameter("passwordValue") @Nullable String passwordValue,
        @OutputCustomType.Parameter("securityQualifier") String securityQualifier) {
        this.authorizationQualifier = authorizationQualifier;
        this.authorizationValue = authorizationValue;
        this.passwordValue = passwordValue;
        this.securityQualifier = securityQualifier;
    }

    /**
     * The authorization qualifier.
     * 
    */
    public String getAuthorizationQualifier() {
        return this.authorizationQualifier;
    }
    /**
     * The authorization value.
     * 
    */
    public Optional<String> getAuthorizationValue() {
        return Optional.ofNullable(this.authorizationValue);
    }
    /**
     * The password value.
     * 
    */
    public Optional<String> getPasswordValue() {
        return Optional.ofNullable(this.passwordValue);
    }
    /**
     * The security qualifier.
     * 
    */
    public String getSecurityQualifier() {
        return this.securityQualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12SecuritySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationQualifier;
        private @Nullable String authorizationValue;
        private @Nullable String passwordValue;
        private String securityQualifier;

        public Builder() {
    	      // Empty
        }

        public Builder(X12SecuritySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationQualifier = defaults.authorizationQualifier;
    	      this.authorizationValue = defaults.authorizationValue;
    	      this.passwordValue = defaults.passwordValue;
    	      this.securityQualifier = defaults.securityQualifier;
        }

        public Builder authorizationQualifier(String authorizationQualifier) {
            this.authorizationQualifier = Objects.requireNonNull(authorizationQualifier);
            return this;
        }

        public Builder authorizationValue(@Nullable String authorizationValue) {
            this.authorizationValue = authorizationValue;
            return this;
        }

        public Builder passwordValue(@Nullable String passwordValue) {
            this.passwordValue = passwordValue;
            return this;
        }

        public Builder securityQualifier(String securityQualifier) {
            this.securityQualifier = Objects.requireNonNull(securityQualifier);
            return this;
        }
        public X12SecuritySettingsResponse build() {
            return new X12SecuritySettingsResponse(authorizationQualifier, authorizationValue, passwordValue, securityQualifier);
        }
    }
}
