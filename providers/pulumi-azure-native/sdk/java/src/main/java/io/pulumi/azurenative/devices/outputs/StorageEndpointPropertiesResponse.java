// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StorageEndpointPropertiesResponse {
    /**
     * Specifies authentication type being used for connecting to the storage account.
     * 
     */
    private final @Nullable String authenticationType;
    /**
     * The connection string for the Azure Storage account to which files are uploaded.
     * 
     */
    private final String connectionString;
    /**
     * The name of the root container where you upload files. The container need not exist but should be creatable using the connectionString specified.
     * 
     */
    private final String containerName;
    /**
     * The period of time for which the SAS URI generated by IoT Hub for file upload is valid. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload#file-upload-notification-configuration-options.
     * 
     */
    private final @Nullable String sasTtlAsIso8601;

    @OutputCustomType.Constructor({"authenticationType","connectionString","containerName","sasTtlAsIso8601"})
    private StorageEndpointPropertiesResponse(
        @Nullable String authenticationType,
        String connectionString,
        String containerName,
        @Nullable String sasTtlAsIso8601) {
        this.authenticationType = authenticationType;
        this.connectionString = connectionString;
        this.containerName = containerName;
        this.sasTtlAsIso8601 = sasTtlAsIso8601;
    }

    /**
     * Specifies authentication type being used for connecting to the storage account.
     * 
    */
    public Optional<String> getAuthenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * The connection string for the Azure Storage account to which files are uploaded.
     * 
    */
    public String getConnectionString() {
        return this.connectionString;
    }
    /**
     * The name of the root container where you upload files. The container need not exist but should be creatable using the connectionString specified.
     * 
    */
    public String getContainerName() {
        return this.containerName;
    }
    /**
     * The period of time for which the SAS URI generated by IoT Hub for file upload is valid. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload#file-upload-notification-configuration-options.
     * 
    */
    public Optional<String> getSasTtlAsIso8601() {
        return Optional.ofNullable(this.sasTtlAsIso8601);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageEndpointPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authenticationType;
        private String connectionString;
        private String containerName;
        private @Nullable String sasTtlAsIso8601;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageEndpointPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectionString = defaults.connectionString;
    	      this.containerName = defaults.containerName;
    	      this.sasTtlAsIso8601 = defaults.sasTtlAsIso8601;
        }

        public Builder setAuthenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setConnectionString(String connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setSasTtlAsIso8601(@Nullable String sasTtlAsIso8601) {
            this.sasTtlAsIso8601 = sasTtlAsIso8601;
            return this;
        }
        public StorageEndpointPropertiesResponse build() {
            return new StorageEndpointPropertiesResponse(authenticationType, connectionString, containerName, sasTtlAsIso8601);
        }
    }
}
