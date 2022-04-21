// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pinpoint;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EventStreamArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventStreamArgs Empty = new EventStreamArgs();

    /**
     * The application ID.
     * 
     */
    @Import(name="applicationId", required=true)
    private Output<String> applicationId;

    public Output<String> applicationId() {
        return this.applicationId;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
     * 
     */
    @Import(name="destinationStreamArn", required=true)
    private Output<String> destinationStreamArn;

    public Output<String> destinationStreamArn() {
        return this.destinationStreamArn;
    }

    /**
     * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    private EventStreamArgs() {}

    private EventStreamArgs(EventStreamArgs $) {
        this.applicationId = $.applicationId;
        this.destinationStreamArn = $.destinationStreamArn;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventStreamArgs $;

        public Builder() {
            $ = new EventStreamArgs();
        }

        public Builder(EventStreamArgs defaults) {
            $ = new EventStreamArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationId(Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        public Builder destinationStreamArn(Output<String> destinationStreamArn) {
            $.destinationStreamArn = destinationStreamArn;
            return this;
        }

        public Builder destinationStreamArn(String destinationStreamArn) {
            return destinationStreamArn(Output.of(destinationStreamArn));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public EventStreamArgs build() {
            $.applicationId = Objects.requireNonNull($.applicationId, "expected parameter 'applicationId' to be non-null");
            $.destinationStreamArn = Objects.requireNonNull($.destinationStreamArn, "expected parameter 'destinationStreamArn' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
