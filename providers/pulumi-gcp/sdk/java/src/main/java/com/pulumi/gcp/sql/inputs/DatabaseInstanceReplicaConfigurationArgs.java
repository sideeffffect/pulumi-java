// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseInstanceReplicaConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceReplicaConfigurationArgs Empty = new DatabaseInstanceReplicaConfigurationArgs();

    /**
     * PEM representation of the trusted CA&#39;s x509
     * certificate.
     * 
     */
    @Import(name="caCertificate")
    private @Nullable Output<String> caCertificate;

    public Optional<Output<String>> caCertificate() {
        return Optional.ofNullable(this.caCertificate);
    }

    /**
     * PEM representation of the replica&#39;s x509
     * certificate.
     * 
     */
    @Import(name="clientCertificate")
    private @Nullable Output<String> clientCertificate;

    public Optional<Output<String>> clientCertificate() {
        return Optional.ofNullable(this.clientCertificate);
    }

    /**
     * PEM representation of the replica&#39;s private key. The
     * corresponding public key in encoded in the `client_certificate`.
     * 
     */
    @Import(name="clientKey")
    private @Nullable Output<String> clientKey;

    public Optional<Output<String>> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }

    /**
     * The number of seconds
     * between connect retries.
     * 
     */
    @Import(name="connectRetryInterval")
    private @Nullable Output<Integer> connectRetryInterval;

    public Optional<Output<Integer>> connectRetryInterval() {
        return Optional.ofNullable(this.connectRetryInterval);
    }

    /**
     * Path to a SQL file in GCS from which replica
     * instances are created. Format is `gs://bucket/filename`.
     * 
     */
    @Import(name="dumpFilePath")
    private @Nullable Output<String> dumpFilePath;

    public Optional<Output<String>> dumpFilePath() {
        return Optional.ofNullable(this.dumpFilePath);
    }

    /**
     * Specifies if the replica is the failover target.
     * If the field is set to true the replica will be designated as a failover replica.
     * If the master instance fails, the replica instance will be promoted as
     * the new master instance.
     * 
     */
    @Import(name="failoverTarget")
    private @Nullable Output<Boolean> failoverTarget;

    public Optional<Output<Boolean>> failoverTarget() {
        return Optional.ofNullable(this.failoverTarget);
    }

    /**
     * Time in ms between replication
     * heartbeats.
     * 
     */
    @Import(name="masterHeartbeatPeriod")
    private @Nullable Output<Integer> masterHeartbeatPeriod;

    public Optional<Output<Integer>> masterHeartbeatPeriod() {
        return Optional.ofNullable(this.masterHeartbeatPeriod);
    }

    /**
     * Password for the replication connection.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    @Import(name="sslCipher")
    private @Nullable Output<String> sslCipher;

    public Optional<Output<String>> sslCipher() {
        return Optional.ofNullable(this.sslCipher);
    }

    /**
     * Username for replication connection.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    /**
     * True if the master&#39;s common name
     * value is checked during the SSL handshake.
     * 
     */
    @Import(name="verifyServerCertificate")
    private @Nullable Output<Boolean> verifyServerCertificate;

    public Optional<Output<Boolean>> verifyServerCertificate() {
        return Optional.ofNullable(this.verifyServerCertificate);
    }

    private DatabaseInstanceReplicaConfigurationArgs() {}

    private DatabaseInstanceReplicaConfigurationArgs(DatabaseInstanceReplicaConfigurationArgs $) {
        this.caCertificate = $.caCertificate;
        this.clientCertificate = $.clientCertificate;
        this.clientKey = $.clientKey;
        this.connectRetryInterval = $.connectRetryInterval;
        this.dumpFilePath = $.dumpFilePath;
        this.failoverTarget = $.failoverTarget;
        this.masterHeartbeatPeriod = $.masterHeartbeatPeriod;
        this.password = $.password;
        this.sslCipher = $.sslCipher;
        this.username = $.username;
        this.verifyServerCertificate = $.verifyServerCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseInstanceReplicaConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseInstanceReplicaConfigurationArgs $;

        public Builder() {
            $ = new DatabaseInstanceReplicaConfigurationArgs();
        }

        public Builder(DatabaseInstanceReplicaConfigurationArgs defaults) {
            $ = new DatabaseInstanceReplicaConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder caCertificate(@Nullable Output<String> caCertificate) {
            $.caCertificate = caCertificate;
            return this;
        }

        public Builder caCertificate(String caCertificate) {
            return caCertificate(Output.of(caCertificate));
        }

        public Builder clientCertificate(@Nullable Output<String> clientCertificate) {
            $.clientCertificate = clientCertificate;
            return this;
        }

        public Builder clientCertificate(String clientCertificate) {
            return clientCertificate(Output.of(clientCertificate));
        }

        public Builder clientKey(@Nullable Output<String> clientKey) {
            $.clientKey = clientKey;
            return this;
        }

        public Builder clientKey(String clientKey) {
            return clientKey(Output.of(clientKey));
        }

        public Builder connectRetryInterval(@Nullable Output<Integer> connectRetryInterval) {
            $.connectRetryInterval = connectRetryInterval;
            return this;
        }

        public Builder connectRetryInterval(Integer connectRetryInterval) {
            return connectRetryInterval(Output.of(connectRetryInterval));
        }

        public Builder dumpFilePath(@Nullable Output<String> dumpFilePath) {
            $.dumpFilePath = dumpFilePath;
            return this;
        }

        public Builder dumpFilePath(String dumpFilePath) {
            return dumpFilePath(Output.of(dumpFilePath));
        }

        public Builder failoverTarget(@Nullable Output<Boolean> failoverTarget) {
            $.failoverTarget = failoverTarget;
            return this;
        }

        public Builder failoverTarget(Boolean failoverTarget) {
            return failoverTarget(Output.of(failoverTarget));
        }

        public Builder masterHeartbeatPeriod(@Nullable Output<Integer> masterHeartbeatPeriod) {
            $.masterHeartbeatPeriod = masterHeartbeatPeriod;
            return this;
        }

        public Builder masterHeartbeatPeriod(Integer masterHeartbeatPeriod) {
            return masterHeartbeatPeriod(Output.of(masterHeartbeatPeriod));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder sslCipher(@Nullable Output<String> sslCipher) {
            $.sslCipher = sslCipher;
            return this;
        }

        public Builder sslCipher(String sslCipher) {
            return sslCipher(Output.of(sslCipher));
        }

        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public Builder verifyServerCertificate(@Nullable Output<Boolean> verifyServerCertificate) {
            $.verifyServerCertificate = verifyServerCertificate;
            return this;
        }

        public Builder verifyServerCertificate(Boolean verifyServerCertificate) {
            return verifyServerCertificate(Output.of(verifyServerCertificate));
        }

        public DatabaseInstanceReplicaConfigurationArgs build() {
            return $;
        }
    }

}
