// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.ArgumentResponse;
import io.pulumi.azurenative.containerregistry.outputs.BaseImageDependencyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DockerBuildStepResponse {
    /**
     * The collection of override arguments to be used when executing this build step.
     * 
     */
    private final @Nullable List<ArgumentResponse> arguments;
    /**
     * List of base image dependencies for a step.
     * 
     */
    private final List<BaseImageDependencyResponse> baseImageDependencies;
    /**
     * The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
     */
    private final @Nullable String contextAccessToken;
    /**
     * The URL(absolute or relative) of the source context for the task step.
     * 
     */
    private final @Nullable String contextPath;
    /**
     * The Docker file path relative to the source context.
     * 
     */
    private final String dockerFilePath;
    /**
     * The fully qualified image names including the repository and tag.
     * 
     */
    private final @Nullable List<String> imageNames;
    /**
     * The value of this property indicates whether the image built should be pushed to the registry or not.
     * 
     */
    private final @Nullable Boolean isPushEnabled;
    /**
     * The value of this property indicates whether the image cache is enabled or not.
     * 
     */
    private final @Nullable Boolean noCache;
    /**
     * The name of the target build stage for the docker build.
     * 
     */
    private final @Nullable String target;
    /**
     * The type of the step.
     * Expected value is 'Docker'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"arguments","baseImageDependencies","contextAccessToken","contextPath","dockerFilePath","imageNames","isPushEnabled","noCache","target","type"})
    private DockerBuildStepResponse(
        @Nullable List<ArgumentResponse> arguments,
        List<BaseImageDependencyResponse> baseImageDependencies,
        @Nullable String contextAccessToken,
        @Nullable String contextPath,
        String dockerFilePath,
        @Nullable List<String> imageNames,
        @Nullable Boolean isPushEnabled,
        @Nullable Boolean noCache,
        @Nullable String target,
        String type) {
        this.arguments = arguments;
        this.baseImageDependencies = baseImageDependencies;
        this.contextAccessToken = contextAccessToken;
        this.contextPath = contextPath;
        this.dockerFilePath = dockerFilePath;
        this.imageNames = imageNames;
        this.isPushEnabled = isPushEnabled;
        this.noCache = noCache;
        this.target = target;
        this.type = type;
    }

    /**
     * The collection of override arguments to be used when executing this build step.
     * 
    */
    public List<ArgumentResponse> getArguments() {
        return this.arguments == null ? List.of() : this.arguments;
    }
    /**
     * List of base image dependencies for a step.
     * 
    */
    public List<BaseImageDependencyResponse> getBaseImageDependencies() {
        return this.baseImageDependencies;
    }
    /**
     * The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
    */
    public Optional<String> getContextAccessToken() {
        return Optional.ofNullable(this.contextAccessToken);
    }
    /**
     * The URL(absolute or relative) of the source context for the task step.
     * 
    */
    public Optional<String> getContextPath() {
        return Optional.ofNullable(this.contextPath);
    }
    /**
     * The Docker file path relative to the source context.
     * 
    */
    public String getDockerFilePath() {
        return this.dockerFilePath;
    }
    /**
     * The fully qualified image names including the repository and tag.
     * 
    */
    public List<String> getImageNames() {
        return this.imageNames == null ? List.of() : this.imageNames;
    }
    /**
     * The value of this property indicates whether the image built should be pushed to the registry or not.
     * 
    */
    public Optional<Boolean> getIsPushEnabled() {
        return Optional.ofNullable(this.isPushEnabled);
    }
    /**
     * The value of this property indicates whether the image cache is enabled or not.
     * 
    */
    public Optional<Boolean> getNoCache() {
        return Optional.ofNullable(this.noCache);
    }
    /**
     * The name of the target build stage for the docker build.
     * 
    */
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }
    /**
     * The type of the step.
     * Expected value is 'Docker'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DockerBuildStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ArgumentResponse> arguments;
        private List<BaseImageDependencyResponse> baseImageDependencies;
        private @Nullable String contextAccessToken;
        private @Nullable String contextPath;
        private String dockerFilePath;
        private @Nullable List<String> imageNames;
        private @Nullable Boolean isPushEnabled;
        private @Nullable Boolean noCache;
        private @Nullable String target;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DockerBuildStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.baseImageDependencies = defaults.baseImageDependencies;
    	      this.contextAccessToken = defaults.contextAccessToken;
    	      this.contextPath = defaults.contextPath;
    	      this.dockerFilePath = defaults.dockerFilePath;
    	      this.imageNames = defaults.imageNames;
    	      this.isPushEnabled = defaults.isPushEnabled;
    	      this.noCache = defaults.noCache;
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        public Builder setArguments(@Nullable List<ArgumentResponse> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder setBaseImageDependencies(List<BaseImageDependencyResponse> baseImageDependencies) {
            this.baseImageDependencies = Objects.requireNonNull(baseImageDependencies);
            return this;
        }

        public Builder setContextAccessToken(@Nullable String contextAccessToken) {
            this.contextAccessToken = contextAccessToken;
            return this;
        }

        public Builder setContextPath(@Nullable String contextPath) {
            this.contextPath = contextPath;
            return this;
        }

        public Builder setDockerFilePath(String dockerFilePath) {
            this.dockerFilePath = Objects.requireNonNull(dockerFilePath);
            return this;
        }

        public Builder setImageNames(@Nullable List<String> imageNames) {
            this.imageNames = imageNames;
            return this;
        }

        public Builder setIsPushEnabled(@Nullable Boolean isPushEnabled) {
            this.isPushEnabled = isPushEnabled;
            return this;
        }

        public Builder setNoCache(@Nullable Boolean noCache) {
            this.noCache = noCache;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public DockerBuildStepResponse build() {
            return new DockerBuildStepResponse(arguments, baseImageDependencies, contextAccessToken, contextPath, dockerFilePath, imageNames, isPushEnabled, noCache, target, type);
        }
    }
}
