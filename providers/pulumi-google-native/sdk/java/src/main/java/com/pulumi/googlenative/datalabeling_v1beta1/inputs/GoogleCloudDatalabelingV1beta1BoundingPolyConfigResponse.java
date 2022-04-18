// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Config for image bounding poly (and bounding box) human labeling task.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse Empty = new GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse();

    /**
     * Annotation spec set resource name.
     * 
     */
    @Import(name="annotationSpecSet", required=true)
      private final String annotationSpecSet;

    public String annotationSpecSet() {
        return this.annotationSpecSet;
    }

    /**
     * Optional. Instruction message showed on contributors UI.
     * 
     */
    @Import(name="instructionMessage", required=true)
      private final String instructionMessage;

    public String instructionMessage() {
        return this.instructionMessage;
    }

    public GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse(
        String annotationSpecSet,
        String instructionMessage) {
        this.annotationSpecSet = Objects.requireNonNull(annotationSpecSet, "expected parameter 'annotationSpecSet' to be non-null");
        this.instructionMessage = Objects.requireNonNull(instructionMessage, "expected parameter 'instructionMessage' to be non-null");
    }

    private GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse() {
        this.annotationSpecSet = null;
        this.instructionMessage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String annotationSpecSet;
        private String instructionMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationSpecSet = defaults.annotationSpecSet;
    	      this.instructionMessage = defaults.instructionMessage;
        }

        public Builder annotationSpecSet(String annotationSpecSet) {
            this.annotationSpecSet = Objects.requireNonNull(annotationSpecSet);
            return this;
        }
        public Builder instructionMessage(String instructionMessage) {
            this.instructionMessage = Objects.requireNonNull(instructionMessage);
            return this;
        }        public GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse build() {
            return new GoogleCloudDatalabelingV1beta1BoundingPolyConfigResponse(annotationSpecSet, instructionMessage);
        }
    }
}
