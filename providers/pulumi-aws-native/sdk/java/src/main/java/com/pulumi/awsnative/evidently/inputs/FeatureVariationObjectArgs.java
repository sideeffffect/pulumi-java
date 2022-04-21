// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.evidently.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureVariationObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final FeatureVariationObjectArgs Empty = new FeatureVariationObjectArgs();

    @Import(name="booleanValue")
    private @Nullable Output<Boolean> booleanValue;

    public Optional<Output<Boolean>> booleanValue() {
        return Optional.ofNullable(this.booleanValue);
    }

    @Import(name="doubleValue")
    private @Nullable Output<Double> doubleValue;

    public Optional<Output<Double>> doubleValue() {
        return Optional.ofNullable(this.doubleValue);
    }

    @Import(name="longValue")
    private @Nullable Output<Double> longValue;

    public Optional<Output<Double>> longValue() {
        return Optional.ofNullable(this.longValue);
    }

    @Import(name="stringValue")
    private @Nullable Output<String> stringValue;

    public Optional<Output<String>> stringValue() {
        return Optional.ofNullable(this.stringValue);
    }

    @Import(name="variationName")
    private @Nullable Output<String> variationName;

    public Optional<Output<String>> variationName() {
        return Optional.ofNullable(this.variationName);
    }

    private FeatureVariationObjectArgs() {}

    private FeatureVariationObjectArgs(FeatureVariationObjectArgs $) {
        this.booleanValue = $.booleanValue;
        this.doubleValue = $.doubleValue;
        this.longValue = $.longValue;
        this.stringValue = $.stringValue;
        this.variationName = $.variationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureVariationObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureVariationObjectArgs $;

        public Builder() {
            $ = new FeatureVariationObjectArgs();
        }

        public Builder(FeatureVariationObjectArgs defaults) {
            $ = new FeatureVariationObjectArgs(Objects.requireNonNull(defaults));
        }

        public Builder booleanValue(@Nullable Output<Boolean> booleanValue) {
            $.booleanValue = booleanValue;
            return this;
        }

        public Builder booleanValue(Boolean booleanValue) {
            return booleanValue(Output.of(booleanValue));
        }

        public Builder doubleValue(@Nullable Output<Double> doubleValue) {
            $.doubleValue = doubleValue;
            return this;
        }

        public Builder doubleValue(Double doubleValue) {
            return doubleValue(Output.of(doubleValue));
        }

        public Builder longValue(@Nullable Output<Double> longValue) {
            $.longValue = longValue;
            return this;
        }

        public Builder longValue(Double longValue) {
            return longValue(Output.of(longValue));
        }

        public Builder stringValue(@Nullable Output<String> stringValue) {
            $.stringValue = stringValue;
            return this;
        }

        public Builder stringValue(String stringValue) {
            return stringValue(Output.of(stringValue));
        }

        public Builder variationName(@Nullable Output<String> variationName) {
            $.variationName = variationName;
            return this;
        }

        public Builder variationName(String variationName) {
            return variationName(Output.of(variationName));
        }

        public FeatureVariationObjectArgs build() {
            return $;
        }
    }

}
