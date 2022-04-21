// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.enums.SchedulingNodeAffinityOperator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Node Affinity: the configuration of desired nodes onto which this Instance could be scheduled.
 * 
 */
public final class SchedulingNodeAffinityArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchedulingNodeAffinityArgs Empty = new SchedulingNodeAffinityArgs();

    /**
     * Corresponds to the label key of Node resource.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
     * 
     */
    @Import(name="operator")
    private @Nullable Output<SchedulingNodeAffinityOperator> operator;

    public Optional<Output<SchedulingNodeAffinityOperator>> operator() {
        return Optional.ofNullable(this.operator);
    }

    /**
     * Corresponds to the label values of Node resource.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private SchedulingNodeAffinityArgs() {}

    private SchedulingNodeAffinityArgs(SchedulingNodeAffinityArgs $) {
        this.key = $.key;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchedulingNodeAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulingNodeAffinityArgs $;

        public Builder() {
            $ = new SchedulingNodeAffinityArgs();
        }

        public Builder(SchedulingNodeAffinityArgs defaults) {
            $ = new SchedulingNodeAffinityArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder operator(@Nullable Output<SchedulingNodeAffinityOperator> operator) {
            $.operator = operator;
            return this;
        }

        public Builder operator(SchedulingNodeAffinityOperator operator) {
            return operator(Output.of(operator));
        }

        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public SchedulingNodeAffinityArgs build() {
            return $;
        }
    }

}
