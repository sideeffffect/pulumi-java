// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Whether fulfillment is enabled for the specific feature.
 * 
 */
public final class GoogleCloudDialogflowV2FulfillmentFeatureResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2FulfillmentFeatureResponse Empty = new GoogleCloudDialogflowV2FulfillmentFeatureResponse();

    /**
     * The type of the feature that enabled for fulfillment.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public GoogleCloudDialogflowV2FulfillmentFeatureResponse(String type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudDialogflowV2FulfillmentFeatureResponse() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2FulfillmentFeatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2FulfillmentFeatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GoogleCloudDialogflowV2FulfillmentFeatureResponse build() {
            return new GoogleCloudDialogflowV2FulfillmentFeatureResponse(type);
        }
    }
}
