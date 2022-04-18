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
 * Power query sink.
 * 
 */
public final class PowerQuerySinkResponse extends com.pulumi.resources.InvokeArgs {

    public static final PowerQuerySinkResponse Empty = new PowerQuerySinkResponse();

    /**
     * Dataset reference.
     * 
     */
    @Import(name="dataset")
      private final @Nullable DatasetReferenceResponse dataset;

    public Optional<DatasetReferenceResponse> dataset() {
        return this.dataset == null ? Optional.empty() : Optional.ofNullable(this.dataset);
    }

    /**
     * Transformation description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Flowlet Reference
     * 
     */
    @Import(name="flowlet")
      private final @Nullable DataFlowReferenceResponse flowlet;

    public Optional<DataFlowReferenceResponse> flowlet() {
        return this.flowlet == null ? Optional.empty() : Optional.ofNullable(this.flowlet);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedService")
      private final @Nullable LinkedServiceReferenceResponse linkedService;

    public Optional<LinkedServiceReferenceResponse> linkedService() {
        return this.linkedService == null ? Optional.empty() : Optional.ofNullable(this.linkedService);
    }

    /**
     * Transformation name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Schema linked service reference.
     * 
     */
    @Import(name="schemaLinkedService")
      private final @Nullable LinkedServiceReferenceResponse schemaLinkedService;

    public Optional<LinkedServiceReferenceResponse> schemaLinkedService() {
        return this.schemaLinkedService == null ? Optional.empty() : Optional.ofNullable(this.schemaLinkedService);
    }

    /**
     * sink script.
     * 
     */
    @Import(name="script")
      private final @Nullable String script;

    public Optional<String> script() {
        return this.script == null ? Optional.empty() : Optional.ofNullable(this.script);
    }

    public PowerQuerySinkResponse(
        @Nullable DatasetReferenceResponse dataset,
        @Nullable String description,
        @Nullable DataFlowReferenceResponse flowlet,
        @Nullable LinkedServiceReferenceResponse linkedService,
        String name,
        @Nullable LinkedServiceReferenceResponse schemaLinkedService,
        @Nullable String script) {
        this.dataset = dataset;
        this.description = description;
        this.flowlet = flowlet;
        this.linkedService = linkedService;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.schemaLinkedService = schemaLinkedService;
        this.script = script;
    }

    private PowerQuerySinkResponse() {
        this.dataset = null;
        this.description = null;
        this.flowlet = null;
        this.linkedService = null;
        this.name = null;
        this.schemaLinkedService = null;
        this.script = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerQuerySinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetReferenceResponse dataset;
        private @Nullable String description;
        private @Nullable DataFlowReferenceResponse flowlet;
        private @Nullable LinkedServiceReferenceResponse linkedService;
        private String name;
        private @Nullable LinkedServiceReferenceResponse schemaLinkedService;
        private @Nullable String script;

        public Builder() {
    	      // Empty
        }

        public Builder(PowerQuerySinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.description = defaults.description;
    	      this.flowlet = defaults.flowlet;
    	      this.linkedService = defaults.linkedService;
    	      this.name = defaults.name;
    	      this.schemaLinkedService = defaults.schemaLinkedService;
    	      this.script = defaults.script;
        }

        public Builder dataset(@Nullable DatasetReferenceResponse dataset) {
            this.dataset = dataset;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder flowlet(@Nullable DataFlowReferenceResponse flowlet) {
            this.flowlet = flowlet;
            return this;
        }
        public Builder linkedService(@Nullable LinkedServiceReferenceResponse linkedService) {
            this.linkedService = linkedService;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder schemaLinkedService(@Nullable LinkedServiceReferenceResponse schemaLinkedService) {
            this.schemaLinkedService = schemaLinkedService;
            return this;
        }
        public Builder script(@Nullable String script) {
            this.script = script;
            return this;
        }        public PowerQuerySinkResponse build() {
            return new PowerQuerySinkResponse(dataset, description, flowlet, linkedService, name, schemaLinkedService, script);
        }
    }
}
