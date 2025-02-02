// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.GetLinuxWebAppLogApplicationLogAzureBlobStorage;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLinuxWebAppLogApplicationLog {
    /**
     * @return A `azure_blob_storage` block as defined above.
     * 
     */
    private final List<GetLinuxWebAppLogApplicationLogAzureBlobStorage> azureBlobStorages;
    /**
     * @return The logging level.
     * 
     */
    private final String fileSystemLevel;

    @CustomType.Constructor
    private GetLinuxWebAppLogApplicationLog(
        @CustomType.Parameter("azureBlobStorages") List<GetLinuxWebAppLogApplicationLogAzureBlobStorage> azureBlobStorages,
        @CustomType.Parameter("fileSystemLevel") String fileSystemLevel) {
        this.azureBlobStorages = azureBlobStorages;
        this.fileSystemLevel = fileSystemLevel;
    }

    /**
     * @return A `azure_blob_storage` block as defined above.
     * 
     */
    public List<GetLinuxWebAppLogApplicationLogAzureBlobStorage> azureBlobStorages() {
        return this.azureBlobStorages;
    }
    /**
     * @return The logging level.
     * 
     */
    public String fileSystemLevel() {
        return this.fileSystemLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxWebAppLogApplicationLog defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetLinuxWebAppLogApplicationLogAzureBlobStorage> azureBlobStorages;
        private String fileSystemLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinuxWebAppLogApplicationLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobStorages = defaults.azureBlobStorages;
    	      this.fileSystemLevel = defaults.fileSystemLevel;
        }

        public Builder azureBlobStorages(List<GetLinuxWebAppLogApplicationLogAzureBlobStorage> azureBlobStorages) {
            this.azureBlobStorages = Objects.requireNonNull(azureBlobStorages);
            return this;
        }
        public Builder azureBlobStorages(GetLinuxWebAppLogApplicationLogAzureBlobStorage... azureBlobStorages) {
            return azureBlobStorages(List.of(azureBlobStorages));
        }
        public Builder fileSystemLevel(String fileSystemLevel) {
            this.fileSystemLevel = Objects.requireNonNull(fileSystemLevel);
            return this;
        }        public GetLinuxWebAppLogApplicationLog build() {
            return new GetLinuxWebAppLogApplicationLog(azureBlobStorages, fileSystemLevel);
        }
    }
}
