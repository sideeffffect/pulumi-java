// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import com.pulumi.azurenative.datafactory.inputs.ActivityPolicyResponse;
import com.pulumi.azurenative.datafactory.inputs.AmazonS3CompatibleReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AmazonS3ReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobFSReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobStorageReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureFileStorageReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.DatasetReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.FileServerReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.FtpReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.GoogleCloudStorageReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.HdfsReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.HttpReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.LogStorageSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.OracleCloudStorageReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.SftpReadSettingsResponse;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Delete activity.
 * 
 */
public final class DeleteActivityResponse extends com.pulumi.resources.InvokeArgs {

    public static final DeleteActivityResponse Empty = new DeleteActivityResponse();

    /**
     * Delete activity dataset reference.
     * 
     */
    @Import(name="dataset", required=true)
      private final DatasetReferenceResponse dataset;

    public DatasetReferenceResponse dataset() {
        return this.dataset;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> dependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Whether to record detailed logs of delete-activity execution. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="enableLogging")
      private final @Nullable Object enableLogging;

    public Optional<Object> enableLogging() {
        return this.enableLogging == null ? Optional.empty() : Optional.ofNullable(this.enableLogging);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
      private final @Nullable LinkedServiceReferenceResponse linkedServiceName;

    public Optional<LinkedServiceReferenceResponse> linkedServiceName() {
        return this.linkedServiceName == null ? Optional.empty() : Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * Log storage settings customer need to provide when enableLogging is true.
     * 
     */
    @Import(name="logStorageSettings")
      private final @Nullable LogStorageSettingsResponse logStorageSettings;

    public Optional<LogStorageSettingsResponse> logStorageSettings() {
        return this.logStorageSettings == null ? Optional.empty() : Optional.ofNullable(this.logStorageSettings);
    }

    /**
     * The max concurrent connections to connect data source at the same time.
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Integer maxConcurrentConnections;

    public Optional<Integer> maxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @Import(name="policy")
      private final @Nullable ActivityPolicyResponse policy;

    public Optional<ActivityPolicyResponse> policy() {
        return this.policy == null ? Optional.empty() : Optional.ofNullable(this.policy);
    }

    /**
     * If true, files or sub-folders under current folder path will be deleted recursively. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="recursive")
      private final @Nullable Object recursive;

    public Optional<Object> recursive() {
        return this.recursive == null ? Optional.empty() : Optional.ofNullable(this.recursive);
    }

    /**
     * Delete activity store settings.
     * 
     */
    @Import(name="storeSettings")
      private final @Nullable Object storeSettings;

    public Object storeSettings() {
        return this.storeSettings == null ? null : this.storeSettings;
    }

    /**
     * Type of activity.
     * Expected value is 'Delete'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
      private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> userProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public DeleteActivityResponse(
        DatasetReferenceResponse dataset,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable Object enableLogging,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @Nullable LogStorageSettingsResponse logStorageSettings,
        @Nullable Integer maxConcurrentConnections,
        String name,
        @Nullable ActivityPolicyResponse policy,
        @Nullable Object recursive,
        @Nullable Object storeSettings,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.dataset = Objects.requireNonNull(dataset, "expected parameter 'dataset' to be non-null");
        this.dependsOn = dependsOn;
        this.description = description;
        this.enableLogging = enableLogging;
        this.linkedServiceName = linkedServiceName;
        this.logStorageSettings = logStorageSettings;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.recursive = recursive;
        this.storeSettings = storeSettings;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private DeleteActivityResponse() {
        this.dataset = null;
        this.dependsOn = List.of();
        this.description = null;
        this.enableLogging = null;
        this.linkedServiceName = null;
        this.logStorageSettings = null;
        this.maxConcurrentConnections = null;
        this.name = null;
        this.policy = null;
        this.recursive = null;
        this.storeSettings = null;
        this.type = null;
        this.userProperties = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeleteActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetReferenceResponse dataset;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Object enableLogging;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable LogStorageSettingsResponse logStorageSettings;
        private @Nullable Integer maxConcurrentConnections;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable Object recursive;
        private @Nullable Object storeSettings;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(DeleteActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.enableLogging = defaults.enableLogging;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.logStorageSettings = defaults.logStorageSettings;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.recursive = defaults.recursive;
    	      this.storeSettings = defaults.storeSettings;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder dataset(DatasetReferenceResponse dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder enableLogging(@Nullable Object enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }
        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }
        public Builder logStorageSettings(@Nullable LogStorageSettingsResponse logStorageSettings) {
            this.logStorageSettings = logStorageSettings;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Integer maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }
        public Builder recursive(@Nullable Object recursive) {
            this.recursive = recursive;
            return this;
        }
        public Builder storeSettings(@Nullable Object storeSettings) {
            this.storeSettings = storeSettings;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }        public DeleteActivityResponse build() {
            return new DeleteActivityResponse(dataset, dependsOn, description, enableLogging, linkedServiceName, logStorageSettings, maxConcurrentConnections, name, policy, recursive, storeSettings, type, userProperties);
        }
    }
}
