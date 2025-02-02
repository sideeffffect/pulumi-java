// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse {
    /**
     * @return Column heading.
     * 
     */
    private final String header;
    /**
     * @return Optional. Defines text alignment for all cells in this column.
     * 
     */
    private final String horizontalAlignment;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse(
        @CustomType.Parameter("header") String header,
        @CustomType.Parameter("horizontalAlignment") String horizontalAlignment) {
        this.header = header;
        this.horizontalAlignment = horizontalAlignment;
    }

    /**
     * @return Column heading.
     * 
     */
    public String header() {
        return this.header;
    }
    /**
     * @return Optional. Defines text alignment for all cells in this column.
     * 
     */
    public String horizontalAlignment() {
        return this.horizontalAlignment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String header;
        private String horizontalAlignment;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.header = defaults.header;
    	      this.horizontalAlignment = defaults.horizontalAlignment;
        }

        public Builder header(String header) {
            this.header = Objects.requireNonNull(header);
            return this;
        }
        public Builder horizontalAlignment(String horizontalAlignment) {
            this.horizontalAlignment = Objects.requireNonNull(horizontalAlignment);
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageColumnPropertiesResponse(header, horizontalAlignment);
        }
    }
}
