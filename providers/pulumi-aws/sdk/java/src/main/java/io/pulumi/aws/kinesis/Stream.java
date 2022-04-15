// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.kinesis.StreamArgs;
import io.pulumi.aws.kinesis.inputs.StreamState;
import io.pulumi.aws.kinesis.outputs.StreamStreamModeDetails;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Kinesis Stream resource. Amazon Kinesis is a managed service that
 * scales elastically for real-time processing of streaming big data.
 * 
 * For more details, see the [Amazon Kinesis Documentation](https://aws.amazon.com/documentation/kinesis/).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Kinesis Streams can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:kinesis/stream:Stream test_stream kinesis-test
 * ```
 * 
 *  [1]https://aws.amazon.com/documentation/kinesis/ [2]https://docs.aws.amazon.com/kinesis/latest/dev/amazon-kinesis-streams.html [3]https://docs.aws.amazon.com/streams/latest/dev/monitoring-with-cloudwatch.html
 * 
 */
@ResourceType(type="aws:kinesis/stream:Stream")
public class Stream extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) specifying the Stream (same as `id`)
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) specifying the Stream (same as `id`)
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The encryption type to use. The only acceptable values are `NONE` or `KMS`. The default value is `NONE`.
     * 
     */
    @Export(name="encryptionType", type=String.class, parameters={})
    private Output</* @Nullable */ String> encryptionType;

    /**
     * @return The encryption type to use. The only acceptable values are `NONE` or `KMS`. The default value is `NONE`.
     * 
     */
    public Output</* @Nullable */ String> encryptionType() {
        return this.encryptionType;
    }
    /**
     * A boolean that indicates all registered consumers should be deregistered from the stream so that the stream can be destroyed without error. The default value is `false`.
     * 
     */
    @Export(name="enforceConsumerDeletion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enforceConsumerDeletion;

    /**
     * @return A boolean that indicates all registered consumers should be deregistered from the stream so that the stream can be destroyed without error. The default value is `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> enforceConsumerDeletion() {
        return this.enforceConsumerDeletion;
    }
    /**
     * The GUID for the customer-managed KMS key to use for encryption. You can also use a Kinesis-owned master key by specifying the alias `alias/aws/kinesis`.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return The GUID for the customer-managed KMS key to use for encryption. You can also use a Kinesis-owned master key by specifying the alias `alias/aws/kinesis`.
     * 
     */
    public Output</* @Nullable */ String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * A name to identify the stream. This is unique to the AWS account and region the Stream is created in.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name to identify the stream. This is unique to the AWS account and region the Stream is created in.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Length of time data records are accessible after they are added to the stream. The maximum value of a stream's retention period is 8760 hours. Minimum value is 24. Default is 24.
     * 
     */
    @Export(name="retentionPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retentionPeriod;

    /**
     * @return Length of time data records are accessible after they are added to the stream. The maximum value of a stream's retention period is 8760 hours. Minimum value is 24. Default is 24.
     * 
     */
    public Output</* @Nullable */ Integer> retentionPeriod() {
        return this.retentionPeriod;
    }
    /**
     * The number of shards that the stream will use. If the `stream_mode` is `PROVISIONED`, this field is required.
     * Amazon has guidelines for specifying the Stream size that should be referenced when creating a Kinesis stream. See [Amazon Kinesis Streams](https://docs.aws.amazon.com/kinesis/latest/dev/amazon-kinesis-streams.html) for more.
     * 
     */
    @Export(name="shardCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> shardCount;

    /**
     * @return The number of shards that the stream will use. If the `stream_mode` is `PROVISIONED`, this field is required.
     * Amazon has guidelines for specifying the Stream size that should be referenced when creating a Kinesis stream. See [Amazon Kinesis Streams](https://docs.aws.amazon.com/kinesis/latest/dev/amazon-kinesis-streams.html) for more.
     * 
     */
    public Output</* @Nullable */ Integer> shardCount() {
        return this.shardCount;
    }
    /**
     * A list of shard-level CloudWatch metrics which can be enabled for the stream. See [Monitoring with CloudWatch](https://docs.aws.amazon.com/streams/latest/dev/monitoring-with-cloudwatch.html) for more. Note that the value ALL should not be used; instead you should provide an explicit list of metrics you wish to enable.
     * 
     */
    @Export(name="shardLevelMetrics", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> shardLevelMetrics;

    /**
     * @return A list of shard-level CloudWatch metrics which can be enabled for the stream. See [Monitoring with CloudWatch](https://docs.aws.amazon.com/streams/latest/dev/monitoring-with-cloudwatch.html) for more. Note that the value ALL should not be used; instead you should provide an explicit list of metrics you wish to enable.
     * 
     */
    public Output</* @Nullable */ List<String>> shardLevelMetrics() {
        return this.shardLevelMetrics;
    }
    /**
     * Indicates the [capacity mode](https://docs.aws.amazon.com/streams/latest/dev/how-do-i-size-a-stream.html) of the data stream. Detailed below.
     * 
     */
    @Export(name="streamModeDetails", type=StreamStreamModeDetails.class, parameters={})
    private Output<StreamStreamModeDetails> streamModeDetails;

    /**
     * @return Indicates the [capacity mode](https://docs.aws.amazon.com/streams/latest/dev/how-do-i-size-a-stream.html) of the data stream. Detailed below.
     * 
     */
    public Output<StreamStreamModeDetails> streamModeDetails() {
        return this.streamModeDetails;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Stream(String name) {
        this(name, StreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Stream(String name, @Nullable StreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Stream(String name, @Nullable StreamArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesis/stream:Stream", name, args == null ? StreamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Stream(String name, Output<String> id, @Nullable StreamState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kinesis/stream:Stream", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Stream get(String name, Output<String> id, @Nullable StreamState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Stream(name, id, state, options);
    }
}
