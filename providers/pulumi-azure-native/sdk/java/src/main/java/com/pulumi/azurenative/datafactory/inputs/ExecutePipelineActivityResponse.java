// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import com.pulumi.azurenative.datafactory.inputs.PipelineReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Execute pipeline activity.
 * 
 */
public final class ExecutePipelineActivityResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExecutePipelineActivityResponse Empty = new ExecutePipelineActivityResponse();

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable List<ActivityDependencyResponse> dependsOn;

    public Optional<List<ActivityDependencyResponse>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Pipeline parameters.
     * 
     */
    @Import(name="parameters")
    private @Nullable Map<String,Object> parameters;

    public Optional<Map<String,Object>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Pipeline reference.
     * 
     */
    @Import(name="pipeline", required=true)
    private PipelineReferenceResponse pipeline;

    public PipelineReferenceResponse pipeline() {
        return this.pipeline;
    }

    /**
     * Type of activity.
     * Expected value is &#39;ExecutePipeline&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
    private @Nullable List<UserPropertyResponse> userProperties;

    public Optional<List<UserPropertyResponse>> userProperties() {
        return Optional.ofNullable(this.userProperties);
    }

    /**
     * Defines whether activity execution will wait for the dependent pipeline execution to finish. Default is false.
     * 
     */
    @Import(name="waitOnCompletion")
    private @Nullable Boolean waitOnCompletion;

    public Optional<Boolean> waitOnCompletion() {
        return Optional.ofNullable(this.waitOnCompletion);
    }

    private ExecutePipelineActivityResponse() {}

    private ExecutePipelineActivityResponse(ExecutePipelineActivityResponse $) {
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.name = $.name;
        this.parameters = $.parameters;
        this.pipeline = $.pipeline;
        this.type = $.type;
        this.userProperties = $.userProperties;
        this.waitOnCompletion = $.waitOnCompletion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExecutePipelineActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecutePipelineActivityResponse $;

        public Builder() {
            $ = new ExecutePipelineActivityResponse();
        }

        public Builder(ExecutePipelineActivityResponse defaults) {
            $ = new ExecutePipelineActivityResponse(Objects.requireNonNull(defaults));
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder parameters(@Nullable Map<String,Object> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder pipeline(PipelineReferenceResponse pipeline) {
            $.pipeline = pipeline;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            $.userProperties = userProperties;
            return this;
        }

        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }

        public Builder waitOnCompletion(@Nullable Boolean waitOnCompletion) {
            $.waitOnCompletion = waitOnCompletion;
            return this;
        }

        public ExecutePipelineActivityResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.pipeline = Objects.requireNonNull($.pipeline, "expected parameter 'pipeline' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
