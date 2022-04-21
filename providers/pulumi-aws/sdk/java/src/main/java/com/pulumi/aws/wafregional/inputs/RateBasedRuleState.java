// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.inputs;

import com.pulumi.aws.wafregional.inputs.RateBasedRulePredicateGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RateBasedRuleState extends com.pulumi.resources.ResourceArgs {

    public static final RateBasedRuleState Empty = new RateBasedRuleState();

    /**
     * The ARN of the WAF Regional Rate Based Rule.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The name or description for the Amazon CloudWatch metric of this rule.
     * 
     */
    @Import(name="metricName")
    private @Nullable Output<String> metricName;

    public Optional<Output<String>> metricName() {
        return Optional.ofNullable(this.metricName);
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
    private @Nullable Output<List<RateBasedRulePredicateGetArgs>> predicates;

    public Optional<Output<List<RateBasedRulePredicateGetArgs>>> predicates() {
        return Optional.ofNullable(this.predicates);
    }

    /**
     * Valid value is IP.
     * 
     */
    @Import(name="rateKey")
    private @Nullable Output<String> rateKey;

    public Optional<Output<String>> rateKey() {
        return Optional.ofNullable(this.rateKey);
    }

    /**
     * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
     * 
     */
    @Import(name="rateLimit")
    private @Nullable Output<Integer> rateLimit;

    public Optional<Output<Integer>> rateLimit() {
        return Optional.ofNullable(this.rateLimit);
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
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private RateBasedRuleState() {}

    private RateBasedRuleState(RateBasedRuleState $) {
        this.arn = $.arn;
        this.metricName = $.metricName;
        this.name = $.name;
        this.predicates = $.predicates;
        this.rateKey = $.rateKey;
        this.rateLimit = $.rateLimit;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RateBasedRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RateBasedRuleState $;

        public Builder() {
            $ = new RateBasedRuleState();
        }

        public Builder(RateBasedRuleState defaults) {
            $ = new RateBasedRuleState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder metricName(@Nullable Output<String> metricName) {
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

        public Builder predicates(@Nullable Output<List<RateBasedRulePredicateGetArgs>> predicates) {
            $.predicates = predicates;
            return this;
        }

        public Builder predicates(List<RateBasedRulePredicateGetArgs> predicates) {
            return predicates(Output.of(predicates));
        }

        public Builder predicates(RateBasedRulePredicateGetArgs... predicates) {
            return predicates(List.of(predicates));
        }

        public Builder rateKey(@Nullable Output<String> rateKey) {
            $.rateKey = rateKey;
            return this;
        }

        public Builder rateKey(String rateKey) {
            return rateKey(Output.of(rateKey));
        }

        public Builder rateLimit(@Nullable Output<Integer> rateLimit) {
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

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public RateBasedRuleState build() {
            return $;
        }
    }

}
