// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2IntentMessageTableCardCellResponse {
    /**
     * @return Text in this cell.
     * 
     */
    private final String text;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageTableCardCellResponse(@CustomType.Parameter("text") String text) {
        this.text = text;
    }

    /**
     * @return Text in this cell.
     * 
     */
    public String text() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageTableCardCellResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageTableCardCellResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageTableCardCellResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageTableCardCellResponse(text);
        }
    }
}
