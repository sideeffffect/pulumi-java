// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentAccessLogSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentAccessLogSettingArgs Empty = new DeploymentAccessLogSettingArgs();

    /**
     * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose delivery stream to receive access logs. If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with amazon-apigateway-.
     * 
     */
    @InputImport(name="destinationArn")
      private final @Nullable Input<String> destinationArn;

    public Input<String> getDestinationArn() {
        return this.destinationArn == null ? Input.empty() : this.destinationArn;
    }

    /**
     * A single line format of the access logs of data, as specified by selected $context variables. The format must include at least $context.requestId.
     * 
     */
    @InputImport(name="format")
      private final @Nullable Input<String> format;

    public Input<String> getFormat() {
        return this.format == null ? Input.empty() : this.format;
    }

    public DeploymentAccessLogSettingArgs(
        @Nullable Input<String> destinationArn,
        @Nullable Input<String> format) {
        this.destinationArn = destinationArn;
        this.format = format;
    }

    private DeploymentAccessLogSettingArgs() {
        this.destinationArn = Input.empty();
        this.format = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentAccessLogSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> destinationArn;
        private @Nullable Input<String> format;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentAccessLogSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationArn = defaults.destinationArn;
    	      this.format = defaults.format;
        }

        public Builder destinationArn(@Nullable Input<String> destinationArn) {
            this.destinationArn = destinationArn;
            return this;
        }

        public Builder destinationArn(@Nullable String destinationArn) {
            this.destinationArn = Input.ofNullable(destinationArn);
            return this;
        }

        public Builder format(@Nullable Input<String> format) {
            this.format = format;
            return this;
        }

        public Builder format(@Nullable String format) {
            this.format = Input.ofNullable(format);
            return this;
        }
        public DeploymentAccessLogSettingArgs build() {
            return new DeploymentAccessLogSettingArgs(destinationArn, format);
        }
    }
}
