// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs;
import java.util.List;
import java.util.Objects;


/**
 * The card for presenting a carousel of options to select from.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs Empty = new GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs();

    /**
     * Carousel items.
     * 
     */
    @Import(name="items", required=true)
    private Output<List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs>> items;

    public Output<List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs>> items() {
        return this.items;
    }

    private GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs() {}

    private GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs(GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs $) {
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs();
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs defaults) {
            $ = new GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs(Objects.requireNonNull(defaults));
        }

        public Builder items(Output<List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs> items) {
            return items(Output.of(items));
        }

        public Builder items(GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs... items) {
            return items(List.of(items));
        }

        public GoogleCloudDialogflowV2IntentMessageCarouselSelectArgs build() {
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            return $;
        }
    }

}
