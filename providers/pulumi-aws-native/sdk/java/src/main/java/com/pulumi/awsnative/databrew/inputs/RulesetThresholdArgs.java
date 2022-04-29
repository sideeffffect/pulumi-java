// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.awsnative.databrew.enums.RulesetThresholdType;
import com.pulumi.awsnative.databrew.enums.RulesetThresholdUnit;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetThresholdArgs extends ResourceArgs {

    public static final RulesetThresholdArgs Empty = new RulesetThresholdArgs();

    @Import(name="type")
    private @Nullable Output<RulesetThresholdType> type;

    public Optional<Output<RulesetThresholdType>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="unit")
    private @Nullable Output<RulesetThresholdUnit> unit;

    public Optional<Output<RulesetThresholdUnit>> unit() {
        return Optional.ofNullable(this.unit);
    }

    @Import(name="value", required=true)
    private Output<Double> value;

    public Output<Double> value() {
        return this.value;
    }

    private RulesetThresholdArgs() {}

    private RulesetThresholdArgs(RulesetThresholdArgs $) {
        this.type = $.type;
        this.unit = $.unit;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetThresholdArgs $;

        public Builder() {
            $ = new RulesetThresholdArgs();
        }

        public Builder(RulesetThresholdArgs defaults) {
            $ = new RulesetThresholdArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(@Nullable Output<RulesetThresholdType> type) {
            $.type = type;
            return this;
        }

        public Builder type(RulesetThresholdType type) {
            return type(Output.of(type));
        }

        public Builder unit(@Nullable Output<RulesetThresholdUnit> unit) {
            $.unit = unit;
            return this;
        }

        public Builder unit(RulesetThresholdUnit unit) {
            return unit(Output.of(unit));
        }

        public Builder value(Output<Double> value) {
            $.value = value;
            return this;
        }

        public Builder value(Double value) {
            return value(Output.of(value));
        }

        public RulesetThresholdArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
