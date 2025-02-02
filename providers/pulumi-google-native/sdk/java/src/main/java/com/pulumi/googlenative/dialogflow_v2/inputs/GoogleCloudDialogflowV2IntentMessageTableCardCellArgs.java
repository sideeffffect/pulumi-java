// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Cell of TableCardRow.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageTableCardCellArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageTableCardCellArgs Empty = new GoogleCloudDialogflowV2IntentMessageTableCardCellArgs();

    /**
     * Text in this cell.
     * 
     */
    @Import(name="text", required=true)
    private Output<String> text;

    /**
     * @return Text in this cell.
     * 
     */
    public Output<String> text() {
        return this.text;
    }

    private GoogleCloudDialogflowV2IntentMessageTableCardCellArgs() {}

    private GoogleCloudDialogflowV2IntentMessageTableCardCellArgs(GoogleCloudDialogflowV2IntentMessageTableCardCellArgs $) {
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentMessageTableCardCellArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageTableCardCellArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentMessageTableCardCellArgs();
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageTableCardCellArgs defaults) {
            $ = new GoogleCloudDialogflowV2IntentMessageTableCardCellArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param text Text in this cell.
         * 
         * @return builder
         * 
         */
        public Builder text(Output<String> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text Text in this cell.
         * 
         * @return builder
         * 
         */
        public Builder text(String text) {
            return text(Output.of(text));
        }

        public GoogleCloudDialogflowV2IntentMessageTableCardCellArgs build() {
            $.text = Objects.requireNonNull($.text, "expected parameter 'text' to be non-null");
            return $;
        }
    }

}
