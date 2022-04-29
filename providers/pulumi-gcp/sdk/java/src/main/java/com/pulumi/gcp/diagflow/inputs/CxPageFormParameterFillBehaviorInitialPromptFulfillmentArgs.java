// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs extends ResourceArgs {

    public static final CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs Empty = new CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs();

    /**
     * The list of rich message responses to present to the user.
     * Structure is documented below.
     * 
     */
    @Import(name="messages")
    private @Nullable Output<List<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs>> messages;

    /**
     * @return The list of rich message responses to present to the user.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs>>> messages() {
        return Optional.ofNullable(this.messages);
    }

    /**
     * Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
     * 
     */
    @Import(name="returnPartialResponses")
    private @Nullable Output<Boolean> returnPartialResponses;

    /**
     * @return Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
     * 
     */
    public Optional<Output<Boolean>> returnPartialResponses() {
        return Optional.ofNullable(this.returnPartialResponses);
    }

    /**
     * The tag used by the webhook to identify which fulfillment is being called. This field is required if webhook is specified.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return The tag used by the webhook to identify which fulfillment is being called. This field is required if webhook is specified.
     * 
     */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    /**
     * The webhook to call. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/webhooks/&lt;Webhook ID&gt;.
     * 
     */
    @Import(name="webhook")
    private @Nullable Output<String> webhook;

    /**
     * @return The webhook to call. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/webhooks/&lt;Webhook ID&gt;.
     * 
     */
    public Optional<Output<String>> webhook() {
        return Optional.ofNullable(this.webhook);
    }

    private CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs() {}

    private CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs(CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs $) {
        this.messages = $.messages;
        this.returnPartialResponses = $.returnPartialResponses;
        this.tag = $.tag;
        this.webhook = $.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs $;

        public Builder() {
            $ = new CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs();
        }

        public Builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs defaults) {
            $ = new CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param messages The list of rich message responses to present to the user.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder messages(@Nullable Output<List<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs>> messages) {
            $.messages = messages;
            return this;
        }

        /**
         * @param messages The list of rich message responses to present to the user.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder messages(List<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs> messages) {
            return messages(Output.of(messages));
        }

        /**
         * @param messages The list of rich message responses to present to the user.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder messages(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs... messages) {
            return messages(List.of(messages));
        }

        /**
         * @param returnPartialResponses Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
         * 
         * @return builder
         * 
         */
        public Builder returnPartialResponses(@Nullable Output<Boolean> returnPartialResponses) {
            $.returnPartialResponses = returnPartialResponses;
            return this;
        }

        /**
         * @param returnPartialResponses Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
         * 
         * @return builder
         * 
         */
        public Builder returnPartialResponses(Boolean returnPartialResponses) {
            return returnPartialResponses(Output.of(returnPartialResponses));
        }

        /**
         * @param tag The tag used by the webhook to identify which fulfillment is being called. This field is required if webhook is specified.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag The tag used by the webhook to identify which fulfillment is being called. This field is required if webhook is specified.
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        /**
         * @param webhook The webhook to call. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/webhooks/&lt;Webhook ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder webhook(@Nullable Output<String> webhook) {
            $.webhook = webhook;
            return this;
        }

        /**
         * @param webhook The webhook to call. Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/webhooks/&lt;Webhook ID&gt;.
         * 
         * @return builder
         * 
         */
        public Builder webhook(String webhook) {
            return webhook(Output.of(webhook));
        }

        public CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs build() {
            return $;
        }
    }

}
