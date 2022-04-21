// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NamespaceCondition contains details about state of namespace.
 * 
 */
public final class NamespaceConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceConditionArgs Empty = new NamespaceConditionArgs();

    @Import(name="lastTransitionTime")
    private @Nullable Output<String> lastTransitionTime;

    public Optional<Output<String>> lastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }

    @Import(name="message")
    private @Nullable Output<String> message;

    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

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
     * Type of namespace controller condition.
     * 
     * Possible enum values:
     *  - `&#34;NamespaceContentRemaining&#34;` contains information about resources remaining in a namespace.
     *  - `&#34;NamespaceDeletionContentFailure&#34;` contains information about namespace deleter errors during deletion of resources.
     *  - `&#34;NamespaceDeletionDiscoveryFailure&#34;` contains information about namespace deleter errors during resource discovery.
     *  - `&#34;NamespaceDeletionGroupVersionParsingFailure&#34;` contains information about namespace deleter errors parsing GV for legacy types.
     *  - `&#34;NamespaceFinalizersRemaining&#34;` contains information about which finalizers are on resources remaining in a namespace.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private NamespaceConditionArgs() {}

    private NamespaceConditionArgs(NamespaceConditionArgs $) {
        this.lastTransitionTime = $.lastTransitionTime;
        this.message = $.message;
        this.reason = $.reason;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceConditionArgs $;

        public Builder() {
            $ = new NamespaceConditionArgs();
        }

        public Builder(NamespaceConditionArgs defaults) {
            $ = new NamespaceConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder lastTransitionTime(@Nullable Output<String> lastTransitionTime) {
            $.lastTransitionTime = lastTransitionTime;
            return this;
        }

        public Builder lastTransitionTime(String lastTransitionTime) {
            return lastTransitionTime(Output.of(lastTransitionTime));
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

        public NamespaceConditionArgs build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
