// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.InputDataBindingResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.MpiResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.OutputDataBindingResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.PyTorchResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.TensorFlowResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Trial component definition.
 * 
 */
public final class TrialComponentResponse extends io.pulumi.resources.InvokeArgs {

    public static final TrialComponentResponse Empty = new TrialComponentResponse();

    /**
     * ARM resource ID of the code asset.
     * 
     */
    @InputImport(name="codeId")
      private final @Nullable String codeId;

    public Optional<String> getCodeId() {
        return this.codeId == null ? Optional.empty() : Optional.ofNullable(this.codeId);
    }

    /**
     * The command to execute on startup of the job. eg. "python train.py"
     * 
     */
    @InputImport(name="command", required=true)
      private final String command;

    public String getCommand() {
        return this.command;
    }

    /**
     * Distribution configuration of the job. If set, this should be one of Mpi, Tensorflow, PyTorch, or null.
     * 
     */
    @InputImport(name="distribution")
      private final @Nullable Object distribution;

    public Object getDistribution() {
        return this.distribution == null ? null : this.distribution;
    }

    /**
     * The ARM resource ID of the Environment specification for the job.
     * 
     */
    @InputImport(name="environmentId")
      private final @Nullable String environmentId;

    public Optional<String> getEnvironmentId() {
        return this.environmentId == null ? Optional.empty() : Optional.ofNullable(this.environmentId);
    }

    /**
     * Environment variables included in the job.
     * 
     */
    @InputImport(name="environmentVariables")
      private final @Nullable Map<String,String> environmentVariables;

    public Map<String,String> getEnvironmentVariables() {
        return this.environmentVariables == null ? Map.of() : this.environmentVariables;
    }

    /**
     * Mapping of input data bindings used in the job.
     * 
     */
    @InputImport(name="inputDataBindings")
      private final @Nullable Map<String,InputDataBindingResponse> inputDataBindings;

    public Map<String,InputDataBindingResponse> getInputDataBindings() {
        return this.inputDataBindings == null ? Map.of() : this.inputDataBindings;
    }

    /**
     * Mapping of output data bindings used in the job.
     * 
     */
    @InputImport(name="outputDataBindings")
      private final @Nullable Map<String,OutputDataBindingResponse> outputDataBindings;

    public Map<String,OutputDataBindingResponse> getOutputDataBindings() {
        return this.outputDataBindings == null ? Map.of() : this.outputDataBindings;
    }

    /**
     * The max run duration in ISO 8601 format, after which the trial component will be cancelled.
     * Only supports duration with precision as low as Seconds.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable String timeout;

    public Optional<String> getTimeout() {
        return this.timeout == null ? Optional.empty() : Optional.ofNullable(this.timeout);
    }

    public TrialComponentResponse(
        @Nullable String codeId,
        String command,
        @Nullable Object distribution,
        @Nullable String environmentId,
        @Nullable Map<String,String> environmentVariables,
        @Nullable Map<String,InputDataBindingResponse> inputDataBindings,
        @Nullable Map<String,OutputDataBindingResponse> outputDataBindings,
        @Nullable String timeout) {
        this.codeId = codeId;
        this.command = Objects.requireNonNull(command, "expected parameter 'command' to be non-null");
        this.distribution = distribution;
        this.environmentId = environmentId;
        this.environmentVariables = environmentVariables;
        this.inputDataBindings = inputDataBindings;
        this.outputDataBindings = outputDataBindings;
        this.timeout = timeout;
    }

    private TrialComponentResponse() {
        this.codeId = null;
        this.command = null;
        this.distribution = null;
        this.environmentId = null;
        this.environmentVariables = Map.of();
        this.inputDataBindings = Map.of();
        this.outputDataBindings = Map.of();
        this.timeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrialComponentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String codeId;
        private String command;
        private @Nullable Object distribution;
        private @Nullable String environmentId;
        private @Nullable Map<String,String> environmentVariables;
        private @Nullable Map<String,InputDataBindingResponse> inputDataBindings;
        private @Nullable Map<String,OutputDataBindingResponse> outputDataBindings;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(TrialComponentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeId = defaults.codeId;
    	      this.command = defaults.command;
    	      this.distribution = defaults.distribution;
    	      this.environmentId = defaults.environmentId;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.inputDataBindings = defaults.inputDataBindings;
    	      this.outputDataBindings = defaults.outputDataBindings;
    	      this.timeout = defaults.timeout;
        }

        public Builder codeId(@Nullable String codeId) {
            this.codeId = codeId;
            return this;
        }

        public Builder command(String command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }

        public Builder distribution(@Nullable Object distribution) {
            this.distribution = distribution;
            return this;
        }

        public Builder environmentId(@Nullable String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder inputDataBindings(@Nullable Map<String,InputDataBindingResponse> inputDataBindings) {
            this.inputDataBindings = inputDataBindings;
            return this;
        }

        public Builder outputDataBindings(@Nullable Map<String,OutputDataBindingResponse> outputDataBindings) {
            this.outputDataBindings = outputDataBindings;
            return this;
        }

        public Builder timeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }
        public TrialComponentResponse build() {
            return new TrialComponentResponse(codeId, command, distribution, environmentId, environmentVariables, inputDataBindings, outputDataBindings, timeout);
        }
    }
}
