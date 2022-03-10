// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetKeyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetKeyArgs Empty = new GetKeyArgs();

    @InputImport(name="appId", required=true)
      private final String appId;

    public String getAppId() {
        return this.appId;
    }

    @InputImport(name="developerId", required=true)
      private final String developerId;

    public String getDeveloperId() {
        return this.developerId;
    }

    @InputImport(name="keyId", required=true)
      private final String keyId;

    public String getKeyId() {
        return this.keyId;
    }

    @InputImport(name="organizationId", required=true)
      private final String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetKeyArgs(
        String appId,
        String developerId,
        String keyId,
        String organizationId) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.developerId = Objects.requireNonNull(developerId, "expected parameter 'developerId' to be non-null");
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GetKeyArgs() {
        this.appId = null;
        this.developerId = null;
        this.keyId = null;
        this.organizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private String developerId;
        private String keyId;
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.developerId = defaults.developerId;
    	      this.keyId = defaults.keyId;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder developerId(String developerId) {
            this.developerId = Objects.requireNonNull(developerId);
            return this;
        }

        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public GetKeyArgs build() {
            return new GetKeyArgs(appId, developerId, keyId, organizationId);
        }
    }
}
