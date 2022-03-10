// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The authentication info when authType is secret
 * 
 */
public final class SecretAuthInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretAuthInfoArgs Empty = new SecretAuthInfoArgs();

    /**
     * The authentication type.
     * Expected value is 'secret'.
     * 
     */
    @InputImport(name="authType", required=true)
      private final Input<String> authType;

    public Input<String> getAuthType() {
        return this.authType;
    }

    /**
     * Username or account name for secret auth.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Password or account key for secret auth.
     * 
     */
    @InputImport(name="secret")
      private final @Nullable Input<String> secret;

    public Input<String> getSecret() {
        return this.secret == null ? Input.empty() : this.secret;
    }

    public SecretAuthInfoArgs(
        Input<String> authType,
        @Nullable Input<String> name,
        @Nullable Input<String> secret) {
        this.authType = Objects.requireNonNull(authType, "expected parameter 'authType' to be non-null");
        this.name = name;
        this.secret = secret;
    }

    private SecretAuthInfoArgs() {
        this.authType = Input.empty();
        this.name = Input.empty();
        this.secret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretAuthInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authType;
        private @Nullable Input<String> name;
        private @Nullable Input<String> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretAuthInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
        }

        public Builder authType(Input<String> authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }

        public Builder authType(String authType) {
            this.authType = Input.of(Objects.requireNonNull(authType));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder secret(@Nullable Input<String> secret) {
            this.secret = secret;
            return this;
        }

        public Builder secret(@Nullable String secret) {
            this.secret = Input.ofNullable(secret);
            return this;
        }
        public SecretAuthInfoArgs build() {
            return new SecretAuthInfoArgs(authType, name, secret);
        }
    }
}
