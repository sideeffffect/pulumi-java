// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.DimensionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the criteria for converting log to metric.
 * 
 */
public final class CriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final CriteriaArgs Empty = new CriteriaArgs();

    /**
     * List of Dimensions for creating metric
     * 
     */
    @Import(name="dimensions")
    private @Nullable Output<List<DimensionArgs>> dimensions;

    public Optional<Output<List<DimensionArgs>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * Name of the metric
     * 
     */
    @Import(name="metricName", required=true)
    private Output<String> metricName;

    public Output<String> metricName() {
        return this.metricName;
    }

    private CriteriaArgs() {}

    private CriteriaArgs(CriteriaArgs $) {
        this.dimensions = $.dimensions;
        this.metricName = $.metricName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CriteriaArgs $;

        public Builder() {
            $ = new CriteriaArgs();
        }

        public Builder(CriteriaArgs defaults) {
            $ = new CriteriaArgs(Objects.requireNonNull(defaults));
        }

        public Builder dimensions(@Nullable Output<List<DimensionArgs>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        public Builder dimensions(List<DimensionArgs> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        public Builder dimensions(DimensionArgs... dimensions) {
            return dimensions(List.of(dimensions));
        }

        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        public CriteriaArgs build() {
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            return $;
        }
    }

}
