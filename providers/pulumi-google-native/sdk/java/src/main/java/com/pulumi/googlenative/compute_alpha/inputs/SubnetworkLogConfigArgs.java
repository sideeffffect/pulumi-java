// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.SubnetworkLogConfigAggregationInterval;
import com.pulumi.googlenative.compute_alpha.enums.SubnetworkLogConfigMetadata;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The available logging options for this subnetwork.
 * 
 */
public final class SubnetworkLogConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubnetworkLogConfigArgs Empty = new SubnetworkLogConfigArgs();

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. Toggles the aggregation interval for collecting flow logs. Increasing the interval time will reduce the amount of generated flow logs for long lasting connections. Default is an interval of 5 seconds per connection.
     * 
     */
    @Import(name="aggregationInterval")
    private @Nullable Output<SubnetworkLogConfigAggregationInterval> aggregationInterval;

    public Optional<Output<SubnetworkLogConfigAggregationInterval>> aggregationInterval() {
        return Optional.ofNullable(this.aggregationInterval);
    }

    /**
     * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is determined by the org policy, if there is no org policy specified, then it will default to disabled.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled. Export filter used to define which VPC flow logs should be logged.
     * 
     */
    @Import(name="filterExpr")
    private @Nullable Output<String> filterExpr;

    public Optional<Output<String>> filterExpr() {
        return Optional.ofNullable(this.filterExpr);
    }

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. The value of the field must be in [0, 1]. Set the sampling rate of VPC flow logs within the subnetwork where 1.0 means all collected logs are reported and 0.0 means no logs are reported. Default is 0.5 unless otherwise specified by the org policy, which means half of all collected logs are reported.
     * 
     */
    @Import(name="flowSampling")
    private @Nullable Output<Double> flowSampling;

    public Optional<Output<Double>> flowSampling() {
        return Optional.ofNullable(this.flowSampling);
    }

    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled. Configures whether all, none or a subset of metadata fields should be added to the reported VPC flow logs. Default is EXCLUDE_ALL_METADATA.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<SubnetworkLogConfigMetadata> metadata;

    public Optional<Output<SubnetworkLogConfigMetadata>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Can only be specified if VPC flow logs for this subnetwork is enabled and &#34;metadata&#34; was set to CUSTOM_METADATA.
     * 
     */
    @Import(name="metadataFields")
    private @Nullable Output<List<String>> metadataFields;

    public Optional<Output<List<String>>> metadataFields() {
        return Optional.ofNullable(this.metadataFields);
    }

    private SubnetworkLogConfigArgs() {}

    private SubnetworkLogConfigArgs(SubnetworkLogConfigArgs $) {
        this.aggregationInterval = $.aggregationInterval;
        this.enable = $.enable;
        this.filterExpr = $.filterExpr;
        this.flowSampling = $.flowSampling;
        this.metadata = $.metadata;
        this.metadataFields = $.metadataFields;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetworkLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetworkLogConfigArgs $;

        public Builder() {
            $ = new SubnetworkLogConfigArgs();
        }

        public Builder(SubnetworkLogConfigArgs defaults) {
            $ = new SubnetworkLogConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder aggregationInterval(@Nullable Output<SubnetworkLogConfigAggregationInterval> aggregationInterval) {
            $.aggregationInterval = aggregationInterval;
            return this;
        }

        public Builder aggregationInterval(SubnetworkLogConfigAggregationInterval aggregationInterval) {
            return aggregationInterval(Output.of(aggregationInterval));
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public Builder filterExpr(@Nullable Output<String> filterExpr) {
            $.filterExpr = filterExpr;
            return this;
        }

        public Builder filterExpr(String filterExpr) {
            return filterExpr(Output.of(filterExpr));
        }

        public Builder flowSampling(@Nullable Output<Double> flowSampling) {
            $.flowSampling = flowSampling;
            return this;
        }

        public Builder flowSampling(Double flowSampling) {
            return flowSampling(Output.of(flowSampling));
        }

        public Builder metadata(@Nullable Output<SubnetworkLogConfigMetadata> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(SubnetworkLogConfigMetadata metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder metadataFields(@Nullable Output<List<String>> metadataFields) {
            $.metadataFields = metadataFields;
            return this;
        }

        public Builder metadataFields(List<String> metadataFields) {
            return metadataFields(Output.of(metadataFields));
        }

        public Builder metadataFields(String... metadataFields) {
            return metadataFields(List.of(metadataFields));
        }

        public SubnetworkLogConfigArgs build() {
            return $;
        }
    }

}
