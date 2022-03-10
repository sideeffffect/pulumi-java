// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;


/**
 * SSIS package execution credential.
 * 
 */
public final class SSISExecutionCredentialResponse extends io.pulumi.resources.InvokeArgs {

    public static final SSISExecutionCredentialResponse Empty = new SSISExecutionCredentialResponse();

    /**
     * Domain for windows authentication.
     * 
     */
    @InputImport(name="domain", required=true)
      private final Object domain;

    public Object getDomain() {
        return this.domain;
    }

    /**
     * Password for windows authentication.
     * 
     */
    @InputImport(name="password", required=true)
      private final SecureStringResponse password;

    public SecureStringResponse getPassword() {
        return this.password;
    }

    /**
     * UseName for windows authentication.
     * 
     */
    @InputImport(name="userName", required=true)
      private final Object userName;

    public Object getUserName() {
        return this.userName;
    }

    public SSISExecutionCredentialResponse(
        Object domain,
        SecureStringResponse password,
        Object userName) {
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private SSISExecutionCredentialResponse() {
        this.domain = null;
        this.password = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSISExecutionCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object domain;
        private SecureStringResponse password;
        private Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SSISExecutionCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.password = defaults.password;
    	      this.userName = defaults.userName;
        }

        public Builder domain(Object domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder password(SecureStringResponse password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder userName(Object userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public SSISExecutionCredentialResponse build() {
            return new SSISExecutionCredentialResponse(domain, password, userName);
        }
    }
}
