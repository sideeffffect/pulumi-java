// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs Empty = new DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs();

    /**
     * A KMS key ARN that is used to encrypt the connection password. If connection password protection is enabled, the caller of CreateConnection and UpdateConnection needs at least `kms:Encrypt` permission on the specified AWS KMS key, to encrypt passwords before storing them in the Data Catalog.
     * 
     */
    @InputImport(name="awsKmsKeyId")
      private final @Nullable Input<String> awsKmsKeyId;

    public Input<String> getAwsKmsKeyId() {
        return this.awsKmsKeyId == null ? Input.empty() : this.awsKmsKeyId;
    }

    /**
     * When set to `true`, passwords remain encrypted in the responses of GetConnection and GetConnections. This encryption takes effect independently of the catalog encryption.
     * 
     */
    @InputImport(name="returnConnectionPasswordEncrypted", required=true)
      private final Input<Boolean> returnConnectionPasswordEncrypted;

    public Input<Boolean> getReturnConnectionPasswordEncrypted() {
        return this.returnConnectionPasswordEncrypted;
    }

    public DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs(
        @Nullable Input<String> awsKmsKeyId,
        Input<Boolean> returnConnectionPasswordEncrypted) {
        this.awsKmsKeyId = awsKmsKeyId;
        this.returnConnectionPasswordEncrypted = Objects.requireNonNull(returnConnectionPasswordEncrypted, "expected parameter 'returnConnectionPasswordEncrypted' to be non-null");
    }

    private DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs() {
        this.awsKmsKeyId = Input.empty();
        this.returnConnectionPasswordEncrypted = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> awsKmsKeyId;
        private Input<Boolean> returnConnectionPasswordEncrypted;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsKmsKeyId = defaults.awsKmsKeyId;
    	      this.returnConnectionPasswordEncrypted = defaults.returnConnectionPasswordEncrypted;
        }

        public Builder awsKmsKeyId(@Nullable Input<String> awsKmsKeyId) {
            this.awsKmsKeyId = awsKmsKeyId;
            return this;
        }

        public Builder awsKmsKeyId(@Nullable String awsKmsKeyId) {
            this.awsKmsKeyId = Input.ofNullable(awsKmsKeyId);
            return this;
        }

        public Builder returnConnectionPasswordEncrypted(Input<Boolean> returnConnectionPasswordEncrypted) {
            this.returnConnectionPasswordEncrypted = Objects.requireNonNull(returnConnectionPasswordEncrypted);
            return this;
        }

        public Builder returnConnectionPasswordEncrypted(Boolean returnConnectionPasswordEncrypted) {
            this.returnConnectionPasswordEncrypted = Input.of(Objects.requireNonNull(returnConnectionPasswordEncrypted));
            return this;
        }
        public DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs build() {
            return new DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionGetArgs(awsKmsKeyId, returnConnectionPasswordEncrypted);
        }
    }
}
