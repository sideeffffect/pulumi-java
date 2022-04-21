// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.DataFlowReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.DatasetReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Transformation for data flow sink.
 * 
 */
public final class DataFlowSinkResponse extends com.pulumi.resources.InvokeArgs {

    public static final DataFlowSinkResponse Empty = new DataFlowSinkResponse();

    /**
     * Dataset reference.
     * 
     */
    @Import(name="dataset")
    private @Nullable DatasetReferenceResponse dataset;

    public Optional<DatasetReferenceResponse> dataset() {
        return Optional.ofNullable(this.dataset);
    }

    /**
     * Transformation description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Flowlet Reference
     * 
     */
    @Import(name="flowlet")
    private @Nullable DataFlowReferenceResponse flowlet;

    public Optional<DataFlowReferenceResponse> flowlet() {
        return Optional.ofNullable(this.flowlet);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedService")
    private @Nullable LinkedServiceReferenceResponse linkedService;

    public Optional<LinkedServiceReferenceResponse> linkedService() {
        return Optional.ofNullable(this.linkedService);
    }

    /**
     * Transformation name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Schema linked service reference.
     * 
     */
    @Import(name="schemaLinkedService")
    private @Nullable LinkedServiceReferenceResponse schemaLinkedService;

    public Optional<LinkedServiceReferenceResponse> schemaLinkedService() {
        return Optional.ofNullable(this.schemaLinkedService);
    }

    private DataFlowSinkResponse() {}

    private DataFlowSinkResponse(DataFlowSinkResponse $) {
        this.dataset = $.dataset;
        this.description = $.description;
        this.flowlet = $.flowlet;
        this.linkedService = $.linkedService;
        this.name = $.name;
        this.schemaLinkedService = $.schemaLinkedService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataFlowSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataFlowSinkResponse $;

        public Builder() {
            $ = new DataFlowSinkResponse();
        }

        public Builder(DataFlowSinkResponse defaults) {
            $ = new DataFlowSinkResponse(Objects.requireNonNull(defaults));
        }

        public Builder dataset(@Nullable DatasetReferenceResponse dataset) {
            $.dataset = dataset;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder flowlet(@Nullable DataFlowReferenceResponse flowlet) {
            $.flowlet = flowlet;
            return this;
        }

        public Builder linkedService(@Nullable LinkedServiceReferenceResponse linkedService) {
            $.linkedService = linkedService;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder schemaLinkedService(@Nullable LinkedServiceReferenceResponse schemaLinkedService) {
            $.schemaLinkedService = schemaLinkedService;
            return this;
        }

        public DataFlowSinkResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
