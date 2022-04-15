// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueOutboundCallerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueueOutboundCallerConfigArgs Empty = new QueueOutboundCallerConfigArgs();

    /**
     * Specifies the caller ID name.
     * 
     */
    @Import(name="outboundCallerIdName")
      private final @Nullable Output<String> outboundCallerIdName;

    public Output<String> outboundCallerIdName() {
        return this.outboundCallerIdName == null ? Codegen.empty() : this.outboundCallerIdName;
    }

    /**
     * Specifies the caller ID number.
     * 
     */
    @Import(name="outboundCallerIdNumberId")
      private final @Nullable Output<String> outboundCallerIdNumberId;

    public Output<String> outboundCallerIdNumberId() {
        return this.outboundCallerIdNumberId == null ? Codegen.empty() : this.outboundCallerIdNumberId;
    }

    /**
     * Specifies outbound whisper flow to be used during an outbound call.
     * 
     */
    @Import(name="outboundFlowId")
      private final @Nullable Output<String> outboundFlowId;

    public Output<String> outboundFlowId() {
        return this.outboundFlowId == null ? Codegen.empty() : this.outboundFlowId;
    }

    public QueueOutboundCallerConfigArgs(
        @Nullable Output<String> outboundCallerIdName,
        @Nullable Output<String> outboundCallerIdNumberId,
        @Nullable Output<String> outboundFlowId) {
        this.outboundCallerIdName = outboundCallerIdName;
        this.outboundCallerIdNumberId = outboundCallerIdNumberId;
        this.outboundFlowId = outboundFlowId;
    }

    private QueueOutboundCallerConfigArgs() {
        this.outboundCallerIdName = Codegen.empty();
        this.outboundCallerIdNumberId = Codegen.empty();
        this.outboundFlowId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueOutboundCallerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> outboundCallerIdName;
        private @Nullable Output<String> outboundCallerIdNumberId;
        private @Nullable Output<String> outboundFlowId;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueOutboundCallerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outboundCallerIdName = defaults.outboundCallerIdName;
    	      this.outboundCallerIdNumberId = defaults.outboundCallerIdNumberId;
    	      this.outboundFlowId = defaults.outboundFlowId;
        }

        public Builder outboundCallerIdName(@Nullable Output<String> outboundCallerIdName) {
            this.outboundCallerIdName = outboundCallerIdName;
            return this;
        }
        public Builder outboundCallerIdName(@Nullable String outboundCallerIdName) {
            this.outboundCallerIdName = Codegen.ofNullable(outboundCallerIdName);
            return this;
        }
        public Builder outboundCallerIdNumberId(@Nullable Output<String> outboundCallerIdNumberId) {
            this.outboundCallerIdNumberId = outboundCallerIdNumberId;
            return this;
        }
        public Builder outboundCallerIdNumberId(@Nullable String outboundCallerIdNumberId) {
            this.outboundCallerIdNumberId = Codegen.ofNullable(outboundCallerIdNumberId);
            return this;
        }
        public Builder outboundFlowId(@Nullable Output<String> outboundFlowId) {
            this.outboundFlowId = outboundFlowId;
            return this;
        }
        public Builder outboundFlowId(@Nullable String outboundFlowId) {
            this.outboundFlowId = Codegen.ofNullable(outboundFlowId);
            return this;
        }        public QueueOutboundCallerConfigArgs build() {
            return new QueueOutboundCallerConfigArgs(outboundCallerIdName, outboundCallerIdNumberId, outboundFlowId);
        }
    }
}
