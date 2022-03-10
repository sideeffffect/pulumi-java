// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TopicRuleCloudwatchMetricAction {
    private final String metricName;
    private final String metricNamespace;
    private final @Nullable String metricTimestamp;
    private final String metricUnit;
    private final String metricValue;
    private final String roleArn;

    @OutputCustomType.Constructor
    private TopicRuleCloudwatchMetricAction(
        @OutputCustomType.Parameter("metricName") String metricName,
        @OutputCustomType.Parameter("metricNamespace") String metricNamespace,
        @OutputCustomType.Parameter("metricTimestamp") @Nullable String metricTimestamp,
        @OutputCustomType.Parameter("metricUnit") String metricUnit,
        @OutputCustomType.Parameter("metricValue") String metricValue,
        @OutputCustomType.Parameter("roleArn") String roleArn) {
        this.metricName = metricName;
        this.metricNamespace = metricNamespace;
        this.metricTimestamp = metricTimestamp;
        this.metricUnit = metricUnit;
        this.metricValue = metricValue;
        this.roleArn = roleArn;
    }

    public String getMetricName() {
        return this.metricName;
    }
    public String getMetricNamespace() {
        return this.metricNamespace;
    }
    public Optional<String> getMetricTimestamp() {
        return Optional.ofNullable(this.metricTimestamp);
    }
    public String getMetricUnit() {
        return this.metricUnit;
    }
    public String getMetricValue() {
        return this.metricValue;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleCloudwatchMetricAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metricName;
        private String metricNamespace;
        private @Nullable String metricTimestamp;
        private String metricUnit;
        private String metricValue;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleCloudwatchMetricAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.metricTimestamp = defaults.metricTimestamp;
    	      this.metricUnit = defaults.metricUnit;
    	      this.metricValue = defaults.metricValue;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder metricNamespace(String metricNamespace) {
            this.metricNamespace = Objects.requireNonNull(metricNamespace);
            return this;
        }

        public Builder metricTimestamp(@Nullable String metricTimestamp) {
            this.metricTimestamp = metricTimestamp;
            return this;
        }

        public Builder metricUnit(String metricUnit) {
            this.metricUnit = Objects.requireNonNull(metricUnit);
            return this;
        }

        public Builder metricValue(String metricValue) {
            this.metricValue = Objects.requireNonNull(metricValue);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public TopicRuleCloudwatchMetricAction build() {
            return new TopicRuleCloudwatchMetricAction(metricName, metricNamespace, metricTimestamp, metricUnit, metricValue, roleArn);
        }
    }
}
