// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudwatch;

import io.pulumi.awsnative.cloudwatch.inputs.MetricStreamFilterArgs;
import io.pulumi.awsnative.cloudwatch.inputs.MetricStreamTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricStreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricStreamArgs Empty = new MetricStreamArgs();

    /**
     * Define which metrics will be not streamed. Metrics matched by multiple instances of MetricStreamFilter are joined with an OR operation by default. If both IncludeFilters and ExcludeFilters are omitted, all metrics in the account will be streamed. IncludeFilters and ExcludeFilters are mutually exclusive. Default to null.
     * 
     */
    @InputImport(name="excludeFilters")
      private final @Nullable Input<List<MetricStreamFilterArgs>> excludeFilters;

    public Input<List<MetricStreamFilterArgs>> getExcludeFilters() {
        return this.excludeFilters == null ? Input.empty() : this.excludeFilters;
    }

    /**
     * The ARN of the Kinesis Firehose where to stream the data.
     * 
     */
    @InputImport(name="firehoseArn", required=true)
      private final Input<String> firehoseArn;

    public Input<String> getFirehoseArn() {
        return this.firehoseArn;
    }

    /**
     * Define which metrics will be streamed. Metrics matched by multiple instances of MetricStreamFilter are joined with an OR operation by default. If both IncludeFilters and ExcludeFilters are omitted, all metrics in the account will be streamed. IncludeFilters and ExcludeFilters are mutually exclusive. Default to null.
     * 
     */
    @InputImport(name="includeFilters")
      private final @Nullable Input<List<MetricStreamFilterArgs>> includeFilters;

    public Input<List<MetricStreamFilterArgs>> getIncludeFilters() {
        return this.includeFilters == null ? Input.empty() : this.includeFilters;
    }

    /**
     * Name of the metric stream.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The output format of the data streamed to the Kinesis Firehose.
     * 
     */
    @InputImport(name="outputFormat", required=true)
      private final Input<String> outputFormat;

    public Input<String> getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * The ARN of the role that provides access to the Kinesis Firehose.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * A set of tags to assign to the delivery stream.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<MetricStreamTagArgs>> tags;

    public Input<List<MetricStreamTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public MetricStreamArgs(
        @Nullable Input<List<MetricStreamFilterArgs>> excludeFilters,
        Input<String> firehoseArn,
        @Nullable Input<List<MetricStreamFilterArgs>> includeFilters,
        @Nullable Input<String> name,
        Input<String> outputFormat,
        Input<String> roleArn,
        @Nullable Input<List<MetricStreamTagArgs>> tags) {
        this.excludeFilters = excludeFilters;
        this.firehoseArn = Objects.requireNonNull(firehoseArn, "expected parameter 'firehoseArn' to be non-null");
        this.includeFilters = includeFilters;
        this.name = name;
        this.outputFormat = Objects.requireNonNull(outputFormat, "expected parameter 'outputFormat' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
    }

    private MetricStreamArgs() {
        this.excludeFilters = Input.empty();
        this.firehoseArn = Input.empty();
        this.includeFilters = Input.empty();
        this.name = Input.empty();
        this.outputFormat = Input.empty();
        this.roleArn = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<MetricStreamFilterArgs>> excludeFilters;
        private Input<String> firehoseArn;
        private @Nullable Input<List<MetricStreamFilterArgs>> includeFilters;
        private @Nullable Input<String> name;
        private Input<String> outputFormat;
        private Input<String> roleArn;
        private @Nullable Input<List<MetricStreamTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricStreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeFilters = defaults.excludeFilters;
    	      this.firehoseArn = defaults.firehoseArn;
    	      this.includeFilters = defaults.includeFilters;
    	      this.name = defaults.name;
    	      this.outputFormat = defaults.outputFormat;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder excludeFilters(@Nullable Input<List<MetricStreamFilterArgs>> excludeFilters) {
            this.excludeFilters = excludeFilters;
            return this;
        }

        public Builder excludeFilters(@Nullable List<MetricStreamFilterArgs> excludeFilters) {
            this.excludeFilters = Input.ofNullable(excludeFilters);
            return this;
        }

        public Builder firehoseArn(Input<String> firehoseArn) {
            this.firehoseArn = Objects.requireNonNull(firehoseArn);
            return this;
        }

        public Builder firehoseArn(String firehoseArn) {
            this.firehoseArn = Input.of(Objects.requireNonNull(firehoseArn));
            return this;
        }

        public Builder includeFilters(@Nullable Input<List<MetricStreamFilterArgs>> includeFilters) {
            this.includeFilters = includeFilters;
            return this;
        }

        public Builder includeFilters(@Nullable List<MetricStreamFilterArgs> includeFilters) {
            this.includeFilters = Input.ofNullable(includeFilters);
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

        public Builder outputFormat(Input<String> outputFormat) {
            this.outputFormat = Objects.requireNonNull(outputFormat);
            return this;
        }

        public Builder outputFormat(String outputFormat) {
            this.outputFormat = Input.of(Objects.requireNonNull(outputFormat));
            return this;
        }

        public Builder roleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder tags(@Nullable Input<List<MetricStreamTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<MetricStreamTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public MetricStreamArgs build() {
            return new MetricStreamArgs(excludeFilters, firehoseArn, includeFilters, name, outputFormat, roleArn, tags);
        }
    }
}
