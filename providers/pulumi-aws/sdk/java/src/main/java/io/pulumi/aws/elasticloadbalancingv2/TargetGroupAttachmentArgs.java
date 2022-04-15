// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetGroupAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetGroupAttachmentArgs Empty = new TargetGroupAttachmentArgs();

    /**
     * The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to 'all'.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> availabilityZone() {
        return this.availabilityZone == null ? Codegen.empty() : this.availabilityZone;
    }

    /**
     * The port on which targets receive traffic.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> port() {
        return this.port == null ? Codegen.empty() : this.port;
    }

    /**
     * The ARN of the target group with which to register targets
     * 
     */
    @Import(name="targetGroupArn", required=true)
      private final Output<String> targetGroupArn;

    public Output<String> targetGroupArn() {
        return this.targetGroupArn;
    }

    /**
     * The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda. If the target type is alb, specify the arn of alb.
     * 
     */
    @Import(name="targetId", required=true)
      private final Output<String> targetId;

    public Output<String> targetId() {
        return this.targetId;
    }

    public TargetGroupAttachmentArgs(
        @Nullable Output<String> availabilityZone,
        @Nullable Output<Integer> port,
        Output<String> targetGroupArn,
        Output<String> targetId) {
        this.availabilityZone = availabilityZone;
        this.port = port;
        this.targetGroupArn = Objects.requireNonNull(targetGroupArn, "expected parameter 'targetGroupArn' to be non-null");
        this.targetId = Objects.requireNonNull(targetId, "expected parameter 'targetId' to be non-null");
    }

    private TargetGroupAttachmentArgs() {
        this.availabilityZone = Codegen.empty();
        this.port = Codegen.empty();
        this.targetGroupArn = Codegen.empty();
        this.targetId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetGroupAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<Integer> port;
        private Output<String> targetGroupArn;
        private Output<String> targetId;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetGroupAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.port = defaults.port;
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.targetId = defaults.targetId;
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Codegen.ofNullable(availabilityZone);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Codegen.ofNullable(port);
            return this;
        }
        public Builder targetGroupArn(Output<String> targetGroupArn) {
            this.targetGroupArn = Objects.requireNonNull(targetGroupArn);
            return this;
        }
        public Builder targetGroupArn(String targetGroupArn) {
            this.targetGroupArn = Output.of(Objects.requireNonNull(targetGroupArn));
            return this;
        }
        public Builder targetId(Output<String> targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }
        public Builder targetId(String targetId) {
            this.targetId = Output.of(Objects.requireNonNull(targetId));
            return this;
        }        public TargetGroupAttachmentArgs build() {
            return new TargetGroupAttachmentArgs(availabilityZone, port, targetGroupArn, targetId);
        }
    }
}
