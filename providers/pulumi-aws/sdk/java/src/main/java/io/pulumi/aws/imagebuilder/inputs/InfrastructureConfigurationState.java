// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.aws.imagebuilder.inputs.InfrastructureConfigurationLoggingGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InfrastructureConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final InfrastructureConfigurationState Empty = new InfrastructureConfigurationState();

    /**
     * Amazon Resource Name (ARN) of the configuration.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Date when the configuration was created.
     * 
     */
    @InputImport(name="dateCreated")
      private final @Nullable Input<String> dateCreated;

    public Input<String> getDateCreated() {
        return this.dateCreated == null ? Input.empty() : this.dateCreated;
    }

    /**
     * Date when the configuration was updated.
     * 
     */
    @InputImport(name="dateUpdated")
      private final @Nullable Input<String> dateUpdated;

    public Input<String> getDateUpdated() {
        return this.dateUpdated == null ? Input.empty() : this.dateUpdated;
    }

    /**
     * Description for the configuration.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of IAM Instance Profile.
     * 
     */
    @InputImport(name="instanceProfileName")
      private final @Nullable Input<String> instanceProfileName;

    public Input<String> getInstanceProfileName() {
        return this.instanceProfileName == null ? Input.empty() : this.instanceProfileName;
    }

    /**
     * Set of EC2 Instance Types.
     * 
     */
    @InputImport(name="instanceTypes")
      private final @Nullable Input<List<String>> instanceTypes;

    public Input<List<String>> getInstanceTypes() {
        return this.instanceTypes == null ? Input.empty() : this.instanceTypes;
    }

    /**
     * Name of EC2 Key Pair.
     * 
     */
    @InputImport(name="keyPair")
      private final @Nullable Input<String> keyPair;

    public Input<String> getKeyPair() {
        return this.keyPair == null ? Input.empty() : this.keyPair;
    }

    /**
     * Configuration block with logging settings. Detailed below.
     * 
     */
    @InputImport(name="logging")
      private final @Nullable Input<InfrastructureConfigurationLoggingGetArgs> logging;

    public Input<InfrastructureConfigurationLoggingGetArgs> getLogging() {
        return this.logging == null ? Input.empty() : this.logging;
    }

    /**
     * Name for the configuration.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Key-value map of resource tags to assign to infrastructure created by the configuration.
     * 
     */
    @InputImport(name="resourceTags")
      private final @Nullable Input<Map<String,String>> resourceTags;

    public Input<Map<String,String>> getResourceTags() {
        return this.resourceTags == null ? Input.empty() : this.resourceTags;
    }

    /**
     * Set of EC2 Security Group identifiers.
     * 
     */
    @InputImport(name="securityGroupIds")
      private final @Nullable Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Input.empty() : this.securityGroupIds;
    }

    /**
     * Amazon Resource Name (ARN) of SNS Topic.
     * 
     */
    @InputImport(name="snsTopicArn")
      private final @Nullable Input<String> snsTopicArn;

    public Input<String> getSnsTopicArn() {
        return this.snsTopicArn == null ? Input.empty() : this.snsTopicArn;
    }

    /**
     * EC2 Subnet identifier. Also requires `security_group_ids` argument.
     * 
     */
    @InputImport(name="subnetId")
      private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    /**
     * Key-value map of resource tags to assign to the configuration. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Enable if the instance should be terminated when the pipeline fails. Defaults to `false`.
     * 
     */
    @InputImport(name="terminateInstanceOnFailure")
      private final @Nullable Input<Boolean> terminateInstanceOnFailure;

    public Input<Boolean> getTerminateInstanceOnFailure() {
        return this.terminateInstanceOnFailure == null ? Input.empty() : this.terminateInstanceOnFailure;
    }

    public InfrastructureConfigurationState(
        @Nullable Input<String> arn,
        @Nullable Input<String> dateCreated,
        @Nullable Input<String> dateUpdated,
        @Nullable Input<String> description,
        @Nullable Input<String> instanceProfileName,
        @Nullable Input<List<String>> instanceTypes,
        @Nullable Input<String> keyPair,
        @Nullable Input<InfrastructureConfigurationLoggingGetArgs> logging,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> resourceTags,
        @Nullable Input<List<String>> securityGroupIds,
        @Nullable Input<String> snsTopicArn,
        @Nullable Input<String> subnetId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<Boolean> terminateInstanceOnFailure) {
        this.arn = arn;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.description = description;
        this.instanceProfileName = instanceProfileName;
        this.instanceTypes = instanceTypes;
        this.keyPair = keyPair;
        this.logging = logging;
        this.name = name;
        this.resourceTags = resourceTags;
        this.securityGroupIds = securityGroupIds;
        this.snsTopicArn = snsTopicArn;
        this.subnetId = subnetId;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.terminateInstanceOnFailure = terminateInstanceOnFailure;
    }

    private InfrastructureConfigurationState() {
        this.arn = Input.empty();
        this.dateCreated = Input.empty();
        this.dateUpdated = Input.empty();
        this.description = Input.empty();
        this.instanceProfileName = Input.empty();
        this.instanceTypes = Input.empty();
        this.keyPair = Input.empty();
        this.logging = Input.empty();
        this.name = Input.empty();
        this.resourceTags = Input.empty();
        this.securityGroupIds = Input.empty();
        this.snsTopicArn = Input.empty();
        this.subnetId = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.terminateInstanceOnFailure = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> dateCreated;
        private @Nullable Input<String> dateUpdated;
        private @Nullable Input<String> description;
        private @Nullable Input<String> instanceProfileName;
        private @Nullable Input<List<String>> instanceTypes;
        private @Nullable Input<String> keyPair;
        private @Nullable Input<InfrastructureConfigurationLoggingGetArgs> logging;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> resourceTags;
        private @Nullable Input<List<String>> securityGroupIds;
        private @Nullable Input<String> snsTopicArn;
        private @Nullable Input<String> subnetId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<Boolean> terminateInstanceOnFailure;

        public Builder() {
    	      // Empty
        }

        public Builder(InfrastructureConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dateCreated = defaults.dateCreated;
    	      this.dateUpdated = defaults.dateUpdated;
    	      this.description = defaults.description;
    	      this.instanceProfileName = defaults.instanceProfileName;
    	      this.instanceTypes = defaults.instanceTypes;
    	      this.keyPair = defaults.keyPair;
    	      this.logging = defaults.logging;
    	      this.name = defaults.name;
    	      this.resourceTags = defaults.resourceTags;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.snsTopicArn = defaults.snsTopicArn;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.terminateInstanceOnFailure = defaults.terminateInstanceOnFailure;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder dateCreated(@Nullable Input<String> dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        public Builder dateCreated(@Nullable String dateCreated) {
            this.dateCreated = Input.ofNullable(dateCreated);
            return this;
        }

        public Builder dateUpdated(@Nullable Input<String> dateUpdated) {
            this.dateUpdated = dateUpdated;
            return this;
        }

        public Builder dateUpdated(@Nullable String dateUpdated) {
            this.dateUpdated = Input.ofNullable(dateUpdated);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder instanceProfileName(@Nullable Input<String> instanceProfileName) {
            this.instanceProfileName = instanceProfileName;
            return this;
        }

        public Builder instanceProfileName(@Nullable String instanceProfileName) {
            this.instanceProfileName = Input.ofNullable(instanceProfileName);
            return this;
        }

        public Builder instanceTypes(@Nullable Input<List<String>> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        public Builder instanceTypes(@Nullable List<String> instanceTypes) {
            this.instanceTypes = Input.ofNullable(instanceTypes);
            return this;
        }

        public Builder keyPair(@Nullable Input<String> keyPair) {
            this.keyPair = keyPair;
            return this;
        }

        public Builder keyPair(@Nullable String keyPair) {
            this.keyPair = Input.ofNullable(keyPair);
            return this;
        }

        public Builder logging(@Nullable Input<InfrastructureConfigurationLoggingGetArgs> logging) {
            this.logging = logging;
            return this;
        }

        public Builder logging(@Nullable InfrastructureConfigurationLoggingGetArgs logging) {
            this.logging = Input.ofNullable(logging);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder resourceTags(@Nullable Input<Map<String,String>> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }

        public Builder resourceTags(@Nullable Map<String,String> resourceTags) {
            this.resourceTags = Input.ofNullable(resourceTags);
            return this;
        }

        public Builder securityGroupIds(@Nullable Input<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Input.ofNullable(securityGroupIds);
            return this;
        }

        public Builder snsTopicArn(@Nullable Input<String> snsTopicArn) {
            this.snsTopicArn = snsTopicArn;
            return this;
        }

        public Builder snsTopicArn(@Nullable String snsTopicArn) {
            this.snsTopicArn = Input.ofNullable(snsTopicArn);
            return this;
        }

        public Builder subnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
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

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder terminateInstanceOnFailure(@Nullable Input<Boolean> terminateInstanceOnFailure) {
            this.terminateInstanceOnFailure = terminateInstanceOnFailure;
            return this;
        }

        public Builder terminateInstanceOnFailure(@Nullable Boolean terminateInstanceOnFailure) {
            this.terminateInstanceOnFailure = Input.ofNullable(terminateInstanceOnFailure);
            return this;
        }
        public InfrastructureConfigurationState build() {
            return new InfrastructureConfigurationState(arn, dateCreated, dateUpdated, description, instanceProfileName, instanceTypes, keyPair, logging, name, resourceTags, securityGroupIds, snsTopicArn, subnetId, tags, tagsAll, terminateInstanceOnFailure);
        }
    }
}
