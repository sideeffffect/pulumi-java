// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionArgs Empty = new DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionArgs();

    /**
     * A KMS key ARN that is used to encrypt the connection password. If connection password protection is enabled, the caller of CreateConnection and UpdateConnection needs at least `kms:Encrypt` permission on the specified AWS KMS key, to encrypt passwords before storing them in the Data Catalog.
     * 
     */
    @Import(name="awsKmsKeyId")
    private @Nullable Output<String> awsKmsKeyId;

    public Optional<Output<String>> awsKmsKeyId() {
        return Optional.ofNullable(this.awsKmsKeyId);
    }

    /**
     * When set to `true`, passwords remain encrypted in the responses of GetConnection and GetConnections. This encryption takes effect independently of the catalog encryption.
     * 
     */
    @Import(name="returnConnectionPasswordEncrypted", required=true)
    private Output<Boolean> returnConnectionPasswordEncrypted;

    public Output<Boolean> returnConnectionPasswordEncrypted() {
        return this.returnConnectionPasswordEncrypted;
    }

    private DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionArgs() {}

    private DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionArgs(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionArgs $) {
        this.awsKmsKeyId = $.awsKmsKeyId;
        this.returnConnectionPasswordEncrypted = $.returnConnectionPasswordEncrypted;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionArgs $;

        public Builder() {
            $ = new DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionArgs();
        }

        public Builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionArgs defaults) {
            $ = new DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder awsKmsKeyId(@Nullable Output<String> awsKmsKeyId) {
            $.awsKmsKeyId = awsKmsKeyId;
            return this;
        }

        public Builder awsKmsKeyId(String awsKmsKeyId) {
            return awsKmsKeyId(Output.of(awsKmsKeyId));
        }

        public Builder returnConnectionPasswordEncrypted(Output<Boolean> returnConnectionPasswordEncrypted) {
            $.returnConnectionPasswordEncrypted = returnConnectionPasswordEncrypted;
            return this;
        }

        public Builder returnConnectionPasswordEncrypted(Boolean returnConnectionPasswordEncrypted) {
            return returnConnectionPasswordEncrypted(Output.of(returnConnectionPasswordEncrypted));
        }

        public DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionArgs build() {
            $.returnConnectionPasswordEncrypted = Objects.requireNonNull($.returnConnectionPasswordEncrypted, "expected parameter 'returnConnectionPasswordEncrypted' to be non-null");
            return $;
        }
    }

}
