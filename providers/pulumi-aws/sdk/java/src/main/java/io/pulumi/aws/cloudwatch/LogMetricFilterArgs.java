// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.cloudwatch.inputs.LogMetricFilterMetricTransformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogMetricFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogMetricFilterArgs Empty = new LogMetricFilterArgs();

    /**
     * The name of the log group to associate the metric filter with.
     * 
     */
    @InputImport(name="logGroupName", required=true)
      private final Input<String> logGroupName;

    public Input<String> getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * A block defining collection of information needed to define how metric data gets emitted. See below.
     * 
     */
    @InputImport(name="metricTransformation", required=true)
      private final Input<LogMetricFilterMetricTransformationArgs> metricTransformation;

    public Input<LogMetricFilterMetricTransformationArgs> getMetricTransformation() {
        return this.metricTransformation;
    }

    /**
     * A name for the metric filter.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
     * for extracting metric data out of ingested log events.
     * 
     */
    @InputImport(name="pattern", required=true)
      private final Input<String> pattern;

    public Input<String> getPattern() {
        return this.pattern;
    }

    public LogMetricFilterArgs(
        Input<String> logGroupName,
        Input<LogMetricFilterMetricTransformationArgs> metricTransformation,
        @Nullable Input<String> name,
        Input<String> pattern) {
        this.logGroupName = Objects.requireNonNull(logGroupName, "expected parameter 'logGroupName' to be non-null");
        this.metricTransformation = Objects.requireNonNull(metricTransformation, "expected parameter 'metricTransformation' to be non-null");
        this.name = name;
        this.pattern = Objects.requireNonNull(pattern, "expected parameter 'pattern' to be non-null");
    }

    private LogMetricFilterArgs() {
        this.logGroupName = Input.empty();
        this.metricTransformation = Input.empty();
        this.name = Input.empty();
        this.pattern = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogMetricFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> logGroupName;
        private Input<LogMetricFilterMetricTransformationArgs> metricTransformation;
        private @Nullable Input<String> name;
        private Input<String> pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(LogMetricFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
    	      this.metricTransformation = defaults.metricTransformation;
    	      this.name = defaults.name;
    	      this.pattern = defaults.pattern;
        }

        public Builder logGroupName(Input<String> logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }

        public Builder logGroupName(String logGroupName) {
            this.logGroupName = Input.of(Objects.requireNonNull(logGroupName));
            return this;
        }

        public Builder metricTransformation(Input<LogMetricFilterMetricTransformationArgs> metricTransformation) {
            this.metricTransformation = Objects.requireNonNull(metricTransformation);
            return this;
        }

        public Builder metricTransformation(LogMetricFilterMetricTransformationArgs metricTransformation) {
            this.metricTransformation = Input.of(Objects.requireNonNull(metricTransformation));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder pattern(Input<String> pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }

        public Builder pattern(String pattern) {
            this.pattern = Input.of(Objects.requireNonNull(pattern));
            return this;
        }
        public LogMetricFilterArgs build() {
            return new LogMetricFilterArgs(logGroupName, metricTransformation, name, pattern);
        }
    }
}
