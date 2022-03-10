// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information for connecting to SQL database server
 * 
 */
public final class SqlConnectionInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final SqlConnectionInfoResponse Empty = new SqlConnectionInfoResponse();

    /**
     * Additional connection settings
     * 
     */
    @InputImport(name="additionalSettings")
      private final @Nullable String additionalSettings;

    public Optional<String> getAdditionalSettings() {
        return this.additionalSettings == null ? Optional.empty() : Optional.ofNullable(this.additionalSettings);
    }

    /**
     * Authentication type to use for connection
     * 
     */
    @InputImport(name="authentication")
      private final @Nullable String authentication;

    public Optional<String> getAuthentication() {
        return this.authentication == null ? Optional.empty() : Optional.ofNullable(this.authentication);
    }

    /**
     * Data source in the format Protocol:MachineName\SQLServerInstanceName,PortNumber
     * 
     */
    @InputImport(name="dataSource", required=true)
      private final String dataSource;

    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * Whether to encrypt the connection
     * 
     */
    @InputImport(name="encryptConnection")
      private final @Nullable Boolean encryptConnection;

    public Optional<Boolean> getEncryptConnection() {
        return this.encryptConnection == null ? Optional.empty() : Optional.ofNullable(this.encryptConnection);
    }

    /**
     * Password credential.
     * 
     */
    @InputImport(name="password")
      private final @Nullable String password;

    public Optional<String> getPassword() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    /**
     * Server platform type for connection
     * 
     */
    @InputImport(name="platform")
      private final @Nullable String platform;

    public Optional<String> getPlatform() {
        return this.platform == null ? Optional.empty() : Optional.ofNullable(this.platform);
    }

    /**
     * Whether to trust the server certificate
     * 
     */
    @InputImport(name="trustServerCertificate")
      private final @Nullable Boolean trustServerCertificate;

    public Optional<Boolean> getTrustServerCertificate() {
        return this.trustServerCertificate == null ? Optional.empty() : Optional.ofNullable(this.trustServerCertificate);
    }

    /**
     * Type of connection info
     * Expected value is 'SqlConnectionInfo'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * User name
     * 
     */
    @InputImport(name="userName")
      private final @Nullable String userName;

    public Optional<String> getUserName() {
        return this.userName == null ? Optional.empty() : Optional.ofNullable(this.userName);
    }

    public SqlConnectionInfoResponse(
        @Nullable String additionalSettings,
        @Nullable String authentication,
        String dataSource,
        @Nullable Boolean encryptConnection,
        @Nullable String password,
        @Nullable String platform,
        @Nullable Boolean trustServerCertificate,
        String type,
        @Nullable String userName) {
        this.additionalSettings = additionalSettings;
        this.authentication = authentication;
        this.dataSource = Objects.requireNonNull(dataSource, "expected parameter 'dataSource' to be non-null");
        this.encryptConnection = encryptConnection == null ? true : encryptConnection;
        this.password = password;
        this.platform = platform;
        this.trustServerCertificate = trustServerCertificate == null ? false : trustServerCertificate;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private SqlConnectionInfoResponse() {
        this.additionalSettings = null;
        this.authentication = null;
        this.dataSource = null;
        this.encryptConnection = null;
        this.password = null;
        this.platform = null;
        this.trustServerCertificate = null;
        this.type = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlConnectionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String additionalSettings;
        private @Nullable String authentication;
        private String dataSource;
        private @Nullable Boolean encryptConnection;
        private @Nullable String password;
        private @Nullable String platform;
        private @Nullable Boolean trustServerCertificate;
        private String type;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlConnectionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalSettings = defaults.additionalSettings;
    	      this.authentication = defaults.authentication;
    	      this.dataSource = defaults.dataSource;
    	      this.encryptConnection = defaults.encryptConnection;
    	      this.password = defaults.password;
    	      this.platform = defaults.platform;
    	      this.trustServerCertificate = defaults.trustServerCertificate;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder additionalSettings(@Nullable String additionalSettings) {
            this.additionalSettings = additionalSettings;
            return this;
        }

        public Builder authentication(@Nullable String authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder dataSource(String dataSource) {
            this.dataSource = Objects.requireNonNull(dataSource);
            return this;
        }

        public Builder encryptConnection(@Nullable Boolean encryptConnection) {
            this.encryptConnection = encryptConnection;
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder platform(@Nullable String platform) {
            this.platform = platform;
            return this;
        }

        public Builder trustServerCertificate(@Nullable Boolean trustServerCertificate) {
            this.trustServerCertificate = trustServerCertificate;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }
        public SqlConnectionInfoResponse build() {
            return new SqlConnectionInfoResponse(additionalSettings, authentication, dataSource, encryptConnection, password, platform, trustServerCertificate, type, userName);
        }
    }
}
