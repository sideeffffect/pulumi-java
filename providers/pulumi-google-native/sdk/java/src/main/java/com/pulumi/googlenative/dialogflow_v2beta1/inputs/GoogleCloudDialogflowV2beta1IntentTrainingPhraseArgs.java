// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2beta1.enums.GoogleCloudDialogflowV2beta1IntentTrainingPhraseType;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents an example that the agent is trained on.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs Empty = new GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs();

    /**
     * The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase. Note: The API does not automatically annotate training phrases like the Dialogflow Console does. Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated. If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set. If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways: - `Part.text` is set to a part of the phrase that has no parameters. - `Part.text` is set to a part of the phrase that you want to annotate, and the `entity_type`, `alias`, and `user_defined` fields are all set.
     * 
     */
    @Import(name="parts", required=true)
    private Output<List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartArgs>> parts;

    public Output<List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartArgs>> parts() {
        return this.parts;
    }

    /**
     * Optional. Indicates how many times this example was added to the intent. Each time a developer adds an existing sample by editing an intent or training, this counter is increased.
     * 
     */
    @Import(name="timesAddedCount")
    private @Nullable Output<Integer> timesAddedCount;

    public Optional<Output<Integer>> timesAddedCount() {
        return Optional.ofNullable(this.timesAddedCount);
    }

    /**
     * The type of the training phrase.
     * 
     */
    @Import(name="type", required=true)
    private Output<GoogleCloudDialogflowV2beta1IntentTrainingPhraseType> type;

    public Output<GoogleCloudDialogflowV2beta1IntentTrainingPhraseType> type() {
        return this.type;
    }

    private GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs() {}

    private GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs(GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs $) {
        this.parts = $.parts;
        this.timesAddedCount = $.timesAddedCount;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs(Objects.requireNonNull(defaults));
        }

        public Builder parts(Output<List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartArgs>> parts) {
            $.parts = parts;
            return this;
        }

        public Builder parts(List<GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartArgs> parts) {
            return parts(Output.of(parts));
        }

        public Builder parts(GoogleCloudDialogflowV2beta1IntentTrainingPhrasePartArgs... parts) {
            return parts(List.of(parts));
        }

        public Builder timesAddedCount(@Nullable Output<Integer> timesAddedCount) {
            $.timesAddedCount = timesAddedCount;
            return this;
        }

        public Builder timesAddedCount(Integer timesAddedCount) {
            return timesAddedCount(Output.of(timesAddedCount));
        }

        public Builder type(Output<GoogleCloudDialogflowV2beta1IntentTrainingPhraseType> type) {
            $.type = type;
            return this;
        }

        public Builder type(GoogleCloudDialogflowV2beta1IntentTrainingPhraseType type) {
            return type(Output.of(type));
        }

        public GoogleCloudDialogflowV2beta1IntentTrainingPhraseArgs build() {
            $.parts = Objects.requireNonNull($.parts, "expected parameter 'parts' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
