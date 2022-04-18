// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleCloudwatchMetricAction {
    private final String metricName;
    private final String metricNamespace;
    private final @Nullable String metricTimestamp;
    private final String metricUnit;
    private final String metricValue;
    private final String roleArn;

    @CustomType.Constructor
    private TopicRuleCloudwatchMetricAction(
        @CustomType.Parameter("metricName") String metricName,
        @CustomType.Parameter("metricNamespace") String metricNamespace,
        @CustomType.Parameter("metricTimestamp") @Nullable String metricTimestamp,
        @CustomType.Parameter("metricUnit") String metricUnit,
        @CustomType.Parameter("metricValue") String metricValue,
        @CustomType.Parameter("roleArn") String roleArn) {
        this.metricName = metricName;
        this.metricNamespace = metricNamespace;
        this.metricTimestamp = metricTimestamp;
        this.metricUnit = metricUnit;
        this.metricValue = metricValue;
        this.roleArn = roleArn;
    }

    public String metricName() {
        return this.metricName;
    }
    public String metricNamespace() {
        return this.metricNamespace;
    }
    public Optional<String> metricTimestamp() {
        return Optional.ofNullable(this.metricTimestamp);
    }
    public String metricUnit() {
        return this.metricUnit;
    }
    public String metricValue() {
        return this.metricValue;
    }
    public String roleArn() {
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
        }        public TopicRuleCloudwatchMetricAction build() {
            return new TopicRuleCloudwatchMetricAction(metricName, metricNamespace, metricTimestamp, metricUnit, metricValue, roleArn);
        }
    }
}
