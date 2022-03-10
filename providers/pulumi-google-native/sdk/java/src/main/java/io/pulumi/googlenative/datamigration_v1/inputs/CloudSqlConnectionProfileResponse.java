// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datamigration_v1.inputs.CloudSqlSettingsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies required connection parameters, and, optionally, the parameters required to create a Cloud SQL destination database instance.
 * 
 */
public final class CloudSqlConnectionProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final CloudSqlConnectionProfileResponse Empty = new CloudSqlConnectionProfileResponse();

    /**
     * The Cloud SQL instance ID that this connection profile is associated with.
     * 
     */
    @InputImport(name="cloudSqlId", required=true)
      private final String cloudSqlId;

    public String getCloudSqlId() {
        return this.cloudSqlId;
    }

    /**
     * The Cloud SQL database instance's private IP.
     * 
     */
    @InputImport(name="privateIp", required=true)
      private final String privateIp;

    public String getPrivateIp() {
        return this.privateIp;
    }

    /**
     * The Cloud SQL database instance's public IP.
     * 
     */
    @InputImport(name="publicIp", required=true)
      private final String publicIp;

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * Immutable. Metadata used to create the destination Cloud SQL database.
     * 
     */
    @InputImport(name="settings", required=true)
      private final CloudSqlSettingsResponse settings;

    public CloudSqlSettingsResponse getSettings() {
        return this.settings;
    }

    public CloudSqlConnectionProfileResponse(
        String cloudSqlId,
        String privateIp,
        String publicIp,
        CloudSqlSettingsResponse settings) {
        this.cloudSqlId = Objects.requireNonNull(cloudSqlId, "expected parameter 'cloudSqlId' to be non-null");
        this.privateIp = Objects.requireNonNull(privateIp, "expected parameter 'privateIp' to be non-null");
        this.publicIp = Objects.requireNonNull(publicIp, "expected parameter 'publicIp' to be non-null");
        this.settings = Objects.requireNonNull(settings, "expected parameter 'settings' to be non-null");
    }

    private CloudSqlConnectionProfileResponse() {
        this.cloudSqlId = null;
        this.privateIp = null;
        this.publicIp = null;
        this.settings = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudSqlConnectionProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudSqlId;
        private String privateIp;
        private String publicIp;
        private CloudSqlSettingsResponse settings;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudSqlConnectionProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSqlId = defaults.cloudSqlId;
    	      this.privateIp = defaults.privateIp;
    	      this.publicIp = defaults.publicIp;
    	      this.settings = defaults.settings;
        }

        public Builder cloudSqlId(String cloudSqlId) {
            this.cloudSqlId = Objects.requireNonNull(cloudSqlId);
            return this;
        }

        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }

        public Builder publicIp(String publicIp) {
            this.publicIp = Objects.requireNonNull(publicIp);
            return this;
        }

        public Builder settings(CloudSqlSettingsResponse settings) {
            this.settings = Objects.requireNonNull(settings);
            return this;
        }
        public CloudSqlConnectionProfileResponse build() {
            return new CloudSqlConnectionProfileResponse(cloudSqlId, privateIp, publicIp, settings);
        }
    }
}
