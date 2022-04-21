// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.aws.apigateway.inputs.UsagePlanApiStageArgs;
import com.pulumi.aws.apigateway.inputs.UsagePlanQuotaSettingsArgs;
import com.pulumi.aws.apigateway.inputs.UsagePlanThrottleSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UsagePlanArgs extends com.pulumi.resources.ResourceArgs {

    public static final UsagePlanArgs Empty = new UsagePlanArgs();

    /**
     * The associated API stages of the usage plan.
     * 
     */
    @Import(name="apiStages")
    private @Nullable Output<List<UsagePlanApiStageArgs>> apiStages;

    public Optional<Output<List<UsagePlanApiStageArgs>>> apiStages() {
        return Optional.ofNullable(this.apiStages);
    }

    /**
     * The description of a usage plan.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the usage plan.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
     * 
     */
    @Import(name="productCode")
    private @Nullable Output<String> productCode;

    public Optional<Output<String>> productCode() {
        return Optional.ofNullable(this.productCode);
    }

    /**
     * The quota settings of the usage plan.
     * 
     */
    @Import(name="quotaSettings")
    private @Nullable Output<UsagePlanQuotaSettingsArgs> quotaSettings;

    public Optional<Output<UsagePlanQuotaSettingsArgs>> quotaSettings() {
        return Optional.ofNullable(this.quotaSettings);
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The throttling limits of the usage plan.
     * 
     */
    @Import(name="throttleSettings")
    private @Nullable Output<UsagePlanThrottleSettingsArgs> throttleSettings;

    public Optional<Output<UsagePlanThrottleSettingsArgs>> throttleSettings() {
        return Optional.ofNullable(this.throttleSettings);
    }

    private UsagePlanArgs() {}

    private UsagePlanArgs(UsagePlanArgs $) {
        this.apiStages = $.apiStages;
        this.description = $.description;
        this.name = $.name;
        this.productCode = $.productCode;
        this.quotaSettings = $.quotaSettings;
        this.tags = $.tags;
        this.throttleSettings = $.throttleSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UsagePlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UsagePlanArgs $;

        public Builder() {
            $ = new UsagePlanArgs();
        }

        public Builder(UsagePlanArgs defaults) {
            $ = new UsagePlanArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiStages(@Nullable Output<List<UsagePlanApiStageArgs>> apiStages) {
            $.apiStages = apiStages;
            return this;
        }

        public Builder apiStages(List<UsagePlanApiStageArgs> apiStages) {
            return apiStages(Output.of(apiStages));
        }

        public Builder apiStages(UsagePlanApiStageArgs... apiStages) {
            return apiStages(List.of(apiStages));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder productCode(@Nullable Output<String> productCode) {
            $.productCode = productCode;
            return this;
        }

        public Builder productCode(String productCode) {
            return productCode(Output.of(productCode));
        }

        public Builder quotaSettings(@Nullable Output<UsagePlanQuotaSettingsArgs> quotaSettings) {
            $.quotaSettings = quotaSettings;
            return this;
        }

        public Builder quotaSettings(UsagePlanQuotaSettingsArgs quotaSettings) {
            return quotaSettings(Output.of(quotaSettings));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder throttleSettings(@Nullable Output<UsagePlanThrottleSettingsArgs> throttleSettings) {
            $.throttleSettings = throttleSettings;
            return this;
        }

        public Builder throttleSettings(UsagePlanThrottleSettingsArgs throttleSettings) {
            return throttleSettings(Output.of(throttleSettings));
        }

        public UsagePlanArgs build() {
            return $;
        }
    }

}
