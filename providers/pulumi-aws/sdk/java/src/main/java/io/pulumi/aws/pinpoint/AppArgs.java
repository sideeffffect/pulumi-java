// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint;

import io.pulumi.aws.pinpoint.inputs.AppCampaignHookArgs;
import io.pulumi.aws.pinpoint.inputs.AppLimitsArgs;
import io.pulumi.aws.pinpoint.inputs.AppQuietTimeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppArgs Empty = new AppArgs();

    /**
     * Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
     * 
     */
    @Import(name="campaignHook")
      private final @Nullable Output<AppCampaignHookArgs> campaignHook;

    public Output<AppCampaignHookArgs> campaignHook() {
        return this.campaignHook == null ? Codegen.empty() : this.campaignHook;
    }

    /**
     * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
     * 
     */
    @Import(name="limits")
      private final @Nullable Output<AppLimitsArgs> limits;

    public Output<AppLimitsArgs> limits() {
        return this.limits == null ? Codegen.empty() : this.limits;
    }

    /**
     * The application name. By default generated by this provider
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The name of the Pinpoint application. Conflicts with `name`
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> namePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
     * 
     */
    @Import(name="quietTime")
      private final @Nullable Output<AppQuietTimeArgs> quietTime;

    public Output<AppQuietTimeArgs> quietTime() {
        return this.quietTime == null ? Codegen.empty() : this.quietTime;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public AppArgs(
        @Nullable Output<AppCampaignHookArgs> campaignHook,
        @Nullable Output<AppLimitsArgs> limits,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<AppQuietTimeArgs> quietTime,
        @Nullable Output<Map<String,String>> tags) {
        this.campaignHook = campaignHook;
        this.limits = limits;
        this.name = name;
        this.namePrefix = namePrefix;
        this.quietTime = quietTime;
        this.tags = tags;
    }

    private AppArgs() {
        this.campaignHook = Codegen.empty();
        this.limits = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.quietTime = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AppCampaignHookArgs> campaignHook;
        private @Nullable Output<AppLimitsArgs> limits;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<AppQuietTimeArgs> quietTime;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.campaignHook = defaults.campaignHook;
    	      this.limits = defaults.limits;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.quietTime = defaults.quietTime;
    	      this.tags = defaults.tags;
        }

        public Builder campaignHook(@Nullable Output<AppCampaignHookArgs> campaignHook) {
            this.campaignHook = campaignHook;
            return this;
        }
        public Builder campaignHook(@Nullable AppCampaignHookArgs campaignHook) {
            this.campaignHook = Codegen.ofNullable(campaignHook);
            return this;
        }
        public Builder limits(@Nullable Output<AppLimitsArgs> limits) {
            this.limits = limits;
            return this;
        }
        public Builder limits(@Nullable AppLimitsArgs limits) {
            this.limits = Codegen.ofNullable(limits);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder quietTime(@Nullable Output<AppQuietTimeArgs> quietTime) {
            this.quietTime = quietTime;
            return this;
        }
        public Builder quietTime(@Nullable AppQuietTimeArgs quietTime) {
            this.quietTime = Codegen.ofNullable(quietTime);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public AppArgs build() {
            return new AppArgs(campaignHook, limits, name, namePrefix, quietTime, tags);
        }
    }
}
