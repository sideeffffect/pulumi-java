// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FirehoseDeliveryStreamKinesisSourceConfiguration {
    /**
     * The kinesis stream used as the source of the firehose delivery stream.
     * 
     */
    private final String kinesisStreamArn;
    /**
     * The ARN of the role that provides access to the source Kinesis stream.
     * 
     */
    private final String roleArn;

    @OutputCustomType.Constructor
    private FirehoseDeliveryStreamKinesisSourceConfiguration(
        @OutputCustomType.Parameter("kinesisStreamArn") String kinesisStreamArn,
        @OutputCustomType.Parameter("roleArn") String roleArn) {
        this.kinesisStreamArn = kinesisStreamArn;
        this.roleArn = roleArn;
    }

    /**
     * The kinesis stream used as the source of the firehose delivery stream.
     * 
    */
    public String getKinesisStreamArn() {
        return this.kinesisStreamArn;
    }
    /**
     * The ARN of the role that provides access to the source Kinesis stream.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamKinesisSourceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kinesisStreamArn;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamKinesisSourceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kinesisStreamArn = defaults.kinesisStreamArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder kinesisStreamArn(String kinesisStreamArn) {
            this.kinesisStreamArn = Objects.requireNonNull(kinesisStreamArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public FirehoseDeliveryStreamKinesisSourceConfiguration build() {
            return new FirehoseDeliveryStreamKinesisSourceConfiguration(kinesisStreamArn, roleArn);
        }
    }
}
