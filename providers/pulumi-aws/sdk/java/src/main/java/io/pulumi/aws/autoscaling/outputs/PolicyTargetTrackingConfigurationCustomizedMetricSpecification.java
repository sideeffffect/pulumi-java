// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.outputs;

import io.pulumi.aws.autoscaling.outputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyTargetTrackingConfigurationCustomizedMetricSpecification {
    /**
     * The dimensions of the metric.
     * 
     */
    private final @Nullable List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension> metricDimensions;
    /**
     * The name of the metric.
     * 
     */
    private final String metricName;
    /**
     * The namespace of the metric.
     * 
     */
    private final String namespace;
    /**
     * The statistic of the metric.
     * 
     */
    private final String statistic;
    /**
     * The unit of the metric.
     * 
     */
    private final @Nullable String unit;

    @CustomType.Constructor
    private PolicyTargetTrackingConfigurationCustomizedMetricSpecification(
        @CustomType.Parameter("metricDimensions") @Nullable List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension> metricDimensions,
        @CustomType.Parameter("metricName") String metricName,
        @CustomType.Parameter("namespace") String namespace,
        @CustomType.Parameter("statistic") String statistic,
        @CustomType.Parameter("unit") @Nullable String unit) {
        this.metricDimensions = metricDimensions;
        this.metricName = metricName;
        this.namespace = namespace;
        this.statistic = statistic;
        this.unit = unit;
    }

    /**
     * The dimensions of the metric.
     * 
    */
    public List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension> metricDimensions() {
        return this.metricDimensions == null ? List.of() : this.metricDimensions;
    }
    /**
     * The name of the metric.
     * 
    */
    public String metricName() {
        return this.metricName;
    }
    /**
     * The namespace of the metric.
     * 
    */
    public String namespace() {
        return this.namespace;
    }
    /**
     * The statistic of the metric.
     * 
    */
    public String statistic() {
        return this.statistic;
    }
    /**
     * The unit of the metric.
     * 
    */
    public Optional<String> unit() {
        return Optional.ofNullable(this.unit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTargetTrackingConfigurationCustomizedMetricSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension> metricDimensions;
        private String metricName;
        private String namespace;
        private String statistic;
        private @Nullable String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTargetTrackingConfigurationCustomizedMetricSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricDimensions = defaults.metricDimensions;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
    	      this.statistic = defaults.statistic;
    	      this.unit = defaults.unit;
        }

        public Builder metricDimensions(@Nullable List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension> metricDimensions) {
            this.metricDimensions = metricDimensions;
            return this;
        }
        public Builder metricDimensions(PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimension... metricDimensions) {
            return metricDimensions(List.of(metricDimensions));
        }
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder statistic(String statistic) {
            this.statistic = Objects.requireNonNull(statistic);
            return this;
        }
        public Builder unit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }        public PolicyTargetTrackingConfigurationCustomizedMetricSpecification build() {
            return new PolicyTargetTrackingConfigurationCustomizedMetricSpecification(metricDimensions, metricName, namespace, statistic, unit);
        }
    }
}
