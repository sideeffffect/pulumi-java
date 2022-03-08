// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class MessageCountDetailsResponse {
    /**
     * Number of active messages in the queue, topic, or subscription.
     * 
     */
    private final Double activeMessageCount;
    /**
     * Number of messages that are dead lettered.
     * 
     */
    private final Double deadLetterMessageCount;
    /**
     * Number of scheduled messages.
     * 
     */
    private final Double scheduledMessageCount;
    /**
     * Number of messages transferred into dead letters.
     * 
     */
    private final Double transferDeadLetterMessageCount;
    /**
     * Number of messages transferred to another queue, topic, or subscription.
     * 
     */
    private final Double transferMessageCount;

    @OutputCustomType.Constructor({"activeMessageCount","deadLetterMessageCount","scheduledMessageCount","transferDeadLetterMessageCount","transferMessageCount"})
    private MessageCountDetailsResponse(
        Double activeMessageCount,
        Double deadLetterMessageCount,
        Double scheduledMessageCount,
        Double transferDeadLetterMessageCount,
        Double transferMessageCount) {
        this.activeMessageCount = activeMessageCount;
        this.deadLetterMessageCount = deadLetterMessageCount;
        this.scheduledMessageCount = scheduledMessageCount;
        this.transferDeadLetterMessageCount = transferDeadLetterMessageCount;
        this.transferMessageCount = transferMessageCount;
    }

    /**
     * Number of active messages in the queue, topic, or subscription.
     * 
    */
    public Double getActiveMessageCount() {
        return this.activeMessageCount;
    }
    /**
     * Number of messages that are dead lettered.
     * 
    */
    public Double getDeadLetterMessageCount() {
        return this.deadLetterMessageCount;
    }
    /**
     * Number of scheduled messages.
     * 
    */
    public Double getScheduledMessageCount() {
        return this.scheduledMessageCount;
    }
    /**
     * Number of messages transferred into dead letters.
     * 
    */
    public Double getTransferDeadLetterMessageCount() {
        return this.transferDeadLetterMessageCount;
    }
    /**
     * Number of messages transferred to another queue, topic, or subscription.
     * 
    */
    public Double getTransferMessageCount() {
        return this.transferMessageCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MessageCountDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double activeMessageCount;
        private Double deadLetterMessageCount;
        private Double scheduledMessageCount;
        private Double transferDeadLetterMessageCount;
        private Double transferMessageCount;

        public Builder() {
    	      // Empty
        }

        public Builder(MessageCountDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeMessageCount = defaults.activeMessageCount;
    	      this.deadLetterMessageCount = defaults.deadLetterMessageCount;
    	      this.scheduledMessageCount = defaults.scheduledMessageCount;
    	      this.transferDeadLetterMessageCount = defaults.transferDeadLetterMessageCount;
    	      this.transferMessageCount = defaults.transferMessageCount;
        }

        public Builder setActiveMessageCount(Double activeMessageCount) {
            this.activeMessageCount = Objects.requireNonNull(activeMessageCount);
            return this;
        }

        public Builder setDeadLetterMessageCount(Double deadLetterMessageCount) {
            this.deadLetterMessageCount = Objects.requireNonNull(deadLetterMessageCount);
            return this;
        }

        public Builder setScheduledMessageCount(Double scheduledMessageCount) {
            this.scheduledMessageCount = Objects.requireNonNull(scheduledMessageCount);
            return this;
        }

        public Builder setTransferDeadLetterMessageCount(Double transferDeadLetterMessageCount) {
            this.transferDeadLetterMessageCount = Objects.requireNonNull(transferDeadLetterMessageCount);
            return this;
        }

        public Builder setTransferMessageCount(Double transferMessageCount) {
            this.transferMessageCount = Objects.requireNonNull(transferMessageCount);
            return this;
        }
        public MessageCountDetailsResponse build() {
            return new MessageCountDetailsResponse(activeMessageCount, deadLetterMessageCount, scheduledMessageCount, transferDeadLetterMessageCount, transferMessageCount);
        }
    }
}
