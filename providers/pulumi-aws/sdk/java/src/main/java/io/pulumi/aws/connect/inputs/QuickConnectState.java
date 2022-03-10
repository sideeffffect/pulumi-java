// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QuickConnectState extends io.pulumi.resources.ResourceArgs {

    public static final QuickConnectState Empty = new QuickConnectState();

    /**
     * The Amazon Resource Name (ARN) of the Quick Connect.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Specifies the description of the Quick Connect.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @InputImport(name="instanceId")
      private final @Nullable Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId == null ? Input.empty() : this.instanceId;
    }

    /**
     * Specifies the name of the Quick Connect.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A block that defines the configuration information for the Quick Connect: `quick_connect_type` and one of `phone_config`, `queue_config`, `user_config` . The Quick Connect Config block is documented below.
     * 
     */
    @InputImport(name="quickConnectConfig")
      private final @Nullable Input<QuickConnectQuickConnectConfigGetArgs> quickConnectConfig;

    public Input<QuickConnectQuickConnectConfigGetArgs> getQuickConnectConfig() {
        return this.quickConnectConfig == null ? Input.empty() : this.quickConnectConfig;
    }

    /**
     * The identifier for the Quick Connect.
     * 
     */
    @InputImport(name="quickConnectId")
      private final @Nullable Input<String> quickConnectId;

    public Input<String> getQuickConnectId() {
        return this.quickConnectId == null ? Input.empty() : this.quickConnectId;
    }

    /**
     * Tags to apply to the Quick Connect. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public QuickConnectState(
        @Nullable Input<String> arn,
        @Nullable Input<String> description,
        @Nullable Input<String> instanceId,
        @Nullable Input<String> name,
        @Nullable Input<QuickConnectQuickConnectConfigGetArgs> quickConnectConfig,
        @Nullable Input<String> quickConnectId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.description = description;
        this.instanceId = instanceId;
        this.name = name;
        this.quickConnectConfig = quickConnectConfig;
        this.quickConnectId = quickConnectId;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private QuickConnectState() {
        this.arn = Input.empty();
        this.description = Input.empty();
        this.instanceId = Input.empty();
        this.name = Input.empty();
        this.quickConnectConfig = Input.empty();
        this.quickConnectId = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> description;
        private @Nullable Input<String> instanceId;
        private @Nullable Input<String> name;
        private @Nullable Input<QuickConnectQuickConnectConfigGetArgs> quickConnectConfig;
        private @Nullable Input<String> quickConnectId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.quickConnectConfig = defaults.quickConnectConfig;
    	      this.quickConnectId = defaults.quickConnectId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
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

        public Builder instanceId(@Nullable Input<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = Input.ofNullable(instanceId);
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

        public Builder quickConnectConfig(@Nullable Input<QuickConnectQuickConnectConfigGetArgs> quickConnectConfig) {
            this.quickConnectConfig = quickConnectConfig;
            return this;
        }

        public Builder quickConnectConfig(@Nullable QuickConnectQuickConnectConfigGetArgs quickConnectConfig) {
            this.quickConnectConfig = Input.ofNullable(quickConnectConfig);
            return this;
        }

        public Builder quickConnectId(@Nullable Input<String> quickConnectId) {
            this.quickConnectId = quickConnectId;
            return this;
        }

        public Builder quickConnectId(@Nullable String quickConnectId) {
            this.quickConnectId = Input.ofNullable(quickConnectId);
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
        public QuickConnectState build() {
            return new QuickConnectState(arn, description, instanceId, name, quickConnectConfig, quickConnectId, tags, tagsAll);
        }
    }
}
