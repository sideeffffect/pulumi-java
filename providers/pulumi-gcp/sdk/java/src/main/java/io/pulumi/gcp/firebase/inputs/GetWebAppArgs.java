// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.firebase.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebAppArgs Empty = new GetWebAppArgs();

    /**
     * The app_ip of name of the Firebase webApp.
     * 
     */
    @InputImport(name="appId", required=true)
      private final String appId;

    public String getAppId() {
        return this.appId;
    }

    public GetWebAppArgs(String appId) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
    }

    private GetWebAppArgs() {
        this.appId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
        }

        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public GetWebAppArgs build() {
            return new GetWebAppArgs(appId);
        }
    }
}
