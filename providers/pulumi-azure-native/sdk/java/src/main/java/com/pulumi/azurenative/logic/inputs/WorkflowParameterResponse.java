// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The workflow parameters.
 * 
 */
public final class WorkflowParameterResponse extends com.pulumi.resources.InvokeArgs {

    public static final WorkflowParameterResponse Empty = new WorkflowParameterResponse();

    /**
     * The description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The metadata.
     * 
     */
    @Import(name="metadata")
    private @Nullable Object metadata;

    public Optional<Object> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The type.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The value.
     * 
     */
    @Import(name="value")
    private @Nullable Object value;

    public Optional<Object> value() {
        return Optional.ofNullable(this.value);
    }

    private WorkflowParameterResponse() {}

    private WorkflowParameterResponse(WorkflowParameterResponse $) {
        this.description = $.description;
        this.metadata = $.metadata;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowParameterResponse $;

        public Builder() {
            $ = new WorkflowParameterResponse();
        }

        public Builder(WorkflowParameterResponse defaults) {
            $ = new WorkflowParameterResponse(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder metadata(@Nullable Object metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public Builder value(@Nullable Object value) {
            $.value = value;
            return this;
        }

        public WorkflowParameterResponse build() {
            return $;
        }
    }

}
