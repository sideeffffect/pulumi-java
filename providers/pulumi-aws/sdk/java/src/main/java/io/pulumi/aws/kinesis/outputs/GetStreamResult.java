// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.GetStreamStreamModeDetail;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetStreamResult {
    /**
     * The Amazon Resource Name (ARN) of the Kinesis Stream (same as id).
     * 
     */
    private final String arn;
    /**
     * The list of shard ids in the CLOSED state. See [Shard State](https://docs.aws.amazon.com/streams/latest/dev/kinesis-using-sdk-java-after-resharding.html#kinesis-using-sdk-java-resharding-data-routing) for more.
     * 
     */
    private final List<String> closedShards;
    /**
     * The approximate UNIX timestamp that the stream was created.
     * 
     */
    private final Integer creationTimestamp;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The name of the Kinesis Stream.
     * 
     */
    private final String name;
    /**
     * The list of shard ids in the OPEN state. See [Shard State](https://docs.aws.amazon.com/streams/latest/dev/kinesis-using-sdk-java-after-resharding.html#kinesis-using-sdk-java-resharding-data-routing) for more.
     * 
     */
    private final List<String> openShards;
    /**
     * Length of time (in hours) data records are accessible after they are added to the stream.
     * 
     */
    private final Integer retentionPeriod;
    /**
     * A list of shard-level CloudWatch metrics which are enabled for the stream. See [Monitoring with CloudWatch](https://docs.aws.amazon.com/streams/latest/dev/monitoring-with-cloudwatch.html) for more.
     * 
     */
    private final List<String> shardLevelMetrics;
    /**
     * The current status of the stream. The stream status is one of CREATING, DELETING, ACTIVE, or UPDATING.
     * 
     */
    private final String status;
    /**
     * Indicates the [capacity mode](https://docs.aws.amazon.com/streams/latest/dev/how-do-i-size-a-stream.html) of the data stream. Detailed below.
     * 
     */
    private final List<GetStreamStreamModeDetail> streamModeDetails;
    /**
     * A map of tags to assigned to the stream.
     * 
     */
    private final Map<String,String> tags;

    @OutputCustomType.Constructor
    private GetStreamResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("closedShards") List<String> closedShards,
        @OutputCustomType.Parameter("creationTimestamp") Integer creationTimestamp,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("openShards") List<String> openShards,
        @OutputCustomType.Parameter("retentionPeriod") Integer retentionPeriod,
        @OutputCustomType.Parameter("shardLevelMetrics") List<String> shardLevelMetrics,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("streamModeDetails") List<GetStreamStreamModeDetail> streamModeDetails,
        @OutputCustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.closedShards = closedShards;
        this.creationTimestamp = creationTimestamp;
        this.id = id;
        this.name = name;
        this.openShards = openShards;
        this.retentionPeriod = retentionPeriod;
        this.shardLevelMetrics = shardLevelMetrics;
        this.status = status;
        this.streamModeDetails = streamModeDetails;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the Kinesis Stream (same as id).
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The list of shard ids in the CLOSED state. See [Shard State](https://docs.aws.amazon.com/streams/latest/dev/kinesis-using-sdk-java-after-resharding.html#kinesis-using-sdk-java-resharding-data-routing) for more.
     * 
    */
    public List<String> getClosedShards() {
        return this.closedShards;
    }
    /**
     * The approximate UNIX timestamp that the stream was created.
     * 
    */
    public Integer getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the Kinesis Stream.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The list of shard ids in the OPEN state. See [Shard State](https://docs.aws.amazon.com/streams/latest/dev/kinesis-using-sdk-java-after-resharding.html#kinesis-using-sdk-java-resharding-data-routing) for more.
     * 
    */
    public List<String> getOpenShards() {
        return this.openShards;
    }
    /**
     * Length of time (in hours) data records are accessible after they are added to the stream.
     * 
    */
    public Integer getRetentionPeriod() {
        return this.retentionPeriod;
    }
    /**
     * A list of shard-level CloudWatch metrics which are enabled for the stream. See [Monitoring with CloudWatch](https://docs.aws.amazon.com/streams/latest/dev/monitoring-with-cloudwatch.html) for more.
     * 
    */
    public List<String> getShardLevelMetrics() {
        return this.shardLevelMetrics;
    }
    /**
     * The current status of the stream. The stream status is one of CREATING, DELETING, ACTIVE, or UPDATING.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Indicates the [capacity mode](https://docs.aws.amazon.com/streams/latest/dev/how-do-i-size-a-stream.html) of the data stream. Detailed below.
     * 
    */
    public List<GetStreamStreamModeDetail> getStreamModeDetails() {
        return this.streamModeDetails;
    }
    /**
     * A map of tags to assigned to the stream.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private List<String> closedShards;
        private Integer creationTimestamp;
        private String id;
        private String name;
        private List<String> openShards;
        private Integer retentionPeriod;
        private List<String> shardLevelMetrics;
        private String status;
        private List<GetStreamStreamModeDetail> streamModeDetails;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.closedShards = defaults.closedShards;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.openShards = defaults.openShards;
    	      this.retentionPeriod = defaults.retentionPeriod;
    	      this.shardLevelMetrics = defaults.shardLevelMetrics;
    	      this.status = defaults.status;
    	      this.streamModeDetails = defaults.streamModeDetails;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder closedShards(List<String> closedShards) {
            this.closedShards = Objects.requireNonNull(closedShards);
            return this;
        }

        public Builder creationTimestamp(Integer creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder openShards(List<String> openShards) {
            this.openShards = Objects.requireNonNull(openShards);
            return this;
        }

        public Builder retentionPeriod(Integer retentionPeriod) {
            this.retentionPeriod = Objects.requireNonNull(retentionPeriod);
            return this;
        }

        public Builder shardLevelMetrics(List<String> shardLevelMetrics) {
            this.shardLevelMetrics = Objects.requireNonNull(shardLevelMetrics);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder streamModeDetails(List<GetStreamStreamModeDetail> streamModeDetails) {
            this.streamModeDetails = Objects.requireNonNull(streamModeDetails);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetStreamResult build() {
            return new GetStreamResult(arn, closedShards, creationTimestamp, id, name, openShards, retentionPeriod, shardLevelMetrics, status, streamModeDetails, tags);
        }
    }
}
