// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MiSqlConnectionInfoResponse {
    /**
     * Resource id for Azure SQL database Managed instance
     * 
     */
    private final String managedInstanceResourceId;
    /**
     * Password credential.
     * 
     */
    private final @Nullable String password;
    /**
     * Type of connection info
     * Expected value is 'MiSqlConnectionInfo'.
     * 
     */
    private final String type;
    /**
     * User name
     * 
     */
    private final @Nullable String userName;

    @OutputCustomType.Constructor({"managedInstanceResourceId","password","type","userName"})
    private MiSqlConnectionInfoResponse(
        String managedInstanceResourceId,
        @Nullable String password,
        String type,
        @Nullable String userName) {
        this.managedInstanceResourceId = managedInstanceResourceId;
        this.password = password;
        this.type = type;
        this.userName = userName;
    }

    /**
     * Resource id for Azure SQL database Managed instance
     * 
    */
    public String getManagedInstanceResourceId() {
        return this.managedInstanceResourceId;
    }
    /**
     * Password credential.
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Type of connection info
     * Expected value is 'MiSqlConnectionInfo'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * User name
     * 
    */
    public Optional<String> getUserName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MiSqlConnectionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managedInstanceResourceId;
        private @Nullable String password;
        private String type;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(MiSqlConnectionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedInstanceResourceId = defaults.managedInstanceResourceId;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setManagedInstanceResourceId(String managedInstanceResourceId) {
            this.managedInstanceResourceId = Objects.requireNonNull(managedInstanceResourceId);
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }
        public MiSqlConnectionInfoResponse build() {
            return new MiSqlConnectionInfoResponse(managedInstanceResourceId, password, type, userName);
        }
    }
}
