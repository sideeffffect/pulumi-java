// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IoTHubFileUpload {
    /**
     * @return The type used to authenticate against the storage account. Possible values are `keyBased` and `identityBased`. Defaults to `keyBased`.
     * 
     */
    private final @Nullable String authenticationType;
    /**
     * @return The connection string for the Azure Storage account to which files are uploaded.
     * 
     */
    private final String connectionString;
    /**
     * @return The name of the root container where the files should be uploaded to. The container need not exist but should be creatable using the connection_string specified.
     * 
     */
    private final String containerName;
    /**
     * @return The period of time for which a file upload notification message is available to consume before it expires, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 48 hours. Defaults to `PT1H`.
     * 
     */
    private final @Nullable String defaultTtl;
    /**
     * @return The ID of the User Managed Identity used to authenticate against the storage account.
     * 
     */
    private final @Nullable String identityId;
    /**
     * @return The lock duration for the file upload notifications queue, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 5 and 300 seconds. Defaults to `PT1M`.
     * 
     */
    private final @Nullable String lockDuration;
    /**
     * @return The number of times the IoT Hub attempts to deliver a file upload notification message. Defaults to `10`.
     * 
     */
    private final @Nullable Integer maxDeliveryCount;
    /**
     * @return Used to specify whether file notifications are sent to IoT Hub on upload. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean notifications;
    /**
     * @return The period of time for which the SAS URI generated by IoT Hub for file upload is valid, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 24 hours. Defaults to `PT1H`.
     * 
     */
    private final @Nullable String sasTtl;

    @CustomType.Constructor
    private IoTHubFileUpload(
        @CustomType.Parameter("authenticationType") @Nullable String authenticationType,
        @CustomType.Parameter("connectionString") String connectionString,
        @CustomType.Parameter("containerName") String containerName,
        @CustomType.Parameter("defaultTtl") @Nullable String defaultTtl,
        @CustomType.Parameter("identityId") @Nullable String identityId,
        @CustomType.Parameter("lockDuration") @Nullable String lockDuration,
        @CustomType.Parameter("maxDeliveryCount") @Nullable Integer maxDeliveryCount,
        @CustomType.Parameter("notifications") @Nullable Boolean notifications,
        @CustomType.Parameter("sasTtl") @Nullable String sasTtl) {
        this.authenticationType = authenticationType;
        this.connectionString = connectionString;
        this.containerName = containerName;
        this.defaultTtl = defaultTtl;
        this.identityId = identityId;
        this.lockDuration = lockDuration;
        this.maxDeliveryCount = maxDeliveryCount;
        this.notifications = notifications;
        this.sasTtl = sasTtl;
    }

    /**
     * @return The type used to authenticate against the storage account. Possible values are `keyBased` and `identityBased`. Defaults to `keyBased`.
     * 
     */
    public Optional<String> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    /**
     * @return The connection string for the Azure Storage account to which files are uploaded.
     * 
     */
    public String connectionString() {
        return this.connectionString;
    }
    /**
     * @return The name of the root container where the files should be uploaded to. The container need not exist but should be creatable using the connection_string specified.
     * 
     */
    public String containerName() {
        return this.containerName;
    }
    /**
     * @return The period of time for which a file upload notification message is available to consume before it expires, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 48 hours. Defaults to `PT1H`.
     * 
     */
    public Optional<String> defaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }
    /**
     * @return The ID of the User Managed Identity used to authenticate against the storage account.
     * 
     */
    public Optional<String> identityId() {
        return Optional.ofNullable(this.identityId);
    }
    /**
     * @return The lock duration for the file upload notifications queue, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 5 and 300 seconds. Defaults to `PT1M`.
     * 
     */
    public Optional<String> lockDuration() {
        return Optional.ofNullable(this.lockDuration);
    }
    /**
     * @return The number of times the IoT Hub attempts to deliver a file upload notification message. Defaults to `10`.
     * 
     */
    public Optional<Integer> maxDeliveryCount() {
        return Optional.ofNullable(this.maxDeliveryCount);
    }
    /**
     * @return Used to specify whether file notifications are sent to IoT Hub on upload. Defaults to `false`.
     * 
     */
    public Optional<Boolean> notifications() {
        return Optional.ofNullable(this.notifications);
    }
    /**
     * @return The period of time for which the SAS URI generated by IoT Hub for file upload is valid, specified as an [ISO 8601 timespan duration](https://en.wikipedia.org/wiki/ISO_8601#Durations). This value must be between 1 minute and 24 hours. Defaults to `PT1H`.
     * 
     */
    public Optional<String> sasTtl() {
        return Optional.ofNullable(this.sasTtl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoTHubFileUpload defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authenticationType;
        private String connectionString;
        private String containerName;
        private @Nullable String defaultTtl;
        private @Nullable String identityId;
        private @Nullable String lockDuration;
        private @Nullable Integer maxDeliveryCount;
        private @Nullable Boolean notifications;
        private @Nullable String sasTtl;

        public Builder() {
    	      // Empty
        }

        public Builder(IoTHubFileUpload defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectionString = defaults.connectionString;
    	      this.containerName = defaults.containerName;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.identityId = defaults.identityId;
    	      this.lockDuration = defaults.lockDuration;
    	      this.maxDeliveryCount = defaults.maxDeliveryCount;
    	      this.notifications = defaults.notifications;
    	      this.sasTtl = defaults.sasTtl;
        }

        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder connectionString(String connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }
        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder defaultTtl(@Nullable String defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }
        public Builder identityId(@Nullable String identityId) {
            this.identityId = identityId;
            return this;
        }
        public Builder lockDuration(@Nullable String lockDuration) {
            this.lockDuration = lockDuration;
            return this;
        }
        public Builder maxDeliveryCount(@Nullable Integer maxDeliveryCount) {
            this.maxDeliveryCount = maxDeliveryCount;
            return this;
        }
        public Builder notifications(@Nullable Boolean notifications) {
            this.notifications = notifications;
            return this;
        }
        public Builder sasTtl(@Nullable String sasTtl) {
            this.sasTtl = sasTtl;
            return this;
        }        public IoTHubFileUpload build() {
            return new IoTHubFileUpload(authenticationType, connectionString, containerName, defaultTtl, identityId, lockDuration, maxDeliveryCount, notifications, sasTtl);
        }
    }
}
