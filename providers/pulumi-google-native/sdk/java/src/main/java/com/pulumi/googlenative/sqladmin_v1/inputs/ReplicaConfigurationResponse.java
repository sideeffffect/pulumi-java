// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.sqladmin_v1.inputs.MySqlReplicaConfigurationResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Read-replica configuration for connecting to the primary instance.
 * 
 */
public final class ReplicaConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReplicaConfigurationResponse Empty = new ReplicaConfigurationResponse();

    /**
     * Specifies if the replica is the failover target. If the field is set to `true`, the replica will be designated as a failover replica. In case the primary instance fails, the replica instance will be promoted as the new primary instance. Only one replica can be specified as failover target, and the replica has to be in different zone with the primary instance.
     * 
     */
    @Import(name="failoverTarget", required=true)
      private final Boolean failoverTarget;

    public Boolean failoverTarget() {
        return this.failoverTarget;
    }

    /**
     * This is always `sql#replicaConfiguration`.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * MySQL specific configuration when replicating from a MySQL on-premises primary instance. Replication configuration information such as the username, password, certificates, and keys are not stored in the instance metadata. The configuration information is used only to set up the replication connection and is stored by MySQL in a file named `master.info` in the data directory.
     * 
     */
    @Import(name="mysqlReplicaConfiguration", required=true)
      private final MySqlReplicaConfigurationResponse mysqlReplicaConfiguration;

    public MySqlReplicaConfigurationResponse mysqlReplicaConfiguration() {
        return this.mysqlReplicaConfiguration;
    }

    public ReplicaConfigurationResponse(
        Boolean failoverTarget,
        String kind,
        MySqlReplicaConfigurationResponse mysqlReplicaConfiguration) {
        this.failoverTarget = Objects.requireNonNull(failoverTarget, "expected parameter 'failoverTarget' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.mysqlReplicaConfiguration = Objects.requireNonNull(mysqlReplicaConfiguration, "expected parameter 'mysqlReplicaConfiguration' to be non-null");
    }

    private ReplicaConfigurationResponse() {
        this.failoverTarget = null;
        this.kind = null;
        this.mysqlReplicaConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean failoverTarget;
        private String kind;
        private MySqlReplicaConfigurationResponse mysqlReplicaConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverTarget = defaults.failoverTarget;
    	      this.kind = defaults.kind;
    	      this.mysqlReplicaConfiguration = defaults.mysqlReplicaConfiguration;
        }

        public Builder failoverTarget(Boolean failoverTarget) {
            this.failoverTarget = Objects.requireNonNull(failoverTarget);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder mysqlReplicaConfiguration(MySqlReplicaConfigurationResponse mysqlReplicaConfiguration) {
            this.mysqlReplicaConfiguration = Objects.requireNonNull(mysqlReplicaConfiguration);
            return this;
        }        public ReplicaConfigurationResponse build() {
            return new ReplicaConfigurationResponse(failoverTarget, kind, mysqlReplicaConfiguration);
        }
    }
}
