// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatabaseInstanceReplicaConfiguration {
    /**
     * PEM representation of the trusted CA's x509
     * certificate.
     * 
     */
    private final @Nullable String caCertificate;
    /**
     * PEM representation of the replica's x509
     * certificate.
     * 
     */
    private final @Nullable String clientCertificate;
    /**
     * PEM representation of the replica's private key. The
     * corresponding public key in encoded in the `client_certificate`.
     * 
     */
    private final @Nullable String clientKey;
    /**
     * The number of seconds
     * between connect retries.
     * 
     */
    private final @Nullable Integer connectRetryInterval;
    /**
     * Path to a SQL file in GCS from which replica
     * instances are created. Format is `gs://bucket/filename`.
     * 
     */
    private final @Nullable String dumpFilePath;
    /**
     * Specifies if the replica is the failover target.
     * If the field is set to true the replica will be designated as a failover replica.
     * If the master instance fails, the replica instance will be promoted as
     * the new master instance.
     * 
     */
    private final @Nullable Boolean failoverTarget;
    /**
     * Time in ms between replication
     * heartbeats.
     * 
     */
    private final @Nullable Integer masterHeartbeatPeriod;
    /**
     * Password for the replication connection.
     * 
     */
    private final @Nullable String password;
    private final @Nullable String sslCipher;
    /**
     * Username for replication connection.
     * 
     */
    private final @Nullable String username;
    /**
     * True if the master's common name
     * value is checked during the SSL handshake.
     * 
     */
    private final @Nullable Boolean verifyServerCertificate;

    @OutputCustomType.Constructor
    private DatabaseInstanceReplicaConfiguration(
        @OutputCustomType.Parameter("caCertificate") @Nullable String caCertificate,
        @OutputCustomType.Parameter("clientCertificate") @Nullable String clientCertificate,
        @OutputCustomType.Parameter("clientKey") @Nullable String clientKey,
        @OutputCustomType.Parameter("connectRetryInterval") @Nullable Integer connectRetryInterval,
        @OutputCustomType.Parameter("dumpFilePath") @Nullable String dumpFilePath,
        @OutputCustomType.Parameter("failoverTarget") @Nullable Boolean failoverTarget,
        @OutputCustomType.Parameter("masterHeartbeatPeriod") @Nullable Integer masterHeartbeatPeriod,
        @OutputCustomType.Parameter("password") @Nullable String password,
        @OutputCustomType.Parameter("sslCipher") @Nullable String sslCipher,
        @OutputCustomType.Parameter("username") @Nullable String username,
        @OutputCustomType.Parameter("verifyServerCertificate") @Nullable Boolean verifyServerCertificate) {
        this.caCertificate = caCertificate;
        this.clientCertificate = clientCertificate;
        this.clientKey = clientKey;
        this.connectRetryInterval = connectRetryInterval;
        this.dumpFilePath = dumpFilePath;
        this.failoverTarget = failoverTarget;
        this.masterHeartbeatPeriod = masterHeartbeatPeriod;
        this.password = password;
        this.sslCipher = sslCipher;
        this.username = username;
        this.verifyServerCertificate = verifyServerCertificate;
    }

    /**
     * PEM representation of the trusted CA's x509
     * certificate.
     * 
    */
    public Optional<String> getCaCertificate() {
        return Optional.ofNullable(this.caCertificate);
    }
    /**
     * PEM representation of the replica's x509
     * certificate.
     * 
    */
    public Optional<String> getClientCertificate() {
        return Optional.ofNullable(this.clientCertificate);
    }
    /**
     * PEM representation of the replica's private key. The
     * corresponding public key in encoded in the `client_certificate`.
     * 
    */
    public Optional<String> getClientKey() {
        return Optional.ofNullable(this.clientKey);
    }
    /**
     * The number of seconds
     * between connect retries.
     * 
    */
    public Optional<Integer> getConnectRetryInterval() {
        return Optional.ofNullable(this.connectRetryInterval);
    }
    /**
     * Path to a SQL file in GCS from which replica
     * instances are created. Format is `gs://bucket/filename`.
     * 
    */
    public Optional<String> getDumpFilePath() {
        return Optional.ofNullable(this.dumpFilePath);
    }
    /**
     * Specifies if the replica is the failover target.
     * If the field is set to true the replica will be designated as a failover replica.
     * If the master instance fails, the replica instance will be promoted as
     * the new master instance.
     * 
    */
    public Optional<Boolean> getFailoverTarget() {
        return Optional.ofNullable(this.failoverTarget);
    }
    /**
     * Time in ms between replication
     * heartbeats.
     * 
    */
    public Optional<Integer> getMasterHeartbeatPeriod() {
        return Optional.ofNullable(this.masterHeartbeatPeriod);
    }
    /**
     * Password for the replication connection.
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    public Optional<String> getSslCipher() {
        return Optional.ofNullable(this.sslCipher);
    }
    /**
     * Username for replication connection.
     * 
    */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }
    /**
     * True if the master's common name
     * value is checked during the SSL handshake.
     * 
    */
    public Optional<Boolean> getVerifyServerCertificate() {
        return Optional.ofNullable(this.verifyServerCertificate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceReplicaConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caCertificate;
        private @Nullable String clientCertificate;
        private @Nullable String clientKey;
        private @Nullable Integer connectRetryInterval;
        private @Nullable String dumpFilePath;
        private @Nullable Boolean failoverTarget;
        private @Nullable Integer masterHeartbeatPeriod;
        private @Nullable String password;
        private @Nullable String sslCipher;
        private @Nullable String username;
        private @Nullable Boolean verifyServerCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceReplicaConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificate = defaults.caCertificate;
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientKey = defaults.clientKey;
    	      this.connectRetryInterval = defaults.connectRetryInterval;
    	      this.dumpFilePath = defaults.dumpFilePath;
    	      this.failoverTarget = defaults.failoverTarget;
    	      this.masterHeartbeatPeriod = defaults.masterHeartbeatPeriod;
    	      this.password = defaults.password;
    	      this.sslCipher = defaults.sslCipher;
    	      this.username = defaults.username;
    	      this.verifyServerCertificate = defaults.verifyServerCertificate;
        }

        public Builder caCertificate(@Nullable String caCertificate) {
            this.caCertificate = caCertificate;
            return this;
        }

        public Builder clientCertificate(@Nullable String clientCertificate) {
            this.clientCertificate = clientCertificate;
            return this;
        }

        public Builder clientKey(@Nullable String clientKey) {
            this.clientKey = clientKey;
            return this;
        }

        public Builder connectRetryInterval(@Nullable Integer connectRetryInterval) {
            this.connectRetryInterval = connectRetryInterval;
            return this;
        }

        public Builder dumpFilePath(@Nullable String dumpFilePath) {
            this.dumpFilePath = dumpFilePath;
            return this;
        }

        public Builder failoverTarget(@Nullable Boolean failoverTarget) {
            this.failoverTarget = failoverTarget;
            return this;
        }

        public Builder masterHeartbeatPeriod(@Nullable Integer masterHeartbeatPeriod) {
            this.masterHeartbeatPeriod = masterHeartbeatPeriod;
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder sslCipher(@Nullable String sslCipher) {
            this.sslCipher = sslCipher;
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }

        public Builder verifyServerCertificate(@Nullable Boolean verifyServerCertificate) {
            this.verifyServerCertificate = verifyServerCertificate;
            return this;
        }
        public DatabaseInstanceReplicaConfiguration build() {
            return new DatabaseInstanceReplicaConfiguration(caCertificate, clientCertificate, clientKey, connectRetryInterval, dumpFilePath, failoverTarget, masterHeartbeatPeriod, password, sslCipher, username, verifyServerCertificate);
        }
    }
}
