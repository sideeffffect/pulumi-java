// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.BaseImageDependencyResponse;
import io.pulumi.azurenative.containerregistry.inputs.SetValueResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a task step.
 * 
 */
public final class FileTaskStepResponse extends io.pulumi.resources.InvokeArgs {

    public static final FileTaskStepResponse Empty = new FileTaskStepResponse();

    /**
     * List of base image dependencies for a step.
     * 
     */
    @InputImport(name="baseImageDependencies", required=true)
      private final List<BaseImageDependencyResponse> baseImageDependencies;

    public List<BaseImageDependencyResponse> getBaseImageDependencies() {
        return this.baseImageDependencies;
    }

    /**
     * The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
     */
    @InputImport(name="contextAccessToken")
      private final @Nullable String contextAccessToken;

    public Optional<String> getContextAccessToken() {
        return this.contextAccessToken == null ? Optional.empty() : Optional.ofNullable(this.contextAccessToken);
    }

    /**
     * The URL(absolute or relative) of the source context for the task step.
     * 
     */
    @InputImport(name="contextPath")
      private final @Nullable String contextPath;

    public Optional<String> getContextPath() {
        return this.contextPath == null ? Optional.empty() : Optional.ofNullable(this.contextPath);
    }

    /**
     * The task template/definition file path relative to the source context.
     * 
     */
    @InputImport(name="taskFilePath", required=true)
      private final String taskFilePath;

    public String getTaskFilePath() {
        return this.taskFilePath;
    }

    /**
     * The type of the step.
     * Expected value is 'FileTask'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The collection of overridable values that can be passed when running a task.
     * 
     */
    @InputImport(name="values")
      private final @Nullable List<SetValueResponse> values;

    public List<SetValueResponse> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    /**
     * The task values/parameters file path relative to the source context.
     * 
     */
    @InputImport(name="valuesFilePath")
      private final @Nullable String valuesFilePath;

    public Optional<String> getValuesFilePath() {
        return this.valuesFilePath == null ? Optional.empty() : Optional.ofNullable(this.valuesFilePath);
    }

    public FileTaskStepResponse(
        List<BaseImageDependencyResponse> baseImageDependencies,
        @Nullable String contextAccessToken,
        @Nullable String contextPath,
        String taskFilePath,
        String type,
        @Nullable List<SetValueResponse> values,
        @Nullable String valuesFilePath) {
        this.baseImageDependencies = Objects.requireNonNull(baseImageDependencies, "expected parameter 'baseImageDependencies' to be non-null");
        this.contextAccessToken = contextAccessToken;
        this.contextPath = contextPath;
        this.taskFilePath = Objects.requireNonNull(taskFilePath, "expected parameter 'taskFilePath' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.values = values;
        this.valuesFilePath = valuesFilePath;
    }

    private FileTaskStepResponse() {
        this.baseImageDependencies = List.of();
        this.contextAccessToken = null;
        this.contextPath = null;
        this.taskFilePath = null;
        this.type = null;
        this.values = List.of();
        this.valuesFilePath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileTaskStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BaseImageDependencyResponse> baseImageDependencies;
        private @Nullable String contextAccessToken;
        private @Nullable String contextPath;
        private String taskFilePath;
        private String type;
        private @Nullable List<SetValueResponse> values;
        private @Nullable String valuesFilePath;

        public Builder() {
    	      // Empty
        }

        public Builder(FileTaskStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseImageDependencies = defaults.baseImageDependencies;
    	      this.contextAccessToken = defaults.contextAccessToken;
    	      this.contextPath = defaults.contextPath;
    	      this.taskFilePath = defaults.taskFilePath;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
    	      this.valuesFilePath = defaults.valuesFilePath;
        }

        public Builder baseImageDependencies(List<BaseImageDependencyResponse> baseImageDependencies) {
            this.baseImageDependencies = Objects.requireNonNull(baseImageDependencies);
            return this;
        }

        public Builder contextAccessToken(@Nullable String contextAccessToken) {
            this.contextAccessToken = contextAccessToken;
            return this;
        }

        public Builder contextPath(@Nullable String contextPath) {
            this.contextPath = contextPath;
            return this;
        }

        public Builder taskFilePath(String taskFilePath) {
            this.taskFilePath = Objects.requireNonNull(taskFilePath);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder values(@Nullable List<SetValueResponse> values) {
            this.values = values;
            return this;
        }

        public Builder valuesFilePath(@Nullable String valuesFilePath) {
            this.valuesFilePath = valuesFilePath;
            return this;
        }
        public FileTaskStepResponse build() {
            return new FileTaskStepResponse(baseImageDependencies, contextAccessToken, contextPath, taskFilePath, type, values, valuesFilePath);
        }
    }
}
