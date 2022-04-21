// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetEnvironmentConfigSoftwareConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentConfigSoftwareConfig Empty = new GetEnvironmentConfigSoftwareConfig();

    @Import(name="airflowConfigOverrides", required=true)
    private Map<String,String> airflowConfigOverrides;

    public Map<String,String> airflowConfigOverrides() {
        return this.airflowConfigOverrides;
    }

    @Import(name="envVariables", required=true)
    private Map<String,String> envVariables;

    public Map<String,String> envVariables() {
        return this.envVariables;
    }

    @Import(name="imageVersion", required=true)
    private String imageVersion;

    public String imageVersion() {
        return this.imageVersion;
    }

    @Import(name="pypiPackages", required=true)
    private Map<String,String> pypiPackages;

    public Map<String,String> pypiPackages() {
        return this.pypiPackages;
    }

    @Import(name="pythonVersion", required=true)
    private String pythonVersion;

    public String pythonVersion() {
        return this.pythonVersion;
    }

    @Import(name="schedulerCount", required=true)
    private Integer schedulerCount;

    public Integer schedulerCount() {
        return this.schedulerCount;
    }

    private GetEnvironmentConfigSoftwareConfig() {}

    private GetEnvironmentConfigSoftwareConfig(GetEnvironmentConfigSoftwareConfig $) {
        this.airflowConfigOverrides = $.airflowConfigOverrides;
        this.envVariables = $.envVariables;
        this.imageVersion = $.imageVersion;
        this.pypiPackages = $.pypiPackages;
        this.pythonVersion = $.pythonVersion;
        this.schedulerCount = $.schedulerCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentConfigSoftwareConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentConfigSoftwareConfig $;

        public Builder() {
            $ = new GetEnvironmentConfigSoftwareConfig();
        }

        public Builder(GetEnvironmentConfigSoftwareConfig defaults) {
            $ = new GetEnvironmentConfigSoftwareConfig(Objects.requireNonNull(defaults));
        }

        public Builder airflowConfigOverrides(Map<String,String> airflowConfigOverrides) {
            $.airflowConfigOverrides = airflowConfigOverrides;
            return this;
        }

        public Builder envVariables(Map<String,String> envVariables) {
            $.envVariables = envVariables;
            return this;
        }

        public Builder imageVersion(String imageVersion) {
            $.imageVersion = imageVersion;
            return this;
        }

        public Builder pypiPackages(Map<String,String> pypiPackages) {
            $.pypiPackages = pypiPackages;
            return this;
        }

        public Builder pythonVersion(String pythonVersion) {
            $.pythonVersion = pythonVersion;
            return this;
        }

        public Builder schedulerCount(Integer schedulerCount) {
            $.schedulerCount = schedulerCount;
            return this;
        }

        public GetEnvironmentConfigSoftwareConfig build() {
            $.airflowConfigOverrides = Objects.requireNonNull($.airflowConfigOverrides, "expected parameter 'airflowConfigOverrides' to be non-null");
            $.envVariables = Objects.requireNonNull($.envVariables, "expected parameter 'envVariables' to be non-null");
            $.imageVersion = Objects.requireNonNull($.imageVersion, "expected parameter 'imageVersion' to be non-null");
            $.pypiPackages = Objects.requireNonNull($.pypiPackages, "expected parameter 'pypiPackages' to be non-null");
            $.pythonVersion = Objects.requireNonNull($.pythonVersion, "expected parameter 'pythonVersion' to be non-null");
            $.schedulerCount = Objects.requireNonNull($.schedulerCount, "expected parameter 'schedulerCount' to be non-null");
            return $;
        }
    }

}
