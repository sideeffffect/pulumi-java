// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class EditAtomResponse {
    /**
     * End time in seconds for the atom, relative to the input file timeline. When `end_time_offset` is not specified, the `inputs` are used until the end of the atom.
     * 
     */
    private final String endTimeOffset;
    /**
     * List of `Input.key`s identifying files that should be used in this atom. The listed `inputs` must have the same timeline.
     * 
     */
    private final List<String> inputs;
    /**
     * A unique key for this atom. Must be specified when using advanced mapping.
     * 
     */
    private final String key;
    /**
     * Start time in seconds for the atom, relative to the input file timeline. The default is `0s`.
     * 
     */
    private final String startTimeOffset;

    @OutputCustomType.Constructor
    private EditAtomResponse(
        @OutputCustomType.Parameter("endTimeOffset") String endTimeOffset,
        @OutputCustomType.Parameter("inputs") List<String> inputs,
        @OutputCustomType.Parameter("key") String key,
        @OutputCustomType.Parameter("startTimeOffset") String startTimeOffset) {
        this.endTimeOffset = endTimeOffset;
        this.inputs = inputs;
        this.key = key;
        this.startTimeOffset = startTimeOffset;
    }

    /**
     * End time in seconds for the atom, relative to the input file timeline. When `end_time_offset` is not specified, the `inputs` are used until the end of the atom.
     * 
    */
    public String getEndTimeOffset() {
        return this.endTimeOffset;
    }
    /**
     * List of `Input.key`s identifying files that should be used in this atom. The listed `inputs` must have the same timeline.
     * 
    */
    public List<String> getInputs() {
        return this.inputs;
    }
    /**
     * A unique key for this atom. Must be specified when using advanced mapping.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Start time in seconds for the atom, relative to the input file timeline. The default is `0s`.
     * 
    */
    public String getStartTimeOffset() {
        return this.startTimeOffset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EditAtomResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTimeOffset;
        private List<String> inputs;
        private String key;
        private String startTimeOffset;

        public Builder() {
    	      // Empty
        }

        public Builder(EditAtomResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTimeOffset = defaults.endTimeOffset;
    	      this.inputs = defaults.inputs;
    	      this.key = defaults.key;
    	      this.startTimeOffset = defaults.startTimeOffset;
        }

        public Builder endTimeOffset(String endTimeOffset) {
            this.endTimeOffset = Objects.requireNonNull(endTimeOffset);
            return this;
        }

        public Builder inputs(List<String> inputs) {
            this.inputs = Objects.requireNonNull(inputs);
            return this;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder startTimeOffset(String startTimeOffset) {
            this.startTimeOffset = Objects.requireNonNull(startTimeOffset);
            return this;
        }
        public EditAtomResponse build() {
            return new EditAtomResponse(endTimeOffset, inputs, key, startTimeOffset);
        }
    }
}
