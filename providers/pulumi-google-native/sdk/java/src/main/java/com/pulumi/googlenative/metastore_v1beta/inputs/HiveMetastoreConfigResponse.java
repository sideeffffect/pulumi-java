// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.metastore_v1beta.inputs.KerberosConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Specifies configuration information specific to running Hive metastore software as the metastore service.
 * 
 */
public final class HiveMetastoreConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final HiveMetastoreConfigResponse Empty = new HiveMetastoreConfigResponse();

    /**
     * A mapping of Hive metastore version to the auxiliary version configuration. When specified, a secondary Hive metastore service is created along with the primary service. All auxiliary versions must be less than the service's primary version. The key is the auxiliary service name and it must match the regular expression a-z?. This means that the first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
     * 
     */
    @Import(name="auxiliaryVersions", required=true)
      private final Map<String,String> auxiliaryVersions;

    public Map<String,String> auxiliaryVersions() {
        return this.auxiliaryVersions;
    }

    /**
     * A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore (configured in hive-site.xml). The mappings override system defaults (some keys cannot be overridden). These overrides are also applied to auxiliary versions and can be further customized in the auxiliary version's AuxiliaryVersionConfig.
     * 
     */
    @Import(name="configOverrides", required=true)
      private final Map<String,String> configOverrides;

    public Map<String,String> configOverrides() {
        return this.configOverrides;
    }

    /**
     * The protocol to use for the metastore service endpoint. If unspecified, defaults to THRIFT.
     * 
     */
    @Import(name="endpointProtocol", required=true)
      private final String endpointProtocol;

    public String endpointProtocol() {
        return this.endpointProtocol;
    }

    /**
     * Information used to configure the Hive metastore service as a service principal in a Kerberos realm. To disable Kerberos, use the UpdateService method and specify this field's path (hive_metastore_config.kerberos_config) in the request's update_mask while omitting this field from the request's service.
     * 
     */
    @Import(name="kerberosConfig", required=true)
      private final KerberosConfigResponse kerberosConfig;

    public KerberosConfigResponse kerberosConfig() {
        return this.kerberosConfig;
    }

    /**
     * Immutable. The Hive metastore schema version.
     * 
     */
    @Import(name="version", required=true)
      private final String version;

    public String version() {
        return this.version;
    }

    public HiveMetastoreConfigResponse(
        Map<String,String> auxiliaryVersions,
        Map<String,String> configOverrides,
        String endpointProtocol,
        KerberosConfigResponse kerberosConfig,
        String version) {
        this.auxiliaryVersions = Objects.requireNonNull(auxiliaryVersions, "expected parameter 'auxiliaryVersions' to be non-null");
        this.configOverrides = Objects.requireNonNull(configOverrides, "expected parameter 'configOverrides' to be non-null");
        this.endpointProtocol = Objects.requireNonNull(endpointProtocol, "expected parameter 'endpointProtocol' to be non-null");
        this.kerberosConfig = Objects.requireNonNull(kerberosConfig, "expected parameter 'kerberosConfig' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private HiveMetastoreConfigResponse() {
        this.auxiliaryVersions = Map.of();
        this.configOverrides = Map.of();
        this.endpointProtocol = null;
        this.kerberosConfig = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HiveMetastoreConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> auxiliaryVersions;
        private Map<String,String> configOverrides;
        private String endpointProtocol;
        private KerberosConfigResponse kerberosConfig;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(HiveMetastoreConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auxiliaryVersions = defaults.auxiliaryVersions;
    	      this.configOverrides = defaults.configOverrides;
    	      this.endpointProtocol = defaults.endpointProtocol;
    	      this.kerberosConfig = defaults.kerberosConfig;
    	      this.version = defaults.version;
        }

        public Builder auxiliaryVersions(Map<String,String> auxiliaryVersions) {
            this.auxiliaryVersions = Objects.requireNonNull(auxiliaryVersions);
            return this;
        }
        public Builder configOverrides(Map<String,String> configOverrides) {
            this.configOverrides = Objects.requireNonNull(configOverrides);
            return this;
        }
        public Builder endpointProtocol(String endpointProtocol) {
            this.endpointProtocol = Objects.requireNonNull(endpointProtocol);
            return this;
        }
        public Builder kerberosConfig(KerberosConfigResponse kerberosConfig) {
            this.kerberosConfig = Objects.requireNonNull(kerberosConfig);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public HiveMetastoreConfigResponse build() {
            return new HiveMetastoreConfigResponse(auxiliaryVersions, configOverrides, endpointProtocol, kerberosConfig, version);
        }
    }
}
