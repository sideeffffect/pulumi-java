// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AnalyticsApplicationOutputKinesisFirehoseArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationOutputKinesisFirehoseArgs Empty = new AnalyticsApplicationOutputKinesisFirehoseArgs();

    /**
     * The ARN of the Kinesis Firehose delivery stream.
     * 
     */
    @InputImport(name="resourceArn", required=true)
      private final Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn;
    }

    /**
     * The ARN of the IAM Role used to access the stream.
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    public AnalyticsApplicationOutputKinesisFirehoseArgs(
        Input<String> resourceArn,
        Input<String> roleArn) {
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private AnalyticsApplicationOutputKinesisFirehoseArgs() {
        this.resourceArn = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationOutputKinesisFirehoseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> resourceArn;
        private Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationOutputKinesisFirehoseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder resourceArn(Input<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Input.of(Objects.requireNonNull(resourceArn));
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
        public AnalyticsApplicationOutputKinesisFirehoseArgs build() {
            return new AnalyticsApplicationOutputKinesisFirehoseArgs(resourceArn, roleArn);
        }
    }
}
