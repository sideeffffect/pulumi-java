// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.sagemaker.inputs.FeatureGroupFeatureDefinitionArgs;
import io.pulumi.aws.sagemaker.inputs.FeatureGroupOfflineStoreConfigArgs;
import io.pulumi.aws.sagemaker.inputs.FeatureGroupOnlineStoreConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureGroupArgs Empty = new FeatureGroupArgs();

    /**
     * A free-form description of a Feature Group.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the feature that stores the EventTime of a Record in a Feature Group.
     * 
     */
    @InputImport(name="eventTimeFeatureName", required=true)
      private final Input<String> eventTimeFeatureName;

    public Input<String> getEventTimeFeatureName() {
        return this.eventTimeFeatureName;
    }

    /**
     * A list of Feature names and types. See Feature Definition Below.
     * 
     */
    @InputImport(name="featureDefinitions", required=true)
      private final Input<List<FeatureGroupFeatureDefinitionArgs>> featureDefinitions;

    public Input<List<FeatureGroupFeatureDefinitionArgs>> getFeatureDefinitions() {
        return this.featureDefinitions;
    }

    /**
     * The name of the Feature Group. The name must be unique within an AWS Region in an AWS account.
     * 
     */
    @InputImport(name="featureGroupName", required=true)
      private final Input<String> featureGroupName;

    public Input<String> getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * The Offline Feature Store Configuration. See Offline Store Config Below.
     * 
     */
    @InputImport(name="offlineStoreConfig")
      private final @Nullable Input<FeatureGroupOfflineStoreConfigArgs> offlineStoreConfig;

    public Input<FeatureGroupOfflineStoreConfigArgs> getOfflineStoreConfig() {
        return this.offlineStoreConfig == null ? Input.empty() : this.offlineStoreConfig;
    }

    /**
     * The Online Feature Store Configuration. See Online Store Config Below.
     * 
     */
    @InputImport(name="onlineStoreConfig")
      private final @Nullable Input<FeatureGroupOnlineStoreConfigArgs> onlineStoreConfig;

    public Input<FeatureGroupOnlineStoreConfigArgs> getOnlineStoreConfig() {
        return this.onlineStoreConfig == null ? Input.empty() : this.onlineStoreConfig;
    }

    /**
     * The name of the Feature whose value uniquely identifies a Record defined in the Feature Store. Only the latest record per identifier value will be stored in the Online Store.
     * 
     */
    @InputImport(name="recordIdentifierFeatureName", required=true)
      private final Input<String> recordIdentifierFeatureName;

    public Input<String> getRecordIdentifierFeatureName() {
        return this.recordIdentifierFeatureName;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM execution role used to persist data into the Offline Store if an `offline_store_config` is provided.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * Map of resource tags for the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public FeatureGroupArgs(
        @Nullable Input<String> description,
        Input<String> eventTimeFeatureName,
        Input<List<FeatureGroupFeatureDefinitionArgs>> featureDefinitions,
        Input<String> featureGroupName,
        @Nullable Input<FeatureGroupOfflineStoreConfigArgs> offlineStoreConfig,
        @Nullable Input<FeatureGroupOnlineStoreConfigArgs> onlineStoreConfig,
        Input<String> recordIdentifierFeatureName,
        Input<String> roleArn,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.eventTimeFeatureName = Objects.requireNonNull(eventTimeFeatureName, "expected parameter 'eventTimeFeatureName' to be non-null");
        this.featureDefinitions = Objects.requireNonNull(featureDefinitions, "expected parameter 'featureDefinitions' to be non-null");
        this.featureGroupName = Objects.requireNonNull(featureGroupName, "expected parameter 'featureGroupName' to be non-null");
        this.offlineStoreConfig = offlineStoreConfig;
        this.onlineStoreConfig = onlineStoreConfig;
        this.recordIdentifierFeatureName = Objects.requireNonNull(recordIdentifierFeatureName, "expected parameter 'recordIdentifierFeatureName' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
    }

    private FeatureGroupArgs() {
        this.description = Input.empty();
        this.eventTimeFeatureName = Input.empty();
        this.featureDefinitions = Input.empty();
        this.featureGroupName = Input.empty();
        this.offlineStoreConfig = Input.empty();
        this.onlineStoreConfig = Input.empty();
        this.recordIdentifierFeatureName = Input.empty();
        this.roleArn = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> eventTimeFeatureName;
        private Input<List<FeatureGroupFeatureDefinitionArgs>> featureDefinitions;
        private Input<String> featureGroupName;
        private @Nullable Input<FeatureGroupOfflineStoreConfigArgs> offlineStoreConfig;
        private @Nullable Input<FeatureGroupOnlineStoreConfigArgs> onlineStoreConfig;
        private Input<String> recordIdentifierFeatureName;
        private Input<String> roleArn;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.eventTimeFeatureName = defaults.eventTimeFeatureName;
    	      this.featureDefinitions = defaults.featureDefinitions;
    	      this.featureGroupName = defaults.featureGroupName;
    	      this.offlineStoreConfig = defaults.offlineStoreConfig;
    	      this.onlineStoreConfig = defaults.onlineStoreConfig;
    	      this.recordIdentifierFeatureName = defaults.recordIdentifierFeatureName;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder eventTimeFeatureName(Input<String> eventTimeFeatureName) {
            this.eventTimeFeatureName = Objects.requireNonNull(eventTimeFeatureName);
            return this;
        }

        public Builder eventTimeFeatureName(String eventTimeFeatureName) {
            this.eventTimeFeatureName = Input.of(Objects.requireNonNull(eventTimeFeatureName));
            return this;
        }

        public Builder featureDefinitions(Input<List<FeatureGroupFeatureDefinitionArgs>> featureDefinitions) {
            this.featureDefinitions = Objects.requireNonNull(featureDefinitions);
            return this;
        }

        public Builder featureDefinitions(List<FeatureGroupFeatureDefinitionArgs> featureDefinitions) {
            this.featureDefinitions = Input.of(Objects.requireNonNull(featureDefinitions));
            return this;
        }

        public Builder featureGroupName(Input<String> featureGroupName) {
            this.featureGroupName = Objects.requireNonNull(featureGroupName);
            return this;
        }

        public Builder featureGroupName(String featureGroupName) {
            this.featureGroupName = Input.of(Objects.requireNonNull(featureGroupName));
            return this;
        }

        public Builder offlineStoreConfig(@Nullable Input<FeatureGroupOfflineStoreConfigArgs> offlineStoreConfig) {
            this.offlineStoreConfig = offlineStoreConfig;
            return this;
        }

        public Builder offlineStoreConfig(@Nullable FeatureGroupOfflineStoreConfigArgs offlineStoreConfig) {
            this.offlineStoreConfig = Input.ofNullable(offlineStoreConfig);
            return this;
        }

        public Builder onlineStoreConfig(@Nullable Input<FeatureGroupOnlineStoreConfigArgs> onlineStoreConfig) {
            this.onlineStoreConfig = onlineStoreConfig;
            return this;
        }

        public Builder onlineStoreConfig(@Nullable FeatureGroupOnlineStoreConfigArgs onlineStoreConfig) {
            this.onlineStoreConfig = Input.ofNullable(onlineStoreConfig);
            return this;
        }

        public Builder recordIdentifierFeatureName(Input<String> recordIdentifierFeatureName) {
            this.recordIdentifierFeatureName = Objects.requireNonNull(recordIdentifierFeatureName);
            return this;
        }

        public Builder recordIdentifierFeatureName(String recordIdentifierFeatureName) {
            this.recordIdentifierFeatureName = Input.of(Objects.requireNonNull(recordIdentifierFeatureName));
            return this;
        }

        public Builder roleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public FeatureGroupArgs build() {
            return new FeatureGroupArgs(description, eventTimeFeatureName, featureDefinitions, featureGroupName, offlineStoreConfig, onlineStoreConfig, recordIdentifierFeatureName, roleArn, tags);
        }
    }
}
