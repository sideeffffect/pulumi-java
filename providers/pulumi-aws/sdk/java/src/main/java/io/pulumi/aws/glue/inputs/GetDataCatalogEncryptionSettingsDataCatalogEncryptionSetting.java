// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption;
import io.pulumi.aws.glue.inputs.GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting extends io.pulumi.resources.InvokeArgs {

    public static final GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting Empty = new GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting();

    /**
     * When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption. see Connection Password Encryption.
     * 
     */
    @InputImport(name="connectionPasswordEncryptions", required=true)
      private final List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption> connectionPasswordEncryptions;

    public List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption> getConnectionPasswordEncryptions() {
        return this.connectionPasswordEncryptions;
    }

    /**
     * Specifies the encryption-at-rest configuration for the Data Catalog. see Encryption At Rest.
     * 
     */
    @InputImport(name="encryptionAtRests", required=true)
      private final List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest> encryptionAtRests;

    public List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest> getEncryptionAtRests() {
        return this.encryptionAtRests;
    }

    public GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting(
        List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption> connectionPasswordEncryptions,
        List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest> encryptionAtRests) {
        this.connectionPasswordEncryptions = Objects.requireNonNull(connectionPasswordEncryptions, "expected parameter 'connectionPasswordEncryptions' to be non-null");
        this.encryptionAtRests = Objects.requireNonNull(encryptionAtRests, "expected parameter 'encryptionAtRests' to be non-null");
    }

    private GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting() {
        this.connectionPasswordEncryptions = List.of();
        this.encryptionAtRests = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption> connectionPasswordEncryptions;
        private List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest> encryptionAtRests;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPasswordEncryptions = defaults.connectionPasswordEncryptions;
    	      this.encryptionAtRests = defaults.encryptionAtRests;
        }

        public Builder connectionPasswordEncryptions(List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingConnectionPasswordEncryption> connectionPasswordEncryptions) {
            this.connectionPasswordEncryptions = Objects.requireNonNull(connectionPasswordEncryptions);
            return this;
        }

        public Builder encryptionAtRests(List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSettingEncryptionAtRest> encryptionAtRests) {
            this.encryptionAtRests = Objects.requireNonNull(encryptionAtRests);
            return this;
        }
        public GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting build() {
            return new GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting(connectionPasswordEncryptions, encryptionAtRests);
        }
    }
}
