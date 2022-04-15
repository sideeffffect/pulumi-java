// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.aws.glue.outputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption;
import io.pulumi.aws.glue.outputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class DataCatalogEncryptionSettingsDataCatalogEncryptionSettings {
    /**
     * When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption. see Connection Password Encryption.
     * 
     */
    private final DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption connectionPasswordEncryption;
    /**
     * Specifies the encryption-at-rest configuration for the Data Catalog. see Encryption At Rest.
     * 
     */
    private final DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest encryptionAtRest;

    @CustomType.Constructor
    private DataCatalogEncryptionSettingsDataCatalogEncryptionSettings(
        @CustomType.Parameter("connectionPasswordEncryption") DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption connectionPasswordEncryption,
        @CustomType.Parameter("encryptionAtRest") DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest encryptionAtRest) {
        this.connectionPasswordEncryption = connectionPasswordEncryption;
        this.encryptionAtRest = encryptionAtRest;
    }

    /**
     * When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption. see Connection Password Encryption.
     * 
    */
    public DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption connectionPasswordEncryption() {
        return this.connectionPasswordEncryption;
    }
    /**
     * Specifies the encryption-at-rest configuration for the Data Catalog. see Encryption At Rest.
     * 
    */
    public DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest encryptionAtRest() {
        return this.encryptionAtRest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption connectionPasswordEncryption;
        private DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest encryptionAtRest;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPasswordEncryption = defaults.connectionPasswordEncryption;
    	      this.encryptionAtRest = defaults.encryptionAtRest;
        }

        public Builder connectionPasswordEncryption(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption connectionPasswordEncryption) {
            this.connectionPasswordEncryption = Objects.requireNonNull(connectionPasswordEncryption);
            return this;
        }
        public Builder encryptionAtRest(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest encryptionAtRest) {
            this.encryptionAtRest = Objects.requireNonNull(encryptionAtRest);
            return this;
        }        public DataCatalogEncryptionSettingsDataCatalogEncryptionSettings build() {
            return new DataCatalogEncryptionSettingsDataCatalogEncryptionSettings(connectionPasswordEncryption, encryptionAtRest);
        }
    }
}
