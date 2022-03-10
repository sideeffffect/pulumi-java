// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint.inputs;

import io.pulumi.aws.pinpoint.inputs.AppCampaignHookGetArgs;
import io.pulumi.aws.pinpoint.inputs.AppLimitsGetArgs;
import io.pulumi.aws.pinpoint.inputs.AppQuietTimeGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppState extends io.pulumi.resources.ResourceArgs {

    public static final AppState Empty = new AppState();

    /**
     * The Application ID of the Pinpoint App.
     * 
     */
    @InputImport(name="applicationId")
      private final @Nullable Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId == null ? Input.empty() : this.applicationId;
    }

    /**
     * Amazon Resource Name (ARN) of the PinPoint Application
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
     * 
     */
    @InputImport(name="campaignHook")
      private final @Nullable Input<AppCampaignHookGetArgs> campaignHook;

    public Input<AppCampaignHookGetArgs> getCampaignHook() {
        return this.campaignHook == null ? Input.empty() : this.campaignHook;
    }

    /**
     * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
     * 
     */
    @InputImport(name="limits")
      private final @Nullable Input<AppLimitsGetArgs> limits;

    public Input<AppLimitsGetArgs> getLimits() {
        return this.limits == null ? Input.empty() : this.limits;
    }

    /**
     * The application name. By default generated by this provider
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the Pinpoint application. Conflicts with `name`
     * 
     */
    @InputImport(name="namePrefix")
      private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
     * 
     */
    @InputImport(name="quietTime")
      private final @Nullable Input<AppQuietTimeGetArgs> quietTime;

    public Input<AppQuietTimeGetArgs> getQuietTime() {
        return this.quietTime == null ? Input.empty() : this.quietTime;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    public AppState(
        @Nullable Input<String> applicationId,
        @Nullable Input<String> arn,
        @Nullable Input<AppCampaignHookGetArgs> campaignHook,
        @Nullable Input<AppLimitsGetArgs> limits,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<AppQuietTimeGetArgs> quietTime,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.applicationId = applicationId;
        this.arn = arn;
        this.campaignHook = campaignHook;
        this.limits = limits;
        this.name = name;
        this.namePrefix = namePrefix;
        this.quietTime = quietTime;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private AppState() {
        this.applicationId = Input.empty();
        this.arn = Input.empty();
        this.campaignHook = Input.empty();
        this.limits = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.quietTime = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationId;
        private @Nullable Input<String> arn;
        private @Nullable Input<AppCampaignHookGetArgs> campaignHook;
        private @Nullable Input<AppLimitsGetArgs> limits;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<AppQuietTimeGetArgs> quietTime;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(AppState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.arn = defaults.arn;
    	      this.campaignHook = defaults.campaignHook;
    	      this.limits = defaults.limits;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.quietTime = defaults.quietTime;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder applicationId(@Nullable Input<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = Input.ofNullable(applicationId);
            return this;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder campaignHook(@Nullable Input<AppCampaignHookGetArgs> campaignHook) {
            this.campaignHook = campaignHook;
            return this;
        }

        public Builder campaignHook(@Nullable AppCampaignHookGetArgs campaignHook) {
            this.campaignHook = Input.ofNullable(campaignHook);
            return this;
        }

        public Builder limits(@Nullable Input<AppLimitsGetArgs> limits) {
            this.limits = limits;
            return this;
        }

        public Builder limits(@Nullable AppLimitsGetArgs limits) {
            this.limits = Input.ofNullable(limits);
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

        public Builder namePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder quietTime(@Nullable Input<AppQuietTimeGetArgs> quietTime) {
            this.quietTime = quietTime;
            return this;
        }

        public Builder quietTime(@Nullable AppQuietTimeGetArgs quietTime) {
            this.quietTime = Input.ofNullable(quietTime);
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
        public AppState build() {
            return new AppState(applicationId, arn, campaignHook, limits, name, namePrefix, quietTime, tags, tagsAll);
        }
    }
}
