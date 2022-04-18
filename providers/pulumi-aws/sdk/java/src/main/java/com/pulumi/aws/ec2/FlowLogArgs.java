// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.ec2.inputs.FlowLogDestinationOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowLogArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowLogArgs Empty = new FlowLogArgs();

    /**
     * Describes the destination options for a flow log. More details below.
     * 
     */
    @Import(name="destinationOptions")
      private final @Nullable Output<FlowLogDestinationOptionsArgs> destinationOptions;

    public Output<FlowLogDestinationOptionsArgs> destinationOptions() {
        return this.destinationOptions == null ? Codegen.empty() : this.destinationOptions;
    }

    /**
     * Elastic Network Interface ID to attach to
     * 
     */
    @Import(name="eniId")
      private final @Nullable Output<String> eniId;

    public Output<String> eniId() {
        return this.eniId == null ? Codegen.empty() : this.eniId;
    }

    /**
     * The ARN for the IAM role that's used to post flow logs to a CloudWatch Logs log group
     * 
     */
    @Import(name="iamRoleArn")
      private final @Nullable Output<String> iamRoleArn;

    public Output<String> iamRoleArn() {
        return this.iamRoleArn == null ? Codegen.empty() : this.iamRoleArn;
    }

    /**
     * The ARN of the logging destination.
     * 
     */
    @Import(name="logDestination")
      private final @Nullable Output<String> logDestination;

    public Output<String> logDestination() {
        return this.logDestination == null ? Codegen.empty() : this.logDestination;
    }

    /**
     * The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
     * 
     */
    @Import(name="logDestinationType")
      private final @Nullable Output<String> logDestinationType;

    public Output<String> logDestinationType() {
        return this.logDestinationType == null ? Codegen.empty() : this.logDestinationType;
    }

    /**
     * The fields to include in the flow log record, in the order in which they should appear.
     * 
     */
    @Import(name="logFormat")
      private final @Nullable Output<String> logFormat;

    public Output<String> logFormat() {
        return this.logFormat == null ? Codegen.empty() : this.logFormat;
    }

    /**
     * *Deprecated:* Use `log_destination` instead. The name of the CloudWatch log group.
     * 
     * @Deprecated
     * use 'log_destination' argument instead
     * 
     */
    @Deprecated /* use 'log_destination' argument instead */
    @Import(name="logGroupName")
      private final @Nullable Output<String> logGroupName;

    @Deprecated /* use 'log_destination' argument instead */
    public Output<String> logGroupName() {
        return this.logGroupName == null ? Codegen.empty() : this.logGroupName;
    }

    /**
     * The maximum interval of time
     * during which a flow of packets is captured and aggregated into a flow
     * log record. Valid Values: `60` seconds (1 minute) or `600` seconds (10
     * minutes). Default: `600`.
     * 
     */
    @Import(name="maxAggregationInterval")
      private final @Nullable Output<Integer> maxAggregationInterval;

    public Output<Integer> maxAggregationInterval() {
        return this.maxAggregationInterval == null ? Codegen.empty() : this.maxAggregationInterval;
    }

    /**
     * Subnet ID to attach to
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> subnetId() {
        return this.subnetId == null ? Codegen.empty() : this.subnetId;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
     * 
     */
    @Import(name="trafficType", required=true)
      private final Output<String> trafficType;

    public Output<String> trafficType() {
        return this.trafficType;
    }

    /**
     * VPC ID to attach to
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId == null ? Codegen.empty() : this.vpcId;
    }

    public FlowLogArgs(
        @Nullable Output<FlowLogDestinationOptionsArgs> destinationOptions,
        @Nullable Output<String> eniId,
        @Nullable Output<String> iamRoleArn,
        @Nullable Output<String> logDestination,
        @Nullable Output<String> logDestinationType,
        @Nullable Output<String> logFormat,
        @Nullable Output<String> logGroupName,
        @Nullable Output<Integer> maxAggregationInterval,
        @Nullable Output<String> subnetId,
        @Nullable Output<Map<String,String>> tags,
        Output<String> trafficType,
        @Nullable Output<String> vpcId) {
        this.destinationOptions = destinationOptions;
        this.eniId = eniId;
        this.iamRoleArn = iamRoleArn;
        this.logDestination = logDestination;
        this.logDestinationType = logDestinationType;
        this.logFormat = logFormat;
        this.logGroupName = logGroupName;
        this.maxAggregationInterval = maxAggregationInterval;
        this.subnetId = subnetId;
        this.tags = tags;
        this.trafficType = Objects.requireNonNull(trafficType, "expected parameter 'trafficType' to be non-null");
        this.vpcId = vpcId;
    }

    private FlowLogArgs() {
        this.destinationOptions = Codegen.empty();
        this.eniId = Codegen.empty();
        this.iamRoleArn = Codegen.empty();
        this.logDestination = Codegen.empty();
        this.logDestinationType = Codegen.empty();
        this.logFormat = Codegen.empty();
        this.logGroupName = Codegen.empty();
        this.maxAggregationInterval = Codegen.empty();
        this.subnetId = Codegen.empty();
        this.tags = Codegen.empty();
        this.trafficType = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FlowLogDestinationOptionsArgs> destinationOptions;
        private @Nullable Output<String> eniId;
        private @Nullable Output<String> iamRoleArn;
        private @Nullable Output<String> logDestination;
        private @Nullable Output<String> logDestinationType;
        private @Nullable Output<String> logFormat;
        private @Nullable Output<String> logGroupName;
        private @Nullable Output<Integer> maxAggregationInterval;
        private @Nullable Output<String> subnetId;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> trafficType;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowLogArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationOptions = defaults.destinationOptions;
    	      this.eniId = defaults.eniId;
    	      this.iamRoleArn = defaults.iamRoleArn;
    	      this.logDestination = defaults.logDestination;
    	      this.logDestinationType = defaults.logDestinationType;
    	      this.logFormat = defaults.logFormat;
    	      this.logGroupName = defaults.logGroupName;
    	      this.maxAggregationInterval = defaults.maxAggregationInterval;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.trafficType = defaults.trafficType;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder destinationOptions(@Nullable Output<FlowLogDestinationOptionsArgs> destinationOptions) {
            this.destinationOptions = destinationOptions;
            return this;
        }
        public Builder destinationOptions(@Nullable FlowLogDestinationOptionsArgs destinationOptions) {
            this.destinationOptions = Codegen.ofNullable(destinationOptions);
            return this;
        }
        public Builder eniId(@Nullable Output<String> eniId) {
            this.eniId = eniId;
            return this;
        }
        public Builder eniId(@Nullable String eniId) {
            this.eniId = Codegen.ofNullable(eniId);
            return this;
        }
        public Builder iamRoleArn(@Nullable Output<String> iamRoleArn) {
            this.iamRoleArn = iamRoleArn;
            return this;
        }
        public Builder iamRoleArn(@Nullable String iamRoleArn) {
            this.iamRoleArn = Codegen.ofNullable(iamRoleArn);
            return this;
        }
        public Builder logDestination(@Nullable Output<String> logDestination) {
            this.logDestination = logDestination;
            return this;
        }
        public Builder logDestination(@Nullable String logDestination) {
            this.logDestination = Codegen.ofNullable(logDestination);
            return this;
        }
        public Builder logDestinationType(@Nullable Output<String> logDestinationType) {
            this.logDestinationType = logDestinationType;
            return this;
        }
        public Builder logDestinationType(@Nullable String logDestinationType) {
            this.logDestinationType = Codegen.ofNullable(logDestinationType);
            return this;
        }
        public Builder logFormat(@Nullable Output<String> logFormat) {
            this.logFormat = logFormat;
            return this;
        }
        public Builder logFormat(@Nullable String logFormat) {
            this.logFormat = Codegen.ofNullable(logFormat);
            return this;
        }
        public Builder logGroupName(@Nullable Output<String> logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }
        public Builder logGroupName(@Nullable String logGroupName) {
            this.logGroupName = Codegen.ofNullable(logGroupName);
            return this;
        }
        public Builder maxAggregationInterval(@Nullable Output<Integer> maxAggregationInterval) {
            this.maxAggregationInterval = maxAggregationInterval;
            return this;
        }
        public Builder maxAggregationInterval(@Nullable Integer maxAggregationInterval) {
            this.maxAggregationInterval = Codegen.ofNullable(maxAggregationInterval);
            return this;
        }
        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Codegen.ofNullable(subnetId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder trafficType(Output<String> trafficType) {
            this.trafficType = Objects.requireNonNull(trafficType);
            return this;
        }
        public Builder trafficType(String trafficType) {
            this.trafficType = Output.of(Objects.requireNonNull(trafficType));
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }        public FlowLogArgs build() {
            return new FlowLogArgs(destinationOptions, eniId, iamRoleArn, logDestination, logDestinationType, logFormat, logGroupName, maxAggregationInterval, subnetId, tags, trafficType, vpcId);
        }
    }
}
