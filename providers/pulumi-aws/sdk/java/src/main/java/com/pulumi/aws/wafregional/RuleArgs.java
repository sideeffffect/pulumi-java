// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional;

import com.pulumi.aws.wafregional.inputs.RulePredicateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleArgs Empty = new RuleArgs();

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
    private @Nullable Output<List<RulePredicateArgs>> predicates;

    public Optional<Output<List<RulePredicateArgs>>> predicates() {
        return Optional.ofNullable(this.predicates);
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

    private RuleArgs() {}

    private RuleArgs(RuleArgs $) {
        this.metricName = $.metricName;
        this.name = $.name;
        this.predicates = $.predicates;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleArgs $;

        public Builder() {
            $ = new RuleArgs();
        }

        public Builder(RuleArgs defaults) {
            $ = new RuleArgs(Objects.requireNonNull(defaults));
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

        public Builder predicates(@Nullable Output<List<RulePredicateArgs>> predicates) {
            $.predicates = predicates;
            return this;
        }

        public Builder predicates(List<RulePredicateArgs> predicates) {
            return predicates(Output.of(predicates));
        }

        public Builder predicates(RulePredicateArgs... predicates) {
            return predicates(List.of(predicates));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public RuleArgs build() {
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            return $;
        }
    }

}
