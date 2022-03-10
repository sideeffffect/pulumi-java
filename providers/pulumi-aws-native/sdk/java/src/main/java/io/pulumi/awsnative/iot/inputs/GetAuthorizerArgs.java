// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAuthorizerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAuthorizerArgs Empty = new GetAuthorizerArgs();

    @InputImport(name="authorizerName", required=true)
      private final String authorizerName;

    public String getAuthorizerName() {
        return this.authorizerName;
    }

    public GetAuthorizerArgs(String authorizerName) {
        this.authorizerName = Objects.requireNonNull(authorizerName, "expected parameter 'authorizerName' to be non-null");
    }

    private GetAuthorizerArgs() {
        this.authorizerName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorizerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizerName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuthorizerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizerName = defaults.authorizerName;
        }

        public Builder authorizerName(String authorizerName) {
            this.authorizerName = Objects.requireNonNull(authorizerName);
            return this;
        }
        public GetAuthorizerArgs build() {
            return new GetAuthorizerArgs(authorizerName);
        }
    }
}
