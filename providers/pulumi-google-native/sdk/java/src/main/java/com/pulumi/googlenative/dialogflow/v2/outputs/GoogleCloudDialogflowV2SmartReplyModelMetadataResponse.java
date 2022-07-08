// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2SmartReplyModelMetadataResponse {
    /**
     * @return Optional. Type of the smart reply model. If not provided, model_type is used.
     * 
     */
    private final String trainingModelType;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2SmartReplyModelMetadataResponse(@CustomType.Parameter("trainingModelType") String trainingModelType) {
        this.trainingModelType = trainingModelType;
    }

    /**
     * @return Optional. Type of the smart reply model. If not provided, model_type is used.
     * 
     */
    public String trainingModelType() {
        return this.trainingModelType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2SmartReplyModelMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String trainingModelType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2SmartReplyModelMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.trainingModelType = defaults.trainingModelType;
        }

        public Builder trainingModelType(String trainingModelType) {
            this.trainingModelType = Objects.requireNonNull(trainingModelType);
            return this;
        }        public GoogleCloudDialogflowV2SmartReplyModelMetadataResponse build() {
            return new GoogleCloudDialogflowV2SmartReplyModelMetadataResponse(trainingModelType);
        }
    }
}
