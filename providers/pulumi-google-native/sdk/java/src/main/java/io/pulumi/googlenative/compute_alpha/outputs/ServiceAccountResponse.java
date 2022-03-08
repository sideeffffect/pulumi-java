// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ServiceAccountResponse {
    /**
     * Email address of the service account.
     * 
     */
    private final String email;
    /**
     * The list of scopes to be made available for this service account.
     * 
     */
    private final List<String> scopes;

    @OutputCustomType.Constructor({"email","scopes"})
    private ServiceAccountResponse(
        String email,
        List<String> scopes) {
        this.email = email;
        this.scopes = scopes;
    }

    /**
     * Email address of the service account.
     * 
    */
    public String getEmail() {
        return this.email;
    }
    /**
     * The list of scopes to be made available for this service account.
     * 
    */
    public List<String> getScopes() {
        return this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private List<String> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.scopes = defaults.scopes;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setScopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }
        public ServiceAccountResponse build() {
            return new ServiceAccountResponse(email, scopes);
        }
    }
}
