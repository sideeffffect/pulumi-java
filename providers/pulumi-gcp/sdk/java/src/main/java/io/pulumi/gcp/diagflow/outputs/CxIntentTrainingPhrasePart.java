// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CxIntentTrainingPhrasePart {
    /**
     * The parameter used to annotate this part of the training phrase. This field is required for annotated parts of the training phrase.
     * 
     */
    private final @Nullable String parameterId;
    /**
     * The text for this part.
     * 
     */
    private final String text;

    @OutputCustomType.Constructor({"parameterId","text"})
    private CxIntentTrainingPhrasePart(
        @Nullable String parameterId,
        String text) {
        this.parameterId = parameterId;
        this.text = text;
    }

    /**
     * The parameter used to annotate this part of the training phrase. This field is required for annotated parts of the training phrase.
     * 
    */
    public Optional<String> getParameterId() {
        return Optional.ofNullable(this.parameterId);
    }
    /**
     * The text for this part.
     * 
    */
    public String getText() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxIntentTrainingPhrasePart defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String parameterId;
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(CxIntentTrainingPhrasePart defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterId = defaults.parameterId;
    	      this.text = defaults.text;
        }

        public Builder setParameterId(@Nullable String parameterId) {
            this.parameterId = parameterId;
            return this;
        }

        public Builder setText(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public CxIntentTrainingPhrasePart build() {
            return new CxIntentTrainingPhrasePart(parameterId, text);
        }
    }
}
