// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * `QuotaLimit` defines a specific limit that applies over a specified duration for a limit type. There can be at most one limit for a duration and limit type combination defined within a `QuotaGroup`.
 * 
 */
public final class QuotaLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final QuotaLimitArgs Empty = new QuotaLimitArgs();

    /**
     * Default number of tokens that can be consumed during the specified duration. This is the number of tokens assigned when a client application developer activates the service for his/her project. Specifying a value of 0 will block all requests. This can be used if you are provisioning quota to selected consumers and blocking others. Similarly, a value of -1 will indicate an unlimited quota. No other negative values are allowed. Used by group-based quotas only.
     * 
     */
    @Import(name="defaultLimit")
    private @Nullable Output<String> defaultLimit;

    public Optional<Output<String>> defaultLimit() {
        return Optional.ofNullable(this.defaultLimit);
    }

    /**
     * Optional. User-visible, extended description for this quota limit. Should be used only when more context is needed to understand this limit than provided by the limit&#39;s display name (see: `display_name`).
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User-visible display name for this limit. Optional. If not set, the UI will provide a default display name based on the quota configuration. This field can be used to override the default display name generated from the configuration.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Duration of this limit in textual notation. Must be &#34;100s&#34; or &#34;1d&#34;. Used by group-based quotas only.
     * 
     */
    @Import(name="duration")
    private @Nullable Output<String> duration;

    public Optional<Output<String>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * Free tier value displayed in the Developers Console for this limit. The free tier is the number of tokens that will be subtracted from the billed amount when billing is enabled. This field can only be set on a limit with duration &#34;1d&#34;, in a billable group; it is invalid on any other limit. If this field is not set, it defaults to 0, indicating that there is no free tier for this service. Used by group-based quotas only.
     * 
     */
    @Import(name="freeTier")
    private @Nullable Output<String> freeTier;

    public Optional<Output<String>> freeTier() {
        return Optional.ofNullable(this.freeTier);
    }

    /**
     * Maximum number of tokens that can be consumed during the specified duration. Client application developers can override the default limit up to this maximum. If specified, this value cannot be set to a value less than the default limit. If not specified, it is set to the default limit. To allow clients to apply overrides with no upper bound, set this to -1, indicating unlimited maximum quota. Used by group-based quotas only.
     * 
     */
    @Import(name="maxLimit")
    private @Nullable Output<String> maxLimit;

    public Optional<Output<String>> maxLimit() {
        return Optional.ofNullable(this.maxLimit);
    }

    /**
     * The name of the metric this quota limit applies to. The quota limits with the same metric will be checked together during runtime. The metric must be defined within the service config.
     * 
     */
    @Import(name="metric")
    private @Nullable Output<String> metric;

    public Optional<Output<String>> metric() {
        return Optional.ofNullable(this.metric);
    }

    /**
     * Name of the quota limit. The name must be provided, and it must be unique within the service. The name can only include alphanumeric characters as well as &#39;-&#39;. The maximum length of the limit name is 64 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specify the unit of the quota limit. It uses the same syntax as Metric.unit. The supported unit kinds are determined by the quota backend system. Here are some examples: * &#34;1/min/{project}&#34; for quota per minute per project. Note: the order of unit components is insignificant. The &#34;1&#34; at the beginning is required to follow the metric unit syntax.
     * 
     */
    @Import(name="unit")
    private @Nullable Output<String> unit;

    public Optional<Output<String>> unit() {
        return Optional.ofNullable(this.unit);
    }

    /**
     * Tiered limit values. You must specify this as a key:value pair, with an integer value that is the maximum number of requests allowed for the specified unit. Currently only STANDARD is supported.
     * 
     */
    @Import(name="values")
    private @Nullable Output<Map<String,String>> values;

    public Optional<Output<Map<String,String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private QuotaLimitArgs() {}

    private QuotaLimitArgs(QuotaLimitArgs $) {
        this.defaultLimit = $.defaultLimit;
        this.description = $.description;
        this.displayName = $.displayName;
        this.duration = $.duration;
        this.freeTier = $.freeTier;
        this.maxLimit = $.maxLimit;
        this.metric = $.metric;
        this.name = $.name;
        this.unit = $.unit;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QuotaLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QuotaLimitArgs $;

        public Builder() {
            $ = new QuotaLimitArgs();
        }

        public Builder(QuotaLimitArgs defaults) {
            $ = new QuotaLimitArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultLimit(@Nullable Output<String> defaultLimit) {
            $.defaultLimit = defaultLimit;
            return this;
        }

        public Builder defaultLimit(String defaultLimit) {
            return defaultLimit(Output.of(defaultLimit));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder duration(@Nullable Output<String> duration) {
            $.duration = duration;
            return this;
        }

        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        public Builder freeTier(@Nullable Output<String> freeTier) {
            $.freeTier = freeTier;
            return this;
        }

        public Builder freeTier(String freeTier) {
            return freeTier(Output.of(freeTier));
        }

        public Builder maxLimit(@Nullable Output<String> maxLimit) {
            $.maxLimit = maxLimit;
            return this;
        }

        public Builder maxLimit(String maxLimit) {
            return maxLimit(Output.of(maxLimit));
        }

        public Builder metric(@Nullable Output<String> metric) {
            $.metric = metric;
            return this;
        }

        public Builder metric(String metric) {
            return metric(Output.of(metric));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder unit(@Nullable Output<String> unit) {
            $.unit = unit;
            return this;
        }

        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        public Builder values(@Nullable Output<Map<String,String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(Map<String,String> values) {
            return values(Output.of(values));
        }

        public QuotaLimitArgs build() {
            return $;
        }
    }

}
