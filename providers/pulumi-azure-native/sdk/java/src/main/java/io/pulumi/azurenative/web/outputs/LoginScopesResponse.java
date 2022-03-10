// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class LoginScopesResponse {
    /**
     * A list of the scopes that should be requested while authenticating.
     * 
     */
    private final @Nullable List<String> scopes;

    @OutputCustomType.Constructor
    private LoginScopesResponse(@OutputCustomType.Parameter("scopes") @Nullable List<String> scopes) {
        this.scopes = scopes;
    }

    /**
     * A list of the scopes that should be requested while authenticating.
     * 
    */
    public List<String> getScopes() {
        return this.scopes == null ? List.of() : this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoginScopesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(LoginScopesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scopes = defaults.scopes;
        }

        public Builder scopes(@Nullable List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public LoginScopesResponse build() {
            return new LoginScopesResponse(scopes);
        }
    }
}
