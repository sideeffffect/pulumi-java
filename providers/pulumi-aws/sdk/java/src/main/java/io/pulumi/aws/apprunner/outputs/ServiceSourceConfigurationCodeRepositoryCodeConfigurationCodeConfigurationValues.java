// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValues {
    /**
     * The command App Runner runs to build your application.
     * 
     */
    private final @Nullable String buildCommand;
    /**
     * The port that your application listens to in the container. Defaults to `"8080"`.
     * 
     */
    private final @Nullable String port;
    /**
     * A runtime environment type for building and running an App Runner service. Represents a programming language runtime. Valid values: `PYTHON_3`, `NODEJS_12`.
     * 
     */
    private final String runtime;
    /**
     * Environment variables available to your running App Runner service. A map of key/value pairs. Keys with a prefix of `AWSAPPRUNNER` are reserved for system use and aren't valid.
     * 
     */
    private final @Nullable Map<String,String> runtimeEnvironmentVariables;
    /**
     * The command App Runner runs to start your application.
     * 
     */
    private final @Nullable String startCommand;

    @OutputCustomType.Constructor({"buildCommand","port","runtime","runtimeEnvironmentVariables","startCommand"})
    private ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValues(
        @Nullable String buildCommand,
        @Nullable String port,
        String runtime,
        @Nullable Map<String,String> runtimeEnvironmentVariables,
        @Nullable String startCommand) {
        this.buildCommand = buildCommand;
        this.port = port;
        this.runtime = runtime;
        this.runtimeEnvironmentVariables = runtimeEnvironmentVariables;
        this.startCommand = startCommand;
    }

    /**
     * The command App Runner runs to build your application.
     * 
    */
    public Optional<String> getBuildCommand() {
        return Optional.ofNullable(this.buildCommand);
    }
    /**
     * The port that your application listens to in the container. Defaults to `"8080"`.
     * 
    */
    public Optional<String> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * A runtime environment type for building and running an App Runner service. Represents a programming language runtime. Valid values: `PYTHON_3`, `NODEJS_12`.
     * 
    */
    public String getRuntime() {
        return this.runtime;
    }
    /**
     * Environment variables available to your running App Runner service. A map of key/value pairs. Keys with a prefix of `AWSAPPRUNNER` are reserved for system use and aren't valid.
     * 
    */
    public Map<String,String> getRuntimeEnvironmentVariables() {
        return this.runtimeEnvironmentVariables == null ? Map.of() : this.runtimeEnvironmentVariables;
    }
    /**
     * The command App Runner runs to start your application.
     * 
    */
    public Optional<String> getStartCommand() {
        return Optional.ofNullable(this.startCommand);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValues defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String buildCommand;
        private @Nullable String port;
        private String runtime;
        private @Nullable Map<String,String> runtimeEnvironmentVariables;
        private @Nullable String startCommand;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValues defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildCommand = defaults.buildCommand;
    	      this.port = defaults.port;
    	      this.runtime = defaults.runtime;
    	      this.runtimeEnvironmentVariables = defaults.runtimeEnvironmentVariables;
    	      this.startCommand = defaults.startCommand;
        }

        public Builder setBuildCommand(@Nullable String buildCommand) {
            this.buildCommand = buildCommand;
            return this;
        }

        public Builder setPort(@Nullable String port) {
            this.port = port;
            return this;
        }

        public Builder setRuntime(String runtime) {
            this.runtime = Objects.requireNonNull(runtime);
            return this;
        }

        public Builder setRuntimeEnvironmentVariables(@Nullable Map<String,String> runtimeEnvironmentVariables) {
            this.runtimeEnvironmentVariables = runtimeEnvironmentVariables;
            return this;
        }

        public Builder setStartCommand(@Nullable String startCommand) {
            this.startCommand = startCommand;
            return this;
        }
        public ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValues build() {
            return new ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValues(buildCommand, port, runtime, runtimeEnvironmentVariables, startCommand);
        }
    }
}
