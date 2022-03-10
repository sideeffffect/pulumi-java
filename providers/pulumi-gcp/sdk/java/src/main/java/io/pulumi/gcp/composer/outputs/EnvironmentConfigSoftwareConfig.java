// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnvironmentConfigSoftwareConfig {
    private final @Nullable Map<String,String> airflowConfigOverrides;
    private final @Nullable Map<String,String> envVariables;
    private final @Nullable String imageVersion;
    private final @Nullable Map<String,String> pypiPackages;
    private final @Nullable String pythonVersion;
    private final @Nullable Integer schedulerCount;

    @OutputCustomType.Constructor
    private EnvironmentConfigSoftwareConfig(
        @OutputCustomType.Parameter("airflowConfigOverrides") @Nullable Map<String,String> airflowConfigOverrides,
        @OutputCustomType.Parameter("envVariables") @Nullable Map<String,String> envVariables,
        @OutputCustomType.Parameter("imageVersion") @Nullable String imageVersion,
        @OutputCustomType.Parameter("pypiPackages") @Nullable Map<String,String> pypiPackages,
        @OutputCustomType.Parameter("pythonVersion") @Nullable String pythonVersion,
        @OutputCustomType.Parameter("schedulerCount") @Nullable Integer schedulerCount) {
        this.airflowConfigOverrides = airflowConfigOverrides;
        this.envVariables = envVariables;
        this.imageVersion = imageVersion;
        this.pypiPackages = pypiPackages;
        this.pythonVersion = pythonVersion;
        this.schedulerCount = schedulerCount;
    }

    public Map<String,String> getAirflowConfigOverrides() {
        return this.airflowConfigOverrides == null ? Map.of() : this.airflowConfigOverrides;
    }
    public Map<String,String> getEnvVariables() {
        return this.envVariables == null ? Map.of() : this.envVariables;
    }
    public Optional<String> getImageVersion() {
        return Optional.ofNullable(this.imageVersion);
    }
    public Map<String,String> getPypiPackages() {
        return this.pypiPackages == null ? Map.of() : this.pypiPackages;
    }
    public Optional<String> getPythonVersion() {
        return Optional.ofNullable(this.pythonVersion);
    }
    public Optional<Integer> getSchedulerCount() {
        return Optional.ofNullable(this.schedulerCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigSoftwareConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> airflowConfigOverrides;
        private @Nullable Map<String,String> envVariables;
        private @Nullable String imageVersion;
        private @Nullable Map<String,String> pypiPackages;
        private @Nullable String pythonVersion;
        private @Nullable Integer schedulerCount;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigSoftwareConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowConfigOverrides = defaults.airflowConfigOverrides;
    	      this.envVariables = defaults.envVariables;
    	      this.imageVersion = defaults.imageVersion;
    	      this.pypiPackages = defaults.pypiPackages;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.schedulerCount = defaults.schedulerCount;
        }

        public Builder airflowConfigOverrides(@Nullable Map<String,String> airflowConfigOverrides) {
            this.airflowConfigOverrides = airflowConfigOverrides;
            return this;
        }

        public Builder envVariables(@Nullable Map<String,String> envVariables) {
            this.envVariables = envVariables;
            return this;
        }

        public Builder imageVersion(@Nullable String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }

        public Builder pypiPackages(@Nullable Map<String,String> pypiPackages) {
            this.pypiPackages = pypiPackages;
            return this;
        }

        public Builder pythonVersion(@Nullable String pythonVersion) {
            this.pythonVersion = pythonVersion;
            return this;
        }

        public Builder schedulerCount(@Nullable Integer schedulerCount) {
            this.schedulerCount = schedulerCount;
            return this;
        }
        public EnvironmentConfigSoftwareConfig build() {
            return new EnvironmentConfigSoftwareConfig(airflowConfigOverrides, envVariables, imageVersion, pypiPackages, pythonVersion, schedulerCount);
        }
    }
}
