// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input for the task that validates connection to SQL Server and also validates source server requirements
 * 
 */
public final class ConnectToSourceSqlServerTaskInputResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConnectToSourceSqlServerTaskInputResponse Empty = new ConnectToSourceSqlServerTaskInputResponse();

    /**
     * Permission group for validations
     * 
     */
    @Import(name="checkPermissionsGroup")
      private final @Nullable String checkPermissionsGroup;

    public Optional<String> checkPermissionsGroup() {
        return this.checkPermissionsGroup == null ? Optional.empty() : Optional.ofNullable(this.checkPermissionsGroup);
    }

    /**
     * Flag for whether to collect agent jobs from source server.
     * 
     */
    @Import(name="collectAgentJobs")
      private final @Nullable Boolean collectAgentJobs;

    public Optional<Boolean> collectAgentJobs() {
        return this.collectAgentJobs == null ? Optional.empty() : Optional.ofNullable(this.collectAgentJobs);
    }

    /**
     * Flag for whether to collect logins from source server.
     * 
     */
    @Import(name="collectLogins")
      private final @Nullable Boolean collectLogins;

    public Optional<Boolean> collectLogins() {
        return this.collectLogins == null ? Optional.empty() : Optional.ofNullable(this.collectLogins);
    }

    /**
     * Connection information for Source SQL Server
     * 
     */
    @Import(name="sourceConnectionInfo", required=true)
      private final SqlConnectionInfoResponse sourceConnectionInfo;

    public SqlConnectionInfoResponse sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    public ConnectToSourceSqlServerTaskInputResponse(
        @Nullable String checkPermissionsGroup,
        @Nullable Boolean collectAgentJobs,
        @Nullable Boolean collectLogins,
        SqlConnectionInfoResponse sourceConnectionInfo) {
        this.checkPermissionsGroup = checkPermissionsGroup;
        this.collectAgentJobs = collectAgentJobs == null ? false : collectAgentJobs;
        this.collectLogins = collectLogins == null ? false : collectLogins;
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
    }

    private ConnectToSourceSqlServerTaskInputResponse() {
        this.checkPermissionsGroup = null;
        this.collectAgentJobs = null;
        this.collectLogins = null;
        this.sourceConnectionInfo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToSourceSqlServerTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String checkPermissionsGroup;
        private @Nullable Boolean collectAgentJobs;
        private @Nullable Boolean collectLogins;
        private SqlConnectionInfoResponse sourceConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToSourceSqlServerTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkPermissionsGroup = defaults.checkPermissionsGroup;
    	      this.collectAgentJobs = defaults.collectAgentJobs;
    	      this.collectLogins = defaults.collectLogins;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
        }

        public Builder checkPermissionsGroup(@Nullable String checkPermissionsGroup) {
            this.checkPermissionsGroup = checkPermissionsGroup;
            return this;
        }
        public Builder collectAgentJobs(@Nullable Boolean collectAgentJobs) {
            this.collectAgentJobs = collectAgentJobs;
            return this;
        }
        public Builder collectLogins(@Nullable Boolean collectLogins) {
            this.collectLogins = collectLogins;
            return this;
        }
        public Builder sourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }        public ConnectToSourceSqlServerTaskInputResponse build() {
            return new ConnectToSourceSqlServerTaskInputResponse(checkPermissionsGroup, collectAgentJobs, collectLogins, sourceConnectionInfo);
        }
    }
}
