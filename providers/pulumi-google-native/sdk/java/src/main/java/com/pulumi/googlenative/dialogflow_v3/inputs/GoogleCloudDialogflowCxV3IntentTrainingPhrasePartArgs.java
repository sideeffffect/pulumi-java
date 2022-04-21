// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a part of a training phrase.
 * 
 */
public final class GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs Empty = new GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs();

    /**
     * The parameter used to annotate this part of the training phrase. This field is required for annotated parts of the training phrase.
     * 
     */
    @Import(name="parameterId")
    private @Nullable Output<String> parameterId;

    public Optional<Output<String>> parameterId() {
        return Optional.ofNullable(this.parameterId);
    }

    /**
     * The text for this part.
     * 
     */
    @Import(name="text", required=true)
    private Output<String> text;

    public Output<String> text() {
        return this.text;
    }

    private GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs() {}

    private GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs(GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs $) {
        this.parameterId = $.parameterId;
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs(Objects.requireNonNull(defaults));
        }

        public Builder parameterId(@Nullable Output<String> parameterId) {
            $.parameterId = parameterId;
            return this;
        }

        public Builder parameterId(String parameterId) {
            return parameterId(Output.of(parameterId));
        }

        public Builder text(Output<String> text) {
            $.text = text;
            return this;
        }

        public Builder text(String text) {
            return text(Output.of(text));
        }

        public GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs build() {
            $.text = Objects.requireNonNull($.text, "expected parameter 'text' to be non-null");
            return $;
        }
    }

}
