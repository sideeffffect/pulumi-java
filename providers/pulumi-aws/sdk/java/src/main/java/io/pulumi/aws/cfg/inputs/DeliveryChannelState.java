// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.aws.cfg.inputs.DeliveryChannelSnapshotDeliveryPropertiesGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryChannelState extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryChannelState Empty = new DeliveryChannelState();

    /**
     * The name of the delivery channel. Defaults to `default`. Changing it recreates the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The name of the S3 bucket used to store the configuration history.
     * 
     */
    @Import(name="s3BucketName")
      private final @Nullable Output<String> s3BucketName;

    public Output<String> s3BucketName() {
        return this.s3BucketName == null ? Codegen.empty() : this.s3BucketName;
    }

    /**
     * The prefix for the specified S3 bucket.
     * 
     */
    @Import(name="s3KeyPrefix")
      private final @Nullable Output<String> s3KeyPrefix;

    public Output<String> s3KeyPrefix() {
        return this.s3KeyPrefix == null ? Codegen.empty() : this.s3KeyPrefix;
    }

    /**
     * The ARN of the AWS KMS key used to encrypt objects delivered by AWS Config. Must belong to the same Region as the destination S3 bucket.
     * 
     */
    @Import(name="s3KmsKeyArn")
      private final @Nullable Output<String> s3KmsKeyArn;

    public Output<String> s3KmsKeyArn() {
        return this.s3KmsKeyArn == null ? Codegen.empty() : this.s3KmsKeyArn;
    }

    /**
     * Options for how AWS Config delivers configuration snapshots. See below
     * 
     */
    @Import(name="snapshotDeliveryProperties")
      private final @Nullable Output<DeliveryChannelSnapshotDeliveryPropertiesGetArgs> snapshotDeliveryProperties;

    public Output<DeliveryChannelSnapshotDeliveryPropertiesGetArgs> snapshotDeliveryProperties() {
        return this.snapshotDeliveryProperties == null ? Codegen.empty() : this.snapshotDeliveryProperties;
    }

    /**
     * The ARN of the SNS topic that AWS Config delivers notifications to.
     * 
     */
    @Import(name="snsTopicArn")
      private final @Nullable Output<String> snsTopicArn;

    public Output<String> snsTopicArn() {
        return this.snsTopicArn == null ? Codegen.empty() : this.snsTopicArn;
    }

    public DeliveryChannelState(
        @Nullable Output<String> name,
        @Nullable Output<String> s3BucketName,
        @Nullable Output<String> s3KeyPrefix,
        @Nullable Output<String> s3KmsKeyArn,
        @Nullable Output<DeliveryChannelSnapshotDeliveryPropertiesGetArgs> snapshotDeliveryProperties,
        @Nullable Output<String> snsTopicArn) {
        this.name = name;
        this.s3BucketName = s3BucketName;
        this.s3KeyPrefix = s3KeyPrefix;
        this.s3KmsKeyArn = s3KmsKeyArn;
        this.snapshotDeliveryProperties = snapshotDeliveryProperties;
        this.snsTopicArn = snsTopicArn;
    }

    private DeliveryChannelState() {
        this.name = Codegen.empty();
        this.s3BucketName = Codegen.empty();
        this.s3KeyPrefix = Codegen.empty();
        this.s3KmsKeyArn = Codegen.empty();
        this.snapshotDeliveryProperties = Codegen.empty();
        this.snsTopicArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryChannelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> s3BucketName;
        private @Nullable Output<String> s3KeyPrefix;
        private @Nullable Output<String> s3KmsKeyArn;
        private @Nullable Output<DeliveryChannelSnapshotDeliveryPropertiesGetArgs> snapshotDeliveryProperties;
        private @Nullable Output<String> snsTopicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryChannelState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
    	      this.s3KmsKeyArn = defaults.s3KmsKeyArn;
    	      this.snapshotDeliveryProperties = defaults.snapshotDeliveryProperties;
    	      this.snsTopicArn = defaults.snsTopicArn;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder s3BucketName(@Nullable Output<String> s3BucketName) {
            this.s3BucketName = s3BucketName;
            return this;
        }
        public Builder s3BucketName(@Nullable String s3BucketName) {
            this.s3BucketName = Codegen.ofNullable(s3BucketName);
            return this;
        }
        public Builder s3KeyPrefix(@Nullable Output<String> s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }
        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = Codegen.ofNullable(s3KeyPrefix);
            return this;
        }
        public Builder s3KmsKeyArn(@Nullable Output<String> s3KmsKeyArn) {
            this.s3KmsKeyArn = s3KmsKeyArn;
            return this;
        }
        public Builder s3KmsKeyArn(@Nullable String s3KmsKeyArn) {
            this.s3KmsKeyArn = Codegen.ofNullable(s3KmsKeyArn);
            return this;
        }
        public Builder snapshotDeliveryProperties(@Nullable Output<DeliveryChannelSnapshotDeliveryPropertiesGetArgs> snapshotDeliveryProperties) {
            this.snapshotDeliveryProperties = snapshotDeliveryProperties;
            return this;
        }
        public Builder snapshotDeliveryProperties(@Nullable DeliveryChannelSnapshotDeliveryPropertiesGetArgs snapshotDeliveryProperties) {
            this.snapshotDeliveryProperties = Codegen.ofNullable(snapshotDeliveryProperties);
            return this;
        }
        public Builder snsTopicArn(@Nullable Output<String> snsTopicArn) {
            this.snsTopicArn = snsTopicArn;
            return this;
        }
        public Builder snsTopicArn(@Nullable String snsTopicArn) {
            this.snsTopicArn = Codegen.ofNullable(snsTopicArn);
            return this;
        }        public DeliveryChannelState build() {
            return new DeliveryChannelState(name, s3BucketName, s3KeyPrefix, s3KmsKeyArn, snapshotDeliveryProperties, snsTopicArn);
        }
    }
}
