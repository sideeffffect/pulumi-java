// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Instructions for a labeling job.
 * 
 */
public final class LabelingJobInstructionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabelingJobInstructionsArgs Empty = new LabelingJobInstructionsArgs();

    /**
     * The link to a page with detailed labeling instructions for labelers.
     * 
     */
    @InputImport(name="uri")
      private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    public LabelingJobInstructionsArgs(@Nullable Input<String> uri) {
        this.uri = uri;
    }

    private LabelingJobInstructionsArgs() {
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelingJobInstructionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelingJobInstructionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        public Builder uri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder uri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }
        public LabelingJobInstructionsArgs build() {
            return new LabelingJobInstructionsArgs(uri);
        }
    }
}
