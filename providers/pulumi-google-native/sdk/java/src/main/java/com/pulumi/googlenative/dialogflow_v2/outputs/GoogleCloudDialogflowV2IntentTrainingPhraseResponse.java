// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2IntentTrainingPhraseResponse {
    /**
     * The unique identifier of this training phrase.
     * 
     */
    private final String name;
    /**
     * The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase. Note: The API does not automatically annotate training phrases like the Dialogflow Console does. Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated. If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set. If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways: - `Part.text` is set to a part of the phrase that has no parameters. - `Part.text` is set to a part of the phrase that you want to annotate, and the `entity_type`, `alias`, and `user_defined` fields are all set.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse> parts;
    /**
     * Optional. Indicates how many times this example was added to the intent. Each time a developer adds an existing sample by editing an intent or training, this counter is increased.
     * 
     */
    private final Integer timesAddedCount;
    /**
     * The type of the training phrase.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2IntentTrainingPhraseResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parts") List<GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse> parts,
        @CustomType.Parameter("timesAddedCount") Integer timesAddedCount,
        @CustomType.Parameter("type") String type) {
        this.name = name;
        this.parts = parts;
        this.timesAddedCount = timesAddedCount;
        this.type = type;
    }

    /**
     * The unique identifier of this training phrase.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase. Note: The API does not automatically annotate training phrases like the Dialogflow Console does. Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated. If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set. If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways: - `Part.text` is set to a part of the phrase that has no parameters. - `Part.text` is set to a part of the phrase that you want to annotate, and the `entity_type`, `alias`, and `user_defined` fields are all set.
     * 
    */
    public List<GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse> parts() {
        return this.parts;
    }
    /**
     * Optional. Indicates how many times this example was added to the intent. Each time a developer adds an existing sample by editing an intent or training, this counter is increased.
     * 
    */
    public Integer timesAddedCount() {
        return this.timesAddedCount;
    }
    /**
     * The type of the training phrase.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentTrainingPhraseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse> parts;
        private Integer timesAddedCount;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentTrainingPhraseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parts = defaults.parts;
    	      this.timesAddedCount = defaults.timesAddedCount;
    	      this.type = defaults.type;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parts(List<GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse> parts) {
            this.parts = Objects.requireNonNull(parts);
            return this;
        }
        public Builder parts(GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse... parts) {
            return parts(List.of(parts));
        }
        public Builder timesAddedCount(Integer timesAddedCount) {
            this.timesAddedCount = Objects.requireNonNull(timesAddedCount);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GoogleCloudDialogflowV2IntentTrainingPhraseResponse build() {
            return new GoogleCloudDialogflowV2IntentTrainingPhraseResponse(name, parts, timesAddedCount, type);
        }
    }
}
