// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.DataFlowReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.DatasetReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerQuerySourceResponse {
    /**
     * Dataset reference.
     * 
     */
    private final @Nullable DatasetReferenceResponse dataset;
    /**
     * Transformation description.
     * 
     */
    private final @Nullable String description;
    /**
     * Flowlet Reference
     * 
     */
    private final @Nullable DataFlowReferenceResponse flowlet;
    /**
     * Linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedService;
    /**
     * Transformation name.
     * 
     */
    private final String name;
    /**
     * Schema linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse schemaLinkedService;
    /**
     * source script.
     * 
     */
    private final @Nullable String script;

    @CustomType.Constructor
    private PowerQuerySourceResponse(
        @CustomType.Parameter("dataset") @Nullable DatasetReferenceResponse dataset,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("flowlet") @Nullable DataFlowReferenceResponse flowlet,
        @CustomType.Parameter("linkedService") @Nullable LinkedServiceReferenceResponse linkedService,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("schemaLinkedService") @Nullable LinkedServiceReferenceResponse schemaLinkedService,
        @CustomType.Parameter("script") @Nullable String script) {
        this.dataset = dataset;
        this.description = description;
        this.flowlet = flowlet;
        this.linkedService = linkedService;
        this.name = name;
        this.schemaLinkedService = schemaLinkedService;
        this.script = script;
    }

    /**
     * Dataset reference.
     * 
    */
    public Optional<DatasetReferenceResponse> dataset() {
        return Optional.ofNullable(this.dataset);
    }
    /**
     * Transformation description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Flowlet Reference
     * 
    */
    public Optional<DataFlowReferenceResponse> flowlet() {
        return Optional.ofNullable(this.flowlet);
    }
    /**
     * Linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> linkedService() {
        return Optional.ofNullable(this.linkedService);
    }
    /**
     * Transformation name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Schema linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> schemaLinkedService() {
        return Optional.ofNullable(this.schemaLinkedService);
    }
    /**
     * source script.
     * 
    */
    public Optional<String> script() {
        return Optional.ofNullable(this.script);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerQuerySourceResponse defaults) {
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

        public Builder(PowerQuerySourceResponse defaults) {
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
        }        public PowerQuerySourceResponse build() {
            return new PowerQuerySourceResponse(dataset, description, flowlet, linkedService, name, schemaLinkedService, script);
        }
    }
}
