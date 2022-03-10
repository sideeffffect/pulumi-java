// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resiliencehub.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAppArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAppArgs Empty = new GetAppArgs();

    /**
     * Amazon Resource Name (ARN) of the App.
     * 
     */
    @InputImport(name="appArn", required=true)
      private final String appArn;

    public String getAppArn() {
        return this.appArn;
    }

    public GetAppArgs(String appArn) {
        this.appArn = Objects.requireNonNull(appArn, "expected parameter 'appArn' to be non-null");
    }

    private GetAppArgs() {
        this.appArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appArn = defaults.appArn;
        }

        public Builder appArn(String appArn) {
            this.appArn = Objects.requireNonNull(appArn);
            return this;
        }
        public GetAppArgs build() {
            return new GetAppArgs(appArn);
        }
    }
}
