// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2NotificationConfigResponse {
    /**
     * Format of message.
     * 
     */
    private final String messageFormat;
    /**
     * Name of the Pub/Sub topic to publish conversation events like CONVERSATION_STARTED as serialized ConversationEvent protos. Notification works for phone calls, if this topic either is in the same project as the conversation or you grant `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow Service Agent` role in the topic project. Format: `projects//locations//topics/`.
     * 
     */
    private final String topic;

    @OutputCustomType.Constructor({"messageFormat","topic"})
    private GoogleCloudDialogflowV2NotificationConfigResponse(
        String messageFormat,
        String topic) {
        this.messageFormat = messageFormat;
        this.topic = topic;
    }

    /**
     * Format of message.
     * 
    */
    public String getMessageFormat() {
        return this.messageFormat;
    }
    /**
     * Name of the Pub/Sub topic to publish conversation events like CONVERSATION_STARTED as serialized ConversationEvent protos. Notification works for phone calls, if this topic either is in the same project as the conversation or you grant `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` the `Dialogflow Service Agent` role in the topic project. Format: `projects//locations//topics/`.
     * 
    */
    public String getTopic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2NotificationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageFormat;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2NotificationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFormat = defaults.messageFormat;
    	      this.topic = defaults.topic;
        }

        public Builder setMessageFormat(String messageFormat) {
            this.messageFormat = Objects.requireNonNull(messageFormat);
            return this;
        }

        public Builder setTopic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public GoogleCloudDialogflowV2NotificationConfigResponse build() {
            return new GoogleCloudDialogflowV2NotificationConfigResponse(messageFormat, topic);
        }
    }
}
