// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.enums.GoogleCloudDialogflowV2beta1FulfillmentFeatureType;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Whether fulfillment is enabled for the specific feature.
 * 
 */
public final class GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs Empty = new GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs();

    /**
     * The type of the feature that enabled for fulfillment.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1FulfillmentFeatureType> type;

    public Input<GoogleCloudDialogflowV2beta1FulfillmentFeatureType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs(@Nullable Input<GoogleCloudDialogflowV2beta1FulfillmentFeatureType> type) {
        this.type = type;
    }

    private GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDialogflowV2beta1FulfillmentFeatureType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Input<GoogleCloudDialogflowV2beta1FulfillmentFeatureType> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable GoogleCloudDialogflowV2beta1FulfillmentFeatureType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs build() {
            return new GoogleCloudDialogflowV2beta1FulfillmentFeatureArgs(type);
        }
    }
}
