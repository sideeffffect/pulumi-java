// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExportConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExportConfigurationArgs Empty = new ExportConfigurationArgs();

    /**
     * The name of destination storage account.
     * 
     */
    @InputImport(name="destinationAccountId")
      private final @Nullable Input<String> destinationAccountId;

    public Input<String> getDestinationAccountId() {
        return this.destinationAccountId == null ? Input.empty() : this.destinationAccountId;
    }

    /**
     * The SAS URL for the destination storage container. It must grant write permission.
     * 
     */
    @InputImport(name="destinationAddress")
      private final @Nullable Input<String> destinationAddress;

    public Input<String> getDestinationAddress() {
        return this.destinationAddress == null ? Input.empty() : this.destinationAddress;
    }

    /**
     * The location ID of the destination storage container.
     * 
     */
    @InputImport(name="destinationStorageLocationId")
      private final @Nullable Input<String> destinationStorageLocationId;

    public Input<String> getDestinationStorageLocationId() {
        return this.destinationStorageLocationId == null ? Input.empty() : this.destinationStorageLocationId;
    }

    /**
     * The subscription ID of the destination storage container.
     * 
     */
    @InputImport(name="destinationStorageSubscriptionId")
      private final @Nullable Input<String> destinationStorageSubscriptionId;

    public Input<String> getDestinationStorageSubscriptionId() {
        return this.destinationStorageSubscriptionId == null ? Input.empty() : this.destinationStorageSubscriptionId;
    }

    /**
     * The Continuous Export destination type. This has to be 'Blob'.
     * 
     */
    @InputImport(name="destinationType")
      private final @Nullable Input<String> destinationType;

    public Input<String> getDestinationType() {
        return this.destinationType == null ? Input.empty() : this.destinationType;
    }

    /**
     * The Continuous Export configuration ID. This is unique within a Application Insights component.
     * 
     */
    @InputImport(name="exportId")
      private final @Nullable Input<String> exportId;

    public Input<String> getExportId() {
        return this.exportId == null ? Input.empty() : this.exportId;
    }

    /**
     * Set to 'true' to create a Continuous Export configuration as enabled, otherwise set it to 'false'.
     * 
     */
    @InputImport(name="isEnabled")
      private final @Nullable Input<String> isEnabled;

    public Input<String> getIsEnabled() {
        return this.isEnabled == null ? Input.empty() : this.isEnabled;
    }

    /**
     * Deprecated
     * 
     */
    @InputImport(name="notificationQueueEnabled")
      private final @Nullable Input<String> notificationQueueEnabled;

    public Input<String> getNotificationQueueEnabled() {
        return this.notificationQueueEnabled == null ? Input.empty() : this.notificationQueueEnabled;
    }

    /**
     * Deprecated
     * 
     */
    @InputImport(name="notificationQueueUri")
      private final @Nullable Input<String> notificationQueueUri;

    public Input<String> getNotificationQueueUri() {
        return this.notificationQueueUri == null ? Input.empty() : this.notificationQueueUri;
    }

    /**
     * The document types to be exported, as comma separated values. Allowed values include 'Requests', 'Event', 'Exceptions', 'Metrics', 'PageViews', 'PageViewPerformance', 'Rdd', 'PerformanceCounters', 'Availability', 'Messages'.
     * 
     */
    @InputImport(name="recordTypes")
      private final @Nullable Input<String> recordTypes;

    public Input<String> getRecordTypes() {
        return this.recordTypes == null ? Input.empty() : this.recordTypes;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Application Insights component resource.
     * 
     */
    @InputImport(name="resourceName", required=true)
      private final Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName;
    }

    public ExportConfigurationArgs(
        @Nullable Input<String> destinationAccountId,
        @Nullable Input<String> destinationAddress,
        @Nullable Input<String> destinationStorageLocationId,
        @Nullable Input<String> destinationStorageSubscriptionId,
        @Nullable Input<String> destinationType,
        @Nullable Input<String> exportId,
        @Nullable Input<String> isEnabled,
        @Nullable Input<String> notificationQueueEnabled,
        @Nullable Input<String> notificationQueueUri,
        @Nullable Input<String> recordTypes,
        Input<String> resourceGroupName,
        Input<String> resourceName) {
        this.destinationAccountId = destinationAccountId;
        this.destinationAddress = destinationAddress;
        this.destinationStorageLocationId = destinationStorageLocationId;
        this.destinationStorageSubscriptionId = destinationStorageSubscriptionId;
        this.destinationType = destinationType;
        this.exportId = exportId;
        this.isEnabled = isEnabled;
        this.notificationQueueEnabled = notificationQueueEnabled;
        this.notificationQueueUri = notificationQueueUri;
        this.recordTypes = recordTypes;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private ExportConfigurationArgs() {
        this.destinationAccountId = Input.empty();
        this.destinationAddress = Input.empty();
        this.destinationStorageLocationId = Input.empty();
        this.destinationStorageSubscriptionId = Input.empty();
        this.destinationType = Input.empty();
        this.exportId = Input.empty();
        this.isEnabled = Input.empty();
        this.notificationQueueEnabled = Input.empty();
        this.notificationQueueUri = Input.empty();
        this.recordTypes = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> destinationAccountId;
        private @Nullable Input<String> destinationAddress;
        private @Nullable Input<String> destinationStorageLocationId;
        private @Nullable Input<String> destinationStorageSubscriptionId;
        private @Nullable Input<String> destinationType;
        private @Nullable Input<String> exportId;
        private @Nullable Input<String> isEnabled;
        private @Nullable Input<String> notificationQueueEnabled;
        private @Nullable Input<String> notificationQueueUri;
        private @Nullable Input<String> recordTypes;
        private Input<String> resourceGroupName;
        private Input<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationAccountId = defaults.destinationAccountId;
    	      this.destinationAddress = defaults.destinationAddress;
    	      this.destinationStorageLocationId = defaults.destinationStorageLocationId;
    	      this.destinationStorageSubscriptionId = defaults.destinationStorageSubscriptionId;
    	      this.destinationType = defaults.destinationType;
    	      this.exportId = defaults.exportId;
    	      this.isEnabled = defaults.isEnabled;
    	      this.notificationQueueEnabled = defaults.notificationQueueEnabled;
    	      this.notificationQueueUri = defaults.notificationQueueUri;
    	      this.recordTypes = defaults.recordTypes;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder destinationAccountId(@Nullable Input<String> destinationAccountId) {
            this.destinationAccountId = destinationAccountId;
            return this;
        }

        public Builder destinationAccountId(@Nullable String destinationAccountId) {
            this.destinationAccountId = Input.ofNullable(destinationAccountId);
            return this;
        }

        public Builder destinationAddress(@Nullable Input<String> destinationAddress) {
            this.destinationAddress = destinationAddress;
            return this;
        }

        public Builder destinationAddress(@Nullable String destinationAddress) {
            this.destinationAddress = Input.ofNullable(destinationAddress);
            return this;
        }

        public Builder destinationStorageLocationId(@Nullable Input<String> destinationStorageLocationId) {
            this.destinationStorageLocationId = destinationStorageLocationId;
            return this;
        }

        public Builder destinationStorageLocationId(@Nullable String destinationStorageLocationId) {
            this.destinationStorageLocationId = Input.ofNullable(destinationStorageLocationId);
            return this;
        }

        public Builder destinationStorageSubscriptionId(@Nullable Input<String> destinationStorageSubscriptionId) {
            this.destinationStorageSubscriptionId = destinationStorageSubscriptionId;
            return this;
        }

        public Builder destinationStorageSubscriptionId(@Nullable String destinationStorageSubscriptionId) {
            this.destinationStorageSubscriptionId = Input.ofNullable(destinationStorageSubscriptionId);
            return this;
        }

        public Builder destinationType(@Nullable Input<String> destinationType) {
            this.destinationType = destinationType;
            return this;
        }

        public Builder destinationType(@Nullable String destinationType) {
            this.destinationType = Input.ofNullable(destinationType);
            return this;
        }

        public Builder exportId(@Nullable Input<String> exportId) {
            this.exportId = exportId;
            return this;
        }

        public Builder exportId(@Nullable String exportId) {
            this.exportId = Input.ofNullable(exportId);
            return this;
        }

        public Builder isEnabled(@Nullable Input<String> isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(@Nullable String isEnabled) {
            this.isEnabled = Input.ofNullable(isEnabled);
            return this;
        }

        public Builder notificationQueueEnabled(@Nullable Input<String> notificationQueueEnabled) {
            this.notificationQueueEnabled = notificationQueueEnabled;
            return this;
        }

        public Builder notificationQueueEnabled(@Nullable String notificationQueueEnabled) {
            this.notificationQueueEnabled = Input.ofNullable(notificationQueueEnabled);
            return this;
        }

        public Builder notificationQueueUri(@Nullable Input<String> notificationQueueUri) {
            this.notificationQueueUri = notificationQueueUri;
            return this;
        }

        public Builder notificationQueueUri(@Nullable String notificationQueueUri) {
            this.notificationQueueUri = Input.ofNullable(notificationQueueUri);
            return this;
        }

        public Builder recordTypes(@Nullable Input<String> recordTypes) {
            this.recordTypes = recordTypes;
            return this;
        }

        public Builder recordTypes(@Nullable String recordTypes) {
            this.recordTypes = Input.ofNullable(recordTypes);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder resourceName(Input<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder resourceName(String resourceName) {
            this.resourceName = Input.of(Objects.requireNonNull(resourceName));
            return this;
        }
        public ExportConfigurationArgs build() {
            return new ExportConfigurationArgs(destinationAccountId, destinationAddress, destinationStorageLocationId, destinationStorageSubscriptionId, destinationType, exportId, isEnabled, notificationQueueEnabled, notificationQueueUri, recordTypes, resourceGroupName, resourceName);
        }
    }
}
