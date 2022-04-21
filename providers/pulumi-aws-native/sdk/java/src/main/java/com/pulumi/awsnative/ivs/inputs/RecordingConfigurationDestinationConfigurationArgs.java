// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ivs.inputs;

import com.pulumi.awsnative.ivs.inputs.RecordingConfigurationS3DestinationConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Recording Destination Configuration.
 * 
 */
public final class RecordingConfigurationDestinationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final RecordingConfigurationDestinationConfigurationArgs Empty = new RecordingConfigurationDestinationConfigurationArgs();

    @Import(name="s3", required=true)
    private Output<RecordingConfigurationS3DestinationConfigurationArgs> s3;

    public Output<RecordingConfigurationS3DestinationConfigurationArgs> s3() {
        return this.s3;
    }

    private RecordingConfigurationDestinationConfigurationArgs() {}

    private RecordingConfigurationDestinationConfigurationArgs(RecordingConfigurationDestinationConfigurationArgs $) {
        this.s3 = $.s3;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecordingConfigurationDestinationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecordingConfigurationDestinationConfigurationArgs $;

        public Builder() {
            $ = new RecordingConfigurationDestinationConfigurationArgs();
        }

        public Builder(RecordingConfigurationDestinationConfigurationArgs defaults) {
            $ = new RecordingConfigurationDestinationConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder s3(Output<RecordingConfigurationS3DestinationConfigurationArgs> s3) {
            $.s3 = s3;
            return this;
        }

        public Builder s3(RecordingConfigurationS3DestinationConfigurationArgs s3) {
            return s3(Output.of(s3));
        }

        public RecordingConfigurationDestinationConfigurationArgs build() {
            $.s3 = Objects.requireNonNull($.s3, "expected parameter 's3' to be non-null");
            return $;
        }
    }

}
