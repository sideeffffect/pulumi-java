// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.aws.cloudwatch.inputs.MetricStreamExcludeFilterGetArgs;
import com.pulumi.aws.cloudwatch.inputs.MetricStreamIncludeFilterGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricStreamState extends com.pulumi.resources.ResourceArgs {

    public static final MetricStreamState Empty = new MetricStreamState();

    /**
     * ARN of the metric stream.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the metric stream was created.
     * 
     */
    @Import(name="creationDate")
    private @Nullable Output<String> creationDate;

    public Optional<Output<String>> creationDate() {
        return Optional.ofNullable(this.creationDate);
    }

    /**
     * List of exclusive metric filters. If you specify this parameter, the stream sends metrics from all metric namespaces except for the namespaces that you specify here. Conflicts with `include_filter`.
     * 
     */
    @Import(name="excludeFilters")
    private @Nullable Output<List<MetricStreamExcludeFilterGetArgs>> excludeFilters;

    public Optional<Output<List<MetricStreamExcludeFilterGetArgs>>> excludeFilters() {
        return Optional.ofNullable(this.excludeFilters);
    }

    /**
     * ARN of the Amazon Kinesis Firehose delivery stream to use for this metric stream.
     * 
     */
    @Import(name="firehoseArn")
    private @Nullable Output<String> firehoseArn;

    public Optional<Output<String>> firehoseArn() {
        return Optional.ofNullable(this.firehoseArn);
    }

    /**
     * List of inclusive metric filters. If you specify this parameter, the stream sends only the metrics from the metric namespaces that you specify here. Conflicts with `exclude_filter`.
     * 
     */
    @Import(name="includeFilters")
    private @Nullable Output<List<MetricStreamIncludeFilterGetArgs>> includeFilters;

    public Optional<Output<List<MetricStreamIncludeFilterGetArgs>>> includeFilters() {
        return Optional.ofNullable(this.includeFilters);
    }

    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the metric stream was last updated.
     * 
     */
    @Import(name="lastUpdateDate")
    private @Nullable Output<String> lastUpdateDate;

    public Optional<Output<String>> lastUpdateDate() {
        return Optional.ofNullable(this.lastUpdateDate);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * Output format for the stream. Possible values are `json` and `opentelemetry0.7`. For more information about output formats, see [Metric streams output formats](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-formats.html).
     * 
     */
    @Import(name="outputFormat")
    private @Nullable Output<String> outputFormat;

    public Optional<Output<String>> outputFormat() {
        return Optional.ofNullable(this.outputFormat);
    }

    /**
     * ARN of the IAM role that this metric stream will use to access Amazon Kinesis Firehose resources. For more information about role permissions, see [Trust between CloudWatch and Kinesis Data Firehose](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-metric-streams-trustpolicy.html).
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * State of the metric stream. Possible values are `running` and `stopped`.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private MetricStreamState() {}

    private MetricStreamState(MetricStreamState $) {
        this.arn = $.arn;
        this.creationDate = $.creationDate;
        this.excludeFilters = $.excludeFilters;
        this.firehoseArn = $.firehoseArn;
        this.includeFilters = $.includeFilters;
        this.lastUpdateDate = $.lastUpdateDate;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.outputFormat = $.outputFormat;
        this.roleArn = $.roleArn;
        this.state = $.state;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricStreamState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricStreamState $;

        public Builder() {
            $ = new MetricStreamState();
        }

        public Builder(MetricStreamState defaults) {
            $ = new MetricStreamState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder creationDate(@Nullable Output<String> creationDate) {
            $.creationDate = creationDate;
            return this;
        }

        public Builder creationDate(String creationDate) {
            return creationDate(Output.of(creationDate));
        }

        public Builder excludeFilters(@Nullable Output<List<MetricStreamExcludeFilterGetArgs>> excludeFilters) {
            $.excludeFilters = excludeFilters;
            return this;
        }

        public Builder excludeFilters(List<MetricStreamExcludeFilterGetArgs> excludeFilters) {
            return excludeFilters(Output.of(excludeFilters));
        }

        public Builder excludeFilters(MetricStreamExcludeFilterGetArgs... excludeFilters) {
            return excludeFilters(List.of(excludeFilters));
        }

        public Builder firehoseArn(@Nullable Output<String> firehoseArn) {
            $.firehoseArn = firehoseArn;
            return this;
        }

        public Builder firehoseArn(String firehoseArn) {
            return firehoseArn(Output.of(firehoseArn));
        }

        public Builder includeFilters(@Nullable Output<List<MetricStreamIncludeFilterGetArgs>> includeFilters) {
            $.includeFilters = includeFilters;
            return this;
        }

        public Builder includeFilters(List<MetricStreamIncludeFilterGetArgs> includeFilters) {
            return includeFilters(Output.of(includeFilters));
        }

        public Builder includeFilters(MetricStreamIncludeFilterGetArgs... includeFilters) {
            return includeFilters(List.of(includeFilters));
        }

        public Builder lastUpdateDate(@Nullable Output<String> lastUpdateDate) {
            $.lastUpdateDate = lastUpdateDate;
            return this;
        }

        public Builder lastUpdateDate(String lastUpdateDate) {
            return lastUpdateDate(Output.of(lastUpdateDate));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        public Builder outputFormat(@Nullable Output<String> outputFormat) {
            $.outputFormat = outputFormat;
            return this;
        }

        public Builder outputFormat(String outputFormat) {
            return outputFormat(Output.of(outputFormat));
        }

        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public MetricStreamState build() {
            return $;
        }
    }

}
