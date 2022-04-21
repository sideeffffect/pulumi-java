// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional;

import com.pulumi.aws.wafregional.inputs.RateBasedRulePredicateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RateBasedRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RateBasedRuleArgs Empty = new RateBasedRuleArgs();

    /**
     * The name or description for the Amazon CloudWatch metric of this rule.
     * 
     */
    @Import(name="metricName", required=true)
    private Output<String> metricName;

    public Output<String> metricName() {
        return this.metricName;
    }

    /**
     * The name or description of the rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The objects to include in a rule (documented below).
     * 
     */
    @Import(name="predicates")
    private @Nullable Output<List<RateBasedRulePredicateArgs>> predicates;

    public Optional<Output<List<RateBasedRulePredicateArgs>>> predicates() {
        return Optional.ofNullable(this.predicates);
    }

    /**
     * Valid value is IP.
     * 
     */
    @Import(name="rateKey", required=true)
    private Output<String> rateKey;

    public Output<String> rateKey() {
        return this.rateKey;
    }

    /**
     * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
     * 
     */
    @Import(name="rateLimit", required=true)
    private Output<Integer> rateLimit;

    public Output<Integer> rateLimit() {
        return this.rateLimit;
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

    private RateBasedRuleArgs() {}

    private RateBasedRuleArgs(RateBasedRuleArgs $) {
        this.metricName = $.metricName;
        this.name = $.name;
        this.predicates = $.predicates;
        this.rateKey = $.rateKey;
        this.rateLimit = $.rateLimit;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RateBasedRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RateBasedRuleArgs $;

        public Builder() {
            $ = new RateBasedRuleArgs();
        }

        public Builder(RateBasedRuleArgs defaults) {
            $ = new RateBasedRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder predicates(@Nullable Output<List<RateBasedRulePredicateArgs>> predicates) {
            $.predicates = predicates;
            return this;
        }

        public Builder predicates(List<RateBasedRulePredicateArgs> predicates) {
            return predicates(Output.of(predicates));
        }

        public Builder predicates(RateBasedRulePredicateArgs... predicates) {
            return predicates(List.of(predicates));
        }

        public Builder rateKey(Output<String> rateKey) {
            $.rateKey = rateKey;
            return this;
        }

        public Builder rateKey(String rateKey) {
            return rateKey(Output.of(rateKey));
        }

        public Builder rateLimit(Output<Integer> rateLimit) {
            $.rateLimit = rateLimit;
            return this;
        }

        public Builder rateLimit(Integer rateLimit) {
            return rateLimit(Output.of(rateLimit));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public RateBasedRuleArgs build() {
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            $.rateKey = Objects.requireNonNull($.rateKey, "expected parameter 'rateKey' to be non-null");
            $.rateLimit = Objects.requireNonNull($.rateLimit, "expected parameter 'rateLimit' to be non-null");
            return $;
        }
    }

}
