// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DeploymentCondition describes the state of a deployment at a certain point.
 * 
 */
public final class DeploymentConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentConditionArgs Empty = new DeploymentConditionArgs();

    /**
     * Last time the condition transitioned from one status to another.
     * 
     */
    @Import(name="lastTransitionTime")
    private @Nullable Output<String> lastTransitionTime;

    public Optional<Output<String>> lastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }

    /**
     * The last time this condition was updated.
     * 
     */
    @Import(name="lastUpdateTime")
    private @Nullable Output<String> lastUpdateTime;

    public Optional<Output<String>> lastUpdateTime() {
        return Optional.ofNullable(this.lastUpdateTime);
    }

    /**
     * A human readable message indicating details about the transition.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * The reason for the condition&#39;s last transition.
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    /**
     * Status of the condition, one of True, False, Unknown.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }

    /**
     * Type of deployment condition.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private DeploymentConditionArgs() {}

    private DeploymentConditionArgs(DeploymentConditionArgs $) {
        this.lastTransitionTime = $.lastTransitionTime;
        this.lastUpdateTime = $.lastUpdateTime;
        this.message = $.message;
        this.reason = $.reason;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentConditionArgs $;

        public Builder() {
            $ = new DeploymentConditionArgs();
        }

        public Builder(DeploymentConditionArgs defaults) {
            $ = new DeploymentConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder lastTransitionTime(@Nullable Output<String> lastTransitionTime) {
            $.lastTransitionTime = lastTransitionTime;
            return this;
        }

        public Builder lastTransitionTime(String lastTransitionTime) {
            return lastTransitionTime(Output.of(lastTransitionTime));
        }

        public Builder lastUpdateTime(@Nullable Output<String> lastUpdateTime) {
            $.lastUpdateTime = lastUpdateTime;
            return this;
        }

        public Builder lastUpdateTime(String lastUpdateTime) {
            return lastUpdateTime(Output.of(lastUpdateTime));
        }

        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        public Builder message(String message) {
            return message(Output.of(message));
        }

        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DeploymentConditionArgs build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
