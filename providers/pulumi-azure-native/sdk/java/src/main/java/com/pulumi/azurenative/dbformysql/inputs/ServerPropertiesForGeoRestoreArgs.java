// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbformysql.inputs;

import com.pulumi.azurenative.dbformysql.enums.InfrastructureEncryption;
import com.pulumi.azurenative.dbformysql.enums.MinimalTlsVersionEnum;
import com.pulumi.azurenative.dbformysql.enums.PublicNetworkAccessEnum;
import com.pulumi.azurenative.dbformysql.enums.ServerVersion;
import com.pulumi.azurenative.dbformysql.enums.SslEnforcementEnum;
import com.pulumi.azurenative.dbformysql.inputs.StorageProfileArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties used to create a new server by restoring to a different region from a geo replicated backup.
 * 
 */
public final class ServerPropertiesForGeoRestoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerPropertiesForGeoRestoreArgs Empty = new ServerPropertiesForGeoRestoreArgs();

    /**
     * The mode to create a new server.
     * Expected value is &#39;GeoRestore&#39;.
     * 
     */
    @Import(name="createMode", required=true)
    private Output<String> createMode;

    public Output<String> createMode() {
        return this.createMode;
    }

    /**
     * Status showing whether the server enabled infrastructure encryption.
     * 
     */
    @Import(name="infrastructureEncryption")
    private @Nullable Output<Either<String,InfrastructureEncryption>> infrastructureEncryption;

    public Optional<Output<Either<String,InfrastructureEncryption>>> infrastructureEncryption() {
        return Optional.ofNullable(this.infrastructureEncryption);
    }

    /**
     * Enforce a minimal Tls version for the server.
     * 
     */
    @Import(name="minimalTlsVersion")
    private @Nullable Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion;

    public Optional<Output<Either<String,MinimalTlsVersionEnum>>> minimalTlsVersion() {
        return Optional.ofNullable(this.minimalTlsVersion);
    }

    /**
     * Whether or not public network access is allowed for this server. Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    @Import(name="publicNetworkAccess")
    private @Nullable Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess;

    public Optional<Output<Either<String,PublicNetworkAccessEnum>>> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }

    /**
     * The source server id to restore from.
     * 
     */
    @Import(name="sourceServerId", required=true)
    private Output<String> sourceServerId;

    public Output<String> sourceServerId() {
        return this.sourceServerId;
    }

    /**
     * Enable ssl enforcement or not when connect to server.
     * 
     */
    @Import(name="sslEnforcement")
    private @Nullable Output<SslEnforcementEnum> sslEnforcement;

    public Optional<Output<SslEnforcementEnum>> sslEnforcement() {
        return Optional.ofNullable(this.sslEnforcement);
    }

    /**
     * Storage profile of a server.
     * 
     */
    @Import(name="storageProfile")
    private @Nullable Output<StorageProfileArgs> storageProfile;

    public Optional<Output<StorageProfileArgs>> storageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }

    /**
     * Server version.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Either<String,ServerVersion>> version;

    public Optional<Output<Either<String,ServerVersion>>> version() {
        return Optional.ofNullable(this.version);
    }

    private ServerPropertiesForGeoRestoreArgs() {}

    private ServerPropertiesForGeoRestoreArgs(ServerPropertiesForGeoRestoreArgs $) {
        this.createMode = $.createMode;
        this.infrastructureEncryption = $.infrastructureEncryption;
        this.minimalTlsVersion = $.minimalTlsVersion;
        this.publicNetworkAccess = $.publicNetworkAccess;
        this.sourceServerId = $.sourceServerId;
        this.sslEnforcement = $.sslEnforcement;
        this.storageProfile = $.storageProfile;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerPropertiesForGeoRestoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerPropertiesForGeoRestoreArgs $;

        public Builder() {
            $ = new ServerPropertiesForGeoRestoreArgs();
        }

        public Builder(ServerPropertiesForGeoRestoreArgs defaults) {
            $ = new ServerPropertiesForGeoRestoreArgs(Objects.requireNonNull(defaults));
        }

        public Builder createMode(Output<String> createMode) {
            $.createMode = createMode;
            return this;
        }

        public Builder createMode(String createMode) {
            return createMode(Output.of(createMode));
        }

        public Builder infrastructureEncryption(@Nullable Output<Either<String,InfrastructureEncryption>> infrastructureEncryption) {
            $.infrastructureEncryption = infrastructureEncryption;
            return this;
        }

        public Builder infrastructureEncryption(Either<String,InfrastructureEncryption> infrastructureEncryption) {
            return infrastructureEncryption(Output.of(infrastructureEncryption));
        }

        public Builder minimalTlsVersion(@Nullable Output<Either<String,MinimalTlsVersionEnum>> minimalTlsVersion) {
            $.minimalTlsVersion = minimalTlsVersion;
            return this;
        }

        public Builder minimalTlsVersion(Either<String,MinimalTlsVersionEnum> minimalTlsVersion) {
            return minimalTlsVersion(Output.of(minimalTlsVersion));
        }

        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccessEnum>> publicNetworkAccess) {
            $.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder publicNetworkAccess(Either<String,PublicNetworkAccessEnum> publicNetworkAccess) {
            return publicNetworkAccess(Output.of(publicNetworkAccess));
        }

        public Builder sourceServerId(Output<String> sourceServerId) {
            $.sourceServerId = sourceServerId;
            return this;
        }

        public Builder sourceServerId(String sourceServerId) {
            return sourceServerId(Output.of(sourceServerId));
        }

        public Builder sslEnforcement(@Nullable Output<SslEnforcementEnum> sslEnforcement) {
            $.sslEnforcement = sslEnforcement;
            return this;
        }

        public Builder sslEnforcement(SslEnforcementEnum sslEnforcement) {
            return sslEnforcement(Output.of(sslEnforcement));
        }

        public Builder storageProfile(@Nullable Output<StorageProfileArgs> storageProfile) {
            $.storageProfile = storageProfile;
            return this;
        }

        public Builder storageProfile(StorageProfileArgs storageProfile) {
            return storageProfile(Output.of(storageProfile));
        }

        public Builder version(@Nullable Output<Either<String,ServerVersion>> version) {
            $.version = version;
            return this;
        }

        public Builder version(Either<String,ServerVersion> version) {
            return version(Output.of(version));
        }

        public ServerPropertiesForGeoRestoreArgs build() {
            $.createMode = Codegen.stringProp("createMode").output().arg($.createMode).require();
            $.sourceServerId = Objects.requireNonNull($.sourceServerId, "expected parameter 'sourceServerId' to be non-null");
            return $;
        }
    }

}
