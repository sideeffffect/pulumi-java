// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Service Account used as a credential.
 * 
 */
public final class ServiceAccountResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceAccountResponse Empty = new ServiceAccountResponse();

    /**
     * The IAM service account email address like test@myproject.iam.gserviceaccount.com
     * 
     */
    @InputImport(name="email", required=true)
      private final String email;

    public String getEmail() {
        return this.email;
    }

    public ServiceAccountResponse(String email) {
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
    }

    private ServiceAccountResponse() {
        this.email = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
        }

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public ServiceAccountResponse build() {
            return new ServiceAccountResponse(email);
        }
    }
}
