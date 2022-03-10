// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseArgs;
import java.util.List;
import java.util.Objects;


/**
 * The collection of simple response candidates. This message in `QueryResult.fulfillment_messages` and `WebhookResponse.fulfillment_messages` should contain only one `SimpleResponse`.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesArgs();

    /**
     * The list of simple responses.
     * 
     */
    @InputImport(name="simpleResponses", required=true)
      private final Input<List<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseArgs>> simpleResponses;

    public Input<List<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseArgs>> getSimpleResponses() {
        return this.simpleResponses;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesArgs(Input<List<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseArgs>> simpleResponses) {
        this.simpleResponses = Objects.requireNonNull(simpleResponses, "expected parameter 'simpleResponses' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesArgs() {
        this.simpleResponses = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseArgs>> simpleResponses;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.simpleResponses = defaults.simpleResponses;
        }

        public Builder simpleResponses(Input<List<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseArgs>> simpleResponses) {
            this.simpleResponses = Objects.requireNonNull(simpleResponses);
            return this;
        }

        public Builder simpleResponses(List<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseArgs> simpleResponses) {
            this.simpleResponses = Input.of(Objects.requireNonNull(simpleResponses));
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesArgs(simpleResponses);
        }
    }
}
