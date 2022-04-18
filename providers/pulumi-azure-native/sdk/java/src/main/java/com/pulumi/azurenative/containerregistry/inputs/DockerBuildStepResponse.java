// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.ArgumentResponse;
import com.pulumi.azurenative.containerregistry.inputs.BaseImageDependencyResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Docker build step.
 * 
 */
public final class DockerBuildStepResponse extends com.pulumi.resources.InvokeArgs {

    public static final DockerBuildStepResponse Empty = new DockerBuildStepResponse();

    /**
     * The collection of override arguments to be used when executing this build step.
     * 
     */
    @Import(name="arguments")
      private final @Nullable List<ArgumentResponse> arguments;

    public List<ArgumentResponse> arguments() {
        return this.arguments == null ? List.of() : this.arguments;
    }

    /**
     * List of base image dependencies for a step.
     * 
     */
    @Import(name="baseImageDependencies", required=true)
      private final List<BaseImageDependencyResponse> baseImageDependencies;

    public List<BaseImageDependencyResponse> baseImageDependencies() {
        return this.baseImageDependencies;
    }

    /**
     * The token (git PAT or SAS token of storage account blob) associated with the context for a step.
     * 
     */
    @Import(name="contextAccessToken")
      private final @Nullable String contextAccessToken;

    public Optional<String> contextAccessToken() {
        return this.contextAccessToken == null ? Optional.empty() : Optional.ofNullable(this.contextAccessToken);
    }

    /**
     * The URL(absolute or relative) of the source context for the task step.
     * 
     */
    @Import(name="contextPath")
      private final @Nullable String contextPath;

    public Optional<String> contextPath() {
        return this.contextPath == null ? Optional.empty() : Optional.ofNullable(this.contextPath);
    }

    /**
     * The Docker file path relative to the source context.
     * 
     */
    @Import(name="dockerFilePath", required=true)
      private final String dockerFilePath;

    public String dockerFilePath() {
        return this.dockerFilePath;
    }

    /**
     * The fully qualified image names including the repository and tag.
     * 
     */
    @Import(name="imageNames")
      private final @Nullable List<String> imageNames;

    public List<String> imageNames() {
        return this.imageNames == null ? List.of() : this.imageNames;
    }

    /**
     * The value of this property indicates whether the image built should be pushed to the registry or not.
     * 
     */
    @Import(name="isPushEnabled")
      private final @Nullable Boolean isPushEnabled;

    public Optional<Boolean> isPushEnabled() {
        return this.isPushEnabled == null ? Optional.empty() : Optional.ofNullable(this.isPushEnabled);
    }

    /**
     * The value of this property indicates whether the image cache is enabled or not.
     * 
     */
    @Import(name="noCache")
      private final @Nullable Boolean noCache;

    public Optional<Boolean> noCache() {
        return this.noCache == null ? Optional.empty() : Optional.ofNullable(this.noCache);
    }

    /**
     * The name of the target build stage for the docker build.
     * 
     */
    @Import(name="target")
      private final @Nullable String target;

    public Optional<String> target() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    /**
     * The type of the step.
     * Expected value is 'Docker'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public DockerBuildStepResponse(
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
        this.baseImageDependencies = Objects.requireNonNull(baseImageDependencies, "expected parameter 'baseImageDependencies' to be non-null");
        this.contextAccessToken = contextAccessToken;
        this.contextPath = contextPath;
        this.dockerFilePath = Objects.requireNonNull(dockerFilePath, "expected parameter 'dockerFilePath' to be non-null");
        this.imageNames = imageNames;
        this.isPushEnabled = isPushEnabled == null ? true : isPushEnabled;
        this.noCache = noCache == null ? false : noCache;
        this.target = target;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DockerBuildStepResponse() {
        this.arguments = List.of();
        this.baseImageDependencies = List.of();
        this.contextAccessToken = null;
        this.contextPath = null;
        this.dockerFilePath = null;
        this.imageNames = List.of();
        this.isPushEnabled = null;
        this.noCache = null;
        this.target = null;
        this.type = null;
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

        public Builder arguments(@Nullable List<ArgumentResponse> arguments) {
            this.arguments = arguments;
            return this;
        }
        public Builder arguments(ArgumentResponse... arguments) {
            return arguments(List.of(arguments));
        }
        public Builder baseImageDependencies(List<BaseImageDependencyResponse> baseImageDependencies) {
            this.baseImageDependencies = Objects.requireNonNull(baseImageDependencies);
            return this;
        }
        public Builder baseImageDependencies(BaseImageDependencyResponse... baseImageDependencies) {
            return baseImageDependencies(List.of(baseImageDependencies));
        }
        public Builder contextAccessToken(@Nullable String contextAccessToken) {
            this.contextAccessToken = contextAccessToken;
            return this;
        }
        public Builder contextPath(@Nullable String contextPath) {
            this.contextPath = contextPath;
            return this;
        }
        public Builder dockerFilePath(String dockerFilePath) {
            this.dockerFilePath = Objects.requireNonNull(dockerFilePath);
            return this;
        }
        public Builder imageNames(@Nullable List<String> imageNames) {
            this.imageNames = imageNames;
            return this;
        }
        public Builder imageNames(String... imageNames) {
            return imageNames(List.of(imageNames));
        }
        public Builder isPushEnabled(@Nullable Boolean isPushEnabled) {
            this.isPushEnabled = isPushEnabled;
            return this;
        }
        public Builder noCache(@Nullable Boolean noCache) {
            this.noCache = noCache;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DockerBuildStepResponse build() {
            return new DockerBuildStepResponse(arguments, baseImageDependencies, contextAccessToken, contextPath, dockerFilePath, imageNames, isPushEnabled, noCache, target, type);
        }
    }
}
