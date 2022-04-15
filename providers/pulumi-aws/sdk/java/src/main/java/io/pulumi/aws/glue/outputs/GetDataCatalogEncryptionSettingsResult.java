// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.aws.glue.outputs.GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDataCatalogEncryptionSettingsResult {
    private final String catalogId;
    /**
     * The security configuration to set. see Data Catalog Encryption Settings.
     * 
     */
    private final List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting> dataCatalogEncryptionSettings;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetDataCatalogEncryptionSettingsResult(
        @CustomType.Parameter("catalogId") String catalogId,
        @CustomType.Parameter("dataCatalogEncryptionSettings") List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting> dataCatalogEncryptionSettings,
        @CustomType.Parameter("id") String id) {
        this.catalogId = catalogId;
        this.dataCatalogEncryptionSettings = dataCatalogEncryptionSettings;
        this.id = id;
    }

    public String catalogId() {
        return this.catalogId;
    }
    /**
     * The security configuration to set. see Data Catalog Encryption Settings.
     * 
    */
    public List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting> dataCatalogEncryptionSettings() {
        return this.dataCatalogEncryptionSettings;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCatalogEncryptionSettingsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalogId;
        private List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting> dataCatalogEncryptionSettings;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCatalogEncryptionSettingsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.dataCatalogEncryptionSettings = defaults.dataCatalogEncryptionSettings;
    	      this.id = defaults.id;
        }

        public Builder catalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }
        public Builder dataCatalogEncryptionSettings(List<GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting> dataCatalogEncryptionSettings) {
            this.dataCatalogEncryptionSettings = Objects.requireNonNull(dataCatalogEncryptionSettings);
            return this;
        }
        public Builder dataCatalogEncryptionSettings(GetDataCatalogEncryptionSettingsDataCatalogEncryptionSetting... dataCatalogEncryptionSettings) {
            return dataCatalogEncryptionSettings(List.of(dataCatalogEncryptionSettings));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetDataCatalogEncryptionSettingsResult build() {
            return new GetDataCatalogEncryptionSettingsResult(catalogId, dataCatalogEncryptionSettings, id);
        }
    }
}
