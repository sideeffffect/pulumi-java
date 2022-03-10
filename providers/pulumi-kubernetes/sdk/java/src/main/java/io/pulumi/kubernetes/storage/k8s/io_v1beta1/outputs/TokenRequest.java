// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TokenRequest {
    /**
     * Audience is the intended audience of the token in "TokenRequestSpec". It will default to the audiences of kube apiserver.
     * 
     */
    private final String audience;
    /**
     * ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec". It has the same default value of "ExpirationSeconds" in "TokenRequestSpec"
     * 
     */
    private final @Nullable Integer expirationSeconds;

    @OutputCustomType.Constructor
    private TokenRequest(
        @OutputCustomType.Parameter("audience") String audience,
        @OutputCustomType.Parameter("expirationSeconds") @Nullable Integer expirationSeconds) {
        this.audience = audience;
        this.expirationSeconds = expirationSeconds;
    }

    /**
     * Audience is the intended audience of the token in "TokenRequestSpec". It will default to the audiences of kube apiserver.
     * 
    */
    public String getAudience() {
        return this.audience;
    }
    /**
     * ExpirationSeconds is the duration of validity of the token in "TokenRequestSpec". It has the same default value of "ExpirationSeconds" in "TokenRequestSpec"
     * 
    */
    public Optional<Integer> getExpirationSeconds() {
        return Optional.ofNullable(this.expirationSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audience;
        private @Nullable Integer expirationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.expirationSeconds = defaults.expirationSeconds;
        }

        public Builder audience(String audience) {
            this.audience = Objects.requireNonNull(audience);
            return this;
        }

        public Builder expirationSeconds(@Nullable Integer expirationSeconds) {
            this.expirationSeconds = expirationSeconds;
            return this;
        }
        public TokenRequest build() {
            return new TokenRequest(audience, expirationSeconds);
        }
    }
}
