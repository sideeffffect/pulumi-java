// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datamigration_v1beta1.inputs.SqlIpConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Settings for creating a Cloud SQL database instance.
 * 
 */
public final class CloudSqlSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final CloudSqlSettingsResponse Empty = new CloudSqlSettingsResponse();

    /**
     * The activation policy specifies when the instance is activated; it is applicable only when the instance state is &#39;RUNNABLE&#39;. Valid values: &#39;ALWAYS&#39;: The instance is on, and remains so even in the absence of connection requests. `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
     * 
     */
    @Import(name="activationPolicy", required=true)
    private String activationPolicy;

    public String activationPolicy() {
        return this.activationPolicy;
    }

    /**
     * [default: ON] If you enable this setting, Cloud SQL checks your available storage every 30 seconds. If the available storage falls below a threshold size, Cloud SQL automatically adds additional storage capacity. If the available storage repeatedly falls below the threshold size, Cloud SQL continues to add storage until it reaches the maximum of 30 TB.
     * 
     */
    @Import(name="autoStorageIncrease", required=true)
    private Boolean autoStorageIncrease;

    public Boolean autoStorageIncrease() {
        return this.autoStorageIncrease;
    }

    /**
     * The storage capacity available to the database, in GB. The minimum (and default) size is 10GB.
     * 
     */
    @Import(name="dataDiskSizeGb", required=true)
    private String dataDiskSizeGb;

    public String dataDiskSizeGb() {
        return this.dataDiskSizeGb;
    }

    /**
     * The type of storage: `PD_SSD` (default) or `PD_HDD`.
     * 
     */
    @Import(name="dataDiskType", required=true)
    private String dataDiskType;

    public String dataDiskType() {
        return this.dataDiskType;
    }

    /**
     * The database flags passed to the Cloud SQL instance at startup. An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     */
    @Import(name="databaseFlags", required=true)
    private Map<String,String> databaseFlags;

    public Map<String,String> databaseFlags() {
        return this.databaseFlags;
    }

    /**
     * The database engine type and version.
     * 
     */
    @Import(name="databaseVersion", required=true)
    private String databaseVersion;

    public String databaseVersion() {
        return this.databaseVersion;
    }

    /**
     * The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled.
     * 
     */
    @Import(name="ipConfig", required=true)
    private SqlIpConfigResponse ipConfig;

    public SqlIpConfigResponse ipConfig() {
        return this.ipConfig;
    }

    /**
     * Input only. Initial root password.
     * 
     */
    @Import(name="rootPassword", required=true)
    private String rootPassword;

    public String rootPassword() {
        return this.rootPassword;
    }

    /**
     * Indicates If this connection profile root password is stored.
     * 
     */
    @Import(name="rootPasswordSet", required=true)
    private Boolean rootPasswordSet;

    public Boolean rootPasswordSet() {
        return this.rootPasswordSet;
    }

    /**
     * The Database Migration Service source connection profile ID, in the format: `projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID`
     * 
     */
    @Import(name="sourceId", required=true)
    private String sourceId;

    public String sourceId() {
        return this.sourceId;
    }

    /**
     * The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
     * 
     */
    @Import(name="storageAutoResizeLimit", required=true)
    private String storageAutoResizeLimit;

    public String storageAutoResizeLimit() {
        return this.storageAutoResizeLimit;
    }

    /**
     * The tier (or machine type) for this instance, for example: `db-n1-standard-1` (MySQL instances). For more information, see [Cloud SQL Instance Settings](https://cloud.google.com/sql/docs/mysql/instance-settings).
     * 
     */
    @Import(name="tier", required=true)
    private String tier;

    public String tier() {
        return this.tier;
    }

    /**
     * The resource labels for a Cloud SQL instance to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of &#34;key&#34;: &#34;value&#34; pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;18kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
     * 
     */
    @Import(name="userLabels", required=true)
    private Map<String,String> userLabels;

    public Map<String,String> userLabels() {
        return this.userLabels;
    }

    /**
     * The Google Cloud Platform zone where your Cloud SQL datdabse instance is located.
     * 
     */
    @Import(name="zone", required=true)
    private String zone;

    public String zone() {
        return this.zone;
    }

    private CloudSqlSettingsResponse() {}

    private CloudSqlSettingsResponse(CloudSqlSettingsResponse $) {
        this.activationPolicy = $.activationPolicy;
        this.autoStorageIncrease = $.autoStorageIncrease;
        this.dataDiskSizeGb = $.dataDiskSizeGb;
        this.dataDiskType = $.dataDiskType;
        this.databaseFlags = $.databaseFlags;
        this.databaseVersion = $.databaseVersion;
        this.ipConfig = $.ipConfig;
        this.rootPassword = $.rootPassword;
        this.rootPasswordSet = $.rootPasswordSet;
        this.sourceId = $.sourceId;
        this.storageAutoResizeLimit = $.storageAutoResizeLimit;
        this.tier = $.tier;
        this.userLabels = $.userLabels;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudSqlSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudSqlSettingsResponse $;

        public Builder() {
            $ = new CloudSqlSettingsResponse();
        }

        public Builder(CloudSqlSettingsResponse defaults) {
            $ = new CloudSqlSettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder activationPolicy(String activationPolicy) {
            $.activationPolicy = activationPolicy;
            return this;
        }

        public Builder autoStorageIncrease(Boolean autoStorageIncrease) {
            $.autoStorageIncrease = autoStorageIncrease;
            return this;
        }

        public Builder dataDiskSizeGb(String dataDiskSizeGb) {
            $.dataDiskSizeGb = dataDiskSizeGb;
            return this;
        }

        public Builder dataDiskType(String dataDiskType) {
            $.dataDiskType = dataDiskType;
            return this;
        }

        public Builder databaseFlags(Map<String,String> databaseFlags) {
            $.databaseFlags = databaseFlags;
            return this;
        }

        public Builder databaseVersion(String databaseVersion) {
            $.databaseVersion = databaseVersion;
            return this;
        }

        public Builder ipConfig(SqlIpConfigResponse ipConfig) {
            $.ipConfig = ipConfig;
            return this;
        }

        public Builder rootPassword(String rootPassword) {
            $.rootPassword = rootPassword;
            return this;
        }

        public Builder rootPasswordSet(Boolean rootPasswordSet) {
            $.rootPasswordSet = rootPasswordSet;
            return this;
        }

        public Builder sourceId(String sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        public Builder storageAutoResizeLimit(String storageAutoResizeLimit) {
            $.storageAutoResizeLimit = storageAutoResizeLimit;
            return this;
        }

        public Builder tier(String tier) {
            $.tier = tier;
            return this;
        }

        public Builder userLabels(Map<String,String> userLabels) {
            $.userLabels = userLabels;
            return this;
        }

        public Builder zone(String zone) {
            $.zone = zone;
            return this;
        }

        public CloudSqlSettingsResponse build() {
            $.activationPolicy = Objects.requireNonNull($.activationPolicy, "expected parameter 'activationPolicy' to be non-null");
            $.autoStorageIncrease = Objects.requireNonNull($.autoStorageIncrease, "expected parameter 'autoStorageIncrease' to be non-null");
            $.dataDiskSizeGb = Objects.requireNonNull($.dataDiskSizeGb, "expected parameter 'dataDiskSizeGb' to be non-null");
            $.dataDiskType = Objects.requireNonNull($.dataDiskType, "expected parameter 'dataDiskType' to be non-null");
            $.databaseFlags = Objects.requireNonNull($.databaseFlags, "expected parameter 'databaseFlags' to be non-null");
            $.databaseVersion = Objects.requireNonNull($.databaseVersion, "expected parameter 'databaseVersion' to be non-null");
            $.ipConfig = Objects.requireNonNull($.ipConfig, "expected parameter 'ipConfig' to be non-null");
            $.rootPassword = Objects.requireNonNull($.rootPassword, "expected parameter 'rootPassword' to be non-null");
            $.rootPasswordSet = Objects.requireNonNull($.rootPasswordSet, "expected parameter 'rootPasswordSet' to be non-null");
            $.sourceId = Objects.requireNonNull($.sourceId, "expected parameter 'sourceId' to be non-null");
            $.storageAutoResizeLimit = Objects.requireNonNull($.storageAutoResizeLimit, "expected parameter 'storageAutoResizeLimit' to be non-null");
            $.tier = Objects.requireNonNull($.tier, "expected parameter 'tier' to be non-null");
            $.userLabels = Objects.requireNonNull($.userLabels, "expected parameter 'userLabels' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
