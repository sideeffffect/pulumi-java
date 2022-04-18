// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * FlowSchemaCondition describes conditions for a FlowSchema.
 * 
 */
public final class FlowSchemaConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowSchemaConditionArgs Empty = new FlowSchemaConditionArgs();

    /**
     * `lastTransitionTime` is the last time the condition transitioned from one status to another.
     * 
     */
    @Import(name="lastTransitionTime")
      private final @Nullable Output<String> lastTransitionTime;

    public Output<String> lastTransitionTime() {
        return this.lastTransitionTime == null ? Codegen.empty() : this.lastTransitionTime;
    }

    /**
     * `message` is a human-readable message indicating details about last transition.
     * 
     */
    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> message() {
        return this.message == null ? Codegen.empty() : this.message;
    }

    /**
     * `reason` is a unique, one-word, CamelCase reason for the condition's last transition.
     * 
     */
    @Import(name="reason")
      private final @Nullable Output<String> reason;

    public Output<String> reason() {
        return this.reason == null ? Codegen.empty() : this.reason;
    }

    /**
     * `status` is the status of the condition. Can be True, False, Unknown. Required.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * `type` is the type of the condition. Required.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public FlowSchemaConditionArgs(
        @Nullable Output<String> lastTransitionTime,
        @Nullable Output<String> message,
        @Nullable Output<String> reason,
        @Nullable Output<String> status,
        @Nullable Output<String> type) {
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = status;
        this.type = type;
    }

    private FlowSchemaConditionArgs() {
        this.lastTransitionTime = Codegen.empty();
        this.message = Codegen.empty();
        this.reason = Codegen.empty();
        this.status = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSchemaConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> lastTransitionTime;
        private @Nullable Output<String> message;
        private @Nullable Output<String> reason;
        private @Nullable Output<String> status;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSchemaConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastTransitionTime = defaults.lastTransitionTime;
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder lastTransitionTime(@Nullable Output<String> lastTransitionTime) {
            this.lastTransitionTime = lastTransitionTime;
            return this;
        }
        public Builder lastTransitionTime(@Nullable String lastTransitionTime) {
            this.lastTransitionTime = Codegen.ofNullable(lastTransitionTime);
            return this;
        }
        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = Codegen.ofNullable(message);
            return this;
        }
        public Builder reason(@Nullable Output<String> reason) {
            this.reason = reason;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = Codegen.ofNullable(reason);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public FlowSchemaConditionArgs build() {
            return new FlowSchemaConditionArgs(lastTransitionTime, message, reason, status, type);
        }
    }
}
