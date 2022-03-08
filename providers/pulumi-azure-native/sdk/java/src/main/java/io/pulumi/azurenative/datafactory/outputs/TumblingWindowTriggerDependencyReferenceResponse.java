// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.TriggerReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TumblingWindowTriggerDependencyReferenceResponse {
    /**
     * Timespan applied to the start time of a tumbling window when evaluating dependency.
     * 
     */
    private final @Nullable String offset;
    /**
     * Referenced trigger.
     * 
     */
    private final TriggerReferenceResponse referenceTrigger;
    /**
     * The size of the window when evaluating the dependency. If undefined the frequency of the tumbling window will be used.
     * 
     */
    private final @Nullable String size;
    /**
     * The type of dependency reference.
     * Expected value is 'TumblingWindowTriggerDependencyReference'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"offset","referenceTrigger","size","type"})
    private TumblingWindowTriggerDependencyReferenceResponse(
        @Nullable String offset,
        TriggerReferenceResponse referenceTrigger,
        @Nullable String size,
        String type) {
        this.offset = offset;
        this.referenceTrigger = referenceTrigger;
        this.size = size;
        this.type = type;
    }

    /**
     * Timespan applied to the start time of a tumbling window when evaluating dependency.
     * 
    */
    public Optional<String> getOffset() {
        return Optional.ofNullable(this.offset);
    }
    /**
     * Referenced trigger.
     * 
    */
    public TriggerReferenceResponse getReferenceTrigger() {
        return this.referenceTrigger;
    }
    /**
     * The size of the window when evaluating the dependency. If undefined the frequency of the tumbling window will be used.
     * 
    */
    public Optional<String> getSize() {
        return Optional.ofNullable(this.size);
    }
    /**
     * The type of dependency reference.
     * Expected value is 'TumblingWindowTriggerDependencyReference'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TumblingWindowTriggerDependencyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String offset;
        private TriggerReferenceResponse referenceTrigger;
        private @Nullable String size;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TumblingWindowTriggerDependencyReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offset = defaults.offset;
    	      this.referenceTrigger = defaults.referenceTrigger;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder setOffset(@Nullable String offset) {
            this.offset = offset;
            return this;
        }

        public Builder setReferenceTrigger(TriggerReferenceResponse referenceTrigger) {
            this.referenceTrigger = Objects.requireNonNull(referenceTrigger);
            return this;
        }

        public Builder setSize(@Nullable String size) {
            this.size = size;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TumblingWindowTriggerDependencyReferenceResponse build() {
            return new TumblingWindowTriggerDependencyReferenceResponse(offset, referenceTrigger, size, type);
        }
    }
}
