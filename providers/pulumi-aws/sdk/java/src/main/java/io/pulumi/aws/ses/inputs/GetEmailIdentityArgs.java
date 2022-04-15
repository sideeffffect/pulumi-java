// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEmailIdentityArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEmailIdentityArgs Empty = new GetEmailIdentityArgs();

    /**
     * The email identity.
     * 
     */
    @Import(name="email", required=true)
      private final String email;

    public String email() {
        return this.email;
    }

    public GetEmailIdentityArgs(String email) {
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
    }

    private GetEmailIdentityArgs() {
        this.email = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEmailIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEmailIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
        }

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }        public GetEmailIdentityArgs build() {
            return new GetEmailIdentityArgs(email);
        }
    }
}
