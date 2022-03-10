// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AzureActiveDirectoryAppResponse {
    /**
     * Key used to authenticate to the Azure Active Directory Application
     * 
     */
    private final String appKey;
    /**
     * Application ID of the Azure Active Directory Application
     * 
     */
    private final String applicationId;
    /**
     * Tenant id of the customer
     * 
     */
    private final String tenantId;

    @OutputCustomType.Constructor
    private AzureActiveDirectoryAppResponse(
        @OutputCustomType.Parameter("appKey") String appKey,
        @OutputCustomType.Parameter("applicationId") String applicationId,
        @OutputCustomType.Parameter("tenantId") String tenantId) {
        this.appKey = appKey;
        this.applicationId = applicationId;
        this.tenantId = tenantId;
    }

    /**
     * Key used to authenticate to the Azure Active Directory Application
     * 
    */
    public String getAppKey() {
        return this.appKey;
    }
    /**
     * Application ID of the Azure Active Directory Application
     * 
    */
    public String getApplicationId() {
        return this.applicationId;
    }
    /**
     * Tenant id of the customer
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureActiveDirectoryAppResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appKey;
        private String applicationId;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureActiveDirectoryAppResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appKey = defaults.appKey;
    	      this.applicationId = defaults.applicationId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder appKey(String appKey) {
            this.appKey = Objects.requireNonNull(appKey);
            return this;
        }

        public Builder applicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }

        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public AzureActiveDirectoryAppResponse build() {
            return new AzureActiveDirectoryAppResponse(appKey, applicationId, tenantId);
        }
    }
}
