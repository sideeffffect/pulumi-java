// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.kinesisfirehose.DeliveryStreamArgs;
import com.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamType;
import com.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamAmazonopensearchserviceDestinationConfiguration;
import com.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamElasticsearchDestinationConfiguration;
import com.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamEncryptionConfigurationInput;
import com.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamExtendedS3DestinationConfiguration;
import com.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamHttpEndpointDestinationConfiguration;
import com.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamKinesisStreamSourceConfiguration;
import com.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamRedshiftDestinationConfiguration;
import com.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamS3DestinationConfiguration;
import com.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamSplunkDestinationConfiguration;
import com.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::KinesisFirehose::DeliveryStream
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:kinesisfirehose:DeliveryStream")
public class DeliveryStream extends CustomResource {
    @Export(name="amazonopensearchserviceDestinationConfiguration", type=DeliveryStreamAmazonopensearchserviceDestinationConfiguration.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamAmazonopensearchserviceDestinationConfiguration> amazonopensearchserviceDestinationConfiguration;

    public Output<Optional<DeliveryStreamAmazonopensearchserviceDestinationConfiguration>> amazonopensearchserviceDestinationConfiguration() {
        return Codegen.optional(this.amazonopensearchserviceDestinationConfiguration);
    }
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="deliveryStreamEncryptionConfigurationInput", type=DeliveryStreamEncryptionConfigurationInput.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamEncryptionConfigurationInput> deliveryStreamEncryptionConfigurationInput;

    public Output<Optional<DeliveryStreamEncryptionConfigurationInput>> deliveryStreamEncryptionConfigurationInput() {
        return Codegen.optional(this.deliveryStreamEncryptionConfigurationInput);
    }
    @Export(name="deliveryStreamName", type=String.class, parameters={})
    private Output</* @Nullable */ String> deliveryStreamName;

    public Output<Optional<String>> deliveryStreamName() {
        return Codegen.optional(this.deliveryStreamName);
    }
    @Export(name="deliveryStreamType", type=DeliveryStreamType.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamType> deliveryStreamType;

    public Output<Optional<DeliveryStreamType>> deliveryStreamType() {
        return Codegen.optional(this.deliveryStreamType);
    }
    @Export(name="elasticsearchDestinationConfiguration", type=DeliveryStreamElasticsearchDestinationConfiguration.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamElasticsearchDestinationConfiguration> elasticsearchDestinationConfiguration;

    public Output<Optional<DeliveryStreamElasticsearchDestinationConfiguration>> elasticsearchDestinationConfiguration() {
        return Codegen.optional(this.elasticsearchDestinationConfiguration);
    }
    @Export(name="extendedS3DestinationConfiguration", type=DeliveryStreamExtendedS3DestinationConfiguration.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamExtendedS3DestinationConfiguration> extendedS3DestinationConfiguration;

    public Output<Optional<DeliveryStreamExtendedS3DestinationConfiguration>> extendedS3DestinationConfiguration() {
        return Codegen.optional(this.extendedS3DestinationConfiguration);
    }
    @Export(name="httpEndpointDestinationConfiguration", type=DeliveryStreamHttpEndpointDestinationConfiguration.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamHttpEndpointDestinationConfiguration> httpEndpointDestinationConfiguration;

    public Output<Optional<DeliveryStreamHttpEndpointDestinationConfiguration>> httpEndpointDestinationConfiguration() {
        return Codegen.optional(this.httpEndpointDestinationConfiguration);
    }
    @Export(name="kinesisStreamSourceConfiguration", type=DeliveryStreamKinesisStreamSourceConfiguration.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamKinesisStreamSourceConfiguration> kinesisStreamSourceConfiguration;

    public Output<Optional<DeliveryStreamKinesisStreamSourceConfiguration>> kinesisStreamSourceConfiguration() {
        return Codegen.optional(this.kinesisStreamSourceConfiguration);
    }
    @Export(name="redshiftDestinationConfiguration", type=DeliveryStreamRedshiftDestinationConfiguration.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamRedshiftDestinationConfiguration> redshiftDestinationConfiguration;

    public Output<Optional<DeliveryStreamRedshiftDestinationConfiguration>> redshiftDestinationConfiguration() {
        return Codegen.optional(this.redshiftDestinationConfiguration);
    }
    @Export(name="s3DestinationConfiguration", type=DeliveryStreamS3DestinationConfiguration.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamS3DestinationConfiguration> s3DestinationConfiguration;

    public Output<Optional<DeliveryStreamS3DestinationConfiguration>> s3DestinationConfiguration() {
        return Codegen.optional(this.s3DestinationConfiguration);
    }
    @Export(name="splunkDestinationConfiguration", type=DeliveryStreamSplunkDestinationConfiguration.class, parameters={})
    private Output</* @Nullable */ DeliveryStreamSplunkDestinationConfiguration> splunkDestinationConfiguration;

    public Output<Optional<DeliveryStreamSplunkDestinationConfiguration>> splunkDestinationConfiguration() {
        return Codegen.optional(this.splunkDestinationConfiguration);
    }
    @Export(name="tags", type=List.class, parameters={DeliveryStreamTag.class})
    private Output</* @Nullable */ List<DeliveryStreamTag>> tags;

    public Output<Optional<List<DeliveryStreamTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeliveryStream(String name) {
        this(name, DeliveryStreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeliveryStream(String name, @Nullable DeliveryStreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeliveryStream(String name, @Nullable DeliveryStreamArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:kinesisfirehose:DeliveryStream", name, args == null ? DeliveryStreamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeliveryStream(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:kinesisfirehose:DeliveryStream", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DeliveryStream get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new DeliveryStream(name, id, options);
    }
}
