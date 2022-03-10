// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowParameterResponse {
    /**
     * The description.
     * 
     */
    private final @Nullable String description;
    /**
     * The metadata.
     * 
     */
    private final @Nullable Object metadata;
    /**
     * The type.
     * 
     */
    private final @Nullable String type;
    /**
     * The value.
     * 
     */
    private final @Nullable Object value;

    @OutputCustomType.Constructor
    private WorkflowParameterResponse(
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("metadata") @Nullable Object metadata,
        @OutputCustomType.Parameter("type") @Nullable String type,
        @OutputCustomType.Parameter("value") @Nullable Object value) {
        this.description = description;
        this.metadata = metadata;
        this.type = type;
        this.value = value;
    }

    /**
     * The description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The metadata.
     * 
    */
    public Optional<Object> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * The type.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * The value.
     * 
    */
    public Optional<Object> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Object metadata;
        private @Nullable String type;
        private @Nullable Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.metadata = defaults.metadata;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder metadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder value(@Nullable Object value) {
            this.value = value;
            return this;
        }
        public WorkflowParameterResponse build() {
            return new WorkflowParameterResponse(description, metadata, type, value);
        }
    }
}
